// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3100_MFCGFACPOGJ.proto

package emu.grasscutter.net.newproto;

public final class Unk3100MFCGFACPOGJ {
  private Unk3100MFCGFACPOGJ() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3100_MFCGFACPOGJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3100_MFCGFACPOGJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
     * @return A list containing the unk3100MKNPIHFAGEP.
     */
    java.util.List<java.lang.Integer> getUnk3100MKNPIHFAGEPList();
    /**
     * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
     * @return The count of unk3100MKNPIHFAGEP.
     */
    int getUnk3100MKNPIHFAGEPCount();
    /**
     * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
     * @param index The index of the element to return.
     * @return The unk3100MKNPIHFAGEP at the given index.
     */
    int getUnk3100MKNPIHFAGEP(int index);
  }
  /**
   * <pre>
   * CmdId: 523
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3100_MFCGFACPOGJ}
   */
  public static final class Unk3100_MFCGFACPOGJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3100_MFCGFACPOGJ)
      Unk3100_MFCGFACPOGJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3100_MFCGFACPOGJ.newBuilder() to construct.
    private Unk3100_MFCGFACPOGJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3100_MFCGFACPOGJ() {
      unk3100MKNPIHFAGEP_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3100_MFCGFACPOGJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.internal_static_Unk3100_MFCGFACPOGJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.internal_static_Unk3100_MFCGFACPOGJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.class, emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.Builder.class);
    }

    public static final int UNK3100_MKNPIHFAGEP_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList unk3100MKNPIHFAGEP_;
    /**
     * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
     * @return A list containing the unk3100MKNPIHFAGEP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3100MKNPIHFAGEPList() {
      return unk3100MKNPIHFAGEP_;
    }
    /**
     * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
     * @return The count of unk3100MKNPIHFAGEP.
     */
    public int getUnk3100MKNPIHFAGEPCount() {
      return unk3100MKNPIHFAGEP_.size();
    }
    /**
     * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
     * @param index The index of the element to return.
     * @return The unk3100MKNPIHFAGEP at the given index.
     */
    public int getUnk3100MKNPIHFAGEP(int index) {
      return unk3100MKNPIHFAGEP_.getInt(index);
    }
    private int unk3100MKNPIHFAGEPMemoizedSerializedSize = -1;

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
      if (getUnk3100MKNPIHFAGEPList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(unk3100MKNPIHFAGEPMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3100MKNPIHFAGEP_.size(); i++) {
        output.writeUInt32NoTag(unk3100MKNPIHFAGEP_.getInt(i));
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
        for (int i = 0; i < unk3100MKNPIHFAGEP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3100MKNPIHFAGEP_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3100MKNPIHFAGEPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3100MKNPIHFAGEPMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ other = (emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ) obj;

      if (!getUnk3100MKNPIHFAGEPList()
          .equals(other.getUnk3100MKNPIHFAGEPList())) return false;
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
      if (getUnk3100MKNPIHFAGEPCount() > 0) {
        hash = (37 * hash) + UNK3100_MKNPIHFAGEP_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3100MKNPIHFAGEPList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ prototype) {
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
     * CmdId: 523
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3100_MFCGFACPOGJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3100_MFCGFACPOGJ)
        emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.internal_static_Unk3100_MFCGFACPOGJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.internal_static_Unk3100_MFCGFACPOGJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.class, emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3100MKNPIHFAGEP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.internal_static_Unk3100_MFCGFACPOGJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ build() {
        emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ buildPartial() {
        emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ result = new emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3100MKNPIHFAGEP_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3100MKNPIHFAGEP_ = unk3100MKNPIHFAGEP_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ other) {
        if (other == emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ.getDefaultInstance()) return this;
        if (!other.unk3100MKNPIHFAGEP_.isEmpty()) {
          if (unk3100MKNPIHFAGEP_.isEmpty()) {
            unk3100MKNPIHFAGEP_ = other.unk3100MKNPIHFAGEP_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3100MKNPIHFAGEPIsMutable();
            unk3100MKNPIHFAGEP_.addAll(other.unk3100MKNPIHFAGEP_);
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
              case 24: {
                int v = input.readUInt32();
                ensureUnk3100MKNPIHFAGEPIsMutable();
                unk3100MKNPIHFAGEP_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3100MKNPIHFAGEPIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3100MKNPIHFAGEP_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
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

      private com.google.protobuf.Internal.IntList unk3100MKNPIHFAGEP_ = emptyIntList();
      private void ensureUnk3100MKNPIHFAGEPIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3100MKNPIHFAGEP_ = mutableCopy(unk3100MKNPIHFAGEP_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @return A list containing the unk3100MKNPIHFAGEP.
       */
      public java.util.List<java.lang.Integer>
          getUnk3100MKNPIHFAGEPList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3100MKNPIHFAGEP_) : unk3100MKNPIHFAGEP_;
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @return The count of unk3100MKNPIHFAGEP.
       */
      public int getUnk3100MKNPIHFAGEPCount() {
        return unk3100MKNPIHFAGEP_.size();
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @param index The index of the element to return.
       * @return The unk3100MKNPIHFAGEP at the given index.
       */
      public int getUnk3100MKNPIHFAGEP(int index) {
        return unk3100MKNPIHFAGEP_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @param index The index to set the value at.
       * @param value The unk3100MKNPIHFAGEP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100MKNPIHFAGEP(
          int index, int value) {
        ensureUnk3100MKNPIHFAGEPIsMutable();
        unk3100MKNPIHFAGEP_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @param value The unk3100MKNPIHFAGEP to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3100MKNPIHFAGEP(int value) {
        ensureUnk3100MKNPIHFAGEPIsMutable();
        unk3100MKNPIHFAGEP_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @param values The unk3100MKNPIHFAGEP to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3100MKNPIHFAGEP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3100MKNPIHFAGEPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3100MKNPIHFAGEP_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_MKNPIHFAGEP = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100MKNPIHFAGEP() {
        unk3100MKNPIHFAGEP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:Unk3100_MFCGFACPOGJ)
    }

    // @@protoc_insertion_point(class_scope:Unk3100_MFCGFACPOGJ)
    private static final emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ();
    }

    public static emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3100_MFCGFACPOGJ>
        PARSER = new com.google.protobuf.AbstractParser<Unk3100_MFCGFACPOGJ>() {
      @java.lang.Override
      public Unk3100_MFCGFACPOGJ parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3100_MFCGFACPOGJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3100_MFCGFACPOGJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3100MFCGFACPOGJ.Unk3100_MFCGFACPOGJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3100_MFCGFACPOGJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3100_MFCGFACPOGJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3100_MFCGFACPOGJ.proto\"2\n\023Unk3100_M" +
      "FCGFACPOGJ\022\033\n\023Unk3100_MKNPIHFAGEP\030\003 \003(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3100_MFCGFACPOGJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3100_MFCGFACPOGJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3100_MFCGFACPOGJ_descriptor,
        new java.lang.String[] { "Unk3100MKNPIHFAGEP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
