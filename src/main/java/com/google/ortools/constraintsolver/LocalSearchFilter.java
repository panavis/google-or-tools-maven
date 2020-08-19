/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class LocalSearchFilter extends BaseObject {
  private transient long swigCPtr;

  protected LocalSearchFilter(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.LocalSearchFilter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LocalSearchFilter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_LocalSearchFilter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mainJNI.LocalSearchFilter_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mainJNI.LocalSearchFilter_change_ownership(this, swigCPtr, true);
  }

  public void Relax(Assignment delta, Assignment deltadelta) {
    if (getClass() == LocalSearchFilter.class) mainJNI.LocalSearchFilter_Relax(swigCPtr, this, Assignment.getCPtr(delta), delta, Assignment.getCPtr(deltadelta), deltadelta); else mainJNI.LocalSearchFilter_RelaxSwigExplicitLocalSearchFilter(swigCPtr, this, Assignment.getCPtr(delta), delta, Assignment.getCPtr(deltadelta), deltadelta);
  }

  public boolean accept(Assignment delta, Assignment deltadelta, long objective_min, long objective_max) {
    return mainJNI.LocalSearchFilter_accept(swigCPtr, this, Assignment.getCPtr(delta), delta, Assignment.getCPtr(deltadelta), deltadelta, objective_min, objective_max);
  }

  public boolean isIncremental() {
    return (getClass() == LocalSearchFilter.class) ? mainJNI.LocalSearchFilter_isIncremental(swigCPtr, this) : mainJNI.LocalSearchFilter_isIncrementalSwigExplicitLocalSearchFilter(swigCPtr, this);
  }

  public void synchronize(Assignment assignment, Assignment delta) {
    mainJNI.LocalSearchFilter_synchronize(swigCPtr, this, Assignment.getCPtr(assignment), assignment, Assignment.getCPtr(delta), delta);
  }

  public void Revert() {
    if (getClass() == LocalSearchFilter.class) mainJNI.LocalSearchFilter_Revert(swigCPtr, this); else mainJNI.LocalSearchFilter_RevertSwigExplicitLocalSearchFilter(swigCPtr, this);
  }

  public long getSynchronizedObjectiveValue() {
    return (getClass() == LocalSearchFilter.class) ? mainJNI.LocalSearchFilter_getSynchronizedObjectiveValue(swigCPtr, this) : mainJNI.LocalSearchFilter_getSynchronizedObjectiveValueSwigExplicitLocalSearchFilter(swigCPtr, this);
  }

  public long getAcceptedObjectiveValue() {
    return (getClass() == LocalSearchFilter.class) ? mainJNI.LocalSearchFilter_getAcceptedObjectiveValue(swigCPtr, this) : mainJNI.LocalSearchFilter_getAcceptedObjectiveValueSwigExplicitLocalSearchFilter(swigCPtr, this);
  }

  public LocalSearchFilter() {
    this(mainJNI.new_LocalSearchFilter(), true);
    mainJNI.LocalSearchFilter_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
