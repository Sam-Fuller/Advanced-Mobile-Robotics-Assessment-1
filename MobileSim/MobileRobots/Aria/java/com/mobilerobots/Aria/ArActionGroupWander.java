/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArActionGroupWander extends ArActionGroup {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionGroupWander(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionGroupWanderUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionGroupWander obj) {
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
        AriaJavaJNI.delete_ArActionGroupWander(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArActionGroupWander(ArRobot robot, int forwardVel, int avoidFrontDist, int avoidVel, int avoidTurnAmt) {
    this(AriaJavaJNI.new_ArActionGroupWander__SWIG_0(ArRobot.getCPtr(robot), robot, forwardVel, avoidFrontDist, avoidVel, avoidTurnAmt), true);
  }

  public ArActionGroupWander(ArRobot robot, int forwardVel, int avoidFrontDist, int avoidVel) {
    this(AriaJavaJNI.new_ArActionGroupWander__SWIG_1(ArRobot.getCPtr(robot), robot, forwardVel, avoidFrontDist, avoidVel), true);
  }

  public ArActionGroupWander(ArRobot robot, int forwardVel, int avoidFrontDist) {
    this(AriaJavaJNI.new_ArActionGroupWander__SWIG_2(ArRobot.getCPtr(robot), robot, forwardVel, avoidFrontDist), true);
  }

  public ArActionGroupWander(ArRobot robot, int forwardVel) {
    this(AriaJavaJNI.new_ArActionGroupWander__SWIG_3(ArRobot.getCPtr(robot), robot, forwardVel), true);
  }

  public ArActionGroupWander(ArRobot robot) {
    this(AriaJavaJNI.new_ArActionGroupWander__SWIG_4(ArRobot.getCPtr(robot), robot), true);
  }

}
