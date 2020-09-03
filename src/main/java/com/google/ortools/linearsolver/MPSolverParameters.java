/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

public class MPSolverParameters {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPSolverParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPSolverParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_MPSolverParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static double getKDefaultRelativeMipGap() {
    return mainJNI.MPSolverParameters_kDefaultRelativeMipGap_get();
  }

  public static double getKDefaultPrimalTolerance() {
    return mainJNI.MPSolverParameters_kDefaultPrimalTolerance_get();
  }

  public static double getKDefaultDualTolerance() {
    return mainJNI.MPSolverParameters_kDefaultDualTolerance_get();
  }

  public static MPSolverParameters.PresolveValues getKDefaultPresolve() {
    return MPSolverParameters.PresolveValues.swigToEnum(mainJNI.MPSolverParameters_kDefaultPresolve_get());
  }

  public static MPSolverParameters.IncrementalityValues getKDefaultIncrementality() {
    return MPSolverParameters.IncrementalityValues.swigToEnum(mainJNI.MPSolverParameters_kDefaultIncrementality_get());
  }

  public MPSolverParameters() {
    this(mainJNI.new_MPSolverParameters(), true);
  }

  public void setDoubleParam(MPSolverParameters.DoubleParam param, double value) {
    mainJNI.MPSolverParameters_setDoubleParam(swigCPtr, this, param.swigValue(), value);
  }

  public void setIntegerParam(MPSolverParameters.IntegerParam param, int value) {
    mainJNI.MPSolverParameters_setIntegerParam(swigCPtr, this, param.swigValue(), value);
  }

  public double getDoubleParam(MPSolverParameters.DoubleParam param) {
    return mainJNI.MPSolverParameters_getDoubleParam(swigCPtr, this, param.swigValue());
  }

  public int getIntegerParam(MPSolverParameters.IntegerParam param) {
    return mainJNI.MPSolverParameters_getIntegerParam(swigCPtr, this, param.swigValue());
  }

  public enum DoubleParam {
    RELATIVE_MIP_GAP(mainJNI.MPSolverParameters_RELATIVE_MIP_GAP_get()),
    PRIMAL_TOLERANCE(mainJNI.MPSolverParameters_PRIMAL_TOLERANCE_get()),
    DUAL_TOLERANCE(mainJNI.MPSolverParameters_DUAL_TOLERANCE_get());

    public final int swigValue() {
      return swigValue;
    }

    public static DoubleParam swigToEnum(int swigValue) {
      DoubleParam[] swigValues = DoubleParam.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (DoubleParam swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + DoubleParam.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private DoubleParam() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private DoubleParam(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private DoubleParam(DoubleParam swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum IntegerParam {
    PRESOLVE(mainJNI.MPSolverParameters_PRESOLVE_get()),
    LP_ALGORITHM(mainJNI.MPSolverParameters_LP_ALGORITHM_get()),
    INCREMENTALITY(mainJNI.MPSolverParameters_INCREMENTALITY_get()),
    SCALING(mainJNI.MPSolverParameters_SCALING_get());

    public final int swigValue() {
      return swigValue;
    }

    public static IntegerParam swigToEnum(int swigValue) {
      IntegerParam[] swigValues = IntegerParam.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (IntegerParam swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + IntegerParam.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private IntegerParam() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private IntegerParam(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private IntegerParam(IntegerParam swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum PresolveValues {
    PRESOLVE_OFF(mainJNI.MPSolverParameters_PRESOLVE_OFF_get()),
    PRESOLVE_ON(mainJNI.MPSolverParameters_PRESOLVE_ON_get());

    public final int swigValue() {
      return swigValue;
    }

    public static PresolveValues swigToEnum(int swigValue) {
      PresolveValues[] swigValues = PresolveValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (PresolveValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + PresolveValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private PresolveValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private PresolveValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private PresolveValues(PresolveValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum LpAlgorithmValues {
    DUAL(mainJNI.MPSolverParameters_DUAL_get()),
    PRIMAL(mainJNI.MPSolverParameters_PRIMAL_get()),
    BARRIER(mainJNI.MPSolverParameters_BARRIER_get());

    public final int swigValue() {
      return swigValue;
    }

    public static LpAlgorithmValues swigToEnum(int swigValue) {
      LpAlgorithmValues[] swigValues = LpAlgorithmValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (LpAlgorithmValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + LpAlgorithmValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private LpAlgorithmValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private LpAlgorithmValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private LpAlgorithmValues(LpAlgorithmValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum IncrementalityValues {
    INCREMENTALITY_OFF(mainJNI.MPSolverParameters_INCREMENTALITY_OFF_get()),
    INCREMENTALITY_ON(mainJNI.MPSolverParameters_INCREMENTALITY_ON_get());

    public final int swigValue() {
      return swigValue;
    }

    public static IncrementalityValues swigToEnum(int swigValue) {
      IncrementalityValues[] swigValues = IncrementalityValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (IncrementalityValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + IncrementalityValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private IncrementalityValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private IncrementalityValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private IncrementalityValues(IncrementalityValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum ScalingValues {
    SCALING_OFF(mainJNI.MPSolverParameters_SCALING_OFF_get()),
    SCALING_ON(mainJNI.MPSolverParameters_SCALING_ON_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ScalingValues swigToEnum(int swigValue) {
      ScalingValues[] swigValues = ScalingValues.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ScalingValues swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ScalingValues.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ScalingValues() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ScalingValues(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ScalingValues(ScalingValues swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
