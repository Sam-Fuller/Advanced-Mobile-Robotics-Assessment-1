/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArForbiddenRangeDevice extends ArRangeDevice {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArForbiddenRangeDevice(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArForbiddenRangeDeviceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArForbiddenRangeDevice obj) {
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
        AriaJavaJNI.delete_ArForbiddenRangeDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArForbiddenRangeDevice(ArMapInterface armap, double distanceIncrement, long maxRange, String name) {
    this(AriaJavaJNI.new_ArForbiddenRangeDevice__SWIG_0(ArMapInterface.getCPtr(armap), armap, distanceIncrement, maxRange, name), true);
  }

  public ArForbiddenRangeDevice(ArMapInterface armap, double distanceIncrement, long maxRange) {
    this(AriaJavaJNI.new_ArForbiddenRangeDevice__SWIG_1(ArMapInterface.getCPtr(armap), armap, distanceIncrement, maxRange), true);
  }

  public ArForbiddenRangeDevice(ArMapInterface armap, double distanceIncrement) {
    this(AriaJavaJNI.new_ArForbiddenRangeDevice__SWIG_2(ArMapInterface.getCPtr(armap), armap, distanceIncrement), true);
  }

  public ArForbiddenRangeDevice(ArMapInterface armap) {
    this(AriaJavaJNI.new_ArForbiddenRangeDevice__SWIG_3(ArMapInterface.getCPtr(armap), armap), true);
  }

  public void processMap() {
    AriaJavaJNI.ArForbiddenRangeDevice_processMap(swigCPtr, this);
  }

  public void processReadings() {
    AriaJavaJNI.ArForbiddenRangeDevice_processReadings(swigCPtr, this);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArForbiddenRangeDevice_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public void enable() {
    AriaJavaJNI.ArForbiddenRangeDevice_enable(swigCPtr, this);
  }

  public void disable() {
    AriaJavaJNI.ArForbiddenRangeDevice_disable(swigCPtr, this);
  }

  public boolean isEnabled() {
    return AriaJavaJNI.ArForbiddenRangeDevice_isEnabled(swigCPtr, this);
  }

  public ArFunctor getEnableCB() {
    long cPtr = AriaJavaJNI.ArForbiddenRangeDevice_getEnableCB(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public ArFunctor getDisableCB() {
    long cPtr = AriaJavaJNI.ArForbiddenRangeDevice_getDisableCB(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

}