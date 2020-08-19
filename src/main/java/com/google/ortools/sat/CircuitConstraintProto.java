// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/sat/cp_model.proto

package com.google.ortools.sat;

/**
 * <pre>
 * The circuit constraint is defined on a graph where the arc presence are
 * controlled by literals. Each arc is given by an index in the
 * tails/heads/literals lists that must have the same size.
 * For now, we ignore node indices with no incident arc. All the other nodes
 * must have exactly one incoming and one outgoing selected arc (i.e. literal at
 * true). All the selected arcs that are not self-loops must form a single
 * circuit. Note that multi-arcs are allowed, but only one of them will be true
 * at the same time. Multi-self loop are disallowed though.
 * </pre>
 *
 * Protobuf type {@code operations_research.sat.CircuitConstraintProto}
 */
public final class CircuitConstraintProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.sat.CircuitConstraintProto)
    CircuitConstraintProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CircuitConstraintProto.newBuilder() to construct.
  private CircuitConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CircuitConstraintProto() {
    tails_ = emptyIntList();
    heads_ = emptyIntList();
    literals_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CircuitConstraintProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CircuitConstraintProto(
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
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tails_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            tails_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              tails_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              tails_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              heads_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            heads_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              heads_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              heads_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              literals_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            literals_.addInt(input.readInt32());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              literals_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              literals_.addInt(input.readInt32());
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
        tails_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        heads_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        literals_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.sat.CircuitConstraintProto.class, com.google.ortools.sat.CircuitConstraintProto.Builder.class);
  }

  public static final int TAILS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList tails_;
  /**
   * <code>repeated int32 tails = 3;</code>
   * @return A list containing the tails.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getTailsList() {
    return tails_;
  }
  /**
   * <code>repeated int32 tails = 3;</code>
   * @return The count of tails.
   */
  public int getTailsCount() {
    return tails_.size();
  }
  /**
   * <code>repeated int32 tails = 3;</code>
   * @param index The index of the element to return.
   * @return The tails at the given index.
   */
  public int getTails(int index) {
    return tails_.getInt(index);
  }
  private int tailsMemoizedSerializedSize = -1;

  public static final int HEADS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList heads_;
  /**
   * <code>repeated int32 heads = 4;</code>
   * @return A list containing the heads.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getHeadsList() {
    return heads_;
  }
  /**
   * <code>repeated int32 heads = 4;</code>
   * @return The count of heads.
   */
  public int getHeadsCount() {
    return heads_.size();
  }
  /**
   * <code>repeated int32 heads = 4;</code>
   * @param index The index of the element to return.
   * @return The heads at the given index.
   */
  public int getHeads(int index) {
    return heads_.getInt(index);
  }
  private int headsMemoizedSerializedSize = -1;

  public static final int LITERALS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList literals_;
  /**
   * <code>repeated int32 literals = 5;</code>
   * @return A list containing the literals.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getLiteralsList() {
    return literals_;
  }
  /**
   * <code>repeated int32 literals = 5;</code>
   * @return The count of literals.
   */
  public int getLiteralsCount() {
    return literals_.size();
  }
  /**
   * <code>repeated int32 literals = 5;</code>
   * @param index The index of the element to return.
   * @return The literals at the given index.
   */
  public int getLiterals(int index) {
    return literals_.getInt(index);
  }
  private int literalsMemoizedSerializedSize = -1;

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
    if (getTailsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(tailsMemoizedSerializedSize);
    }
    for (int i = 0; i < tails_.size(); i++) {
      output.writeInt32NoTag(tails_.getInt(i));
    }
    if (getHeadsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(headsMemoizedSerializedSize);
    }
    for (int i = 0; i < heads_.size(); i++) {
      output.writeInt32NoTag(heads_.getInt(i));
    }
    if (getLiteralsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(literalsMemoizedSerializedSize);
    }
    for (int i = 0; i < literals_.size(); i++) {
      output.writeInt32NoTag(literals_.getInt(i));
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
      for (int i = 0; i < tails_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(tails_.getInt(i));
      }
      size += dataSize;
      if (!getTailsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      tailsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < heads_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(heads_.getInt(i));
      }
      size += dataSize;
      if (!getHeadsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      headsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < literals_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(literals_.getInt(i));
      }
      size += dataSize;
      if (!getLiteralsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      literalsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.ortools.sat.CircuitConstraintProto)) {
      return super.equals(obj);
    }
    com.google.ortools.sat.CircuitConstraintProto other = (com.google.ortools.sat.CircuitConstraintProto) obj;

    if (!getTailsList()
        .equals(other.getTailsList())) return false;
    if (!getHeadsList()
        .equals(other.getHeadsList())) return false;
    if (!getLiteralsList()
        .equals(other.getLiteralsList())) return false;
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
    if (getTailsCount() > 0) {
      hash = (37 * hash) + TAILS_FIELD_NUMBER;
      hash = (53 * hash) + getTailsList().hashCode();
    }
    if (getHeadsCount() > 0) {
      hash = (37 * hash) + HEADS_FIELD_NUMBER;
      hash = (53 * hash) + getHeadsList().hashCode();
    }
    if (getLiteralsCount() > 0) {
      hash = (37 * hash) + LITERALS_FIELD_NUMBER;
      hash = (53 * hash) + getLiteralsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.sat.CircuitConstraintProto parseFrom(
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
  public static Builder newBuilder(com.google.ortools.sat.CircuitConstraintProto prototype) {
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
   * The circuit constraint is defined on a graph where the arc presence are
   * controlled by literals. Each arc is given by an index in the
   * tails/heads/literals lists that must have the same size.
   * For now, we ignore node indices with no incident arc. All the other nodes
   * must have exactly one incoming and one outgoing selected arc (i.e. literal at
   * true). All the selected arcs that are not self-loops must form a single
   * circuit. Note that multi-arcs are allowed, but only one of them will be true
   * at the same time. Multi-self loop are disallowed though.
   * </pre>
   *
   * Protobuf type {@code operations_research.sat.CircuitConstraintProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.sat.CircuitConstraintProto)
      com.google.ortools.sat.CircuitConstraintProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.sat.CircuitConstraintProto.class, com.google.ortools.sat.CircuitConstraintProto.Builder.class);
    }

    // Construct using com.google.ortools.sat.CircuitConstraintProto.newBuilder()
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
      tails_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      heads_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      literals_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.sat.CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_descriptor;
    }

    @java.lang.Override
    public com.google.ortools.sat.CircuitConstraintProto getDefaultInstanceForType() {
      return com.google.ortools.sat.CircuitConstraintProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ortools.sat.CircuitConstraintProto build() {
      com.google.ortools.sat.CircuitConstraintProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ortools.sat.CircuitConstraintProto buildPartial() {
      com.google.ortools.sat.CircuitConstraintProto result = new com.google.ortools.sat.CircuitConstraintProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        tails_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tails_ = tails_;
      if (((bitField0_ & 0x00000002) != 0)) {
        heads_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.heads_ = heads_;
      if (((bitField0_ & 0x00000004) != 0)) {
        literals_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.literals_ = literals_;
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
      if (other instanceof com.google.ortools.sat.CircuitConstraintProto) {
        return mergeFrom((com.google.ortools.sat.CircuitConstraintProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.sat.CircuitConstraintProto other) {
      if (other == com.google.ortools.sat.CircuitConstraintProto.getDefaultInstance()) return this;
      if (!other.tails_.isEmpty()) {
        if (tails_.isEmpty()) {
          tails_ = other.tails_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTailsIsMutable();
          tails_.addAll(other.tails_);
        }
        onChanged();
      }
      if (!other.heads_.isEmpty()) {
        if (heads_.isEmpty()) {
          heads_ = other.heads_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureHeadsIsMutable();
          heads_.addAll(other.heads_);
        }
        onChanged();
      }
      if (!other.literals_.isEmpty()) {
        if (literals_.isEmpty()) {
          literals_ = other.literals_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureLiteralsIsMutable();
          literals_.addAll(other.literals_);
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
      com.google.ortools.sat.CircuitConstraintProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.sat.CircuitConstraintProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList tails_ = emptyIntList();
    private void ensureTailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tails_ = mutableCopy(tails_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @return A list containing the tails.
     */
    public java.util.List<java.lang.Integer>
        getTailsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(tails_) : tails_;
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @return The count of tails.
     */
    public int getTailsCount() {
      return tails_.size();
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @param index The index of the element to return.
     * @return The tails at the given index.
     */
    public int getTails(int index) {
      return tails_.getInt(index);
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @param index The index to set the value at.
     * @param value The tails to set.
     * @return This builder for chaining.
     */
    public Builder setTails(
        int index, int value) {
      ensureTailsIsMutable();
      tails_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @param value The tails to add.
     * @return This builder for chaining.
     */
    public Builder addTails(int value) {
      ensureTailsIsMutable();
      tails_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @param values The tails to add.
     * @return This builder for chaining.
     */
    public Builder addAllTails(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTailsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tails_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 tails = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTails() {
      tails_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList heads_ = emptyIntList();
    private void ensureHeadsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        heads_ = mutableCopy(heads_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @return A list containing the heads.
     */
    public java.util.List<java.lang.Integer>
        getHeadsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(heads_) : heads_;
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @return The count of heads.
     */
    public int getHeadsCount() {
      return heads_.size();
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @param index The index of the element to return.
     * @return The heads at the given index.
     */
    public int getHeads(int index) {
      return heads_.getInt(index);
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @param index The index to set the value at.
     * @param value The heads to set.
     * @return This builder for chaining.
     */
    public Builder setHeads(
        int index, int value) {
      ensureHeadsIsMutable();
      heads_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @param value The heads to add.
     * @return This builder for chaining.
     */
    public Builder addHeads(int value) {
      ensureHeadsIsMutable();
      heads_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @param values The heads to add.
     * @return This builder for chaining.
     */
    public Builder addAllHeads(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureHeadsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, heads_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 heads = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeads() {
      heads_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList literals_ = emptyIntList();
    private void ensureLiteralsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        literals_ = mutableCopy(literals_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @return A list containing the literals.
     */
    public java.util.List<java.lang.Integer>
        getLiteralsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(literals_) : literals_;
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @return The count of literals.
     */
    public int getLiteralsCount() {
      return literals_.size();
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @param index The index of the element to return.
     * @return The literals at the given index.
     */
    public int getLiterals(int index) {
      return literals_.getInt(index);
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @param index The index to set the value at.
     * @param value The literals to set.
     * @return This builder for chaining.
     */
    public Builder setLiterals(
        int index, int value) {
      ensureLiteralsIsMutable();
      literals_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @param value The literals to add.
     * @return This builder for chaining.
     */
    public Builder addLiterals(int value) {
      ensureLiteralsIsMutable();
      literals_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @param values The literals to add.
     * @return This builder for chaining.
     */
    public Builder addAllLiterals(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureLiteralsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, literals_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 literals = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLiterals() {
      literals_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:operations_research.sat.CircuitConstraintProto)
  }

  // @@protoc_insertion_point(class_scope:operations_research.sat.CircuitConstraintProto)
  private static final com.google.ortools.sat.CircuitConstraintProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.sat.CircuitConstraintProto();
  }

  public static com.google.ortools.sat.CircuitConstraintProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CircuitConstraintProto>
      PARSER = new com.google.protobuf.AbstractParser<CircuitConstraintProto>() {
    @java.lang.Override
    public CircuitConstraintProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CircuitConstraintProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CircuitConstraintProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CircuitConstraintProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ortools.sat.CircuitConstraintProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

