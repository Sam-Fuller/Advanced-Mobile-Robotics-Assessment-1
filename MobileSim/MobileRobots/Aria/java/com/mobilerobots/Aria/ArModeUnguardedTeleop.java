/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArModeUnguardedTeleop extends ArMode {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArModeUnguardedTeleop(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArModeUnguardedTeleopUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArModeUnguardedTeleop obj) {
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
        AriaJavaJNI.delete_ArModeUnguardedTeleop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArModeUnguardedTeleop(ArRobot robot, String name, char key, char key2) {
    this(AriaJavaJNI.new_ArModeUnguardedTeleop(ArRobot.getCPtr(robot), robot, name, key, key2), true);
  }

  public void activate() {
    AriaJavaJNI.ArModeUnguardedTeleop_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArModeUnguardedTeleop_deactivate(swigCPtr, this);
  }

  public void help() {
    AriaJavaJNI.ArModeUnguardedTeleop_help(swigCPtr, this);
  }

  public void userTask() {
    AriaJavaJNI.ArModeUnguardedTeleop_userTask(swigCPtr, this);
  }

}