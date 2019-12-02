/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerModeStop extends ArServerMode {
  private long swigCPtr;

  /* for internal use by swig only */
  public ArServerModeStop(long cPtr, boolean cMemoryOwn) {
    super(ArNetworkingJavaJNI.SWIGArServerModeStopUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerModeStop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerModeStop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArServerModeStop(ArServerBase server, ArRobot robot, boolean defunct) {
    this(ArNetworkingJavaJNI.new_ArServerModeStop__SWIG_0(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot, defunct), true);
  }

  public ArServerModeStop(ArServerBase server, ArRobot robot) {
    this(ArNetworkingJavaJNI.new_ArServerModeStop__SWIG_1(ArServerBase.getCPtr(server), server, ArRobot.getCPtr(robot), robot), true);
  }

  public void activate() {
    ArNetworkingJavaJNI.ArServerModeStop_activate(swigCPtr, this);
  }

  public void deactivate() {
    ArNetworkingJavaJNI.ArServerModeStop_deactivate(swigCPtr, this);
  }

  public void stop() {
    ArNetworkingJavaJNI.ArServerModeStop_stop(swigCPtr, this);
  }

  public void netStop(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerModeStop_netStop(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void userTask() {
    ArNetworkingJavaJNI.ArServerModeStop_userTask(swigCPtr, this);
  }

  public void checkDefault() {
    ArNetworkingJavaJNI.ArServerModeStop_checkDefault(swigCPtr, this);
  }

  public ArActionGroup getActionGroup() {
    long cPtr = ArNetworkingJavaJNI.ArServerModeStop_getActionGroup(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionGroup(cPtr, false);
  }

  public void addToConfig(ArConfig config, String section) {
    ArNetworkingJavaJNI.ArServerModeStop_addToConfig__SWIG_0(swigCPtr, this, ArConfig.getCPtr(config), config, section);
  }

  public void addToConfig(ArConfig config) {
    ArNetworkingJavaJNI.ArServerModeStop_addToConfig__SWIG_1(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public void setUseLocationDependentDevices(boolean useLocationDependentDevices, boolean internal) {
    ArNetworkingJavaJNI.ArServerModeStop_setUseLocationDependentDevices__SWIG_0(swigCPtr, this, useLocationDependentDevices, internal);
  }

  public void setUseLocationDependentDevices(boolean useLocationDependentDevices) {
    ArNetworkingJavaJNI.ArServerModeStop_setUseLocationDependentDevices__SWIG_1(swigCPtr, this, useLocationDependentDevices);
  }

  public boolean getUseLocationDependentDevices() {
    return ArNetworkingJavaJNI.ArServerModeStop_getUseLocationDependentDevices(swigCPtr, this);
  }

}