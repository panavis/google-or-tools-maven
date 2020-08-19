/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class BooleanVar extends IntVar {
  private transient long swigCPtr;

  protected BooleanVar(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.BooleanVar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BooleanVar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_BooleanVar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static int getKUnboundBooleanVarValue() {
    return mainJNI.BooleanVar_kUnboundBooleanVarValue_get();
  }

  public long min() {
    return mainJNI.BooleanVar_min(swigCPtr, this);
  }

  public void setMin(long m) {
    mainJNI.BooleanVar_setMin(swigCPtr, this, m);
  }

  public long max() {
    return mainJNI.BooleanVar_max(swigCPtr, this);
  }

  public void setMax(long m) {
    mainJNI.BooleanVar_setMax(swigCPtr, this, m);
  }

  public void setRange(long mi, long ma) {
    mainJNI.BooleanVar_setRange(swigCPtr, this, mi, ma);
  }

  public boolean bound() {
    return mainJNI.BooleanVar_bound(swigCPtr, this);
  }

  public long value() {
    return mainJNI.BooleanVar_value(swigCPtr, this);
  }

  public void removeValue(long v) {
    mainJNI.BooleanVar_removeValue(swigCPtr, this, v);
  }

  public void removeInterval(long l, long u) {
    mainJNI.BooleanVar_removeInterval(swigCPtr, this, l, u);
  }

  public void whenBound(Demon d) {
    mainJNI.BooleanVar_whenBound(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenRange(Demon d) {
    mainJNI.BooleanVar_whenRange(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public void whenDomain(Demon d) {
    mainJNI.BooleanVar_whenDomain(swigCPtr, this, Demon.getCPtr(d), d);
  }

  public long size() {
    return mainJNI.BooleanVar_size(swigCPtr, this);
  }

  public boolean contains(long v) {
    return mainJNI.BooleanVar_contains(swigCPtr, this, v);
  }

  public IntVarIterator makeHoleIterator(boolean reversible) {
    long cPtr = mainJNI.BooleanVar_makeHoleIterator(swigCPtr, this, reversible);
    return (cPtr == 0) ? null : new IntVarIterator(cPtr, false);
  }

  public IntVarIterator makeDomainIterator(boolean reversible) {
    long cPtr = mainJNI.BooleanVar_makeDomainIterator(swigCPtr, this, reversible);
    return (cPtr == 0) ? null : new IntVarIterator(cPtr, false);
  }

  public String toString() {
    return mainJNI.BooleanVar_toString(swigCPtr, this);
  }

  public int varType() {
    return mainJNI.BooleanVar_varType(swigCPtr, this);
  }

  public IntVar isEqual(long constant) {
    long cPtr = mainJNI.BooleanVar_isEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isDifferent(long constant) {
    long cPtr = mainJNI.BooleanVar_isDifferent(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isGreaterOrEqual(long constant) {
    long cPtr = mainJNI.BooleanVar_isGreaterOrEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public IntVar isLessOrEqual(long constant) {
    long cPtr = mainJNI.BooleanVar_isLessOrEqual(swigCPtr, this, constant);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public void restoreValue() {
    mainJNI.BooleanVar_restoreValue(swigCPtr, this);
  }

  public String baseName() {
    return mainJNI.BooleanVar_baseName(swigCPtr, this);
  }

  public int rawValue() {
    return mainJNI.BooleanVar_rawValue(swigCPtr, this);
  }

}