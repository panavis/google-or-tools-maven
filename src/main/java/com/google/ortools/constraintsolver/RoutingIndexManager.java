/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class RoutingIndexManager {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RoutingIndexManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RoutingIndexManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_RoutingIndexManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RoutingIndexManager(int num_nodes, int num_vehicles, int depot) {
    this(mainJNI.new_RoutingIndexManager__SWIG_0(num_nodes, num_vehicles, depot), true);
  }

  public RoutingIndexManager(int num_nodes, int num_vehicles, int[] starts, int[] ends) {
    this(mainJNI.new_RoutingIndexManager__SWIG_1(num_nodes, num_vehicles, starts, ends), true);
  }

  public int getNumberOfNodes() {
    return mainJNI.RoutingIndexManager_getNumberOfNodes(swigCPtr, this);
  }

  public int getNumberOfVehicles() {
    return mainJNI.RoutingIndexManager_getNumberOfVehicles(swigCPtr, this);
  }

  public int getNumberOfIndices() {
    return mainJNI.RoutingIndexManager_getNumberOfIndices(swigCPtr, this);
  }

  public long getStartIndex(int vehicle) {
    return mainJNI.RoutingIndexManager_getStartIndex(swigCPtr, this, vehicle);
  }

  public long getEndIndex(int vehicle) {
    return mainJNI.RoutingIndexManager_getEndIndex(swigCPtr, this, vehicle);
  }

  public long nodeToIndex(int node) {
    return mainJNI.RoutingIndexManager_nodeToIndex(swigCPtr, this, node);
  }

  public long[] nodesToIndices(int[] nodes) {
  return mainJNI.RoutingIndexManager_nodesToIndices(swigCPtr, this, nodes);
}

  public int indexToNode(long index) {
  return mainJNI.RoutingIndexManager_indexToNode(swigCPtr, this, index);
}

}