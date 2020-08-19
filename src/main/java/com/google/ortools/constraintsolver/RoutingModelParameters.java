// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/routing_parameters.proto

package com.google.ortools.constraintsolver;

/**
 * <pre>
 * Parameters which have to be set when creating a RoutingModel.
 * </pre>
 *
 * Protobuf type {@code operations_research.RoutingModelParameters}
 */
public final class RoutingModelParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.RoutingModelParameters)
    RoutingModelParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoutingModelParameters.newBuilder() to construct.
  private RoutingModelParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoutingModelParameters() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoutingModelParameters();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoutingModelParameters(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.ortools.constraintsolver.ConstraintSolverParameters.Builder subBuilder = null;
            if (solverParameters_ != null) {
              subBuilder = solverParameters_.toBuilder();
            }
            solverParameters_ = input.readMessage(com.google.ortools.constraintsolver.ConstraintSolverParameters.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(solverParameters_);
              solverParameters_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            reduceVehicleCostModel_ = input.readBool();
            break;
          }
          case 24: {

            maxCallbackCacheSize_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.constraintsolver.RoutingParameters.internal_static_operations_research_RoutingModelParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.constraintsolver.RoutingParameters.internal_static_operations_research_RoutingModelParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.constraintsolver.RoutingModelParameters.class, com.google.ortools.constraintsolver.RoutingModelParameters.Builder.class);
  }

  public static final int SOLVER_PARAMETERS_FIELD_NUMBER = 1;
  private com.google.ortools.constraintsolver.ConstraintSolverParameters solverParameters_;
  /**
   * <pre>
   * Parameters to use in the underlying constraint solver.
   * </pre>
   *
   * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
   * @return Whether the solverParameters field is set.
   */
  @java.lang.Override
  public boolean hasSolverParameters() {
    return solverParameters_ != null;
  }
  /**
   * <pre>
   * Parameters to use in the underlying constraint solver.
   * </pre>
   *
   * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
   * @return The solverParameters.
   */
  @java.lang.Override
  public com.google.ortools.constraintsolver.ConstraintSolverParameters getSolverParameters() {
    return solverParameters_ == null ? com.google.ortools.constraintsolver.ConstraintSolverParameters.getDefaultInstance() : solverParameters_;
  }
  /**
   * <pre>
   * Parameters to use in the underlying constraint solver.
   * </pre>
   *
   * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
   */
  @java.lang.Override
  public com.google.ortools.constraintsolver.ConstraintSolverParametersOrBuilder getSolverParametersOrBuilder() {
    return getSolverParameters();
  }

  public static final int REDUCE_VEHICLE_COST_MODEL_FIELD_NUMBER = 2;
  private boolean reduceVehicleCostModel_;
  /**
   * <pre>
   * Advanced settings.
   * If set to true reduction of the underlying constraint model will be
   * attempted when all vehicles have exactly the same cost structure. This can
   * result in significant speedups.
   * </pre>
   *
   * <code>bool reduce_vehicle_cost_model = 2;</code>
   * @return The reduceVehicleCostModel.
   */
  @java.lang.Override
  public boolean getReduceVehicleCostModel() {
    return reduceVehicleCostModel_;
  }

  public static final int MAX_CALLBACK_CACHE_SIZE_FIELD_NUMBER = 3;
  private int maxCallbackCacheSize_;
  /**
   * <pre>
   * Cache callback calls if the number of nodes in the model is less or equal
   * to this value.
   * </pre>
   *
   * <code>int32 max_callback_cache_size = 3;</code>
   * @return The maxCallbackCacheSize.
   */
  @java.lang.Override
  public int getMaxCallbackCacheSize() {
    return maxCallbackCacheSize_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (solverParameters_ != null) {
      output.writeMessage(1, getSolverParameters());
    }
    if (reduceVehicleCostModel_ != false) {
      output.writeBool(2, reduceVehicleCostModel_);
    }
    if (maxCallbackCacheSize_ != 0) {
      output.writeInt32(3, maxCallbackCacheSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (solverParameters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSolverParameters());
    }
    if (reduceVehicleCostModel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, reduceVehicleCostModel_);
    }
    if (maxCallbackCacheSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxCallbackCacheSize_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ortools.constraintsolver.RoutingModelParameters)) {
      return super.equals(obj);
    }
    com.google.ortools.constraintsolver.RoutingModelParameters other = (com.google.ortools.constraintsolver.RoutingModelParameters) obj;

    if (hasSolverParameters() != other.hasSolverParameters()) return false;
    if (hasSolverParameters()) {
      if (!getSolverParameters()
          .equals(other.getSolverParameters())) return false;
    }
    if (getReduceVehicleCostModel()
        != other.getReduceVehicleCostModel()) return false;
    if (getMaxCallbackCacheSize()
        != other.getMaxCallbackCacheSize()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSolverParameters()) {
      hash = (37 * hash) + SOLVER_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getSolverParameters().hashCode();
    }
    hash = (37 * hash) + REDUCE_VEHICLE_COST_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReduceVehicleCostModel());
    hash = (37 * hash) + MAX_CALLBACK_CACHE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxCallbackCacheSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.RoutingModelParameters parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ortools.constraintsolver.RoutingModelParameters prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Parameters which have to be set when creating a RoutingModel.
   * </pre>
   *
   * Protobuf type {@code operations_research.RoutingModelParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.RoutingModelParameters)
      com.google.ortools.constraintsolver.RoutingModelParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.constraintsolver.RoutingParameters.internal_static_operations_research_RoutingModelParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.constraintsolver.RoutingParameters.internal_static_operations_research_RoutingModelParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.constraintsolver.RoutingModelParameters.class, com.google.ortools.constraintsolver.RoutingModelParameters.Builder.class);
    }

    // Construct using com.google.ortools.constraintsolver.RoutingModelParameters.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (solverParametersBuilder_ == null) {
        solverParameters_ = null;
      } else {
        solverParameters_ = null;
        solverParametersBuilder_ = null;
      }
      reduceVehicleCostModel_ = false;

      maxCallbackCacheSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.constraintsolver.RoutingParameters.internal_static_operations_research_RoutingModelParameters_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.constraintsolver.RoutingModelParameters getDefaultInstanceForType() {
      return com.google.ortools.constraintsolver.RoutingModelParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.constraintsolver.RoutingModelParameters build() {
      com.google.ortools.constraintsolver.RoutingModelParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.constraintsolver.RoutingModelParameters buildPartial() {
      com.google.ortools.constraintsolver.RoutingModelParameters result = new com.google.ortools.constraintsolver.RoutingModelParameters(this);
      if (solverParametersBuilder_ == null) {
        result.solverParameters_ = solverParameters_;
      } else {
        result.solverParameters_ = solverParametersBuilder_.build();
      }
      result.reduceVehicleCostModel_ = reduceVehicleCostModel_;
      result.maxCallbackCacheSize_ = maxCallbackCacheSize_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ortools.constraintsolver.RoutingModelParameters) {
        return mergeFrom((com.google.ortools.constraintsolver.RoutingModelParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.constraintsolver.RoutingModelParameters other) {
      if (other == com.google.ortools.constraintsolver.RoutingModelParameters.getDefaultInstance()) return this;
      if (other.hasSolverParameters()) {
        mergeSolverParameters(other.getSolverParameters());
      }
      if (other.getReduceVehicleCostModel() != false) {
        setReduceVehicleCostModel(other.getReduceVehicleCostModel());
      }
      if (other.getMaxCallbackCacheSize() != 0) {
        setMaxCallbackCacheSize(other.getMaxCallbackCacheSize());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ortools.constraintsolver.RoutingModelParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.constraintsolver.RoutingModelParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ortools.constraintsolver.ConstraintSolverParameters solverParameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ortools.constraintsolver.ConstraintSolverParameters, com.google.ortools.constraintsolver.ConstraintSolverParameters.Builder, com.google.ortools.constraintsolver.ConstraintSolverParametersOrBuilder> solverParametersBuilder_;
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     * @return Whether the solverParameters field is set.
     */
    public boolean hasSolverParameters() {
      return solverParametersBuilder_ != null || solverParameters_ != null;
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     * @return The solverParameters.
     */
    public com.google.ortools.constraintsolver.ConstraintSolverParameters getSolverParameters() {
      if (solverParametersBuilder_ == null) {
        return solverParameters_ == null ? com.google.ortools.constraintsolver.ConstraintSolverParameters.getDefaultInstance() : solverParameters_;
      } else {
        return solverParametersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    public Builder setSolverParameters(com.google.ortools.constraintsolver.ConstraintSolverParameters value) {
      if (solverParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        solverParameters_ = value;
        onChanged();
      } else {
        solverParametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    public Builder setSolverParameters(
        com.google.ortools.constraintsolver.ConstraintSolverParameters.Builder builderForValue) {
      if (solverParametersBuilder_ == null) {
        solverParameters_ = builderForValue.build();
        onChanged();
      } else {
        solverParametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    public Builder mergeSolverParameters(com.google.ortools.constraintsolver.ConstraintSolverParameters value) {
      if (solverParametersBuilder_ == null) {
        if (solverParameters_ != null) {
          solverParameters_ =
            com.google.ortools.constraintsolver.ConstraintSolverParameters.newBuilder(solverParameters_).mergeFrom(value).buildPartial();
        } else {
          solverParameters_ = value;
        }
        onChanged();
      } else {
        solverParametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    public Builder clearSolverParameters() {
      if (solverParametersBuilder_ == null) {
        solverParameters_ = null;
        onChanged();
      } else {
        solverParameters_ = null;
        solverParametersBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    public com.google.ortools.constraintsolver.ConstraintSolverParameters.Builder getSolverParametersBuilder() {
      
      onChanged();
      return getSolverParametersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    public com.google.ortools.constraintsolver.ConstraintSolverParametersOrBuilder getSolverParametersOrBuilder() {
      if (solverParametersBuilder_ != null) {
        return solverParametersBuilder_.getMessageOrBuilder();
      } else {
        return solverParameters_ == null ?
            com.google.ortools.constraintsolver.ConstraintSolverParameters.getDefaultInstance() : solverParameters_;
      }
    }
    /**
     * <pre>
     * Parameters to use in the underlying constraint solver.
     * </pre>
     *
     * <code>.operations_research.ConstraintSolverParameters solver_parameters = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ortools.constraintsolver.ConstraintSolverParameters, com.google.ortools.constraintsolver.ConstraintSolverParameters.Builder, com.google.ortools.constraintsolver.ConstraintSolverParametersOrBuilder> 
        getSolverParametersFieldBuilder() {
      if (solverParametersBuilder_ == null) {
        solverParametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ortools.constraintsolver.ConstraintSolverParameters, com.google.ortools.constraintsolver.ConstraintSolverParameters.Builder, com.google.ortools.constraintsolver.ConstraintSolverParametersOrBuilder>(
                getSolverParameters(),
                getParentForChildren(),
                isClean());
        solverParameters_ = null;
      }
      return solverParametersBuilder_;
    }

    private boolean reduceVehicleCostModel_ ;
    /**
     * <pre>
     * Advanced settings.
     * If set to true reduction of the underlying constraint model will be
     * attempted when all vehicles have exactly the same cost structure. This can
     * result in significant speedups.
     * </pre>
     *
     * <code>bool reduce_vehicle_cost_model = 2;</code>
     * @return The reduceVehicleCostModel.
     */
    @java.lang.Override
    public boolean getReduceVehicleCostModel() {
      return reduceVehicleCostModel_;
    }
    /**
     * <pre>
     * Advanced settings.
     * If set to true reduction of the underlying constraint model will be
     * attempted when all vehicles have exactly the same cost structure. This can
     * result in significant speedups.
     * </pre>
     *
     * <code>bool reduce_vehicle_cost_model = 2;</code>
     * @param value The reduceVehicleCostModel to set.
     * @return This builder for chaining.
     */
    public Builder setReduceVehicleCostModel(boolean value) {
      
      reduceVehicleCostModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Advanced settings.
     * If set to true reduction of the underlying constraint model will be
     * attempted when all vehicles have exactly the same cost structure. This can
     * result in significant speedups.
     * </pre>
     *
     * <code>bool reduce_vehicle_cost_model = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReduceVehicleCostModel() {
      
      reduceVehicleCostModel_ = false;
      onChanged();
      return this;
    }

    private int maxCallbackCacheSize_ ;
    /**
     * <pre>
     * Cache callback calls if the number of nodes in the model is less or equal
     * to this value.
     * </pre>
     *
     * <code>int32 max_callback_cache_size = 3;</code>
     * @return The maxCallbackCacheSize.
     */
    @java.lang.Override
    public int getMaxCallbackCacheSize() {
      return maxCallbackCacheSize_;
    }
    /**
     * <pre>
     * Cache callback calls if the number of nodes in the model is less or equal
     * to this value.
     * </pre>
     *
     * <code>int32 max_callback_cache_size = 3;</code>
     * @param value The maxCallbackCacheSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCallbackCacheSize(int value) {
      
      maxCallbackCacheSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cache callback calls if the number of nodes in the model is less or equal
     * to this value.
     * </pre>
     *
     * <code>int32 max_callback_cache_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCallbackCacheSize() {
      
      maxCallbackCacheSize_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:operations_research.RoutingModelParameters)
  }

  // @@protoc_insertion_point(class_scope:operations_research.RoutingModelParameters)
  private static final com.google.ortools.constraintsolver.RoutingModelParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.constraintsolver.RoutingModelParameters();
  }

  public static com.google.ortools.constraintsolver.RoutingModelParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoutingModelParameters>
      PARSER = new com.google.protobuf.AbstractParser<RoutingModelParameters>() {
    @java.lang.Override
    public RoutingModelParameters parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoutingModelParameters(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoutingModelParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoutingModelParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.constraintsolver.RoutingModelParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

