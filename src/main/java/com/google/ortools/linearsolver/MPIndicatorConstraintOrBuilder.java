// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/linear_solver/linear_solver.proto

package com.google.ortools.linearsolver;

public interface MPIndicatorConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.MPIndicatorConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Variable index (w.r.t. the "variable" field of MPModelProto) of the Boolean
   * variable used as indicator.
   * </pre>
   *
   * <code>optional int32 var_index = 1;</code>
   * @return Whether the varIndex field is set.
   */
  boolean hasVarIndex();
  /**
   * <pre>
   * Variable index (w.r.t. the "variable" field of MPModelProto) of the Boolean
   * variable used as indicator.
   * </pre>
   *
   * <code>optional int32 var_index = 1;</code>
   * @return The varIndex.
   */
  int getVarIndex();

  /**
   * <pre>
   * Value the above variable should take. Must be 0 or 1.
   * </pre>
   *
   * <code>optional int32 var_value = 2;</code>
   * @return Whether the varValue field is set.
   */
  boolean hasVarValue();
  /**
   * <pre>
   * Value the above variable should take. Must be 0 or 1.
   * </pre>
   *
   * <code>optional int32 var_value = 2;</code>
   * @return The varValue.
   */
  int getVarValue();

  /**
   * <pre>
   * The constraint activated by the indicator variable.
   * </pre>
   *
   * <code>optional .operations_research.MPConstraintProto constraint = 3;</code>
   * @return Whether the constraint field is set.
   */
  boolean hasConstraint();
  /**
   * <pre>
   * The constraint activated by the indicator variable.
   * </pre>
   *
   * <code>optional .operations_research.MPConstraintProto constraint = 3;</code>
   * @return The constraint.
   */
  com.google.ortools.linearsolver.MPConstraintProto getConstraint();
  /**
   * <pre>
   * The constraint activated by the indicator variable.
   * </pre>
   *
   * <code>optional .operations_research.MPConstraintProto constraint = 3;</code>
   */
  com.google.ortools.linearsolver.MPConstraintProtoOrBuilder getConstraintOrBuilder();
}
