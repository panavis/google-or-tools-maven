// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/search_limit.proto

package com.google.ortools.constraintsolver;

public interface RegularLimitParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.RegularLimitParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 time = 1;</code>
   * @return The time.
   */
  long getTime();

  /**
   * <code>int64 branches = 2;</code>
   * @return The branches.
   */
  long getBranches();

  /**
   * <code>int64 failures = 3;</code>
   * @return The failures.
   */
  long getFailures();

  /**
   * <code>int64 solutions = 4;</code>
   * @return The solutions.
   */
  long getSolutions();

  /**
   * <code>bool smart_time_check = 5;</code>
   * @return The smartTimeCheck.
   */
  boolean getSmartTimeCheck();

  /**
   * <code>bool cumulative = 6;</code>
   * @return The cumulative.
   */
  boolean getCumulative();
}