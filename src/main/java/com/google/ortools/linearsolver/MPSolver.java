/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

import java.lang.reflect.*;

public class MPSolver {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPSolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_MPSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Creates and returns an array of variables.
   */
  public MPVariable[] makeVarArray(int count, double lb, double ub, boolean integer) {
    MPVariable[] array = new MPVariable[count];
    for (int i = 0; i < count; ++i) {
      array[i] = makeVar(lb, ub, integer, "");
    }
    return array;
  }

  /**
   * Creates and returns an array of named variables.
   */
  public MPVariable[] makeVarArray(int count, double lb, double ub, boolean integer,
                                   String var_name) {
    MPVariable[] array = new MPVariable[count];
    for (int i = 0; i < count; ++i) {
      array[i] = makeVar(lb, ub, integer, var_name + i);
    }
    return array;
  }

  public MPVariable[] makeNumVarArray(int count, double lb, double ub) {
    return makeVarArray(count, lb, ub, false);
  }

  public MPVariable[] makeNumVarArray(int count, double lb, double ub, String var_name) {
    return makeVarArray(count, lb, ub, false, var_name);
  }

  public MPVariable[] makeIntVarArray(int count, double lb, double ub) {
    return makeVarArray(count, lb, ub, true);
  }

  public MPVariable[] makeIntVarArray(int count, double lb, double ub, String var_name) {
    return makeVarArray(count, lb, ub, true, var_name);
  }

  public MPVariable[] makeBoolVarArray(int count) {
    return makeVarArray(count, 0.0, 1.0, true);
  }

  public MPVariable[] makeBoolVarArray(int count, String var_name) {
    return makeVarArray(count, 0.0, 1.0, true, var_name);
  }

  public MPSolver(String name, MPSolver.OptimizationProblemType problem_type) {
    this(mainJNI.new_MPSolver(name, problem_type.swigValue()), true);
  }

  public static MPSolver createSolver(String name, String solver_id) {
    long cPtr = mainJNI.MPSolver_createSolver(name, solver_id);
    return (cPtr == 0) ? null : new MPSolver(cPtr, true);
  }

  public static boolean supportsProblemType(MPSolver.OptimizationProblemType problem_type) {
    return mainJNI.MPSolver_supportsProblemType(problem_type.swigValue());
  }

  public static boolean parseAndCheckSupportForProblemType(String solver_id) {
    return mainJNI.MPSolver_parseAndCheckSupportForProblemType(solver_id);
  }

  public boolean isMip() {
    return mainJNI.MPSolver_isMip(swigCPtr, this);
  }

  public void clear() {
    mainJNI.MPSolver_clear(swigCPtr, this);
  }

  public int numVariables() {
    return mainJNI.MPSolver_numVariables(swigCPtr, this);
  }

  public MPVariable[] variables() {
  return mainJNI.MPSolver_variables(swigCPtr, this);
}

  public MPVariable lookupVariableOrNull(String var_name) {
    long cPtr = mainJNI.MPSolver_lookupVariableOrNull(swigCPtr, this, var_name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeVar(double lb, double ub, boolean integer, String name) {
    long cPtr = mainJNI.MPSolver_makeVar(swigCPtr, this, lb, ub, integer, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeNumVar(double lb, double ub, String name) {
    long cPtr = mainJNI.MPSolver_makeNumVar(swigCPtr, this, lb, ub, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeIntVar(double lb, double ub, String name) {
    long cPtr = mainJNI.MPSolver_makeIntVar(swigCPtr, this, lb, ub, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public MPVariable makeBoolVar(String name) {
    long cPtr = mainJNI.MPSolver_makeBoolVar(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MPVariable(cPtr, false);
  }

  public int numConstraints() {
    return mainJNI.MPSolver_numConstraints(swigCPtr, this);
  }

  public MPConstraint[] constraints() {
  return mainJNI.MPSolver_constraints(swigCPtr, this);
}

  public MPConstraint lookupConstraintOrNull(String constraint_name) {
    long cPtr = mainJNI.MPSolver_lookupConstraintOrNull(swigCPtr, this, constraint_name);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint(double lb, double ub) {
    long cPtr = mainJNI.MPSolver_makeConstraint__SWIG_0(swigCPtr, this, lb, ub);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint() {
    long cPtr = mainJNI.MPSolver_makeConstraint__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint(double lb, double ub, String name) {
    long cPtr = mainJNI.MPSolver_makeConstraint__SWIG_2(swigCPtr, this, lb, ub, name);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPConstraint makeConstraint(String name) {
    long cPtr = mainJNI.MPSolver_makeConstraint__SWIG_3(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MPConstraint(cPtr, false);
  }

  public MPObjective objective() {
    long cPtr = mainJNI.MPSolver_objective(swigCPtr, this);
    return (cPtr == 0) ? null : new MPObjective(cPtr, false);
  }

  public MPSolver.ResultStatus solve() {
    return MPSolver.ResultStatus.swigToEnum(mainJNI.MPSolver_solve__SWIG_0(swigCPtr, this));
  }

  public MPSolver.ResultStatus solve(MPSolverParameters param) {
    return MPSolver.ResultStatus.swigToEnum(mainJNI.MPSolver_solve__SWIG_1(swigCPtr, this, MPSolverParameters.getCPtr(param), param));
  }

  public double[] computeConstraintActivities() {
  return mainJNI.MPSolver_computeConstraintActivities(swigCPtr, this);
}

  public boolean verifySolution(double tolerance, boolean log_errors) {
    return mainJNI.MPSolver_verifySolution(swigCPtr, this, tolerance, log_errors);
  }

  public void reset() {
    mainJNI.MPSolver_reset(swigCPtr, this);
  }

  public boolean interruptSolve() {
    return mainJNI.MPSolver_interruptSolve(swigCPtr, this);
  }

  public boolean setSolverSpecificParametersAsString(String parameters) {
    return mainJNI.MPSolver_setSolverSpecificParametersAsString(swigCPtr, this, parameters);
  }

  public static double infinity() {
    return mainJNI.MPSolver_infinity();
  }

  public void enableOutput() {
    mainJNI.MPSolver_enableOutput(swigCPtr, this);
  }

  public void suppressOutput() {
    mainJNI.MPSolver_suppressOutput(swigCPtr, this);
  }

  public long iterations() {
    return mainJNI.MPSolver_iterations(swigCPtr, this);
  }

  public long nodes() {
    return mainJNI.MPSolver_nodes(swigCPtr, this);
  }

  public double computeExactConditionNumber() {
    return mainJNI.MPSolver_computeExactConditionNumber(swigCPtr, this);
  }

  public void setTimeLimit(long time_limit_milliseconds) {
    mainJNI.MPSolver_setTimeLimit(swigCPtr, this, time_limit_milliseconds);
  }

  public long wallTime() {
    return mainJNI.MPSolver_wallTime(swigCPtr, this);
  }

  public static void setGurobiLibraryPath(String full_library_path) {
    mainJNI.MPSolver_setGurobiLibraryPath(full_library_path);
  }

  public String loadModelFromProto(com.google.ortools.linearsolver.MPModelProto input_model) {
    return mainJNI.MPSolver_loadModelFromProto(swigCPtr, this, input_model.toByteArray());
  }

  public String loadModelFromProtoWithUniqueNamesOrDie(com.google.ortools.linearsolver.MPModelProto input_model) {
    return mainJNI.MPSolver_loadModelFromProtoWithUniqueNamesOrDie(swigCPtr, this, input_model.toByteArray());
  }

  public com.google.ortools.linearsolver.MPModelProto exportModelToProto() {
  byte[] buf = mainJNI.MPSolver_exportModelToProto(swigCPtr, this);
  if (buf == null || buf.length == 0) {
    return null;
  }
  try {
    return com.google.ortools.linearsolver.MPModelProto.parseFrom(buf);
  } catch (com.google.protobuf.InvalidProtocolBufferException e) {
    throw new RuntimeException(
        "Unable to parse com.google.ortools.linearsolver.MPModelProto protocol message.");
  }
}

  public com.google.ortools.linearsolver.MPSolutionResponse createSolutionResponseProto() {
  byte[] buf = mainJNI.MPSolver_createSolutionResponseProto(swigCPtr, this);
  if (buf == null || buf.length == 0) {
    return null;
  }
  try {
    return com.google.ortools.linearsolver.MPSolutionResponse.parseFrom(buf);
  } catch (com.google.protobuf.InvalidProtocolBufferException e) {
    throw new RuntimeException(
        "Unable to parse com.google.ortools.linearsolver.MPSolutionResponse protocol message.");
  }
}

  public boolean loadSolutionFromProto(com.google.ortools.linearsolver.MPSolutionResponse response) {
    return mainJNI.MPSolver_loadSolutionFromProto(swigCPtr, this, response.toByteArray());
  }

  public static com.google.ortools.linearsolver.MPSolutionResponse solveWithProto(com.google.ortools.linearsolver.MPModelRequest model_request) {
  byte[] buf = mainJNI.MPSolver_solveWithProto(model_request.toByteArray());
  if (buf == null || buf.length == 0) {
    return null;
  }
  try {
    return com.google.ortools.linearsolver.MPSolutionResponse.parseFrom(buf);
  } catch (com.google.protobuf.InvalidProtocolBufferException e) {
    throw new RuntimeException(
        "Unable to parse com.google.ortools.linearsolver.MPSolutionResponse protocol message.");
  }
}

  public String exportModelAsLpFormat(MPModelExportOptions options) {
    return mainJNI.MPSolver_exportModelAsLpFormat__SWIG_0(swigCPtr, this, MPModelExportOptions.getCPtr(options), options);
  }

  public String exportModelAsLpFormat() {
    return mainJNI.MPSolver_exportModelAsLpFormat__SWIG_1(swigCPtr, this);
  }

  public String exportModelAsMpsFormat(MPModelExportOptions options) {
    return mainJNI.MPSolver_exportModelAsMpsFormat__SWIG_0(swigCPtr, this, MPModelExportOptions.getCPtr(options), options);
  }

  public String exportModelAsMpsFormat() {
    return mainJNI.MPSolver_exportModelAsMpsFormat__SWIG_1(swigCPtr, this);
  }

  public void setHint(MPVariable[] variables, double[] values) {
    mainJNI.MPSolver_setHint(swigCPtr, this, variables, values);
  }

  public boolean setNumThreads(int num_theads) {
    return mainJNI.MPSolver_setNumThreads(swigCPtr, this, num_theads);
  }

  public enum OptimizationProblemType {
    CLP_LINEAR_PROGRAMMING(mainJNI.MPSolver_CLP_LINEAR_PROGRAMMING_get()),
    GLPK_LINEAR_PROGRAMMING(mainJNI.MPSolver_GLPK_LINEAR_PROGRAMMING_get()),
    GLOP_LINEAR_PROGRAMMING(mainJNI.MPSolver_GLOP_LINEAR_PROGRAMMING_get()),
    SCIP_MIXED_INTEGER_PROGRAMMING(mainJNI.MPSolver_SCIP_MIXED_INTEGER_PROGRAMMING_get()),
    GLPK_MIXED_INTEGER_PROGRAMMING(mainJNI.MPSolver_GLPK_MIXED_INTEGER_PROGRAMMING_get()),
    CBC_MIXED_INTEGER_PROGRAMMING(mainJNI.MPSolver_CBC_MIXED_INTEGER_PROGRAMMING_get()),
    GUROBI_LINEAR_PROGRAMMING(mainJNI.MPSolver_GUROBI_LINEAR_PROGRAMMING_get()),
    GUROBI_MIXED_INTEGER_PROGRAMMING(mainJNI.MPSolver_GUROBI_MIXED_INTEGER_PROGRAMMING_get()),
    CPLEX_LINEAR_PROGRAMMING(mainJNI.MPSolver_CPLEX_LINEAR_PROGRAMMING_get()),
    CPLEX_MIXED_INTEGER_PROGRAMMING(mainJNI.MPSolver_CPLEX_MIXED_INTEGER_PROGRAMMING_get()),
    XPRESS_LINEAR_PROGRAMMING(mainJNI.MPSolver_XPRESS_LINEAR_PROGRAMMING_get()),
    XPRESS_MIXED_INTEGER_PROGRAMMING(mainJNI.MPSolver_XPRESS_MIXED_INTEGER_PROGRAMMING_get()),
    BOP_INTEGER_PROGRAMMING(mainJNI.MPSolver_BOP_INTEGER_PROGRAMMING_get()),
    SAT_INTEGER_PROGRAMMING(mainJNI.MPSolver_SAT_INTEGER_PROGRAMMING_get());

    public final int swigValue() {
      return swigValue;
    }

    public static OptimizationProblemType swigToEnum(int swigValue) {
      OptimizationProblemType[] swigValues = OptimizationProblemType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (OptimizationProblemType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + OptimizationProblemType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private OptimizationProblemType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private OptimizationProblemType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private OptimizationProblemType(OptimizationProblemType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum ResultStatus {
    OPTIMAL,
    FEASIBLE,
    INFEASIBLE,
    UNBOUNDED,
    ABNORMAL,
    NOT_SOLVED(mainJNI.MPSolver_NOT_SOLVED_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ResultStatus swigToEnum(int swigValue) {
      ResultStatus[] swigValues = ResultStatus.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ResultStatus swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ResultStatus.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ResultStatus() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ResultStatus(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ResultStatus(ResultStatus swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum BasisStatus {
    FREE(mainJNI.MPSolver_FREE_get()),
    AT_LOWER_BOUND,
    AT_UPPER_BOUND,
    FIXED_VALUE,
    BASIC;

    public final int swigValue() {
      return swigValue;
    }

    public static BasisStatus swigToEnum(int swigValue) {
      BasisStatus[] swigValues = BasisStatus.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (BasisStatus swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + BasisStatus.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private BasisStatus() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private BasisStatus(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private BasisStatus(BasisStatus swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
