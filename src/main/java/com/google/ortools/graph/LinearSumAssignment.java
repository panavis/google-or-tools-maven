/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.graph;

public class LinearSumAssignment {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LinearSumAssignment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LinearSumAssignment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_LinearSumAssignment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LinearSumAssignment() {
    this(mainJNI.new_LinearSumAssignment(), true);
  }

  public int addArcWithCost(int left_node, int right_node, long cost) {
    return mainJNI.LinearSumAssignment_addArcWithCost(swigCPtr, this, left_node, right_node, cost);
  }

  public int getNumNodes() {
    return mainJNI.LinearSumAssignment_getNumNodes(swigCPtr, this);
  }

  public int getNumArcs() {
    return mainJNI.LinearSumAssignment_getNumArcs(swigCPtr, this);
  }

  public int getLeftNode(int arc) {
    return mainJNI.LinearSumAssignment_getLeftNode(swigCPtr, this, arc);
  }

  public int getRightNode(int arc) {
    return mainJNI.LinearSumAssignment_getRightNode(swigCPtr, this, arc);
  }

  public long getCost(int arc) {
    return mainJNI.LinearSumAssignment_getCost(swigCPtr, this, arc);
  }

  public LinearSumAssignment.Status solve() {
    return LinearSumAssignment.Status.swigToEnum(mainJNI.LinearSumAssignment_solve(swigCPtr, this));
  }

  public long getOptimalCost() {
    return mainJNI.LinearSumAssignment_getOptimalCost(swigCPtr, this);
  }

  public int getRightMate(int left_node) {
    return mainJNI.LinearSumAssignment_getRightMate(swigCPtr, this, left_node);
  }

  public long getAssignmentCost(int left_node) {
    return mainJNI.LinearSumAssignment_getAssignmentCost(swigCPtr, this, left_node);
  }

  public enum Status {
    OPTIMAL,
    INFEASIBLE,
    POSSIBLE_OVERFLOW;

    public final int swigValue() {
      return swigValue;
    }

    public static Status swigToEnum(int swigValue) {
      Status[] swigValues = Status.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Status swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Status.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Status() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Status(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Status(Status swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}