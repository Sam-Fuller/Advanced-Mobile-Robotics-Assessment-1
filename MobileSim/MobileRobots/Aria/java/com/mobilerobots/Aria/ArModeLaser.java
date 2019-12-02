/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArModeLaser extends ArMode {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArModeLaser(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArModeLaserUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArModeLaser obj) {
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
        AriaJavaJNI.delete_ArModeLaser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArModeLaser(ArRobot robot, String name, char key, char key2, ArSick obsolete) {
    this(AriaJavaJNI.new_ArModeLaser__SWIG_0(ArRobot.getCPtr(robot), robot, name, key, key2, ArSick.getCPtr(obsolete), obsolete), true);
  }

  public ArModeLaser(ArRobot robot, String name, char key, char key2) {
    this(AriaJavaJNI.new_ArModeLaser__SWIG_1(ArRobot.getCPtr(robot), robot, name, key, key2), true);
  }

  public void activate() {
    AriaJavaJNI.ArModeLaser_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArModeLaser_deactivate(swigCPtr, this);
  }

  public void userTask() {
    AriaJavaJNI.ArModeLaser_userTask(swigCPtr, this);
  }

  public void help() {
    AriaJavaJNI.ArModeLaser_help(swigCPtr, this);
  }

  public void switchToLaser(int laserNumber) {
    AriaJavaJNI.ArModeLaser_switchToLaser(swigCPtr, this, laserNumber);
  }

}