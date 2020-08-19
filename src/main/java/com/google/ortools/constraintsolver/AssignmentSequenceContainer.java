/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class AssignmentSequenceContainer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AssignmentSequenceContainer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AssignmentSequenceContainer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_AssignmentSequenceContainer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AssignmentSequenceContainer() {
    this(mainJNI.new_AssignmentSequenceContainer(), true);
  }

  public SequenceVarElement add(SequenceVar var) {
    long cPtr = mainJNI.AssignmentSequenceContainer_add(swigCPtr, this, SequenceVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public SequenceVarElement fastAdd(SequenceVar var) {
    long cPtr = mainJNI.AssignmentSequenceContainer_fastAdd(swigCPtr, this, SequenceVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public SequenceVarElement addAtPosition(SequenceVar var, int position) {
    long cPtr = mainJNI.AssignmentSequenceContainer_addAtPosition(swigCPtr, this, SequenceVar.getCPtr(var), var, position);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public void clear() {
    mainJNI.AssignmentSequenceContainer_clear(swigCPtr, this);
  }

  public void resize(long size) {
    mainJNI.AssignmentSequenceContainer_resize(swigCPtr, this, size);
  }

  public boolean empty() {
    return mainJNI.AssignmentSequenceContainer_empty(swigCPtr, this);
  }

  public void copyIntersection(AssignmentSequenceContainer container) {
    mainJNI.AssignmentSequenceContainer_copyIntersection(swigCPtr, this, AssignmentSequenceContainer.getCPtr(container), container);
  }

  public void copy(AssignmentSequenceContainer container) {
    mainJNI.AssignmentSequenceContainer_copy(swigCPtr, this, AssignmentSequenceContainer.getCPtr(container), container);
  }

  public boolean contains(SequenceVar var) {
    return mainJNI.AssignmentSequenceContainer_contains(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public SequenceVarElement mutableElement(SequenceVar var) {
    long cPtr = mainJNI.AssignmentSequenceContainer_mutableElement__SWIG_0(swigCPtr, this, SequenceVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public SequenceVarElement element(SequenceVar var) {
    return new SequenceVarElement(mainJNI.AssignmentSequenceContainer_element__SWIG_0(swigCPtr, this, SequenceVar.getCPtr(var), var), false);
  }

  public SequenceVarElement mutableElement(int index) {
    long cPtr = mainJNI.AssignmentSequenceContainer_mutableElement__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public SequenceVarElement element(int index) {
    return new SequenceVarElement(mainJNI.AssignmentSequenceContainer_element__SWIG_1(swigCPtr, this, index), false);
  }

  public int size() {
    return mainJNI.AssignmentSequenceContainer_size(swigCPtr, this);
  }

  public void store() {
    mainJNI.AssignmentSequenceContainer_store(swigCPtr, this);
  }

  public void restore() {
    mainJNI.AssignmentSequenceContainer_restore(swigCPtr, this);
  }

  public boolean AreAllElementsBound() {
    return mainJNI.AssignmentSequenceContainer_AreAllElementsBound(swigCPtr, this);
  }

}