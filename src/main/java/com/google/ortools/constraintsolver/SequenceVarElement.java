/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SequenceVarElement extends AssignmentElement {
  private transient long swigCPtr;

  protected SequenceVarElement(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SequenceVarElement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SequenceVarElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_SequenceVarElement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SequenceVarElement() {
    this(mainJNI.new_SequenceVarElement__SWIG_0(), true);
  }

  public SequenceVarElement(SequenceVar var) {
    this(mainJNI.new_SequenceVarElement__SWIG_1(SequenceVar.getCPtr(var), var), true);
  }

  public void reset(SequenceVar var) {
    mainJNI.SequenceVarElement_reset(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public SequenceVarElement clone() {
    long cPtr = mainJNI.SequenceVarElement_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public void copy(SequenceVarElement element) {
    mainJNI.SequenceVarElement_copy(swigCPtr, this, SequenceVarElement.getCPtr(element), element);
  }

  public SequenceVar var() {
    long cPtr = mainJNI.SequenceVarElement_var(swigCPtr, this);
    return (cPtr == 0) ? null : new SequenceVar(cPtr, false);
  }

  public void store() {
    mainJNI.SequenceVarElement_store(swigCPtr, this);
  }

  public void restore() {
    mainJNI.SequenceVarElement_restore(swigCPtr, this);
  }

  public int[] forwardSequence() {
  return mainJNI.SequenceVarElement_forwardSequence(swigCPtr, this);
}

  public int[] backwardSequence() {
  return mainJNI.SequenceVarElement_backwardSequence(swigCPtr, this);
}

  public int[] unperformed() {
  return mainJNI.SequenceVarElement_unperformed(swigCPtr, this);
}

  public void setSequence(int[] forward_sequence, int[] backward_sequence, int[] unperformed) {
    mainJNI.SequenceVarElement_setSequence(swigCPtr, this, forward_sequence, backward_sequence, unperformed);
  }

  public void setForwardSequence(int[] forward_sequence) {
    mainJNI.SequenceVarElement_setForwardSequence(swigCPtr, this, forward_sequence);
  }

  public void setBackwardSequence(int[] backward_sequence) {
    mainJNI.SequenceVarElement_setBackwardSequence(swigCPtr, this, backward_sequence);
  }

  public void setUnperformed(int[] unperformed) {
    mainJNI.SequenceVarElement_setUnperformed(swigCPtr, this, unperformed);
  }

  public boolean bound() {
    return mainJNI.SequenceVarElement_bound(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.SequenceVarElement_toString(swigCPtr, this);
  }

}
