/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArNovatelGPS extends ArGPS {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArNovatelGPS(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArNovatelGPSUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArNovatelGPS obj) {
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
        AriaJavaJNI.delete_ArNovatelGPS(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArNovatelGPS() {
    this(AriaJavaJNI.new_ArNovatelGPS(), true);
  }

}
