import urllib.request
import json
import time
import math

import matplotlib.pyplot as plt
import matplotlib.animation as animation


### defining constants
# data url
url = 'http://127.0.0.1:18080'
# angles of all the pioneer robot sonars
sonarAngles = [90, 50, 30, 10, -10, -30, -50, -90, -90, -130, -150, -170, 170, 150, 130, 90]
# scale of the occupancy grid
occupancyScale = 100
# the peak range of the sonar
sonarMax = 5000 / occupancyScale
# the tolerance for the sonar when calculating occuapancy
sonarInaccuracyDist = 1
sonarInaccuracyAng = 0.02

### defining graph lists
# the current offset for the all points (to keep all points are posative)
# offset[0] is the x offset
# offset[1] is the y offset
offsets = [0,0]
# x and y values for the robots path
pathX = []
pathY = []
# x and y values for all sonar points
scatterX = []
scatterY = []
# 2d list representing a grayscale image from 0 (white) to 1 (black)
occupancy = [[]]

# create a new figure and subplot
fig = plt.figure()
subplot = fig.add_subplot(1,1,1)

### offset the collection by a given offset
# increases all elements of the collection by offset
def offsetList(offset, collection):
    # for each element in the collection:
    for index in range(0, len(collection)):
        # increase its value by the offset
        collection[index] = collection[index] + offset

### pads the left of the occupancy grid with 0.5 values
def offsetOccupancyX(offset):
    # create a list of 0.5s with legnth of the offset
    defaultList = [0.5] * round(offset)

    # for each sublist in occupancy:
    for index in range(0, len(occupancy)):
        # add the list of 0.5s to the start
        occupancy[index] = defaultList + occupancy[index]

### pads the top of the occupancy grid with 0.5 values
def offsetOccupancyY(offset):
    # the extend command adds the list to the end of occupancy, so occupancy needs to be reversed before and after extension
    occupancy.reverse()
    # add a 2d list of 0.5s with legnth of all other lists in occupancy, and height of the offset to the end of the now reversed occupancy grid
    occupancy.extend([[0.5] * len(occupancy[0])] * round(offset))
    occupancy.reverse()
    
### pads the right of the occupancy grid with 0.5 values
def extendOccupancyX(offset):
    # create a list of 0.5s with legnth of the offset
    defaultList = [0.5] * round(offset)

    # for each sublist in occupancy:
    for index in range(0, len(occupancy)):
        # add the list of 0.5s to the end
        occupancy[index] = occupancy[index] + defaultList

### pads the bottom of the occupancy grid with 0.5 values
def extendOccupancyY(offset):
    # add a 2d list of 0.5s with legnth of all other lists in occupancy, and height of the offset to the end of the occupancy grid
    occupancy.extend([[0.5] * len(occupancy[0])] * round(offset))

### animates the subplot
# repeats every 100ms
def animatePlot(i):
    # get data from the given url, and print it out
    data = json.loads(urllib.request.urlopen(url).read())
    print(data)

    # retrieve the sonar and robot position dat
    sonar = data['SonarData']
    # the robot uses only relative position, all references to the absoulte position refer to (0,0) as appose to the robots current position
    robot = data['relativePosition']

    # retrive the robots current position
    # position is divided by the scale so that all graphs will align
    robotX = robot['x'] / occupancyScale
    robotY = robot['y'] / occupancyScale
    # position is given in degrees, all references to angle in this program are in radians
    robotAngle = math.radians(robot['th'])

    # scale the robots current position by the graph offsets
    robotXScaled = robotX + offsets[0]
    robotYScaled = robotY + offsets[1]

    # append these coordinates to the two path ordinate lists
    pathX.append(robotXScaled)
    pathY.append(robotYScaled)

    # loop through each sonar reading
    for sonarNum in range(0, 15):
        # retrive the sonar distance relative to the robot
        sonarRelDistance = sonar[sonarNum] / occupancyScale

        # calculate the sonar angle relative to the robot
        sonarRelAngle = math.radians(sonarAngles[sonarNum])

        # calculate the sonar angle relative to (0,0)
        sonarAbsAngle = sonarRelAngle + robotAngle

        # calculate the x and y ordinates of the sonar relative to the robot
        sonarRelX = math.cos(sonarAbsAngle) * sonarRelDistance
        sonarRelY = math.sin(sonarAbsAngle) * sonarRelDistance

        # calculate the x and y ordinates of the sonar relative to (0,0)
        sonarAbsX = sonarRelX + robotX
        sonarAbsY = sonarRelY + robotY

        # scale both sonar ordiantes using the current offsets
        sonarAbsXScaled = sonarAbsX + offsets[0]
        sonarAbsYScaled = sonarAbsY + offsets[1]

        # if the sonar isnt at max range (the sonar has detected an object):
        if sonarRelDistance < sonarMax:
            # append both sonar ordinates to the scatter ordinate lists
            scatterX.append(sonarAbsXScaled)
            scatterY.append(sonarAbsYScaled)

        # if a negative x sonar position is produced:
        if sonarAbsXScaled < 0:
            # reoffset all current lists on the x axis
            offsetList(-sonarAbsXScaled,pathX)
            offsetList(-sonarAbsXScaled,scatterX)
            offsetOccupancyX(-sonarAbsXScaled)
            # update the x offset
            offsets[0] += -sonarAbsXScaled

        # if a negative y sonar position is produced:
        if sonarAbsYScaled < 0:
            # reoffset all current lists on the y axis
            offsetList(-sonarAbsYScaled,pathY)
            offsetList(-sonarAbsYScaled,scatterY) 
            offsetOccupancyY(-sonarAbsYScaled)
            # update the y offset
            offsets[1] += -sonarAbsYScaled

        # if a sonar position with a greater x value than the occupancy grid:
        if sonarAbsXScaled > len(occupancy[0]):
            # extend the occupancy grid in the x direction
            extendOccupancyX(1 + sonarAbsXScaled - len(occupancy[0]))

        # if a sonar position with a greater y value than the occupancy grid:
        if sonarAbsYScaled > len(occupancy):
            # extend the occupancy grid in the y direction
            extendOccupancyY(1 + sonarAbsYScaled - len(occupancy))

        # recalculate the sonar absoulte scaled ordinates
        sonarAbsXScaled = sonarAbsX + offsets[0]
        sonarAbsYScaled = sonarAbsY + offsets[1]

        # for each pixel of the occupancy grid:
        for indexY in range(0, len(occupancy)):
            for indexX in range(0, len(occupancy[0])):
                # calcualte the relative distance to the pixel from the robot
                pixelRelX = indexX - robotXScaled
                pixelRelY = indexY - robotYScaled
                
                # calculate the angle to the pixel relative to (0,0)
                pixelRobotAngle = math.atan2(pixelRelY, pixelRelX)

                # if the pixel is within angle tolerance from the current sonar:
                if(pixelRobotAngle < sonarAbsAngle + sonarInaccuracyAng and pixelRobotAngle > sonarAbsAngle - sonarInaccuracyAng):
                    # calcuate the distance from the pixel to the robot
                    distanceFromRobot = math.sqrt((indexX - robotXScaled)**2 + (indexY - robotYScaled)**2)

                    # if the pixel is between the robot and the reading:
                    if(distanceFromRobot < (sonarRelDistance - sonarInaccuracyDist)):
                        # tend the pixel towards white
                        occupancy[indexY][indexX] = (occupancy[indexY][indexX] + 1) / 2

                    # if the pixel is within tolerance of the sonar:
                    elif(distanceFromRobot < (sonarRelDistance + sonarInaccuracyDist)):
                        # and the sonar is within range
                        if(sonarRelDistance < sonarMax):
                            # tend the pixel towards black
                            occupancy[indexY][indexX] = (occupancy[indexY][indexX] + 0) / 2



    # reset the subplot
    subplot.clear()
    # display all graphs on the subplot
    subplot.imshow(occupancy, 'gray')
    subplot.scatter(scatterX, scatterY, s=1, c='r')
    subplot.plot(pathX, pathY)
     
# animate and display the subplot in realtime
realTime = animation.FuncAnimation(fig, animatePlot, fargs=(), interval=100)
plt.show()