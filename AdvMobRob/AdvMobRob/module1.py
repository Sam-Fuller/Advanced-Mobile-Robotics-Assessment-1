import matplotlib.pyplot as plt
import matplotlib.animation as animation

fig = plt.figure()
subplot = fig.add_subplot(1,1,1)

subplot.imshow([[0.5]*10]*10,'gray')
subplot.scatter([5,5,5,1,9], [5,1,9,5,5], s=1, c='r')

plt.show()