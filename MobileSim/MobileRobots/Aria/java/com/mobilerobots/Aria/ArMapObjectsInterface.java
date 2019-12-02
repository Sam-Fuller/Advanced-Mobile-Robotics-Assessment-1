/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArMapObjectsInterface {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArMapObjectsInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapObjectsInterface obj) {
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
        AriaJavaJNI.delete_ArMapObjectsInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArMapObject findFirstMapObject(String name, String type, boolean isIncludeWithHeading) {
    long cPtr = AriaJavaJNI.ArMapObjectsInterface_findFirstMapObject__SWIG_0(swigCPtr, this, name, type, isIncludeWithHeading);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findFirstMapObject(String name, String type) {
    long cPtr = AriaJavaJNI.ArMapObjectsInterface_findFirstMapObject__SWIG_1(swigCPtr, this, name, type);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findMapObject(String name, String type, boolean isIncludeWithHeading) {
    long cPtr = AriaJavaJNI.ArMapObjectsInterface_findMapObject__SWIG_0(swigCPtr, this, name, type, isIncludeWithHeading);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findMapObject(String name, String type) {
    long cPtr = AriaJavaJNI.ArMapObjectsInterface_findMapObject__SWIG_1(swigCPtr, this, name, type);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject findMapObject(String name) {
    long cPtr = AriaJavaJNI.ArMapObjectsInterface_findMapObject__SWIG_2(swigCPtr, this, name);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObjectPtrList findMapObjectsOfType(String type, boolean isIncludeWithHeading) {
    return new ArMapObjectPtrList(AriaJavaJNI.ArMapObjectsInterface_findMapObjectsOfType__SWIG_0(swigCPtr, this, type, isIncludeWithHeading), true);
  }

  public ArMapObjectPtrList findMapObjectsOfType(String type) {
    return new ArMapObjectPtrList(AriaJavaJNI.ArMapObjectsInterface_findMapObjectsOfType__SWIG_1(swigCPtr, this, type), true);
  }

  public ArMapObjectPtrList getMapObjects() {
    long cPtr = AriaJavaJNI.ArMapObjectsInterface_getMapObjects(swigCPtr, this);
    return (cPtr == 0) ? null : new ArMapObjectPtrList(cPtr, false);
  }

  public void setMapObjects(ArMapObjectPtrList mapObjects, boolean isSortedObjects, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapObjectsInterface_setMapObjects__SWIG_0(swigCPtr, this, ArMapObjectPtrList.getCPtr(mapObjects), mapObjects, isSortedObjects, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setMapObjects(ArMapObjectPtrList mapObjects, boolean isSortedObjects) {
    AriaJavaJNI.ArMapObjectsInterface_setMapObjects__SWIG_1(swigCPtr, this, ArMapObjectPtrList.getCPtr(mapObjects), mapObjects, isSortedObjects);
  }

  public void setMapObjects(ArMapObjectPtrList mapObjects) {
    AriaJavaJNI.ArMapObjectsInterface_setMapObjects__SWIG_2(swigCPtr, this, ArMapObjectPtrList.getCPtr(mapObjects), mapObjects);
  }

  public void writeObjectListToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapObjectsInterface_writeObjectListToFunctor(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

}
