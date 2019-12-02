# Microsoft Developer Studio Project File - Name="ArNetworkingLib" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Dynamic-Link Library" 0x0102

CFG=ArNetworkingLib - Win32 Debug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "ArNetworkingLib.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "ArNetworkingLib.mak" CFG="ArNetworkingLib - Win32 Debug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "ArNetworkingLib - Win32 Release" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE "ArNetworkingLib - Win32 Debug" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
MTL=midl.exe
RSC=rc.exe

!IF  "$(CFG)" == "ArNetworkingLib - Win32 Release"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "../../lib"
# PROP Intermediate_Dir "../../obj"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MT /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARSPEECHLIB_EXPORTS" /YX /FD /c
# ADD CPP /nologo /MT /W3 /GX /O2 /I "..\include" /I "..\..\include" /I "..\internalLibraries\festival\src\include" /I "..\internalLibraries\speech_tools\include" /I "..\internalLibraries\sphinx2\include" /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARSPEECHLIB_EXPORTS" /FD /c
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
# ADD LINK32 Aria.lib wsock32.lib winmm.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /machine:I386 /out:"../../bin/ArNetworking.dll" /libpath:"../../lib"

!ELSEIF  "$(CFG)" == "ArNetworkingLib - Win32 Debug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "Debug"
# PROP BASE Intermediate_Dir "Debug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "../../lib"
# PROP Intermediate_Dir "../../obj"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MTd /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARSPEECHLIB_EXPORTS" /YX /FD /GZ /c
# ADD CPP /nologo /MTd /W3 /Gm /GX /ZI /Od /I "..\include" /I "..\..\include" /I "..\internalLibraries\festival\src\include" /I "..\internalLibraries\speech_tools\include" /I "..\internalLibraries\sphinx2\include" /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_MBCS" /D "_USRDLL" /D "ARSPEECHLIB_EXPORTS" /FD /GZ /c
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
# ADD LINK32 Aria.lib wsock32.lib winmm.lib kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /nologo /dll /incremental:no /debug /machine:I386 /out:"../../bin/ArNetworking.dll" /pdbtype:sept /libpath:"../../lib"

!ENDIF 

# Begin Target

# Name "ArNetworkingLib - Win32 Release"
# Name "ArNetworkingLib - Win32 Debug"
# Begin Group "Source Files"

# PROP Default_Filter "cpp;c;cxx;rc;def;r;odl;idl;hpj;bat"
# Begin Source File

SOURCE=.\ArClientBase.cpp
# End Source File
# Begin Source File

SOURCE=.\ArClientHandlerConfig.cpp
# End Source File
# Begin Source File

SOURCE=.\ArHybridForwarderVideo.cpp
# End Source File
# Begin Source File

SOURCE=.\ArNetPacket.cpp
# End Source File
# Begin Source File

SOURCE=.\ArNetPacketReceiverTcp.cpp
# End Source File
# Begin Source File

SOURCE=.\ArNetPacketReceiverUdp.cpp
# End Source File
# Begin Source File

SOURCE=.\ArNetPacketSenderTcp.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerBase.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerClient.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerHandlerCamera.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerHandlerCommands.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerHandlerConfig.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerHandlerMap.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerInfoDrawings.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerInfoRobot.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerInfoSensor.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerMode.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerModeDrive.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerModeStop.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerModeWander.cpp
# End Source File
# Begin Source File

SOURCE=.\ArServerSimpleCommandsUC.cpp
# End Source File
# End Group
# Begin Group "Header Files"

# PROP Default_Filter "h;hpp;hxx;hm;inl"
# Begin Source File

SOURCE=..\include\ArClientBase.h
# End Source File
# Begin Source File

SOURCE=..\include\ArClientCommands.h
# End Source File
# Begin Source File

SOURCE=..\include\ArClientData.h
# End Source File
# Begin Source File

SOURCE=..\include\ArClientHandlerConfig.h
# End Source File
# Begin Source File

SOURCE=..\include\ArHybridForwarderVideo.h
# End Source File
# Begin Source File

SOURCE=..\include\ArNetPacket.h
# End Source File
# Begin Source File

SOURCE=..\include\ArNetPacketReceiverTcp.h
# End Source File
# Begin Source File

SOURCE=..\include\ArNetPacketReceiverUdp.h
# End Source File
# Begin Source File

SOURCE=..\include\ArNetPacketSenderTcp.h
# End Source File
# Begin Source File

SOURCE=..\include\ArNetworking.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerBase.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerClient.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerClientData.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerCommands.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerData.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerHandlerCamera.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerHandlerCommands.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerHandlerConfig.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerHandlerMap.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerInfoDrawings.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerInfoRobot.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerInfoSensor.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerMode.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerModeDrive.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerModeStop.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerModeWander.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerSimpleCommandsUC.h
# End Source File
# End Group
# Begin Group "Resource Files"

# PROP Default_Filter "ico;cur;bmp;dlg;rc2;rct;bin;rgs;gif;jpg;jpeg;jpe"
# End Group
# End Target
# End Project
