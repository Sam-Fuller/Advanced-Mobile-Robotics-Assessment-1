/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerUserInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerUserInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerUserInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerUserInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerUserInfo(String baseDirectory) {
    this(ArNetworkingJavaJNI.new_ArServerUserInfo__SWIG_0(baseDirectory), true);
  }

  public ArServerUserInfo() {
    this(ArNetworkingJavaJNI.new_ArServerUserInfo__SWIG_1(), true);
  }

  public boolean readFile(String fileName) {
    return ArNetworkingJavaJNI.ArServerUserInfo_readFile(swigCPtr, this, fileName);
  }

  public void setBaseDirectory(String baseDirectory) {
    ArNetworkingJavaJNI.ArServerUserInfo_setBaseDirectory(swigCPtr, this, baseDirectory);
  }

  public boolean matchUserPassword(String user, SWIGTYPE_p_unsigned_char password, String passwordKey, String serverKey, boolean logFailureVerbosely) {
    return ArNetworkingJavaJNI.ArServerUserInfo_matchUserPassword__SWIG_0(swigCPtr, this, user, SWIGTYPE_p_unsigned_char.getCPtr(password), passwordKey, serverKey, logFailureVerbosely);
  }

  public boolean matchUserPassword(String user, SWIGTYPE_p_unsigned_char password, String passwordKey, String serverKey) {
    return ArNetworkingJavaJNI.ArServerUserInfo_matchUserPassword__SWIG_1(swigCPtr, this, user, SWIGTYPE_p_unsigned_char.getCPtr(password), passwordKey, serverKey);
  }

  public boolean doNotUse() {
    return ArNetworkingJavaJNI.ArServerUserInfo_doNotUse(swigCPtr, this);
  }

  public SWIGTYPE_p_std__setT_std__string_ArStrCaseCmpOp_t getUsersGroups(String user) {
    return new SWIGTYPE_p_std__setT_std__string_ArStrCaseCmpOp_t(ArNetworkingJavaJNI.ArServerUserInfo_getUsersGroups(swigCPtr, this, user), true);
  }

  public void logUsers() {
    ArNetworkingJavaJNI.ArServerUserInfo_logUsers(swigCPtr, this);
  }

}