/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArIrrfDevice extends ArRangeDevice {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArIrrfDevice(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArIrrfDeviceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArIrrfDevice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArIrrfDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArIrrfDevice(long currentBufferSize, long cumulativeBufferSize, String name) {
    this(AriaJavaJNI.new_ArIrrfDevice__SWIG_0(currentBufferSize, cumulativeBufferSize, name), true);
  }

  public ArIrrfDevice(long currentBufferSize, long cumulativeBufferSize) {
    this(AriaJavaJNI.new_ArIrrfDevice__SWIG_1(currentBufferSize, cumulativeBufferSize), true);
  }

  public ArIrrfDevice(long currentBufferSize) {
    this(AriaJavaJNI.new_ArIrrfDevice__SWIG_2(currentBufferSize), true);
  }

  public ArIrrfDevice() {
    this(AriaJavaJNI.new_ArIrrfDevice__SWIG_3(), true);
  }

  public boolean packetHandler(ArRobotPacket packet) {
    return AriaJavaJNI.ArIrrfDevice_packetHandler(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public void setCumulativeMaxRange(double r) {
    AriaJavaJNI.ArIrrfDevice_setCumulativeMaxRange(swigCPtr, this, r);
  }

  public void setRobot(ArRobot arg0) {
    AriaJavaJNI.ArIrrfDevice_setRobot(swigCPtr, this, ArRobot.getCPtr(arg0), arg0);
  }

}
