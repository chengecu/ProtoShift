// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_LJIMEHHNHJA.proto

package emu.grasscutter.net.newproto;

public final class Unk3000LJIMEHHNHJA {
  private Unk3000LJIMEHHNHJA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_LJIMEHHNHJAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_LJIMEHHNHJA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
     * @return A list containing the unk3000CKLBBGHIIFC.
     */
    java.util.List<java.lang.Integer> getUnk3000CKLBBGHIIFCList();
    /**
     * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
     * @return The count of unk3000CKLBBGHIIFC.
     */
    int getUnk3000CKLBBGHIIFCCount();
    /**
     * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
     * @param index The index of the element to return.
     * @return The unk3000CKLBBGHIIFC at the given index.
     */
    int getUnk3000CKLBBGHIIFC(int index);

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3493
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_LJIMEHHNHJA}
   */
  public static final class Unk3000_LJIMEHHNHJA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_LJIMEHHNHJA)
      Unk3000_LJIMEHHNHJAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_LJIMEHHNHJA.newBuilder() to construct.
    private Unk3000_LJIMEHHNHJA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_LJIMEHHNHJA() {
      unk3000CKLBBGHIIFC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_LJIMEHHNHJA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.internal_static_Unk3000_LJIMEHHNHJA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.internal_static_Unk3000_LJIMEHHNHJA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.class, emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.Builder.class);
    }

    public static final int UNK3000_CKLBBGHIIFC_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList unk3000CKLBBGHIIFC_;
    /**
     * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
     * @return A list containing the unk3000CKLBBGHIIFC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3000CKLBBGHIIFCList() {
      return unk3000CKLBBGHIIFC_;
    }
    /**
     * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
     * @return The count of unk3000CKLBBGHIIFC.
     */
    public int getUnk3000CKLBBGHIIFCCount() {
      return unk3000CKLBBGHIIFC_.size();
    }
    /**
     * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
     * @param index The index of the element to return.
     * @return The unk3000CKLBBGHIIFC at the given index.
     */
    public int getUnk3000CKLBBGHIIFC(int index) {
      return unk3000CKLBBGHIIFC_.getInt(index);
    }
    private int unk3000CKLBBGHIIFCMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (getUnk3000CKLBBGHIIFCList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(unk3000CKLBBGHIIFCMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3000CKLBBGHIIFC_.size(); i++) {
        output.writeUInt32NoTag(unk3000CKLBBGHIIFC_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
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
        for (int i = 0; i < unk3000CKLBBGHIIFC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3000CKLBBGHIIFC_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3000CKLBBGHIIFCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3000CKLBBGHIIFCMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA other = (emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA) obj;

      if (!getUnk3000CKLBBGHIIFCList()
          .equals(other.getUnk3000CKLBBGHIIFCList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getUnk3000CKLBBGHIIFCCount() > 0) {
        hash = (37 * hash) + UNK3000_CKLBBGHIIFC_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3000CKLBBGHIIFCList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA prototype) {
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
     * CmdId: 3493
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_LJIMEHHNHJA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_LJIMEHHNHJA)
        emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.internal_static_Unk3000_LJIMEHHNHJA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.internal_static_Unk3000_LJIMEHHNHJA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.class, emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3000CKLBBGHIIFC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.internal_static_Unk3000_LJIMEHHNHJA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA build() {
        emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA buildPartial() {
        emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA result = new emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3000CKLBBGHIIFC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3000CKLBBGHIIFC_ = unk3000CKLBBGHIIFC_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA other) {
        if (other == emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA.getDefaultInstance()) return this;
        if (!other.unk3000CKLBBGHIIFC_.isEmpty()) {
          if (unk3000CKLBBGHIIFC_.isEmpty()) {
            unk3000CKLBBGHIIFC_ = other.unk3000CKLBBGHIIFC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3000CKLBBGHIIFCIsMutable();
            unk3000CKLBBGHIIFC_.addAll(other.unk3000CKLBBGHIIFC_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 56: {
                int v = input.readUInt32();
                ensureUnk3000CKLBBGHIIFCIsMutable();
                unk3000CKLBBGHIIFC_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3000CKLBBGHIIFCIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3000CKLBBGHIIFC_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
              case 120: {
                retcode_ = input.readInt32();

                break;
              } // case 120
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

      private com.google.protobuf.Internal.IntList unk3000CKLBBGHIIFC_ = emptyIntList();
      private void ensureUnk3000CKLBBGHIIFCIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3000CKLBBGHIIFC_ = mutableCopy(unk3000CKLBBGHIIFC_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @return A list containing the unk3000CKLBBGHIIFC.
       */
      public java.util.List<java.lang.Integer>
          getUnk3000CKLBBGHIIFCList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3000CKLBBGHIIFC_) : unk3000CKLBBGHIIFC_;
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @return The count of unk3000CKLBBGHIIFC.
       */
      public int getUnk3000CKLBBGHIIFCCount() {
        return unk3000CKLBBGHIIFC_.size();
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @param index The index of the element to return.
       * @return The unk3000CKLBBGHIIFC at the given index.
       */
      public int getUnk3000CKLBBGHIIFC(int index) {
        return unk3000CKLBBGHIIFC_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @param index The index to set the value at.
       * @param value The unk3000CKLBBGHIIFC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CKLBBGHIIFC(
          int index, int value) {
        ensureUnk3000CKLBBGHIIFCIsMutable();
        unk3000CKLBBGHIIFC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @param value The unk3000CKLBBGHIIFC to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3000CKLBBGHIIFC(int value) {
        ensureUnk3000CKLBBGHIIFCIsMutable();
        unk3000CKLBBGHIIFC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @param values The unk3000CKLBBGHIIFC to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3000CKLBBGHIIFC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3000CKLBBGHIIFCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3000CKLBBGHIIFC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3000_CKLBBGHIIFC = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CKLBBGHIIFC() {
        unk3000CKLBBGHIIFC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_LJIMEHHNHJA)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_LJIMEHHNHJA)
    private static final emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA();
    }

    public static emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_LJIMEHHNHJA>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_LJIMEHHNHJA>() {
      @java.lang.Override
      public Unk3000_LJIMEHHNHJA parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_LJIMEHHNHJA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_LJIMEHHNHJA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000LJIMEHHNHJA.Unk3000_LJIMEHHNHJA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_LJIMEHHNHJA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_LJIMEHHNHJA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_LJIMEHHNHJA.proto\"C\n\023Unk3000_L" +
      "JIMEHHNHJA\022\033\n\023Unk3000_CKLBBGHIIFC\030\007 \003(\r\022" +
      "\017\n\007retcode\030\017 \001(\005B\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_LJIMEHHNHJA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_LJIMEHHNHJA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_LJIMEHHNHJA_descriptor,
        new java.lang.String[] { "Unk3000CKLBBGHIIFC", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}