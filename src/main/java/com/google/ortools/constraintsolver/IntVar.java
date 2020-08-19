/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class IntVar extends IntExpr {
  private transient long swigCPtr;

  protected IntVar(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.IntVar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_IntVar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean isVar() {
    return mainJNI.IntVar_isVar(swigCPtr, this);
  }

  public IntVar var() {
    long cPtr = mainJNI.IntVar_var(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public long value() {
    return mainJNI.IntVar_value(swigCPtr, this);
  }

  public void removeValue(long v) {
    mainJNI.IntVar_removeValue(swigCPtr, this, v);
  }

  public void removeInterval(long l, long u) {
    mainJNI.IntVar_removeInterval(swigCPtr, this, l, u);
  }

  public void removeValues(long[] values) {
    mainJNI.IntVar_removeValues(swigCPtr, this, values);
  }

  public void setValue(long[] values) {
    mainJNI.IntVar_setValue(swigCPtr, this, values);
  }

  public void whenBound(Demon d) {
    mainJNI.IntVar_whenBound__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenBound(Runnable closure) {
    mainJNI.IntVar_whenBound__SWIG_1(swigCPtr, this, closure);
  }

  public void whenDomain(Demon d) {
    mainJNI.IntVar_whenDomain__SWIG_0(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenDomain(Runnable closure) {
    mainJNI.IntVar_whenDomain__SWIG_1(swigCPtr, this, closure);
  }

  public long size() {
    return mainJNI.IntVar_size(swigCPtr, this);
  }

  public boolean contains(long v) {
    return mainJNI.IntVar_contains(swigCPtr, this, v);
  }

  public IntVarIterator makeHoleIterator(boolean reversible) {
    long cPtr = mainJNI.IntVar_makeHoleIterator(swigCPtr, this, reversible);
    return (cPtr == 0) ? null : new IntVarIterator(cPtr, false);
  }

  public IntVarIterator makeDomainIterator(boolean reversible) {
    long cPtr = mainJNI.IntVar_makeDomainIterator(swigCPtr, this, reversible);
    return (cPtr == 0) ? null : new IntVarIterator(cPtr, false);
  }

  public long oldMin() {
    return mainJNI.IntVar_oldMin(swigCPtr, this);
  }

  public long oldMax() {
    return mainJNI.IntVar_oldMax(swigCPtr, this);
  }

  public int varType() {
    return mainJNI.IntVar_varType(swigCPtr, this);
  }

  public void accept(ModelVisitor visitor) {
    mainJNI.IntVar_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

  public IntVar isEqual(long constant) {
    long cPtr = mainJNI.IntVar_isEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isDifferent(long constant) {
    long cPtr = mainJNI.IntVar_isDifferent(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isGreaterOrEqual(long constant) {
    long cPtr = mainJNI.IntVar_isGreaterOrEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isLessOrEqual(long constant) {
    long cPtr = mainJNI.IntVar_isLessOrEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public int index() {
    return mainJNI.IntVar_index(swigCPtr, this);
  }

}
