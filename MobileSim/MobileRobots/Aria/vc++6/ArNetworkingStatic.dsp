# Microsoft Developer Studio Project File - Name="ArNetworkingStatic" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Static Library" 0x0104

CFG=ArNetworkingStatic - Win32 Debug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "ArNetworkingStatic.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "ArNetworkingStatic.mak" CFG="ArNetworkingStatic - Win32 Debug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "ArNetworkingStatic - Win32 Release" (based on "Win32 (x86) Static Library")
!MESSAGE "ArNetworkingStatic - Win32 Debug" (based on "Win32 (x86) Static Library")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
RSC=rc.exe

!IF  "$(CFG)" == "ArNetworkingStatic - Win32 Release"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "../../lib"
# PROP Intermediate_Dir "../../obj"
# PROP Target_Dir ""
F90=df.exe
# ADD BASE CPP /nologo /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_MBCS" /D "_LIB" /YX /FD /c
# ADD CPP /nologo /MT /W3 /GX /O2 /I "../../include" /I "../include" /D "NDEBUG" /D "WIN32" /D "_MBCS" /D "_LIB" /D "ARIA_STATIC" /YX /FD /c
# ADD BASE RSC /l 0x409 /d "NDEBUG"
# ADD RSC /l 0x409 /d "NDEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LIB32=link.exe -lib
# ADD BASE LIB32 /nologo
# ADD LIB32 /nologo

!ELSEIF  "$(CFG)" == "ArNetworkingStatic - Win32 Debug"

# PROP BASE Use_MFC 0
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "Debug"
# PROP BASE Intermediate_Dir "Debug"
# PROP BASE Target_Dir ""
# PROP Use_MFC 0
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "../../lib"
# PROP Intermediate_Dir "../../staticobj"
# PROP Target_Dir ""
F90=df.exe
# ADD BASE CPP /nologo /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_MBCS" /D "_LIB" /YX /FD /GZ /c
# ADD CPP /nologo /MTd /W3 /Gm /GR /GX /ZI /Od /I "../../include" /I "../include" /D "_DEBUG" /D "WIN32" /D "_MBCS" /D "_LIB" /D "ARIA_STATIC" /FD /GZ /c
# SUBTRACT CPP /YX
# ADD BASE RSC /l 0x409 /d "_DEBUG"
# ADD RSC /l 0x409 /d "_DEBUG"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LIB32=link.exe -lib
# ADD BASE LIB32 /nologo
# ADD LIB32 /nologo

!ENDIF 

# Begin Target

# Name "ArNetworkingStatic - Win32 Release"
# Name "ArNetworkingStatic - Win32 Debug"
# Begin Group "Source Files"

# PROP Default_Filter "cpp;c;cxx;rc;def;r;odl;idl;hpj;bat"
# Begin Source File

SOURCE=.\ArClientBase.cpp
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

SOURCE=..\include\ArServerBase.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerClient.h
# End Source File
# Begin Source File

SOURCE=..\include\ArServerCommands.h
# End Source File
# End Group
# End Target
# End Project
