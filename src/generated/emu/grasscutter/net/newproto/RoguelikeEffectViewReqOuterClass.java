// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeEffectViewReq.proto

package emu.grasscutter.net.newproto;

public final class RoguelikeEffectViewReqOuterClass {
  private RoguelikeEffectViewReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeEffectViewReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeEffectViewReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
     * @return A list containing the unk3300FKGJGIJHKJI.
     */
    java.util.List<java.lang.Integer> getUnk3300FKGJGIJHKJIList();
    /**
     * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
     * @return The count of unk3300FKGJGIJHKJI.
     */
    int getUnk3300FKGJGIJHKJICount();
    /**
     * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3300FKGJGIJHKJI at the given index.
     */
    int getUnk3300FKGJGIJHKJI(int index);

    /**
     * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
     * @return A list containing the unk3300LMIIAEPBKNB.
     */
    java.util.List<java.lang.Integer> getUnk3300LMIIAEPBKNBList();
    /**
     * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
     * @return The count of unk3300LMIIAEPBKNB.
     */
    int getUnk3300LMIIAEPBKNBCount();
    /**
     * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
     * @param index The index of the element to return.
     * @return The unk3300LMIIAEPBKNB at the given index.
     */
    int getUnk3300LMIIAEPBKNB(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8605;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RoguelikeEffectViewReq}
   */
  public static final class RoguelikeEffectViewReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeEffectViewReq)
      RoguelikeEffectViewReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeEffectViewReq.newBuilder() to construct.
    private RoguelikeEffectViewReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeEffectViewReq() {
      unk3300FKGJGIJHKJI_ = emptyIntList();
      unk3300LMIIAEPBKNB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeEffectViewReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.internal_static_RoguelikeEffectViewReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.internal_static_RoguelikeEffectViewReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.class, emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.Builder.class);
    }

    public static final int UNK3300_FKGJGIJHKJI_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList unk3300FKGJGIJHKJI_;
    /**
     * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
     * @return A list containing the unk3300FKGJGIJHKJI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300FKGJGIJHKJIList() {
      return unk3300FKGJGIJHKJI_;
    }
    /**
     * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
     * @return The count of unk3300FKGJGIJHKJI.
     */
    public int getUnk3300FKGJGIJHKJICount() {
      return unk3300FKGJGIJHKJI_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3300FKGJGIJHKJI at the given index.
     */
    public int getUnk3300FKGJGIJHKJI(int index) {
      return unk3300FKGJGIJHKJI_.getInt(index);
    }
    private int unk3300FKGJGIJHKJIMemoizedSerializedSize = -1;

    public static final int UNK3300_LMIIAEPBKNB_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList unk3300LMIIAEPBKNB_;
    /**
     * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
     * @return A list containing the unk3300LMIIAEPBKNB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300LMIIAEPBKNBList() {
      return unk3300LMIIAEPBKNB_;
    }
    /**
     * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
     * @return The count of unk3300LMIIAEPBKNB.
     */
    public int getUnk3300LMIIAEPBKNBCount() {
      return unk3300LMIIAEPBKNB_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
     * @param index The index of the element to return.
     * @return The unk3300LMIIAEPBKNB at the given index.
     */
    public int getUnk3300LMIIAEPBKNB(int index) {
      return unk3300LMIIAEPBKNB_.getInt(index);
    }
    private int unk3300LMIIAEPBKNBMemoizedSerializedSize = -1;

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
      if (getUnk3300FKGJGIJHKJIList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(unk3300FKGJGIJHKJIMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300FKGJGIJHKJI_.size(); i++) {
        output.writeUInt32NoTag(unk3300FKGJGIJHKJI_.getInt(i));
      }
      if (getUnk3300LMIIAEPBKNBList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(unk3300LMIIAEPBKNBMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300LMIIAEPBKNB_.size(); i++) {
        output.writeUInt32NoTag(unk3300LMIIAEPBKNB_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300FKGJGIJHKJI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300FKGJGIJHKJI_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300FKGJGIJHKJIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300FKGJGIJHKJIMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300LMIIAEPBKNB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300LMIIAEPBKNB_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300LMIIAEPBKNBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300LMIIAEPBKNBMemoizedSerializedSize = dataSize;
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq other = (emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq) obj;

      if (!getUnk3300FKGJGIJHKJIList()
          .equals(other.getUnk3300FKGJGIJHKJIList())) return false;
      if (!getUnk3300LMIIAEPBKNBList()
          .equals(other.getUnk3300LMIIAEPBKNBList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getUnk3300FKGJGIJHKJICount() > 0) {
        hash = (37 * hash) + UNK3300_FKGJGIJHKJI_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300FKGJGIJHKJIList().hashCode();
      }
      if (getUnk3300LMIIAEPBKNBCount() > 0) {
        hash = (37 * hash) + UNK3300_LMIIAEPBKNB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300LMIIAEPBKNBList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 8605;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RoguelikeEffectViewReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeEffectViewReq)
        emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.internal_static_RoguelikeEffectViewReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.internal_static_RoguelikeEffectViewReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.class, emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300FKGJGIJHKJI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300LMIIAEPBKNB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.internal_static_RoguelikeEffectViewReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq build() {
        emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq buildPartial() {
        emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq result = new emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3300FKGJGIJHKJI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3300FKGJGIJHKJI_ = unk3300FKGJGIJHKJI_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3300LMIIAEPBKNB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3300LMIIAEPBKNB_ = unk3300LMIIAEPBKNB_;
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
        if (other instanceof emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq) {
          return mergeFrom((emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq other) {
        if (other == emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq.getDefaultInstance()) return this;
        if (!other.unk3300FKGJGIJHKJI_.isEmpty()) {
          if (unk3300FKGJGIJHKJI_.isEmpty()) {
            unk3300FKGJGIJHKJI_ = other.unk3300FKGJGIJHKJI_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3300FKGJGIJHKJIIsMutable();
            unk3300FKGJGIJHKJI_.addAll(other.unk3300FKGJGIJHKJI_);
          }
          onChanged();
        }
        if (!other.unk3300LMIIAEPBKNB_.isEmpty()) {
          if (unk3300LMIIAEPBKNB_.isEmpty()) {
            unk3300LMIIAEPBKNB_ = other.unk3300LMIIAEPBKNB_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3300LMIIAEPBKNBIsMutable();
            unk3300LMIIAEPBKNB_.addAll(other.unk3300LMIIAEPBKNB_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 80: {
                int v = input.readUInt32();
                ensureUnk3300FKGJGIJHKJIIsMutable();
                unk3300FKGJGIJHKJI_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3300FKGJGIJHKJIIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3300FKGJGIJHKJI_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
              case 120: {
                int v = input.readUInt32();
                ensureUnk3300LMIIAEPBKNBIsMutable();
                unk3300LMIIAEPBKNB_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3300LMIIAEPBKNBIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3300LMIIAEPBKNB_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk3300FKGJGIJHKJI_ = emptyIntList();
      private void ensureUnk3300FKGJGIJHKJIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3300FKGJGIJHKJI_ = mutableCopy(unk3300FKGJGIJHKJI_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @return A list containing the unk3300FKGJGIJHKJI.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300FKGJGIJHKJIList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300FKGJGIJHKJI_) : unk3300FKGJGIJHKJI_;
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @return The count of unk3300FKGJGIJHKJI.
       */
      public int getUnk3300FKGJGIJHKJICount() {
        return unk3300FKGJGIJHKJI_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @param index The index of the element to return.
       * @return The unk3300FKGJGIJHKJI at the given index.
       */
      public int getUnk3300FKGJGIJHKJI(int index) {
        return unk3300FKGJGIJHKJI_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @param index The index to set the value at.
       * @param value The unk3300FKGJGIJHKJI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FKGJGIJHKJI(
          int index, int value) {
        ensureUnk3300FKGJGIJHKJIIsMutable();
        unk3300FKGJGIJHKJI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @param value The unk3300FKGJGIJHKJI to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300FKGJGIJHKJI(int value) {
        ensureUnk3300FKGJGIJHKJIIsMutable();
        unk3300FKGJGIJHKJI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @param values The unk3300FKGJGIJHKJI to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300FKGJGIJHKJI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300FKGJGIJHKJIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300FKGJGIJHKJI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_FKGJGIJHKJI = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FKGJGIJHKJI() {
        unk3300FKGJGIJHKJI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300LMIIAEPBKNB_ = emptyIntList();
      private void ensureUnk3300LMIIAEPBKNBIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3300LMIIAEPBKNB_ = mutableCopy(unk3300LMIIAEPBKNB_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @return A list containing the unk3300LMIIAEPBKNB.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300LMIIAEPBKNBList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300LMIIAEPBKNB_) : unk3300LMIIAEPBKNB_;
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @return The count of unk3300LMIIAEPBKNB.
       */
      public int getUnk3300LMIIAEPBKNBCount() {
        return unk3300LMIIAEPBKNB_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @param index The index of the element to return.
       * @return The unk3300LMIIAEPBKNB at the given index.
       */
      public int getUnk3300LMIIAEPBKNB(int index) {
        return unk3300LMIIAEPBKNB_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @param index The index to set the value at.
       * @param value The unk3300LMIIAEPBKNB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LMIIAEPBKNB(
          int index, int value) {
        ensureUnk3300LMIIAEPBKNBIsMutable();
        unk3300LMIIAEPBKNB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @param value The unk3300LMIIAEPBKNB to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300LMIIAEPBKNB(int value) {
        ensureUnk3300LMIIAEPBKNBIsMutable();
        unk3300LMIIAEPBKNB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @param values The unk3300LMIIAEPBKNB to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300LMIIAEPBKNB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300LMIIAEPBKNBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300LMIIAEPBKNB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_LMIIAEPBKNB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LMIIAEPBKNB() {
        unk3300LMIIAEPBKNB_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:RoguelikeEffectViewReq)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeEffectViewReq)
    private static final emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq();
    }

    public static emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeEffectViewReq>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeEffectViewReq>() {
      @java.lang.Override
      public RoguelikeEffectViewReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<RoguelikeEffectViewReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeEffectViewReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.RoguelikeEffectViewReqOuterClass.RoguelikeEffectViewReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeEffectViewReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeEffectViewReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034RoguelikeEffectViewReq.proto\"R\n\026Roguel" +
      "ikeEffectViewReq\022\033\n\023Unk3300_FKGJGIJHKJI\030" +
      "\n \003(\r\022\033\n\023Unk3300_LMIIAEPBKNB\030\017 \003(\rB\036\n\034em" +
      "u.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeEffectViewReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeEffectViewReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeEffectViewReq_descriptor,
        new java.lang.String[] { "Unk3300FKGJGIJHKJI", "Unk3300LMIIAEPBKNB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
