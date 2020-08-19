/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class RevInteger {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RevInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RevInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_RevInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RevInteger(int val) {
    this(mainJNI.new_RevInteger(val), true);
  }

  public int value() {
    return mainJNI.RevInteger_value(swigCPtr, this);
  }

  public void setValue(Solver s, int val) {
    mainJNI.RevInteger_setValue(swigCPtr, this, Solver.getCPtr(s), s, val);
  }

}