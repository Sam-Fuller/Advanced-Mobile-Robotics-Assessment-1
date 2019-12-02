/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerClientIdentifier {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerClientIdentifier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerClientIdentifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerClientIdentifier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerClientIdentifier() {
    this(ArNetworkingJavaJNI.new_ArServerClientIdentifier(), true);
  }

  public String getIDString() {
    return ArNetworkingJavaJNI.ArServerClientIdentifier_getIDString(swigCPtr, this);
  }

  public void setConnectionID(long idNum) {
    ArNetworkingJavaJNI.ArServerClientIdentifier_setConnectionID(swigCPtr, this, idNum);
  }

  public long getConnectionID() {
    return ArNetworkingJavaJNI.ArServerClientIdentifier_getConnectionID(swigCPtr, this);
  }

  public void setSelfIdentifier(String selfIdentifier) {
    ArNetworkingJavaJNI.ArServerClientIdentifier_setSelfIdentifier(swigCPtr, this, selfIdentifier);
  }

  public String getSelfIdentifier() {
    return ArNetworkingJavaJNI.ArServerClientIdentifier_getSelfIdentifier(swigCPtr, this);
  }

  public void setHereGoal(String selfIdentifier) {
    ArNetworkingJavaJNI.ArServerClientIdentifier_setHereGoal(swigCPtr, this, selfIdentifier);
  }

  public String getHereGoal() {
    return ArNetworkingJavaJNI.ArServerClientIdentifier_getHereGoal(swigCPtr, this);
  }

  public boolean matches(ArServerClientIdentifier identifier, boolean matchConnectionID) {
    return ArNetworkingJavaJNI.ArServerClientIdentifier_matches(swigCPtr, this, ArServerClientIdentifier.getCPtr(identifier), identifier, matchConnectionID);
  }

  public void rebuildIDString() {
    ArNetworkingJavaJNI.ArServerClientIdentifier_rebuildIDString(swigCPtr, this);
  }

}