/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class DefaultPhaseParameters {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DefaultPhaseParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultPhaseParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_DefaultPhaseParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVar_selection_schema(int value) {
    mainJNI.DefaultPhaseParameters_var_selection_schema_set(swigCPtr, this, value);
  }

  public int getVar_selection_schema() {
    return mainJNI.DefaultPhaseParameters_var_selection_schema_get(swigCPtr, this);
  }

  public void setValue_selection_schema(int value) {
    mainJNI.DefaultPhaseParameters_value_selection_schema_set(swigCPtr, this, value);
  }

  public int getValue_selection_schema() {
    return mainJNI.DefaultPhaseParameters_value_selection_schema_get(swigCPtr, this);
  }

  public void setInitialization_splits(int value) {
    mainJNI.DefaultPhaseParameters_initialization_splits_set(swigCPtr, this, value);
  }

  public int getInitialization_splits() {
    return mainJNI.DefaultPhaseParameters_initialization_splits_get(swigCPtr, this);
  }

  public void setRun_all_heuristics(boolean value) {
    mainJNI.DefaultPhaseParameters_run_all_heuristics_set(swigCPtr, this, value);
  }

  public boolean getRun_all_heuristics() {
    return mainJNI.DefaultPhaseParameters_run_all_heuristics_get(swigCPtr, this);
  }

  public void setHeuristic_period(int value) {
    mainJNI.DefaultPhaseParameters_heuristic_period_set(swigCPtr, this, value);
  }

  public int getHeuristic_period() {
    return mainJNI.DefaultPhaseParameters_heuristic_period_get(swigCPtr, this);
  }

  public void setHeuristic_num_failures_limit(int value) {
    mainJNI.DefaultPhaseParameters_heuristic_num_failures_limit_set(swigCPtr, this, value);
  }

  public int getHeuristic_num_failures_limit() {
    return mainJNI.DefaultPhaseParameters_heuristic_num_failures_limit_get(swigCPtr, this);
  }

  public void setPersistent_impact(boolean value) {
    mainJNI.DefaultPhaseParameters_persistent_impact_set(swigCPtr, this, value);
  }

  public boolean getPersistent_impact() {
    return mainJNI.DefaultPhaseParameters_persistent_impact_get(swigCPtr, this);
  }

  public void setRandom_seed(int value) {
    mainJNI.DefaultPhaseParameters_random_seed_set(swigCPtr, this, value);
  }

  public int getRandom_seed() {
    return mainJNI.DefaultPhaseParameters_random_seed_get(swigCPtr, this);
  }

  public void setDisplay_level(int value) {
    mainJNI.DefaultPhaseParameters_display_level_set(swigCPtr, this, value);
  }

  public int getDisplay_level() {
    return mainJNI.DefaultPhaseParameters_display_level_get(swigCPtr, this);
  }

  public void setUse_last_conflict(boolean value) {
    mainJNI.DefaultPhaseParameters_use_last_conflict_set(swigCPtr, this, value);
  }

  public boolean getUse_last_conflict() {
    return mainJNI.DefaultPhaseParameters_use_last_conflict_get(swigCPtr, this);
  }

  public void setDecision_builder(DecisionBuilder value) {
    mainJNI.DefaultPhaseParameters_decision_builder_set(swigCPtr, this, DecisionBuilder.getCPtr(value), value);
  }

  public DecisionBuilder getDecision_builder() {
    long cPtr = mainJNI.DefaultPhaseParameters_decision_builder_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DecisionBuilder(cPtr, false);
  }

  public DefaultPhaseParameters() {
    this(mainJNI.new_DefaultPhaseParameters(), true);
  }

  // VariableSelection 
  public final static int CHOOSE_MAX_SUM_IMPACT = mainJNI.DefaultPhaseParameters_CHOOSE_MAX_SUM_IMPACT_get();
  public final static int CHOOSE_MAX_AVERAGE_IMPACT = mainJNI.DefaultPhaseParameters_CHOOSE_MAX_AVERAGE_IMPACT_get();
  public final static int CHOOSE_MAX_VALUE_IMPACT = mainJNI.DefaultPhaseParameters_CHOOSE_MAX_VALUE_IMPACT_get();

  // ValueSelection 
  public final static int SELECT_MIN_IMPACT = mainJNI.DefaultPhaseParameters_SELECT_MIN_IMPACT_get();
  public final static int SELECT_MAX_IMPACT = mainJNI.DefaultPhaseParameters_SELECT_MAX_IMPACT_get();

  // DisplayLevel 
  public final static int NONE = mainJNI.DefaultPhaseParameters_NONE_get();
  public final static int NORMAL = mainJNI.DefaultPhaseParameters_NORMAL_get();
  public final static int VERBOSE = mainJNI.DefaultPhaseParameters_VERBOSE_get();

}
