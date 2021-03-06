// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

public interface CpModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.sat.CpModelProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * For debug/logging only. Can be empty.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * For debug/logging only. Can be empty.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The associated Protos should be referred by their index in these fields.
   * </pre>
   *
   * <code>repeated .operations_research.sat.IntegerVariableProto variables = 2;</code>
   */
  java.util.List<com.google.ortools.sat.IntegerVariableProto> 
      getVariablesList();
  /**
   * <pre>
   * The associated Protos should be referred by their index in these fields.
   * </pre>
   *
   * <code>repeated .operations_research.sat.IntegerVariableProto variables = 2;</code>
   */
  com.google.ortools.sat.IntegerVariableProto getVariables(int index);
  /**
   * <pre>
   * The associated Protos should be referred by their index in these fields.
   * </pre>
   *
   * <code>repeated .operations_research.sat.IntegerVariableProto variables = 2;</code>
   */
  int getVariablesCount();
  /**
   * <pre>
   * The associated Protos should be referred by their index in these fields.
   * </pre>
   *
   * <code>repeated .operations_research.sat.IntegerVariableProto variables = 2;</code>
   */
  java.util.List<? extends com.google.ortools.sat.IntegerVariableProtoOrBuilder> 
      getVariablesOrBuilderList();
  /**
   * <pre>
   * The associated Protos should be referred by their index in these fields.
   * </pre>
   *
   * <code>repeated .operations_research.sat.IntegerVariableProto variables = 2;</code>
   */
  com.google.ortools.sat.IntegerVariableProtoOrBuilder getVariablesOrBuilder(
      int index);

  /**
   * <code>repeated .operations_research.sat.ConstraintProto constraints = 3;</code>
   */
  java.util.List<com.google.ortools.sat.ConstraintProto> 
      getConstraintsList();
  /**
   * <code>repeated .operations_research.sat.ConstraintProto constraints = 3;</code>
   */
  com.google.ortools.sat.ConstraintProto getConstraints(int index);
  /**
   * <code>repeated .operations_research.sat.ConstraintProto constraints = 3;</code>
   */
  int getConstraintsCount();
  /**
   * <code>repeated .operations_research.sat.ConstraintProto constraints = 3;</code>
   */
  java.util.List<? extends com.google.ortools.sat.ConstraintProtoOrBuilder> 
      getConstraintsOrBuilderList();
  /**
   * <code>repeated .operations_research.sat.ConstraintProto constraints = 3;</code>
   */
  com.google.ortools.sat.ConstraintProtoOrBuilder getConstraintsOrBuilder(
      int index);

  /**
   * <pre>
   * The objective to minimize. Can be empty for pure decision problems.
   * </pre>
   *
   * <code>.operations_research.sat.CpObjectiveProto objective = 4;</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * The objective to minimize. Can be empty for pure decision problems.
   * </pre>
   *
   * <code>.operations_research.sat.CpObjectiveProto objective = 4;</code>
   * @return The objective.
   */
  com.google.ortools.sat.CpObjectiveProto getObjective();
  /**
   * <pre>
   * The objective to minimize. Can be empty for pure decision problems.
   * </pre>
   *
   * <code>.operations_research.sat.CpObjectiveProto objective = 4;</code>
   */
  com.google.ortools.sat.CpObjectiveProtoOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Defines the strategy that the solver should follow when the
   * search_branching parameter is set to FIXED_SEARCH. Note that this strategy
   * is also used as a heuristic when we are not in fixed search.
   * Advanced Usage: if not all variables appears and the parameter
   * "instantiate_all_variables" is set to false, then the solver will not try
   * to instantiate the variables that do not appear. Thus, at the end of the
   * search, not all variables may be fixed and this is why we have the
   * solution_lower_bounds and solution_upper_bounds fields in the
   * CpSolverResponse.
   * </pre>
   *
   * <code>repeated .operations_research.sat.DecisionStrategyProto search_strategy = 5;</code>
   */
  java.util.List<com.google.ortools.sat.DecisionStrategyProto> 
      getSearchStrategyList();
  /**
   * <pre>
   * Defines the strategy that the solver should follow when the
   * search_branching parameter is set to FIXED_SEARCH. Note that this strategy
   * is also used as a heuristic when we are not in fixed search.
   * Advanced Usage: if not all variables appears and the parameter
   * "instantiate_all_variables" is set to false, then the solver will not try
   * to instantiate the variables that do not appear. Thus, at the end of the
   * search, not all variables may be fixed and this is why we have the
   * solution_lower_bounds and solution_upper_bounds fields in the
   * CpSolverResponse.
   * </pre>
   *
   * <code>repeated .operations_research.sat.DecisionStrategyProto search_strategy = 5;</code>
   */
  com.google.ortools.sat.DecisionStrategyProto getSearchStrategy(int index);
  /**
   * <pre>
   * Defines the strategy that the solver should follow when the
   * search_branching parameter is set to FIXED_SEARCH. Note that this strategy
   * is also used as a heuristic when we are not in fixed search.
   * Advanced Usage: if not all variables appears and the parameter
   * "instantiate_all_variables" is set to false, then the solver will not try
   * to instantiate the variables that do not appear. Thus, at the end of the
   * search, not all variables may be fixed and this is why we have the
   * solution_lower_bounds and solution_upper_bounds fields in the
   * CpSolverResponse.
   * </pre>
   *
   * <code>repeated .operations_research.sat.DecisionStrategyProto search_strategy = 5;</code>
   */
  int getSearchStrategyCount();
  /**
   * <pre>
   * Defines the strategy that the solver should follow when the
   * search_branching parameter is set to FIXED_SEARCH. Note that this strategy
   * is also used as a heuristic when we are not in fixed search.
   * Advanced Usage: if not all variables appears and the parameter
   * "instantiate_all_variables" is set to false, then the solver will not try
   * to instantiate the variables that do not appear. Thus, at the end of the
   * search, not all variables may be fixed and this is why we have the
   * solution_lower_bounds and solution_upper_bounds fields in the
   * CpSolverResponse.
   * </pre>
   *
   * <code>repeated .operations_research.sat.DecisionStrategyProto search_strategy = 5;</code>
   */
  java.util.List<? extends com.google.ortools.sat.DecisionStrategyProtoOrBuilder> 
      getSearchStrategyOrBuilderList();
  /**
   * <pre>
   * Defines the strategy that the solver should follow when the
   * search_branching parameter is set to FIXED_SEARCH. Note that this strategy
   * is also used as a heuristic when we are not in fixed search.
   * Advanced Usage: if not all variables appears and the parameter
   * "instantiate_all_variables" is set to false, then the solver will not try
   * to instantiate the variables that do not appear. Thus, at the end of the
   * search, not all variables may be fixed and this is why we have the
   * solution_lower_bounds and solution_upper_bounds fields in the
   * CpSolverResponse.
   * </pre>
   *
   * <code>repeated .operations_research.sat.DecisionStrategyProto search_strategy = 5;</code>
   */
  com.google.ortools.sat.DecisionStrategyProtoOrBuilder getSearchStrategyOrBuilder(
      int index);

  /**
   * <pre>
   * Solution hint.
   * If a feasible or almost-feasible solution to the problem is already known,
   * it may be helpful to pass it to the solver so that it can be used. The
   * solver will try to use this information to create its initial feasible
   * solution.
   * Note that it may not always be faster to give a hint like this to the
   * solver. There is also no guarantee that the solver will use this hint or
   * try to return a solution "close" to this assignment in case of multiple
   * optimal solutions.
   * </pre>
   *
   * <code>.operations_research.sat.PartialVariableAssignment solution_hint = 6;</code>
   * @return Whether the solutionHint field is set.
   */
  boolean hasSolutionHint();
  /**
   * <pre>
   * Solution hint.
   * If a feasible or almost-feasible solution to the problem is already known,
   * it may be helpful to pass it to the solver so that it can be used. The
   * solver will try to use this information to create its initial feasible
   * solution.
   * Note that it may not always be faster to give a hint like this to the
   * solver. There is also no guarantee that the solver will use this hint or
   * try to return a solution "close" to this assignment in case of multiple
   * optimal solutions.
   * </pre>
   *
   * <code>.operations_research.sat.PartialVariableAssignment solution_hint = 6;</code>
   * @return The solutionHint.
   */
  com.google.ortools.sat.PartialVariableAssignment getSolutionHint();
  /**
   * <pre>
   * Solution hint.
   * If a feasible or almost-feasible solution to the problem is already known,
   * it may be helpful to pass it to the solver so that it can be used. The
   * solver will try to use this information to create its initial feasible
   * solution.
   * Note that it may not always be faster to give a hint like this to the
   * solver. There is also no guarantee that the solver will use this hint or
   * try to return a solution "close" to this assignment in case of multiple
   * optimal solutions.
   * </pre>
   *
   * <code>.operations_research.sat.PartialVariableAssignment solution_hint = 6;</code>
   */
  com.google.ortools.sat.PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder();

  /**
   * <pre>
   * A list of literals. The model will be solved assuming all these literals
   * are true. Compared to just fixing the domain of these literals, using this
   * mechanism is slower but allows in case the model is INFEASIBLE to get a
   * potentially small subset of them that can be used to explain the
   * infeasibility.
   * Think (IIS), except when you are only concerned by the provided
   * assumptions. This is powerful as it allows to group a set of logicially
   * related constraint under only one enforcement literal which can potentially
   * give you a good and interpretable explanation for infeasiblity.
   * Such infeasibility explanation will be available in the
   * sufficient_assumptions_for_infeasibility response field.
   * </pre>
   *
   * <code>repeated int32 assumptions = 7;</code>
   * @return A list containing the assumptions.
   */
  java.util.List<java.lang.Integer> getAssumptionsList();
  /**
   * <pre>
   * A list of literals. The model will be solved assuming all these literals
   * are true. Compared to just fixing the domain of these literals, using this
   * mechanism is slower but allows in case the model is INFEASIBLE to get a
   * potentially small subset of them that can be used to explain the
   * infeasibility.
   * Think (IIS), except when you are only concerned by the provided
   * assumptions. This is powerful as it allows to group a set of logicially
   * related constraint under only one enforcement literal which can potentially
   * give you a good and interpretable explanation for infeasiblity.
   * Such infeasibility explanation will be available in the
   * sufficient_assumptions_for_infeasibility response field.
   * </pre>
   *
   * <code>repeated int32 assumptions = 7;</code>
   * @return The count of assumptions.
   */
  int getAssumptionsCount();
  /**
   * <pre>
   * A list of literals. The model will be solved assuming all these literals
   * are true. Compared to just fixing the domain of these literals, using this
   * mechanism is slower but allows in case the model is INFEASIBLE to get a
   * potentially small subset of them that can be used to explain the
   * infeasibility.
   * Think (IIS), except when you are only concerned by the provided
   * assumptions. This is powerful as it allows to group a set of logicially
   * related constraint under only one enforcement literal which can potentially
   * give you a good and interpretable explanation for infeasiblity.
   * Such infeasibility explanation will be available in the
   * sufficient_assumptions_for_infeasibility response field.
   * </pre>
   *
   * <code>repeated int32 assumptions = 7;</code>
   * @param index The index of the element to return.
   * @return The assumptions at the given index.
   */
  int getAssumptions(int index);
}
