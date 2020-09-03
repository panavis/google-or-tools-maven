/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

public class MPVariable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPVariable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPVariable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_MPVariable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String name() {
    return mainJNI.MPVariable_name(swigCPtr, this);
  }

  public void setInteger(boolean integer) {
    mainJNI.MPVariable_setInteger(swigCPtr, this, integer);
  }

  public double solutionValue() {
    return mainJNI.MPVariable_solutionValue(swigCPtr, this);
  }

  public int index() {
    return mainJNI.MPVariable_index(swigCPtr, this);
  }

  public double lb() {
    return mainJNI.MPVariable_lb(swigCPtr, this);
  }

  public double ub() {
    return mainJNI.MPVariable_ub(swigCPtr, this);
  }

  public void setLb(double lb) {
    mainJNI.MPVariable_setLb(swigCPtr, this, lb);
  }

  public void setUb(double ub) {
    mainJNI.MPVariable_setUb(swigCPtr, this, ub);
  }

  public void setBounds(double lb, double ub) {
    mainJNI.MPVariable_setBounds(swigCPtr, this, lb, ub);
  }

  public double reducedCost() {
    return mainJNI.MPVariable_reducedCost(swigCPtr, this);
  }

  public MPSolver.BasisStatus basisStatus() {
    return MPSolver.BasisStatus.swigToEnum(mainJNI.MPVariable_basisStatus(swigCPtr, this));
  }

}
