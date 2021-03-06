/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SolutionPool extends BaseObject {
  private transient long swigCPtr;

  protected SolutionPool(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SolutionPool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SolutionPool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_SolutionPool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void initialize(Assignment assignment) {
    mainJNI.SolutionPool_initialize(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  public void registerNewSolution(Assignment assignment) {
    mainJNI.SolutionPool_registerNewSolution(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  public void getNextSolution(Assignment assignment) {
    mainJNI.SolutionPool_getNextSolution(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  public boolean syncNeeded(Assignment local_assignment) {
    return mainJNI.SolutionPool_syncNeeded(swigCPtr, this, Assignment.getCPtr(local_assignment), local_assignment);
  }

}
