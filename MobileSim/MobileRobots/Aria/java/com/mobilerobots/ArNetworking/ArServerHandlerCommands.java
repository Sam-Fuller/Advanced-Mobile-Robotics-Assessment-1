/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerHandlerCommands {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerHandlerCommands(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerHandlerCommands obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerHandlerCommands(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerHandlerCommands(ArServerBase server) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerCommands(ArServerBase.getCPtr(server), server), true);
  }

  public boolean addCommand(String name, String description, ArFunctor functor, String commandGroup) {
    return ArNetworkingJavaJNI.ArServerHandlerCommands_addCommand__SWIG_0(swigCPtr, this, name, description, ArFunctor.getCPtr(functor), functor, commandGroup);
  }

  public boolean addCommand(String name, String description, ArFunctor functor) {
    return ArNetworkingJavaJNI.ArServerHandlerCommands_addCommand__SWIG_1(swigCPtr, this, name, description, ArFunctor.getCPtr(functor), functor);
  }

  public boolean addStringCommand(String name, String description, SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t functor, String commandGroup) {
    return ArNetworkingJavaJNI.ArServerHandlerCommands_addStringCommand__SWIG_0(swigCPtr, this, name, description, SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t.getCPtr(functor), commandGroup);
  }

  public boolean addStringCommand(String name, String description, SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t functor) {
    return ArNetworkingJavaJNI.ArServerHandlerCommands_addStringCommand__SWIG_1(swigCPtr, this, name, description, SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t.getCPtr(functor));
  }

  public void setPrefix(String prefix) {
    ArNetworkingJavaJNI.ArServerHandlerCommands_setPrefix(swigCPtr, this, prefix);
  }

  public String getPrefix() {
    return ArNetworkingJavaJNI.ArServerHandlerCommands_getPrefix(swigCPtr, this);
  }

  public void netListCommands(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCommands_netListCommands(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void netListStringCommands(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerCommands_netListStringCommands(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

}
