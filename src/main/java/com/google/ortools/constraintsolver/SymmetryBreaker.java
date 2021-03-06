/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SymmetryBreaker extends DecisionVisitor {
  private transient long swigCPtr;

  protected SymmetryBreaker(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SymmetryBreaker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SymmetryBreaker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_SymmetryBreaker(swigCPtr);
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
    mainJNI.SymmetryBreaker_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mainJNI.SymmetryBreaker_change_ownership(this, swigCPtr, true);
  }

  public SymmetryBreaker() {
    this(mainJNI.new_SymmetryBreaker(), true);
    mainJNI.SymmetryBreaker_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void addIntegerVariableEqualValueClause(IntVar var, long value) {
    mainJNI.SymmetryBreaker_addIntegerVariableEqualValueClause(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

  public void addIntegerVariableGreaterOrEqualValueClause(IntVar var, long value) {
    mainJNI.SymmetryBreaker_addIntegerVariableGreaterOrEqualValueClause(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

  public void addIntegerVariableLessOrEqualValueClause(IntVar var, long value) {
    mainJNI.SymmetryBreaker_addIntegerVariableLessOrEqualValueClause(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

}
