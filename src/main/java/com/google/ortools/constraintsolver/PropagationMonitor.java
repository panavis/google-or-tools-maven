/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class PropagationMonitor extends SearchMonitor {
  private transient long swigCPtr;

  protected PropagationMonitor(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.PropagationMonitor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PropagationMonitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_PropagationMonitor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String toString() {
    return mainJNI.PropagationMonitor_toString(swigCPtr, this);
  }

  public void beginConstraintInitialPropagation(Constraint constraint) {
    mainJNI.PropagationMonitor_beginConstraintInitialPropagation(swigCPtr, this, Constraint.getCPtr(constraint), constraint);
  }

  public void endConstraintInitialPropagation(Constraint constraint) {
    mainJNI.PropagationMonitor_endConstraintInitialPropagation(swigCPtr, this, Constraint.getCPtr(constraint), constraint);
  }

  public void beginNestedConstraintInitialPropagation(Constraint parent, Constraint nested) {
    mainJNI.PropagationMonitor_beginNestedConstraintInitialPropagation(swigCPtr, this, Constraint.getCPtr(parent), parent, Constraint.getCPtr(nested), nested);
  }

  public void endNestedConstraintInitialPropagation(Constraint parent, Constraint nested) {
    mainJNI.PropagationMonitor_endNestedConstraintInitialPropagation(swigCPtr, this, Constraint.getCPtr(parent), parent, Constraint.getCPtr(nested), nested);
  }

  public void registerDemon(Demon demon) {
    mainJNI.PropagationMonitor_registerDemon(swigCPtr, this, Demon.getCPtr(demon), demon);
  }

  public void beginDemonRun(Demon demon) {
    mainJNI.PropagationMonitor_beginDemonRun(swigCPtr, this, Demon.getCPtr(demon), demon);
  }

  public void endDemonRun(Demon demon) {
    mainJNI.PropagationMonitor_endDemonRun(swigCPtr, this, Demon.getCPtr(demon), demon);
  }

  public void startProcessingIntegerVariable(IntVar var) {
    mainJNI.PropagationMonitor_startProcessingIntegerVariable(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public void endProcessingIntegerVariable(IntVar var) {
    mainJNI.PropagationMonitor_endProcessingIntegerVariable(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public void pushContext(String context) {
    mainJNI.PropagationMonitor_pushContext(swigCPtr, this, context);
  }

  public void popContext() {
    mainJNI.PropagationMonitor_popContext(swigCPtr, this);
  }

  public void setMin(IntExpr expr, long new_min) {
    mainJNI.PropagationMonitor_setMin__SWIG_0(swigCPtr, this, IntExpr.getCPtr(expr), expr, new_min);
  }

  public void setMax(IntExpr expr, long new_max) {
    mainJNI.PropagationMonitor_setMax__SWIG_0(swigCPtr, this, IntExpr.getCPtr(expr), expr, new_max);
  }

  public void setRange(IntExpr expr, long new_min, long new_max) {
    mainJNI.PropagationMonitor_setRange__SWIG_0(swigCPtr, this, IntExpr.getCPtr(expr), expr, new_min, new_max);
  }

  public void setMin(IntVar var, long new_min) {
    mainJNI.PropagationMonitor_setMin__SWIG_1(swigCPtr, this, IntVar.getCPtr(var), var, new_min);
  }

  public void setMax(IntVar var, long new_max) {
    mainJNI.PropagationMonitor_setMax__SWIG_1(swigCPtr, this, IntVar.getCPtr(var), var, new_max);
  }

  public void setRange(IntVar var, long new_min, long new_max) {
    mainJNI.PropagationMonitor_setRange__SWIG_1(swigCPtr, this, IntVar.getCPtr(var), var, new_min, new_max);
  }

  public void removeValue(IntVar var, long value) {
    mainJNI.PropagationMonitor_removeValue(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

  public void setValue(IntVar var, long value) {
    mainJNI.PropagationMonitor_setValue__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

  public void removeInterval(IntVar var, long imin, long imax) {
    mainJNI.PropagationMonitor_removeInterval(swigCPtr, this, IntVar.getCPtr(var), var, imin, imax);
  }

  public void setValue(IntVar var, long[] values) {
    mainJNI.PropagationMonitor_setValue__SWIG_1(swigCPtr, this, IntVar.getCPtr(var), var, values);
  }

  public void removeValues(IntVar var, long[] values) {
    mainJNI.PropagationMonitor_removeValues(swigCPtr, this, IntVar.getCPtr(var), var, values);
  }

  public void setStartMin(IntervalVar var, long new_min) {
    mainJNI.PropagationMonitor_setStartMin(swigCPtr, this, IntervalVar.getCPtr(var), var, new_min);
  }

  public void setStartMax(IntervalVar var, long new_max) {
    mainJNI.PropagationMonitor_setStartMax(swigCPtr, this, IntervalVar.getCPtr(var), var, new_max);
  }

  public void setStartRange(IntervalVar var, long new_min, long new_max) {
    mainJNI.PropagationMonitor_setStartRange(swigCPtr, this, IntervalVar.getCPtr(var), var, new_min, new_max);
  }

  public void setEndMin(IntervalVar var, long new_min) {
    mainJNI.PropagationMonitor_setEndMin(swigCPtr, this, IntervalVar.getCPtr(var), var, new_min);
  }

  public void setEndMax(IntervalVar var, long new_max) {
    mainJNI.PropagationMonitor_setEndMax(swigCPtr, this, IntervalVar.getCPtr(var), var, new_max);
  }

  public void setEndRange(IntervalVar var, long new_min, long new_max) {
    mainJNI.PropagationMonitor_setEndRange(swigCPtr, this, IntervalVar.getCPtr(var), var, new_min, new_max);
  }

  public void setDurationMin(IntervalVar var, long new_min) {
    mainJNI.PropagationMonitor_setDurationMin(swigCPtr, this, IntervalVar.getCPtr(var), var, new_min);
  }

  public void setDurationMax(IntervalVar var, long new_max) {
    mainJNI.PropagationMonitor_setDurationMax(swigCPtr, this, IntervalVar.getCPtr(var), var, new_max);
  }

  public void setDurationRange(IntervalVar var, long new_min, long new_max) {
    mainJNI.PropagationMonitor_setDurationRange(swigCPtr, this, IntervalVar.getCPtr(var), var, new_min, new_max);
  }

  public void setPerformed(IntervalVar var, boolean value) {
    mainJNI.PropagationMonitor_setPerformed(swigCPtr, this, IntervalVar.getCPtr(var), var, value);
  }

  public void rankFirst(SequenceVar var, int index) {
    mainJNI.PropagationMonitor_rankFirst(swigCPtr, this, SequenceVar.getCPtr(var), var, index);
  }

  public void rankNotFirst(SequenceVar var, int index) {
    mainJNI.PropagationMonitor_rankNotFirst(swigCPtr, this, SequenceVar.getCPtr(var), var, index);
  }

  public void rankLast(SequenceVar var, int index) {
    mainJNI.PropagationMonitor_rankLast(swigCPtr, this, SequenceVar.getCPtr(var), var, index);
  }

  public void rankNotLast(SequenceVar var, int index) {
    mainJNI.PropagationMonitor_rankNotLast(swigCPtr, this, SequenceVar.getCPtr(var), var, index);
  }

  public void rankSequence(SequenceVar var, int[] rank_first, int[] rank_last, int[] unperformed) {
    mainJNI.PropagationMonitor_rankSequence(swigCPtr, this, SequenceVar.getCPtr(var), var, rank_first, rank_last, unperformed);
  }

  public void install() {
    mainJNI.PropagationMonitor_install(swigCPtr, this);
  }

}
