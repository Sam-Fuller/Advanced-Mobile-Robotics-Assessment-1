/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArLMS2xxPacket extends ArBasePacket {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArLMS2xxPacket(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArLMS2xxPacketUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLMS2xxPacket obj) {
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
        AriaJavaJNI.delete_ArLMS2xxPacket(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArLMS2xxPacket(short sendingAddress) {
    this(AriaJavaJNI.new_ArLMS2xxPacket__SWIG_0(sendingAddress), true);
  }

  public ArLMS2xxPacket() {
    this(AriaJavaJNI.new_ArLMS2xxPacket__SWIG_1(), true);
  }

  public void setSendingAddress(short address) {
    AriaJavaJNI.ArLMS2xxPacket_setSendingAddress(swigCPtr, this, address);
  }

  public short getSendingAddress() {
    return AriaJavaJNI.ArLMS2xxPacket_getSendingAddress(swigCPtr, this);
  }

  public short getReceivedAddress() {
    return AriaJavaJNI.ArLMS2xxPacket_getReceivedAddress(swigCPtr, this);
  }

  public boolean verifyCRC() {
    return AriaJavaJNI.ArLMS2xxPacket_verifyCRC(swigCPtr, this);
  }

  public short getID() {
    return AriaJavaJNI.ArLMS2xxPacket_getID(swigCPtr, this);
  }

  public short calcCRC() {
    return AriaJavaJNI.ArLMS2xxPacket_calcCRC(swigCPtr, this);
  }

  public void finalizePacket() {
    AriaJavaJNI.ArLMS2xxPacket_finalizePacket(swigCPtr, this);
  }

  public void resetRead() {
    AriaJavaJNI.ArLMS2xxPacket_resetRead(swigCPtr, this);
  }

  public ArTime getTimeReceived() {
    return new ArTime(AriaJavaJNI.ArLMS2xxPacket_getTimeReceived(swigCPtr, this), true);
  }

  public void setTimeReceived(ArTime timeReceived) {
    AriaJavaJNI.ArLMS2xxPacket_setTimeReceived(swigCPtr, this, ArTime.getCPtr(timeReceived), timeReceived);
  }

  public void duplicatePacket(ArLMS2xxPacket packet) {
    AriaJavaJNI.ArLMS2xxPacket_duplicatePacket(swigCPtr, this, ArLMS2xxPacket.getCPtr(packet), packet);
  }

}
