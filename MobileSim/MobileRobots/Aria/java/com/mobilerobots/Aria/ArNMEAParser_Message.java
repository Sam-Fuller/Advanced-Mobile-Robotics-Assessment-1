/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArNMEAParser_Message {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArNMEAParser_Message(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArNMEAParser_Message obj) {
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
        AriaJavaJNI.delete_ArNMEAParser_Message(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMessage(SWIGTYPE_p_std__vectorT_std__string_t value) {
    AriaJavaJNI.ArNMEAParser_Message_message_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_std__string_t getMessage() {
    long cPtr = AriaJavaJNI.ArNMEAParser_Message_message_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_std__string_t(cPtr, false);
  }

  public void setTimeParseStarted(ArTime value) {
    AriaJavaJNI.ArNMEAParser_Message_timeParseStarted_set(swigCPtr, this, ArTime.getCPtr(value), value);
  }

  public ArTime getTimeParseStarted() {
    long cPtr = AriaJavaJNI.ArNMEAParser_Message_timeParseStarted_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ArTime(cPtr, false);
  }

  public ArNMEAParser_Message() {
    this(AriaJavaJNI.new_ArNMEAParser_Message(), true);
  }

}
