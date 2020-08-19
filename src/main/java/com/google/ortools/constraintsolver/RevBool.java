/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class RevBool {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RevBool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RevBool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_RevBool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RevBool(boolean val) {
    this(mainJNI.new_RevBool(val), true);
  }

  public boolean value() {
    return mainJNI.RevBool_value(swigCPtr, this);
  }

  public void setValue(Solver s, boolean val) {
    mainJNI.RevBool_setValue(swigCPtr, this, Solver.getCPtr(s), s, val);
  }

}