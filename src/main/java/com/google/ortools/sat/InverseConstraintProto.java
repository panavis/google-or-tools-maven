// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

/**
 * <pre>
 * The two arrays of variable each represent a function, the second is the
 * inverse of the first: f_direct[i] == j &lt;=&gt; f_inverse[j] == i.
 * </pre>
 *
 * Protobuf type {@code operations_research.sat.InverseConstraintProto}
 */
public final class InverseConstraintProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.sat.InverseConstraintProto)
    InverseConstraintProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InverseConstraintProto.newBuilder() to construct.
  private InverseConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InverseConstraintProto() {
    fDirect_ = emptyIntList();
    fInverse_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InverseConstraintProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InverseConstraintProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fDirect_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            fDirect_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              fDirect_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              fDirect_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              fInverse_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            fInverse_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              fInverse_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              fInverse_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fDirect_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        fInverse_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.sat.InverseConstraintProto.class, com.google.ortools.sat.InverseConstraintProto.Builder.class);
  }

  public static final int F_DIRECT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList fDirect_;
  /**
   * <code>repeated int32 f_direct = 1;</code>
   * @return A list containing the fDirect.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getFDirectList() {
    return fDirect_;
  }
  /**
   * <code>repeated int32 f_direct = 1;</code>
   * @return The count of fDirect.
   */
  public int getFDirectCount() {
    return fDirect_.size();
  }
  /**
   * <code>repeated int32 f_direct = 1;</code>
   * @param index The index of the element to return.
   * @return The fDirect at the given index.
   */
  public int getFDirect(int index) {
    return fDirect_.getInt(index);
  }
  private int fDirectMemoizedSerializedSize = -1;

  public static final int F_INVERSE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList fInverse_;
  /**
   * <code>repeated int32 f_inverse = 2;</code>
   * @return A list containing the fInverse.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getFInverseList() {
    return fInverse_;
  }
  /**
   * <code>repeated int32 f_inverse = 2;</code>
   * @return The count of fInverse.
   */
  public int getFInverseCount() {
    return fInverse_.size();
  }
  /**
   * <code>repeated int32 f_inverse = 2;</code>
   * @param index The index of the element to return.
   * @return The fInverse at the given index.
   */
  public int getFInverse(int index) {
    return fInverse_.getInt(index);
  }
  private int fInverseMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getFDirectList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(fDirectMemoizedSerializedSize);
    }
    for (int i = 0; i < fDirect_.size(); i++) {
      output.writeInt32NoTag(fDirect_.getInt(i));
    }
    if (getFInverseList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(fInverseMemoizedSerializedSize);
    }
    for (int i = 0; i < fInverse_.size(); i++) {
      output.writeInt32NoTag(fInverse_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < fDirect_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(fDirect_.getInt(i));
      }
      size += dataSize;
      if (!getFDirectList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fDirectMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fInverse_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(fInverse_.getInt(i));
      }
      size += dataSize;
      if (!getFInverseList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fInverseMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.ortools.sat.InverseConstraintProto)) {
      return super.equals(obj);
    }
    com.google.ortools.sat.InverseConstraintProto other = (com.google.ortools.sat.InverseConstraintProto) obj;

    if (!getFDirectList()
        .equals(other.getFDirectList())) return false;
    if (!getFInverseList()
        .equals(other.getFInverseList())) return false;
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
    if (getFDirectCount() > 0) {
      hash = (37 * hash) + F_DIRECT_FIELD_NUMBER;
      hash = (53 * hash) + getFDirectList().hashCode();
    }
    if (getFInverseCount() > 0) {
      hash = (37 * hash) + F_INVERSE_FIELD_NUMBER;
      hash = (53 * hash) + getFInverseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.InverseConstraintProto parseFrom(
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
  public static Builder newBuilder(com.google.ortools.sat.InverseConstraintProto prototype) {
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
   * The two arrays of variable each represent a function, the second is the
   * inverse of the first: f_direct[i] == j &lt;=&gt; f_inverse[j] == i.
   * </pre>
   *
   * Protobuf type {@code operations_research.sat.InverseConstraintProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.sat.InverseConstraintProto)
      com.google.ortools.sat.InverseConstraintProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.sat.InverseConstraintProto.class, com.google.ortools.sat.InverseConstraintProto.Builder.class);
    }

    // Construct using com.google.ortools.sat.InverseConstraintProto.newBuilder()
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
      fDirect_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      fInverse_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.sat.InverseConstraintProto getDefaultInstanceForType() {
      return com.google.ortools.sat.InverseConstraintProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.sat.InverseConstraintProto build() {
      com.google.ortools.sat.InverseConstraintProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.sat.InverseConstraintProto buildPartial() {
      com.google.ortools.sat.InverseConstraintProto result = new com.google.ortools.sat.InverseConstraintProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fDirect_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fDirect_ = fDirect_;
      if (((bitField0_ & 0x00000002) != 0)) {
        fInverse_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.fInverse_ = fInverse_;
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
      if (other instanceof com.google.ortools.sat.InverseConstraintProto) {
        return mergeFrom((com.google.ortools.sat.InverseConstraintProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.sat.InverseConstraintProto other) {
      if (other == com.google.ortools.sat.InverseConstraintProto.getDefaultInstance()) return this;
      if (!other.fDirect_.isEmpty()) {
        if (fDirect_.isEmpty()) {
          fDirect_ = other.fDirect_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFDirectIsMutable();
          fDirect_.addAll(other.fDirect_);
        }
        onChanged();
      }
      if (!other.fInverse_.isEmpty()) {
        if (fInverse_.isEmpty()) {
          fInverse_ = other.fInverse_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFInverseIsMutable();
          fInverse_.addAll(other.fInverse_);
        }
        onChanged();
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
      com.google.ortools.sat.InverseConstraintProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.sat.InverseConstraintProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList fDirect_ = emptyIntList();
    private void ensureFDirectIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fDirect_ = mutableCopy(fDirect_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @return A list containing the fDirect.
     */
    public java.util.List<java.lang.Integer>
        getFDirectList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(fDirect_) : fDirect_;
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @return The count of fDirect.
     */
    public int getFDirectCount() {
      return fDirect_.size();
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @param index The index of the element to return.
     * @return The fDirect at the given index.
     */
    public int getFDirect(int index) {
      return fDirect_.getInt(index);
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @param index The index to set the value at.
     * @param value The fDirect to set.
     * @return This builder for chaining.
     */
    public Builder setFDirect(
        int index, int value) {
      ensureFDirectIsMutable();
      fDirect_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @param value The fDirect to add.
     * @return This builder for chaining.
     */
    public Builder addFDirect(int value) {
      ensureFDirectIsMutable();
      fDirect_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @param values The fDirect to add.
     * @return This builder for chaining.
     */
    public Builder addAllFDirect(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFDirectIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fDirect_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 f_direct = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFDirect() {
      fDirect_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList fInverse_ = emptyIntList();
    private void ensureFInverseIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fInverse_ = mutableCopy(fInverse_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @return A list containing the fInverse.
     */
    public java.util.List<java.lang.Integer>
        getFInverseList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(fInverse_) : fInverse_;
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @return The count of fInverse.
     */
    public int getFInverseCount() {
      return fInverse_.size();
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @param index The index of the element to return.
     * @return The fInverse at the given index.
     */
    public int getFInverse(int index) {
      return fInverse_.getInt(index);
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @param index The index to set the value at.
     * @param value The fInverse to set.
     * @return This builder for chaining.
     */
    public Builder setFInverse(
        int index, int value) {
      ensureFInverseIsMutable();
      fInverse_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @param value The fInverse to add.
     * @return This builder for chaining.
     */
    public Builder addFInverse(int value) {
      ensureFInverseIsMutable();
      fInverse_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @param values The fInverse to add.
     * @return This builder for chaining.
     */
    public Builder addAllFInverse(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureFInverseIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fInverse_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 f_inverse = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFInverse() {
      fInverse_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:operations_research.sat.InverseConstraintProto)
  }

  // @@protoc_insertion_point(class_scope:operations_research.sat.InverseConstraintProto)
  private static final com.google.ortools.sat.InverseConstraintProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.sat.InverseConstraintProto();
  }

  public static com.google.ortools.sat.InverseConstraintProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InverseConstraintProto>
      PARSER = new com.google.protobuf.AbstractParser<InverseConstraintProto>() {
    @java.lang.Override
    public InverseConstraintProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InverseConstraintProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InverseConstraintProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InverseConstraintProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.sat.InverseConstraintProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

