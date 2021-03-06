/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class Assignment extends PropagationBaseObject {
  private transient long swigCPtr;

  protected Assignment(long cPtr, boolean cMemoryOwn) {
    super(mainJNI.Assignment_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Assignment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mainJNI.delete_Assignment(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Assignment(Solver s) {
    this(mainJNI.new_Assignment__SWIG_0(Solver.getCPtr(s), s), true);
  }

  public Assignment(Assignment copy) {
    this(mainJNI.new_Assignment__SWIG_1(Assignment.getCPtr(copy), copy), true);
  }

  public void clear() {
    mainJNI.Assignment_clear(swigCPtr, this);
  }

  public boolean empty() {
    return mainJNI.Assignment_empty(swigCPtr, this);
  }

  public int size() {
    return mainJNI.Assignment_size(swigCPtr, this);
  }

  public int numIntVars() {
    return mainJNI.Assignment_numIntVars(swigCPtr, this);
  }

  public int numIntervalVars() {
    return mainJNI.Assignment_numIntervalVars(swigCPtr, this);
  }

  public int numSequenceVars() {
    return mainJNI.Assignment_numSequenceVars(swigCPtr, this);
  }

  public void store() {
    mainJNI.Assignment_store(swigCPtr, this);
  }

  public void restore() {
    mainJNI.Assignment_restore(swigCPtr, this);
  }

  public boolean load(String filename) {
    return mainJNI.Assignment_load(swigCPtr, this, filename);
  }

  public boolean save(String filename) {
    return mainJNI.Assignment_save(swigCPtr, this, filename);
  }

  public void addObjective(IntVar v) {
    mainJNI.Assignment_addObjective(swigCPtr, this, IntVar.getCPtr(v), v);
  }

  public void ClearObjective() {
    mainJNI.Assignment_ClearObjective(swigCPtr, this);
  }

  public IntVar objective() {
    long cPtr = mainJNI.Assignment_objective(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public boolean hasObjective() {
    return mainJNI.Assignment_hasObjective(swigCPtr, this);
  }

  public long objectiveMin() {
    return mainJNI.Assignment_objectiveMin(swigCPtr, this);
  }

  public long objectiveMax() {
    return mainJNI.Assignment_objectiveMax(swigCPtr, this);
  }

  public long objectiveValue() {
    return mainJNI.Assignment_objectiveValue(swigCPtr, this);
  }

  public boolean objectiveBound() {
    return mainJNI.Assignment_objectiveBound(swigCPtr, this);
  }

  public void setObjectiveMin(long m) {
    mainJNI.Assignment_setObjectiveMin(swigCPtr, this, m);
  }

  public void setObjectiveMax(long m) {
    mainJNI.Assignment_setObjectiveMax(swigCPtr, this, m);
  }

  public void setObjectiveValue(long value) {
    mainJNI.Assignment_setObjectiveValue(swigCPtr, this, value);
  }

  public void setObjectiveRange(long l, long u) {
    mainJNI.Assignment_setObjectiveRange(swigCPtr, this, l, u);
  }

  public IntVarElement add(IntVar var) {
    long cPtr = mainJNI.Assignment_add__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public void add(IntVar[] vars) {
    mainJNI.Assignment_add__SWIG_1(swigCPtr, this, vars);
  }

  public IntVarElement fastAdd(IntVar var) {
    long cPtr = mainJNI.Assignment_fastAdd__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public long min(IntVar var) {
    return mainJNI.Assignment_min(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public long max(IntVar var) {
    return mainJNI.Assignment_max(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public long value(IntVar var) {
    return mainJNI.Assignment_value(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public boolean bound(IntVar var) {
    return mainJNI.Assignment_bound(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public void setMin(IntVar var, long m) {
    mainJNI.Assignment_setMin(swigCPtr, this, IntVar.getCPtr(var), var, m);
  }

  public void setMax(IntVar var, long m) {
    mainJNI.Assignment_setMax(swigCPtr, this, IntVar.getCPtr(var), var, m);
  }

  public void setRange(IntVar var, long l, long u) {
    mainJNI.Assignment_setRange(swigCPtr, this, IntVar.getCPtr(var), var, l, u);
  }

  public void setValue(IntVar var, long value) {
    mainJNI.Assignment_setValue(swigCPtr, this, IntVar.getCPtr(var), var, value);
  }

  public IntervalVarElement add(IntervalVar var) {
    long cPtr = mainJNI.Assignment_add__SWIG_2(swigCPtr, this, IntervalVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  public void add(IntervalVar[] vars) {
    mainJNI.Assignment_add__SWIG_3(swigCPtr, this, vars);
  }

  public IntervalVarElement fastAdd(IntervalVar var) {
    long cPtr = mainJNI.Assignment_fastAdd__SWIG_1(swigCPtr, this, IntervalVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntervalVarElement(cPtr, false);
  }

  public long startMin(IntervalVar var) {
    return mainJNI.Assignment_startMin(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long startMax(IntervalVar var) {
    return mainJNI.Assignment_startMax(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long startValue(IntervalVar var) {
    return mainJNI.Assignment_startValue(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long durationMin(IntervalVar var) {
    return mainJNI.Assignment_durationMin(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long durationMax(IntervalVar var) {
    return mainJNI.Assignment_durationMax(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long durationValue(IntervalVar var) {
    return mainJNI.Assignment_durationValue(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long endMin(IntervalVar var) {
    return mainJNI.Assignment_endMin(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long endMax(IntervalVar var) {
    return mainJNI.Assignment_endMax(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long endValue(IntervalVar var) {
    return mainJNI.Assignment_endValue(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long performedMin(IntervalVar var) {
    return mainJNI.Assignment_performedMin(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long performedMax(IntervalVar var) {
    return mainJNI.Assignment_performedMax(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public long performedValue(IntervalVar var) {
    return mainJNI.Assignment_performedValue(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public void setStartMin(IntervalVar var, long m) {
    mainJNI.Assignment_setStartMin(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setStartMax(IntervalVar var, long m) {
    mainJNI.Assignment_setStartMax(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setStartRange(IntervalVar var, long mi, long ma) {
    mainJNI.Assignment_setStartRange(swigCPtr, this, IntervalVar.getCPtr(var), var, mi, ma);
  }

  public void setStartValue(IntervalVar var, long value) {
    mainJNI.Assignment_setStartValue(swigCPtr, this, IntervalVar.getCPtr(var), var, value);
  }

  public void setDurationMin(IntervalVar var, long m) {
    mainJNI.Assignment_setDurationMin(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setDurationMax(IntervalVar var, long m) {
    mainJNI.Assignment_setDurationMax(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setDurationRange(IntervalVar var, long mi, long ma) {
    mainJNI.Assignment_setDurationRange(swigCPtr, this, IntervalVar.getCPtr(var), var, mi, ma);
  }

  public void setDurationValue(IntervalVar var, long value) {
    mainJNI.Assignment_setDurationValue(swigCPtr, this, IntervalVar.getCPtr(var), var, value);
  }

  public void setEndMin(IntervalVar var, long m) {
    mainJNI.Assignment_setEndMin(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setEndMax(IntervalVar var, long m) {
    mainJNI.Assignment_setEndMax(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setEndRange(IntervalVar var, long mi, long ma) {
    mainJNI.Assignment_setEndRange(swigCPtr, this, IntervalVar.getCPtr(var), var, mi, ma);
  }

  public void setEndValue(IntervalVar var, long value) {
    mainJNI.Assignment_setEndValue(swigCPtr, this, IntervalVar.getCPtr(var), var, value);
  }

  public void setPerformedMin(IntervalVar var, long m) {
    mainJNI.Assignment_setPerformedMin(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setPerformedMax(IntervalVar var, long m) {
    mainJNI.Assignment_setPerformedMax(swigCPtr, this, IntervalVar.getCPtr(var), var, m);
  }

  public void setPerformedRange(IntervalVar var, long mi, long ma) {
    mainJNI.Assignment_setPerformedRange(swigCPtr, this, IntervalVar.getCPtr(var), var, mi, ma);
  }

  public void setPerformedValue(IntervalVar var, long value) {
    mainJNI.Assignment_setPerformedValue(swigCPtr, this, IntervalVar.getCPtr(var), var, value);
  }

  public SequenceVarElement add(SequenceVar var) {
    long cPtr = mainJNI.Assignment_add__SWIG_4(swigCPtr, this, SequenceVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public void add(SequenceVar[] vars) {
    mainJNI.Assignment_add__SWIG_5(swigCPtr, this, vars);
  }

  public SequenceVarElement fastAdd(SequenceVar var) {
    long cPtr = mainJNI.Assignment_fastAdd__SWIG_2(swigCPtr, this, SequenceVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new SequenceVarElement(cPtr, false);
  }

  public int[] forwardSequence(SequenceVar var) {
  return mainJNI.Assignment_forwardSequence(swigCPtr, this, SequenceVar.getCPtr(var), var);
}

  public int[] backwardSequence(SequenceVar var) {
  return mainJNI.Assignment_backwardSequence(swigCPtr, this, SequenceVar.getCPtr(var), var);
}

  public int[] unperformed(SequenceVar var) {
  return mainJNI.Assignment_unperformed(swigCPtr, this, SequenceVar.getCPtr(var), var);
}

  public void setSequence(SequenceVar var, int[] forward_sequence, int[] backward_sequence, int[] unperformed) {
    mainJNI.Assignment_setSequence(swigCPtr, this, SequenceVar.getCPtr(var), var, forward_sequence, backward_sequence, unperformed);
  }

  public void setForwardSequence(SequenceVar var, int[] forward_sequence) {
    mainJNI.Assignment_setForwardSequence(swigCPtr, this, SequenceVar.getCPtr(var), var, forward_sequence);
  }

  public void setBackwardSequence(SequenceVar var, int[] backward_sequence) {
    mainJNI.Assignment_setBackwardSequence(swigCPtr, this, SequenceVar.getCPtr(var), var, backward_sequence);
  }

  public void setUnperformed(SequenceVar var, int[] unperformed) {
    mainJNI.Assignment_setUnperformed(swigCPtr, this, SequenceVar.getCPtr(var), var, unperformed);
  }

  public void activate(IntVar var) {
    mainJNI.Assignment_activate__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public void deactivate(IntVar var) {
    mainJNI.Assignment_deactivate__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public boolean activated(IntVar var) {
    return mainJNI.Assignment_activated__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public void activate(IntervalVar var) {
    mainJNI.Assignment_activate__SWIG_1(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public void deactivate(IntervalVar var) {
    mainJNI.Assignment_deactivate__SWIG_1(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public boolean activated(IntervalVar var) {
    return mainJNI.Assignment_activated__SWIG_1(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public void activate(SequenceVar var) {
    mainJNI.Assignment_activate__SWIG_2(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public void deactivate(SequenceVar var) {
    mainJNI.Assignment_deactivate__SWIG_2(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public boolean activated(SequenceVar var) {
    return mainJNI.Assignment_activated__SWIG_2(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public void activateObjective() {
    mainJNI.Assignment_activateObjective(swigCPtr, this);
  }

  public void deactivateObjective() {
    mainJNI.Assignment_deactivateObjective(swigCPtr, this);
  }

  public boolean activatedObjective() {
    return mainJNI.Assignment_activatedObjective(swigCPtr, this);
  }

  public String toString() {
    return mainJNI.Assignment_toString(swigCPtr, this);
  }

  public boolean AreAllElementsBound() {
    return mainJNI.Assignment_AreAllElementsBound(swigCPtr, this);
  }

  public boolean contains(IntVar var) {
    return mainJNI.Assignment_contains__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public boolean contains(IntervalVar var) {
    return mainJNI.Assignment_contains__SWIG_1(swigCPtr, this, IntervalVar.getCPtr(var), var);
  }

  public boolean contains(SequenceVar var) {
    return mainJNI.Assignment_contains__SWIG_2(swigCPtr, this, SequenceVar.getCPtr(var), var);
  }

  public void copyIntersection(Assignment assignment) {
    mainJNI.Assignment_copyIntersection(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  public void copy(Assignment assignment) {
    mainJNI.Assignment_copy(swigCPtr, this, Assignment.getCPtr(assignment), assignment);
  }

  public AssignmentIntContainer intVarContainer() {
    return new AssignmentIntContainer(mainJNI.Assignment_intVarContainer(swigCPtr, this), false);
  }

  public AssignmentIntContainer mutableIntVarContainer() {
    long cPtr = mainJNI.Assignment_mutableIntVarContainer(swigCPtr, this);
    return (cPtr == 0) ? null : new AssignmentIntContainer(cPtr, false);
  }

  public AssignmentIntervalContainer intervalVarContainer() {
    return new AssignmentIntervalContainer(mainJNI.Assignment_intervalVarContainer(swigCPtr, this), false);
  }

  public AssignmentIntervalContainer mutableIntervalVarContainer() {
    long cPtr = mainJNI.Assignment_mutableIntervalVarContainer(swigCPtr, this);
    return (cPtr == 0) ? null : new AssignmentIntervalContainer(cPtr, false);
  }

  public AssignmentSequenceContainer sequenceVarContainer() {
    return new AssignmentSequenceContainer(mainJNI.Assignment_sequenceVarContainer(swigCPtr, this), false);
  }

  public AssignmentSequenceContainer mutableSequenceVarContainer() {
    long cPtr = mainJNI.Assignment_mutableSequenceVarContainer(swigCPtr, this);
    return (cPtr == 0) ? null : new AssignmentSequenceContainer(cPtr, false);
  }

}
