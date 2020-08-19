/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.algorithms;

public class KnapsackSolver {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected KnapsackSolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KnapsackSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_KnapsackSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public KnapsackSolver(String solver_name) {
    this(mainJNI.new_KnapsackSolver__SWIG_0(solver_name), true);
  }

  public KnapsackSolver(KnapsackSolver.SolverType solver_type, String solver_name) {
    this(mainJNI.new_KnapsackSolver__SWIG_1(solver_type.swigValue(), solver_name), true);
  }

  public void init(long[] profits, long[][] weights, long[] capacities) {
    mainJNI.KnapsackSolver_init(swigCPtr, this, profits, weights, capacities);
  }

  public long solve() {
    return mainJNI.KnapsackSolver_solve(swigCPtr, this);
  }

  public boolean bestSolutionContains(int item_id) {
    return mainJNI.KnapsackSolver_bestSolutionContains(swigCPtr, this, item_id);
  }

  public boolean isSolutionOptimal() {
    return mainJNI.KnapsackSolver_isSolutionOptimal(swigCPtr, this);
  }

  public String getName() {
    return mainJNI.KnapsackSolver_getName(swigCPtr, this);
  }

  public boolean useReduction() {
    return mainJNI.KnapsackSolver_useReduction(swigCPtr, this);
  }

  public void setUseReduction(boolean use_reduction) {
    mainJNI.KnapsackSolver_setUseReduction(swigCPtr, this, use_reduction);
  }

  public void setTimeLimit(double time_limit_seconds) {
    mainJNI.KnapsackSolver_setTimeLimit(swigCPtr, this, time_limit_seconds);
  }

  public enum SolverType {
    KNAPSACK_BRUTE_FORCE_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_BRUTE_FORCE_SOLVER_get()),
    KNAPSACK_64ITEMS_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_64ITEMS_SOLVER_get()),
    KNAPSACK_DYNAMIC_PROGRAMMING_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_DYNAMIC_PROGRAMMING_SOLVER_get()),
    KNAPSACK_MULTIDIMENSION_CBC_MIP_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_MULTIDIMENSION_CBC_MIP_SOLVER_get()),
    KNAPSACK_MULTIDIMENSION_BRANCH_AND_BOUND_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_MULTIDIMENSION_BRANCH_AND_BOUND_SOLVER_get());

    public final int swigValue() {
      return swigValue;
    }

    public static SolverType swigToEnum(int swigValue) {
      SolverType[] swigValues = SolverType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (SolverType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + SolverType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private SolverType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private SolverType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private SolverType(SolverType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
