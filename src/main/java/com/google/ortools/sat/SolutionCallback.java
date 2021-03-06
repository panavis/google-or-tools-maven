/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.sat;

public class SolutionCallback {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  /*PTRCTOR_VISIBILITY=*/public SolutionCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /*CPTR_VISIBILITY=*/protected static long getCPtr(SolutionCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_SolutionCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mainJNI.SolutionCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mainJNI.SolutionCallback_change_ownership(this, swigCPtr, true);
  }

  public void onSolutionCallback() {
    mainJNI.SolutionCallback_onSolutionCallback(swigCPtr, this);
  }

  public long numBooleans() {
    return mainJNI.SolutionCallback_numBooleans(swigCPtr, this);
  }

  public long numBranches() {
    return mainJNI.SolutionCallback_numBranches(swigCPtr, this);
  }

  public long numConflicts() {
    return mainJNI.SolutionCallback_numConflicts(swigCPtr, this);
  }

  public long numBinaryPropagations() {
    return mainJNI.SolutionCallback_numBinaryPropagations(swigCPtr, this);
  }

  public long numIntegerPropagations() {
    return mainJNI.SolutionCallback_numIntegerPropagations(swigCPtr, this);
  }

  public double wallTime() {
    return mainJNI.SolutionCallback_wallTime(swigCPtr, this);
  }

  public double userTime() {
    return mainJNI.SolutionCallback_userTime(swigCPtr, this);
  }

  public double objectiveValue() {
    return mainJNI.SolutionCallback_objectiveValue(swigCPtr, this);
  }

  public double bestObjectiveBound() {
    return mainJNI.SolutionCallback_bestObjectiveBound(swigCPtr, this);
  }

  public long solutionIntegerValue(int index) {
    return mainJNI.SolutionCallback_solutionIntegerValue(swigCPtr, this, index);
  }

  public boolean solutionBooleanValue(int index) {
    return mainJNI.SolutionCallback_solutionBooleanValue(swigCPtr, this, index);
  }

  public void stopSearch() {
    mainJNI.SolutionCallback_stopSearch(swigCPtr, this);
  }

  public SolutionCallback() {
    this(mainJNI.new_SolutionCallback(), true);
    mainJNI.SolutionCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
