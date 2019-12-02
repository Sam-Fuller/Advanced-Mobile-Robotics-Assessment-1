/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerSimpleServerCommands {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerSimpleServerCommands(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerSimpleServerCommands obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerSimpleServerCommands(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerSimpleServerCommands(ArServerHandlerCommands commands, ArServerBase server, boolean addLogConnections) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleServerCommands__SWIG_0(ArServerHandlerCommands.getCPtr(commands), commands, ArServerBase.getCPtr(server), server, addLogConnections), true);
  }

  public ArServerSimpleServerCommands(ArServerHandlerCommands commands, ArServerBase server) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleServerCommands__SWIG_1(ArServerHandlerCommands.getCPtr(commands), commands, ArServerBase.getCPtr(server), server), true);
  }

  public void logTerseTracking() {
    ArNetworkingJavaJNI.ArServerSimpleServerCommands_logTerseTracking(swigCPtr, this);
  }

  public void logVerboseTracking() {
    ArNetworkingJavaJNI.ArServerSimpleServerCommands_logVerboseTracking(swigCPtr, this);
  }

  public void resetTracking() {
    ArNetworkingJavaJNI.ArServerSimpleServerCommands_resetTracking(swigCPtr, this);
  }

  public void logConnections() {
    ArNetworkingJavaJNI.ArServerSimpleServerCommands_logConnections(swigCPtr, this);
  }

}
