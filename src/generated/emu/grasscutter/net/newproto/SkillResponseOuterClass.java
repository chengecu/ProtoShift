// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkillResponse.proto

package emu.grasscutter.net.newproto;

public final class SkillResponseOuterClass {
  private SkillResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkillResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkillResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    java.util.List<java.lang.Integer> getUnk3250JDGLLFNGLGIList();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    int getUnk3250JDGLLFNGLGICount();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    int getUnk3250JDGLLFNGLGI(int index);

    /**
     * <code>uint32 skill_depot_id = 13;</code>
     * @return The skillDepotId.
     */
    int getSkillDepotId();
  }
  /**
   * Protobuf type {@code SkillResponse}
   */
  public static final class SkillResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkillResponse)
      SkillResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkillResponse.newBuilder() to construct.
    private SkillResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkillResponse() {
      unk3250JDGLLFNGLGI_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkillResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SkillResponseOuterClass.internal_static_SkillResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SkillResponseOuterClass.internal_static_SkillResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.class, emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.Builder.class);
    }

    public static final int UNK3250_JDGLLFNGLGI_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_;
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250JDGLLFNGLGIList() {
      return unk3250JDGLLFNGLGI_;
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    public int getUnk3250JDGLLFNGLGICount() {
      return unk3250JDGLLFNGLGI_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    public int getUnk3250JDGLLFNGLGI(int index) {
      return unk3250JDGLLFNGLGI_.getInt(index);
    }
    private int unk3250JDGLLFNGLGIMemoizedSerializedSize = -1;

    public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 13;
    private int skillDepotId_;
    /**
     * <code>uint32 skill_depot_id = 13;</code>
     * @return The skillDepotId.
     */
    @java.lang.Override
    public int getSkillDepotId() {
      return skillDepotId_;
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
      getSerializedSize();
      if (getUnk3250JDGLLFNGLGIList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(unk3250JDGLLFNGLGIMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
        output.writeUInt32NoTag(unk3250JDGLLFNGLGI_.getInt(i));
      }
      if (skillDepotId_ != 0) {
        output.writeUInt32(13, skillDepotId_);
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
        for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250JDGLLFNGLGI_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250JDGLLFNGLGIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250JDGLLFNGLGIMemoizedSerializedSize = dataSize;
      }
      if (skillDepotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, skillDepotId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse other = (emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse) obj;

      if (!getUnk3250JDGLLFNGLGIList()
          .equals(other.getUnk3250JDGLLFNGLGIList())) return false;
      if (getSkillDepotId()
          != other.getSkillDepotId()) return false;
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
      if (getUnk3250JDGLLFNGLGICount() > 0) {
        hash = (37 * hash) + UNK3250_JDGLLFNGLGI_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250JDGLLFNGLGIList().hashCode();
      }
      hash = (37 * hash) + SKILL_DEPOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillDepotId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse prototype) {
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
     * Protobuf type {@code SkillResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkillResponse)
        emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SkillResponseOuterClass.internal_static_SkillResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SkillResponseOuterClass.internal_static_SkillResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.class, emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250JDGLLFNGLGI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        skillDepotId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SkillResponseOuterClass.internal_static_SkillResponse_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse build() {
        emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse buildPartial() {
        emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse result = new emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3250JDGLLFNGLGI_ = unk3250JDGLLFNGLGI_;
        result.skillDepotId_ = skillDepotId_;
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
        if (other instanceof emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse) {
          return mergeFrom((emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse other) {
        if (other == emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse.getDefaultInstance()) return this;
        if (!other.unk3250JDGLLFNGLGI_.isEmpty()) {
          if (unk3250JDGLLFNGLGI_.isEmpty()) {
            unk3250JDGLLFNGLGI_ = other.unk3250JDGLLFNGLGI_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3250JDGLLFNGLGIIsMutable();
            unk3250JDGLLFNGLGI_.addAll(other.unk3250JDGLLFNGLGI_);
          }
          onChanged();
        }
        if (other.getSkillDepotId() != 0) {
          setSkillDepotId(other.getSkillDepotId());
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
              case 48: {
                int v = input.readUInt32();
                ensureUnk3250JDGLLFNGLGIIsMutable();
                unk3250JDGLLFNGLGI_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3250JDGLLFNGLGIIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3250JDGLLFNGLGI_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 104: {
                skillDepotId_ = input.readUInt32();

                break;
              } // case 104
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

      private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_ = emptyIntList();
      private void ensureUnk3250JDGLLFNGLGIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_ = mutableCopy(unk3250JDGLLFNGLGI_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @return A list containing the unk3250JDGLLFNGLGI.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250JDGLLFNGLGIList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250JDGLLFNGLGI_) : unk3250JDGLLFNGLGI_;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @return The count of unk3250JDGLLFNGLGI.
       */
      public int getUnk3250JDGLLFNGLGICount() {
        return unk3250JDGLLFNGLGI_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @param index The index of the element to return.
       * @return The unk3250JDGLLFNGLGI at the given index.
       */
      public int getUnk3250JDGLLFNGLGI(int index) {
        return unk3250JDGLLFNGLGI_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @param index The index to set the value at.
       * @param value The unk3250JDGLLFNGLGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JDGLLFNGLGI(
          int index, int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @param value The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250JDGLLFNGLGI(int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @param values The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250JDGLLFNGLGI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250JDGLLFNGLGI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JDGLLFNGLGI() {
        unk3250JDGLLFNGLGI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int skillDepotId_ ;
      /**
       * <code>uint32 skill_depot_id = 13;</code>
       * @return The skillDepotId.
       */
      @java.lang.Override
      public int getSkillDepotId() {
        return skillDepotId_;
      }
      /**
       * <code>uint32 skill_depot_id = 13;</code>
       * @param value The skillDepotId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillDepotId(int value) {
        
        skillDepotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_depot_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillDepotId() {
        
        skillDepotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SkillResponse)
    }

    // @@protoc_insertion_point(class_scope:SkillResponse)
    private static final emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse();
    }

    public static emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkillResponse>
        PARSER = new com.google.protobuf.AbstractParser<SkillResponse>() {
      @java.lang.Override
      public SkillResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<SkillResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkillResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SkillResponseOuterClass.SkillResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkillResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkillResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SkillResponse.proto\"D\n\rSkillResponse\022\033" +
      "\n\023Unk3250_JDGLLFNGLGI\030\006 \003(\r\022\026\n\016skill_dep" +
      "ot_id\030\r \001(\rB\036\n\034emu.grasscutter.net.newpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SkillResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkillResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkillResponse_descriptor,
        new java.lang.String[] { "Unk3250JDGLLFNGLGI", "SkillDepotId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
