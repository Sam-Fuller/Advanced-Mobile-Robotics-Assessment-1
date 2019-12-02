/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArRobotPacketSender {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArRobotPacketSender(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRobotPacketSender obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArRobotPacketSender(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArRobotPacketSender(short sync1, short sync2) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_0(sync1, sync2), true);
  }

  public ArRobotPacketSender(short sync1) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_1(sync1), true);
  }

  public ArRobotPacketSender() {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_2(), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection, short sync1, short sync2) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_3(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection, sync1, sync2), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection, short sync1) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_4(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection, sync1), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_5(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection), true);
  }

  public boolean com(short command) {
    return AriaJavaJNI.ArRobotPacketSender_com(swigCPtr, this, command);
  }

  public boolean comInt(short command, short argument) {
    return AriaJavaJNI.ArRobotPacketSender_comInt(swigCPtr, this, command, argument);
  }

  public boolean com2Bytes(short command, char high, char low) {
    return AriaJavaJNI.ArRobotPacketSender_com2Bytes(swigCPtr, this, command, high, low);
  }

  public boolean comStr(short command, String argument) {
    return AriaJavaJNI.ArRobotPacketSender_comStr(swigCPtr, this, command, argument);
  }

  public boolean comStrN(short command, String str, int size) {
    return AriaJavaJNI.ArRobotPacketSender_comStrN(swigCPtr, this, command, str, size);
  }

  public boolean comDataN(short command, String data, int size) {
    return AriaJavaJNI.ArRobotPacketSender_comDataN(swigCPtr, this, command, data, size);
  }

  public void setDeviceConnection(ArDeviceConnection deviceConnection) {
    AriaJavaJNI.ArRobotPacketSender_setDeviceConnection(swigCPtr, this, ArDeviceConnection.getCPtr(deviceConnection), deviceConnection);
  }

  public ArDeviceConnection getDeviceConnection() {
    long cPtr = AriaJavaJNI.ArRobotPacketSender_getDeviceConnection(swigCPtr, this);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

}
