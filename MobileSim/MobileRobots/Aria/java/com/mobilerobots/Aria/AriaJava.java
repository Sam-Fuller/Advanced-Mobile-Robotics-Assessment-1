/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class AriaJava implements AriaJavaConstants {
  public static void md5_init(md5_state_t pms) {
    AriaJavaJNI.md5_init(md5_state_t.getCPtr(pms), pms);
  }

  public static void md5_append(md5_state_t pms, SWIGTYPE_p_unsigned_char data, int nbytes) {
    AriaJavaJNI.md5_append(md5_state_t.getCPtr(pms), pms, SWIGTYPE_p_unsigned_char.getCPtr(data), nbytes);
  }

  public static void md5_finish(md5_state_t pms, SWIGTYPE_p_unsigned_char digest) {
    AriaJavaJNI.md5_finish(md5_state_t.getCPtr(pms), pms, SWIGTYPE_p_unsigned_char.getCPtr(digest));
  }

}