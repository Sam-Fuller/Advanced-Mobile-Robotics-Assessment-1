/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArArgumentBuilderPtrList {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArArgumentBuilderPtrList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArArgumentBuilderPtrList obj) {
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
        AriaJavaJNI.delete_ArArgumentBuilderPtrList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArArgumentBuilderPtrList() {
    this(AriaJavaJNI.new_ArArgumentBuilderPtrList(), true);
  }

  public long size() {
    return AriaJavaJNI.ArArgumentBuilderPtrList_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return AriaJavaJNI.ArArgumentBuilderPtrList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AriaJavaJNI.ArArgumentBuilderPtrList_clear(swigCPtr, this);
  }

  public void add(ArArgumentBuilder x) {
    AriaJavaJNI.ArArgumentBuilderPtrList_add(swigCPtr, this, ArArgumentBuilder.getCPtr(x), x);
  }

  public ArArgumentBuilder get(int i) {
    long cPtr = AriaJavaJNI.ArArgumentBuilderPtrList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new ArArgumentBuilder(cPtr, false);
  }

}
