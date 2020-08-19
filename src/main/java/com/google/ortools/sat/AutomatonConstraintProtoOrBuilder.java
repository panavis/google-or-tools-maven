// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

public interface AutomatonConstraintProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.sat.AutomatonConstraintProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A state is identified by a non-negative number. It is preferable to keep
   * all the states dense in says [0, num_states). The automaton starts at
   * starting_state and must finish in any of the final states.
   * </pre>
   *
   * <code>int64 starting_state = 2;</code>
   * @return The startingState.
   */
  long getStartingState();

  /**
   * <code>repeated int64 final_states = 3;</code>
   * @return A list containing the finalStates.
   */
  java.util.List<java.lang.Long> getFinalStatesList();
  /**
   * <code>repeated int64 final_states = 3;</code>
   * @return The count of finalStates.
   */
  int getFinalStatesCount();
  /**
   * <code>repeated int64 final_states = 3;</code>
   * @param index The index of the element to return.
   * @return The finalStates at the given index.
   */
  long getFinalStates(int index);

  /**
   * <pre>
   * List of transitions (all 3 vectors have the same size). Both tail and head
   * are states, label is any variable value. No two outgoing transitions from
   * the same state can have the same label.
   * </pre>
   *
   * <code>repeated int64 transition_tail = 4;</code>
   * @return A list containing the transitionTail.
   */
  java.util.List<java.lang.Long> getTransitionTailList();
  /**
   * <pre>
   * List of transitions (all 3 vectors have the same size). Both tail and head
   * are states, label is any variable value. No two outgoing transitions from
   * the same state can have the same label.
   * </pre>
   *
   * <code>repeated int64 transition_tail = 4;</code>
   * @return The count of transitionTail.
   */
  int getTransitionTailCount();
  /**
   * <pre>
   * List of transitions (all 3 vectors have the same size). Both tail and head
   * are states, label is any variable value. No two outgoing transitions from
   * the same state can have the same label.
   * </pre>
   *
   * <code>repeated int64 transition_tail = 4;</code>
   * @param index The index of the element to return.
   * @return The transitionTail at the given index.
   */
  long getTransitionTail(int index);

  /**
   * <code>repeated int64 transition_head = 5;</code>
   * @return A list containing the transitionHead.
   */
  java.util.List<java.lang.Long> getTransitionHeadList();
  /**
   * <code>repeated int64 transition_head = 5;</code>
   * @return The count of transitionHead.
   */
  int getTransitionHeadCount();
  /**
   * <code>repeated int64 transition_head = 5;</code>
   * @param index The index of the element to return.
   * @return The transitionHead at the given index.
   */
  long getTransitionHead(int index);

  /**
   * <code>repeated int64 transition_label = 6;</code>
   * @return A list containing the transitionLabel.
   */
  java.util.List<java.lang.Long> getTransitionLabelList();
  /**
   * <code>repeated int64 transition_label = 6;</code>
   * @return The count of transitionLabel.
   */
  int getTransitionLabelCount();
  /**
   * <code>repeated int64 transition_label = 6;</code>
   * @param index The index of the element to return.
   * @return The transitionLabel at the given index.
   */
  long getTransitionLabel(int index);

  /**
   * <pre>
   * The sequence of variables. The automaton is ran for vars_size() "steps" and
   * the value of vars[i] corresponds to the transition label at step i.
   * </pre>
   *
   * <code>repeated int32 vars = 7;</code>
   * @return A list containing the vars.
   */
  java.util.List<java.lang.Integer> getVarsList();
  /**
   * <pre>
   * The sequence of variables. The automaton is ran for vars_size() "steps" and
   * the value of vars[i] corresponds to the transition label at step i.
   * </pre>
   *
   * <code>repeated int32 vars = 7;</code>
   * @return The count of vars.
   */
  int getVarsCount();
  /**
   * <pre>
   * The sequence of variables. The automaton is ran for vars_size() "steps" and
   * the value of vars[i] corresponds to the transition label at step i.
   * </pre>
   *
   * <code>repeated int32 vars = 7;</code>
   * @param index The index of the element to return.
   * @return The vars at the given index.
   */
  int getVars(int index);
}