/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class Decision extends BaseObject {
  private transient long swigCPtr;

  protected Decision(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.Decision_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Decision obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_Decision(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mainJNI.Decision_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mainJNI.Decision_change_ownership(this, swigCPtr, true);
  }

  public Decision() {
    this(mainJNI.new_Decision(), true);
    mainJNI.Decision_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void apply(Solver s) {
    mainJNI.Decision_apply(swigCPtr, this, Solver.getCPtr(s), s);
  }

  public void refute(Solver s) {
    mainJNI.Decision_refute(swigCPtr, this, Solver.getCPtr(s), s);
  }

  public String toString() {
    return (getClass() == Decision.class) ? mainJNI.Decision_toString(swigCPtr, this) : mainJNI.Decision_toStringSwigExplicitDecision(swigCPtr, this);
  }

  public void accept(DecisionVisitor visitor) {
    if (getClass() == Decision.class) mainJNI.Decision_accept(swigCPtr, this, DecisionVisitor.getCPtr(visitor), visitor); else mainJNI.Decision_acceptSwigExplicitDecision(swigCPtr, this, DecisionVisitor.getCPtr(visitor), visitor);
  }

}
