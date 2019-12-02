# Microsoft Developer Studio Project File - Name="AriaJava" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Dynamic-Link Library" 0x0102

CFG=AriaJava - Win32 Debug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "AriaJava.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "AriaJava.mak" CFG="AriaJava - Win32 Debug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "AriaJava - Win32 Release" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE "AriaJava - Win32 Debug" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
MTL=midl.exe
RSC=rc.exe

!IF  "$(CFG)" == "AriaJava - Win32 Release"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "../lib"
# PROP Intermediate_Dir "../obj"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MT /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIADLL_EXPORTS" /YX /FD /c
# ADD CPP /nologo /MT /W3 /GR /GX /O2 /I "../include" /I "$(JAVA_INCLUDE)" /I "$(JAVA_INCLUDE)/win32" /D "NDEBUG" /D "WIN32" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIA_STATIC" /FD /c
# SUBTRACT CPP /YX
# ADD BASE MTL /nologo /D "NDEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "NDEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "NDEBUG"
# ADD RSC /l 0x409 /d "NDEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /machine:I386
# ADD LINK32 wsock32.lib winmm.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /version:0.7 /dll /pdb:none /machine:I386 /out:"../bin/AriaJava.DLL"
# Begin Special Build Tool
SOURCE="$(InputPath)"
PostBuild_Cmds=echo on	set PATH=%PATH%;%JAVA_BIN%	javac *.java
# End Special Build Tool

!ELSEIF  "$(CFG)" == "AriaJava - Win32 Debug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "AriaJava___Win32_Debug"
# PROP BASE Intermediate_Dir "AriaJava___Win32_Debug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "../lib"
# PROP Intermediate_Dir "../obj"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MTd /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIADLL_EXPORTS" /YX /FD /GZ /c
# ADD CPP /nologo /MTd /W3 /GR /GX /Zi /Od /I "../include" /I "$(JAVA_INCLUDE)" /I "$(JAVA_INCLUDE)/win32" /D "_DEBUG" /D "WIN32" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARIA_STATIC" /FR /FD /GZ /c
# SUBTRACT CPP /YX
# ADD BASE MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD MTL /nologo /D "_DEBUG" /mktyplib203 /win32
# ADD BASE RSC /l 0x409 /d "_DEBUG"
# ADD RSC /l 0x409 /d "_DEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /debug /machine:I386 /pdbtype:sept
# ADD LINK32 wsock32.lib winmm.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /version:0.7 /dll /pdb:none /debug /machine:I386 /out:"../bin/AriaJava.DLL"
# Begin Special Build Tool
SOURCE="$(InputPath)"
PostBuild_Cmds=echo on	set PATH=%PATH%;%JAVA_BIN%	javac *.java
# End Special Build Tool

!ENDIF 

# Begin Target

# Name "AriaJava - Win32 Release"
# Name "AriaJava - Win32 Debug"
# Begin Group "Source Files"

# PROP Default_Filter "cpp;c;cxx;rc;def;r;odl;idl;hpj;bat"
# Begin Source File

SOURCE=..\src\ArAction.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionAvoidFront.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionAvoidSide.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionBumpers.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionConstantVelocity.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionDesired.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionGoto.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionGroup.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionGroups.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionInput.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionJoydrive.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionKeydrive.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionLimiterBackwards.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionLimiterForwards.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionLimiterTableSensor.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionStallRecover.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionStop.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArActionTurn.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArACTS.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArAMPTU.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArAnalogGyro.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArArg.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArArgumentBuilder.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArArgumentParser.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArASyncTask.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArBasePacket.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArCondition_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArConfig.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArConfigGroup.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArDeviceConnection.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArDPPTU.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArFileParser.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArFunctorASyncTask.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArGripper.cpp
# End Source File
# Begin Source File

SOURCE=..\src\Aria.cpp
# End Source File
# Begin Source File

SOURCE=.\AriaJava_wrap.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ariaUtil.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArInterpolation.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArIrrfDevice.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArJoyHandler.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArJoyHandler_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArKeyHandler.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArLog.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArLogFileConnection.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArMode.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArModes.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArModule.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArModuleLoader.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArMutex_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArNetServer.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArP2Arm.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArPriorityResolver.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArPTZ.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRangeBuffer.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRangeDevice.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRangeDeviceThreaded.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRecurrentTask.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobot.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobotConfigPacketReader.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobotPacket.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobotPacketReceiver.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobotPacketSender.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobotParams.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArRobotTypes.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSensorReading.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSerialConnection_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSick.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSickLogger.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSickPacket.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSickPacketReceiver.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSignalHandler_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSimpleConnector.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSocket.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSocket_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSonarDevice.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSonyPTZ.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSyncLoop.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArSyncTask.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArTcpConnection.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArThread.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArThread_WIN.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArTransform.cpp
# End Source File
# Begin Source File

SOURCE=..\src\ArVCC4.cpp
# End Source File
# End Group
# Begin Group "Header Files"

# PROP Default_Filter "h;hpp;hxx;hm;inl"
# End Group
# Begin Source File

SOURCE=..\include\wrapper.i

!IF  "$(CFG)" == "AriaJava - Win32 Release"

# Begin Custom Build
InputPath=..\include\wrapper.i

"..\java\AriaJava_wrap.cpp" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
	echo In order to function correctly, please ensure the following environment variables are correctly set: 
	echo JAVA_INCLUDE: %JAVA_INCLUDE% 
	echo JAVA_BIN: %JAVA_BIN% 
	echo Also make sure swig is in your PATH variable. 
	echo on 
	cd ..\java 
	swig.exe -c++ -java -DAREXPORT -module AriaJava -o AriaJava_wrap.cpp $(InputPath) 
	
# End Custom Build

!ELSEIF  "$(CFG)" == "AriaJava - Win32 Debug"

# Begin Custom Build
InputPath=..\include\wrapper.i

"..\java\AriaJava_wrap.cpp" : $(SOURCE) "$(INTDIR)" "$(OUTDIR)"
	echo In order to function correctly, please ensure the following environment variables are correctly set: 
	echo JAVA_INCLUDE: %JAVA_INCLUDE% 
	echo JAVA_BIN: %JAVA_BIN% 
	echo Also make sure swig is in your PATH variable. 
	echo on 
	cd ..\java 
	swig.exe -c++ -java -DAREXPORT -module AriaJava -o AriaJava_wrap.cpp $(InputPath) 
	
# End Custom Build

!ENDIF 

# End Source File
# End Target
# End Project
