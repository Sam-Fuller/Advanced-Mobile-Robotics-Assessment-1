/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArCallbackList {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArCallbackList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArCallbackList obj) {
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
        AriaJavaJNI.delete_ArCallbackList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArCallbackList(String name, ArLog.LogLevel logLevel, boolean singleShot) {
    this(AriaJavaJNI.new_ArCallbackList__SWIG_0(name, logLevel.swigValue(), singleShot), true);
  }

  public ArCallbackList(String name, ArLog.LogLevel logLevel) {
    this(AriaJavaJNI.new_ArCallbackList__SWIG_1(name, logLevel.swigValue()), true);
  }

  public ArCallbackList(String name) {
    this(AriaJavaJNI.new_ArCallbackList__SWIG_2(name), true);
  }

  public ArCallbackList() {
    this(AriaJavaJNI.new_ArCallbackList__SWIG_3(), true);
  }

  public void addCallback(ArFunctor functor, int position) {
    AriaJavaJNI.ArCallbackList_addCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position);
  }

  public void addCallback(ArFunctor functor) {
    AriaJavaJNI.ArCallbackList_addCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remCallback(ArFunctor functor) {
    AriaJavaJNI.ArCallbackList_remCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void setName(String name) {
    AriaJavaJNI.ArCallbackList_setName(swigCPtr, this, name);
  }

  public void setLogLevel(ArLog.LogLevel logLevel) {
    AriaJavaJNI.ArCallbackList_setLogLevel(swigCPtr, this, logLevel.swigValue());
  }

  public void setSingleShot(boolean singleShot) {
    AriaJavaJNI.ArCallbackList_setSingleShot(swigCPtr, this, singleShot);
  }

  public void invoke() {
    AriaJavaJNI.ArCallbackList_invoke(swigCPtr, this);
  }

}