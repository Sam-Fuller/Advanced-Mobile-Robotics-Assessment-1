/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerData(String name, String description, long command, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup, String dataFlags, SWIGTYPE_p_ArRetFunctor1T_long_unsigned_int_t getFrequencyFunctor, SWIGTYPE_p_ArFunctor2T_long_unsigned_int_t requestChangedFunctor, ArFunctor_ServerData requestOnceFunctor) {
    this(ArNetworkingJavaJNI.new_ArServerData__SWIG_0(name, description, command, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup, dataFlags, SWIGTYPE_p_ArRetFunctor1T_long_unsigned_int_t.getCPtr(getFrequencyFunctor), SWIGTYPE_p_ArFunctor2T_long_unsigned_int_t.getCPtr(requestChangedFunctor), ArFunctor_ServerData.getCPtr(requestOnceFunctor), requestOnceFunctor), true);
  }

  public ArServerData(String name, String description, long command, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup, String dataFlags, SWIGTYPE_p_ArRetFunctor1T_long_unsigned_int_t getFrequencyFunctor, SWIGTYPE_p_ArFunctor2T_long_unsigned_int_t requestChangedFunctor) {
    this(ArNetworkingJavaJNI.new_ArServerData__SWIG_1(name, description, command, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup, dataFlags, SWIGTYPE_p_ArRetFunctor1T_long_unsigned_int_t.getCPtr(getFrequencyFunctor), SWIGTYPE_p_ArFunctor2T_long_unsigned_int_t.getCPtr(requestChangedFunctor)), true);
  }

  public ArServerData(String name, String description, long command, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup, String dataFlags, SWIGTYPE_p_ArRetFunctor1T_long_unsigned_int_t getFrequencyFunctor) {
    this(ArNetworkingJavaJNI.new_ArServerData__SWIG_2(name, description, command, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup, dataFlags, SWIGTYPE_p_ArRetFunctor1T_long_unsigned_int_t.getCPtr(getFrequencyFunctor)), true);
  }

  public ArServerData(String name, String description, long command, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup, String dataFlags) {
    this(ArNetworkingJavaJNI.new_ArServerData__SWIG_3(name, description, command, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup, dataFlags), true);
  }

  public ArServerData(String name, String description, long command, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup) {
    this(ArNetworkingJavaJNI.new_ArServerData__SWIG_4(name, description, command, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup), true);
  }

  public ArServerData(String name, String description, long command, ArFunctor_ServerData functor, String argumentDescription, String returnDescription) {
    this(ArNetworkingJavaJNI.new_ArServerData__SWIG_5(name, description, command, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription), true);
  }

  public String getName() {
    return ArNetworkingJavaJNI.ArServerData_getName(swigCPtr, this);
  }

  public String getDescription() {
    return ArNetworkingJavaJNI.ArServerData_getDescription(swigCPtr, this);
  }

  public long getCommand() {
    return ArNetworkingJavaJNI.ArServerData_getCommand(swigCPtr, this);
  }

  public ArFunctor_ServerData getFunctor() {
    long cPtr = ArNetworkingJavaJNI.ArServerData_getFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor_ServerData(cPtr, false);
  }

  public String getArgumentDescription() {
    return ArNetworkingJavaJNI.ArServerData_getArgumentDescription(swigCPtr, this);
  }

  public String getReturnDescription() {
    return ArNetworkingJavaJNI.ArServerData_getReturnDescription(swigCPtr, this);
  }

  public String getCommandGroup() {
    return ArNetworkingJavaJNI.ArServerData_getCommandGroup(swigCPtr, this);
  }

  public ArFunctor_ServerData getRequestOnceFunctor() {
    long cPtr = ArNetworkingJavaJNI.ArServerData_getRequestOnceFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor_ServerData(cPtr, false);
  }

  public boolean hasDataFlag(String dataFlag) {
    return ArNetworkingJavaJNI.ArServerData_hasDataFlag(swigCPtr, this, dataFlag);
  }

  public boolean addDataFlags(String dataFlags) {
    return ArNetworkingJavaJNI.ArServerData_addDataFlags(swigCPtr, this, dataFlags);
  }

  public boolean remDataFlag(String dataFlag) {
    return ArNetworkingJavaJNI.ArServerData_remDataFlag(swigCPtr, this, dataFlag);
  }

  public boolean isSlowPacket() {
    return ArNetworkingJavaJNI.ArServerData_isSlowPacket(swigCPtr, this);
  }

  public boolean isIdlePacket() {
    return ArNetworkingJavaJNI.ArServerData_isIdlePacket(swigCPtr, this);
  }

  public String getDataFlagsString() {
    return ArNetworkingJavaJNI.ArServerData_getDataFlagsString(swigCPtr, this);
  }

  public void callRequestChangedFunctor() {
    ArNetworkingJavaJNI.ArServerData_callRequestChangedFunctor(swigCPtr, this);
  }

}