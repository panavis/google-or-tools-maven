/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SearchLimit extends SearchMonitor {
  private transient long swigCPtr;

  protected SearchLimit(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.SearchLimit_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SearchLimit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_SearchLimit(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean crossed() {
    return mainJNI.SearchLimit_crossed(swigCPtr, this);
  }

  public boolean check() {
    return mainJNI.SearchLimit_check(swigCPtr, this);
  }

  public void init() {
    mainJNI.SearchLimit_init(swigCPtr, this);
  }

  public void copy(SearchLimit limit) {
    mainJNI.SearchLimit_copy(swigCPtr, this, SearchLimit.getCPtr(limit), limit);
  }

  public SearchLimit makeClone() {
    long cPtr = mainJNI.SearchLimit_makeClone(swigCPtr, this);
    return (cPtr == 0) ? null : new SearchLimit(cPtr, false);
  }

  public void enterSearch() {
    mainJNI.SearchLimit_enterSearch(swigCPtr, this);
  }

  public void beginNextDecision(DecisionBuilder b) {
    mainJNI.SearchLimit_beginNextDecision(swigCPtr, this, DecisionBuilder.getCPtr(b), b);
  }

  public void periodicCheck() {
    mainJNI.SearchLimit_periodicCheck(swigCPtr, this);
  }

  public void refuteDecision(Decision d) {
    mainJNI.SearchLimit_refuteDecision(swigCPtr, this, Decision.getCPtr(d), d);
  }

  public String toString() {
    return mainJNI.SearchLimit_toString(swigCPtr, this);
  }

}
