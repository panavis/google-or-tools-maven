/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class RoutingModelVisitor extends BaseObject {
  private transient long swigCPtr;

  protected RoutingModelVisitor(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.RoutingModelVisitor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RoutingModelVisitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_RoutingModelVisitor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static String getKLightElement() {
    return mainJNI.RoutingModelVisitor_kLightElement_get();
  }

  public static String getKLightElement2() {
    return mainJNI.RoutingModelVisitor_kLightElement2_get();
  }

  public static String getKRemoveValues() {
    return mainJNI.RoutingModelVisitor_kRemoveValues_get();
  }

  public RoutingModelVisitor() {
    this(mainJNI.new_RoutingModelVisitor(), true);
  }

}
