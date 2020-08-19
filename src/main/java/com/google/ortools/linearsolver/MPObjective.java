/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

public class MPObjective {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPObjective(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPObjective obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        main_research_linear_solverJNI.delete_MPObjective(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void clear() {
    main_research_linear_solverJNI.MPObjective_clear(swigCPtr, this);
  }

  public void setCoefficient(MPVariable var, double coeff) {
    main_research_linear_solverJNI.MPObjective_setCoefficient(swigCPtr, this, MPVariable.getCPtr(var), var, coeff);
  }

  public double getCoefficient(MPVariable var) {
    return main_research_linear_solverJNI.MPObjective_getCoefficient(swigCPtr, this, MPVariable.getCPtr(var), var);
  }

  public void setOffset(double value) {
    main_research_linear_solverJNI.MPObjective_setOffset(swigCPtr, this, value);
  }

  public double offset() {
    return main_research_linear_solverJNI.MPObjective_offset(swigCPtr, this);
  }

  public void setOptimizationDirection(boolean maximize) {
    main_research_linear_solverJNI.MPObjective_setOptimizationDirection(swigCPtr, this, maximize);
  }

  public void setMinimization() {
    main_research_linear_solverJNI.MPObjective_setMinimization(swigCPtr, this);
  }

  public void setMaximization() {
    main_research_linear_solverJNI.MPObjective_setMaximization(swigCPtr, this);
  }

  public boolean maximization() {
    return main_research_linear_solverJNI.MPObjective_maximization(swigCPtr, this);
  }

  public boolean minimization() {
    return main_research_linear_solverJNI.MPObjective_minimization(swigCPtr, this);
  }

  public double value() {
    return main_research_linear_solverJNI.MPObjective_value(swigCPtr, this);
  }

  public double bestBound() {
    return main_research_linear_solverJNI.MPObjective_bestBound(swigCPtr, this);
  }

}