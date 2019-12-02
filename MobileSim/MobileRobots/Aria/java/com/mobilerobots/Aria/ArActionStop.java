/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArActionStop extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionStop(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionStopUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionStop obj) {
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
        AriaJavaJNI.delete_ArActionStop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArActionStop(String name) {
    this(AriaJavaJNI.new_ArActionStop__SWIG_0(name), true);
  }

  public ArActionStop() {
    this(AriaJavaJNI.new_ArActionStop__SWIG_1(), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionStop_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionStop_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

}
