/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class ModelCache {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelCache(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelCache obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_ModelCache(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void clear() {
    mainJNI.ModelCache_clear(swigCPtr, this);
  }

  public Constraint findVoidConstraint(int type) {
    long cPtr = mainJNI.ModelCache_findVoidConstraint(swigCPtr, this, type);
    return (cPtr == 0) ? null : new Constraint(cPtr, false);
  }

  public void insertVoidConstraint(Constraint ct, int type) {
    mainJNI.ModelCache_insertVoidConstraint(swigCPtr, this, Constraint.getCPtr(ct), ct, type);
  }

  public Constraint findVarConstantConstraint(IntVar var, long value, int type) {
    long cPtr = mainJNI.ModelCache_findVarConstantConstraint(swigCPtr, this, IntVar.getCPtr(var), var, value, type);
    return (cPtr == 0) ? null : new Constraint(cPtr, false);
  }

  public void insertVarConstantConstraint(Constraint ct, IntVar var, long value, int type) {
    mainJNI.ModelCache_insertVarConstantConstraint(swigCPtr, this, Constraint.getCPtr(ct), ct, IntVar.getCPtr(var), var, value, type);
  }

  public Constraint findVarConstantConstantConstraint(IntVar var, long value1, long value2, int type) {
    long cPtr = mainJNI.ModelCache_findVarConstantConstantConstraint(swigCPtr, this, IntVar.getCPtr(var), var, value1, value2, type);
    return (cPtr == 0) ? null : new Constraint(cPtr, false);
  }

  public void insertVarConstantConstantConstraint(Constraint ct, IntVar var, long value1, long value2, int type) {
    mainJNI.ModelCache_insertVarConstantConstantConstraint(swigCPtr, this, Constraint.getCPtr(ct), ct, IntVar.getCPtr(var), var, value1, value2, type);
  }

  public Constraint findExprExprConstraint(IntExpr expr1, IntExpr expr2, int type) {
    long cPtr = mainJNI.ModelCache_findExprExprConstraint(swigCPtr, this, IntExpr.getCPtr(expr1), expr1, IntExpr.getCPtr(expr2), expr2, type);
    return (cPtr == 0) ? null : new Constraint(cPtr, false);
  }

  public void insertExprExprConstraint(Constraint ct, IntExpr expr1, IntExpr expr2, int type) {
    mainJNI.ModelCache_insertExprExprConstraint(swigCPtr, this, Constraint.getCPtr(ct), ct, IntExpr.getCPtr(expr1), expr1, IntExpr.getCPtr(expr2), expr2, type);
  }

  public IntExpr findExprExpression(IntExpr expr, int type) {
    long cPtr = mainJNI.ModelCache_findExprExpression(swigCPtr, this, IntExpr.getCPtr(expr), expr, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertExprExpression(IntExpr expression, IntExpr expr, int type) {
    mainJNI.ModelCache_insertExprExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, IntExpr.getCPtr(expr), expr, type);
  }

  public IntExpr findExprConstantExpression(IntExpr expr, long value, int type) {
    long cPtr = mainJNI.ModelCache_findExprConstantExpression(swigCPtr, this, IntExpr.getCPtr(expr), expr, value, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertExprConstantExpression(IntExpr expression, IntExpr var, long value, int type) {
    mainJNI.ModelCache_insertExprConstantExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, IntExpr.getCPtr(var), var, value, type);
  }

  public IntExpr findExprExprExpression(IntExpr var1, IntExpr var2, int type) {
    long cPtr = mainJNI.ModelCache_findExprExprExpression(swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertExprExprExpression(IntExpr expression, IntExpr var1, IntExpr var2, int type) {
    mainJNI.ModelCache_insertExprExprExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, type);
  }

  public IntExpr findExprExprConstantExpression(IntExpr var1, IntExpr var2, long constant, int type) {
    long cPtr = mainJNI.ModelCache_findExprExprConstantExpression(swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, constant, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertExprExprConstantExpression(IntExpr expression, IntExpr var1, IntExpr var2, long constant, int type) {
    mainJNI.ModelCache_insertExprExprConstantExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, constant, type);
  }

  public IntExpr findVarConstantConstantExpression(IntVar var, long value1, long value2, int type) {
    long cPtr = mainJNI.ModelCache_findVarConstantConstantExpression(swigCPtr, this, IntVar.getCPtr(var), var, value1, value2, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertVarConstantConstantExpression(IntExpr expression, IntVar var, long value1, long value2, int type) {
    mainJNI.ModelCache_insertVarConstantConstantExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, IntVar.getCPtr(var), var, value1, value2, type);
  }

  public IntExpr findVarConstantArrayExpression(IntVar var, long[] values, int type) {
    long cPtr = mainJNI.ModelCache_findVarConstantArrayExpression(swigCPtr, this, IntVar.getCPtr(var), var, values, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertVarConstantArrayExpression(IntExpr expression, IntVar var, long[] values, int type) {
    mainJNI.ModelCache_insertVarConstantArrayExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, IntVar.getCPtr(var), var, values, type);
  }

  public IntExpr findVarArrayExpression(IntVar[] vars, int type) {
    long cPtr = mainJNI.ModelCache_findVarArrayExpression(swigCPtr, this, vars, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertVarArrayExpression(IntExpr expression, IntVar[] vars, int type) {
    mainJNI.ModelCache_insertVarArrayExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, vars, type);
  }

  public IntExpr findVarArrayConstantArrayExpression(IntVar[] vars, long[] values, int type) {
    long cPtr = mainJNI.ModelCache_findVarArrayConstantArrayExpression(swigCPtr, this, vars, values, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertVarArrayConstantArrayExpression(IntExpr expression, IntVar[] var, long[] values, int type) {
    mainJNI.ModelCache_insertVarArrayConstantArrayExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, var, values, type);
  }

  public IntExpr findVarArrayConstantExpression(IntVar[] vars, long value, int type) {
    long cPtr = mainJNI.ModelCache_findVarArrayConstantExpression(swigCPtr, this, vars, value, type);
    return (cPtr == 0) ? null : new IntExpr(cPtr, false);
  }

  public void insertVarArrayConstantExpression(IntExpr expression, IntVar[] var, long value, int type) {
    mainJNI.ModelCache_insertVarArrayConstantExpression(swigCPtr, this, IntExpr.getCPtr(expression), expression, var, value, type);
  }

  public Solver solver() {
    long cPtr = mainJNI.ModelCache_solver(swigCPtr, this);
    return (cPtr == 0) ? null : new Solver(cPtr, false);
  }

  // VoidConstraintType 
  public final static int VOID_FALSE_CONSTRAINT = mainJNI.ModelCache_VOID_FALSE_CONSTRAINT_get();
  public final static int VOID_TRUE_CONSTRAINT = mainJNI.ModelCache_VOID_TRUE_CONSTRAINT_get();
  public final static int VOID_CONSTRAINT_MAX = mainJNI.ModelCache_VOID_CONSTRAINT_MAX_get();

  // VarConstantConstraintType 
  public final static int VAR_CONSTANT_EQUALITY = mainJNI.ModelCache_VAR_CONSTANT_EQUALITY_get();
  public final static int VAR_CONSTANT_GREATER_OR_EQUAL = mainJNI.ModelCache_VAR_CONSTANT_GREATER_OR_EQUAL_get();
  public final static int VAR_CONSTANT_LESS_OR_EQUAL = mainJNI.ModelCache_VAR_CONSTANT_LESS_OR_EQUAL_get();
  public final static int VAR_CONSTANT_NON_EQUALITY = mainJNI.ModelCache_VAR_CONSTANT_NON_EQUALITY_get();
  public final static int VAR_CONSTANT_CONSTRAINT_MAX = mainJNI.ModelCache_VAR_CONSTANT_CONSTRAINT_MAX_get();

  // VarConstantConstantConstraintType 
  public final static int VAR_CONSTANT_CONSTANT_BETWEEN = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_BETWEEN_get();
  public final static int VAR_CONSTANT_CONSTANT_CONSTRAINT_MAX = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_CONSTRAINT_MAX_get();

  // ExprExprConstraintType 
  public final static int EXPR_EXPR_EQUALITY = mainJNI.ModelCache_EXPR_EXPR_EQUALITY_get();
  public final static int EXPR_EXPR_GREATER = mainJNI.ModelCache_EXPR_EXPR_GREATER_get();
  public final static int EXPR_EXPR_GREATER_OR_EQUAL = mainJNI.ModelCache_EXPR_EXPR_GREATER_OR_EQUAL_get();
  public final static int EXPR_EXPR_LESS = mainJNI.ModelCache_EXPR_EXPR_LESS_get();
  public final static int EXPR_EXPR_LESS_OR_EQUAL = mainJNI.ModelCache_EXPR_EXPR_LESS_OR_EQUAL_get();
  public final static int EXPR_EXPR_NON_EQUALITY = mainJNI.ModelCache_EXPR_EXPR_NON_EQUALITY_get();
  public final static int EXPR_EXPR_CONSTRAINT_MAX = mainJNI.ModelCache_EXPR_EXPR_CONSTRAINT_MAX_get();

  // ExprExpressionType 
  public final static int EXPR_OPPOSITE = mainJNI.ModelCache_EXPR_OPPOSITE_get();
  public final static int EXPR_ABS = mainJNI.ModelCache_EXPR_ABS_get();
  public final static int EXPR_SQUARE = mainJNI.ModelCache_EXPR_SQUARE_get();
  public final static int EXPR_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_EXPRESSION_MAX_get();

  // ExprExprExpressionType 
  public final static int EXPR_EXPR_DIFFERENCE = mainJNI.ModelCache_EXPR_EXPR_DIFFERENCE_get();
  public final static int EXPR_EXPR_PROD = mainJNI.ModelCache_EXPR_EXPR_PROD_get();
  public final static int EXPR_EXPR_DIV = mainJNI.ModelCache_EXPR_EXPR_DIV_get();
  public final static int EXPR_EXPR_MAX = mainJNI.ModelCache_EXPR_EXPR_MAX_get();
  public final static int EXPR_EXPR_MIN = mainJNI.ModelCache_EXPR_EXPR_MIN_get();
  public final static int EXPR_EXPR_SUM = mainJNI.ModelCache_EXPR_EXPR_SUM_get();
  public final static int EXPR_EXPR_IS_LESS = mainJNI.ModelCache_EXPR_EXPR_IS_LESS_get();
  public final static int EXPR_EXPR_IS_LESS_OR_EQUAL = mainJNI.ModelCache_EXPR_EXPR_IS_LESS_OR_EQUAL_get();
  public final static int EXPR_EXPR_IS_EQUAL = mainJNI.ModelCache_EXPR_EXPR_IS_EQUAL_get();
  public final static int EXPR_EXPR_IS_NOT_EQUAL = mainJNI.ModelCache_EXPR_EXPR_IS_NOT_EQUAL_get();
  public final static int EXPR_EXPR_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_EXPR_EXPRESSION_MAX_get();

  // ExprExprConstantExpressionType 
  public final static int EXPR_EXPR_CONSTANT_CONDITIONAL = mainJNI.ModelCache_EXPR_EXPR_CONSTANT_CONDITIONAL_get();
  public final static int EXPR_EXPR_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_EXPR_CONSTANT_EXPRESSION_MAX_get();

  // ExprConstantExpressionType 
  public final static int EXPR_CONSTANT_DIFFERENCE = mainJNI.ModelCache_EXPR_CONSTANT_DIFFERENCE_get();
  public final static int EXPR_CONSTANT_DIVIDE = mainJNI.ModelCache_EXPR_CONSTANT_DIVIDE_get();
  public final static int EXPR_CONSTANT_PROD = mainJNI.ModelCache_EXPR_CONSTANT_PROD_get();
  public final static int EXPR_CONSTANT_MAX = mainJNI.ModelCache_EXPR_CONSTANT_MAX_get();
  public final static int EXPR_CONSTANT_MIN = mainJNI.ModelCache_EXPR_CONSTANT_MIN_get();
  public final static int EXPR_CONSTANT_SUM = mainJNI.ModelCache_EXPR_CONSTANT_SUM_get();
  public final static int EXPR_CONSTANT_IS_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_EQUAL_get();
  public final static int EXPR_CONSTANT_IS_NOT_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_NOT_EQUAL_get();
  public final static int EXPR_CONSTANT_IS_GREATER_OR_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_GREATER_OR_EQUAL_get();
  public final static int EXPR_CONSTANT_IS_LESS_OR_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_LESS_OR_EQUAL_get();
  public final static int EXPR_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_CONSTANT_EXPRESSION_MAX_get();

  // VarConstantConstantExpressionType 
  public final static int VAR_CONSTANT_CONSTANT_SEMI_CONTINUOUS = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_SEMI_CONTINUOUS_get();
  public final static int VAR_CONSTANT_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_EXPRESSION_MAX_get();

  // VarConstantArrayExpressionType 
  public final static int VAR_CONSTANT_ARRAY_ELEMENT = mainJNI.ModelCache_VAR_CONSTANT_ARRAY_ELEMENT_get();
  public final static int VAR_CONSTANT_ARRAY_EXPRESSION_MAX = mainJNI.ModelCache_VAR_CONSTANT_ARRAY_EXPRESSION_MAX_get();

  // VarArrayConstantArrayExpressionType 
  public final static int VAR_ARRAY_CONSTANT_ARRAY_SCAL_PROD = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_ARRAY_SCAL_PROD_get();
  public final static int VAR_ARRAY_CONSTANT_ARRAY_EXPRESSION_MAX = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_ARRAY_EXPRESSION_MAX_get();

  // VarArrayExpressionType 
  public final static int VAR_ARRAY_MAX = mainJNI.ModelCache_VAR_ARRAY_MAX_get();
  public final static int VAR_ARRAY_MIN = mainJNI.ModelCache_VAR_ARRAY_MIN_get();
  public final static int VAR_ARRAY_SUM = mainJNI.ModelCache_VAR_ARRAY_SUM_get();
  public final static int VAR_ARRAY_EXPRESSION_MAX = mainJNI.ModelCache_VAR_ARRAY_EXPRESSION_MAX_get();

  // VarArrayConstantExpressionType 
  public final static int VAR_ARRAY_CONSTANT_INDEX = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_INDEX_get();
  public final static int VAR_ARRAY_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_EXPRESSION_MAX_get();

}
