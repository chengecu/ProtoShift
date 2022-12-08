// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleSeenRsp.proto

package emu.grasscutter.net.oldproto;

public final class HomeModuleSeenRspOuterClass {
  private HomeModuleSeenRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeModuleSeenRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeModuleSeenRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 seen_module_id_list = 13;</code>
     * @return A list containing the seenModuleIdList.
     */
    java.util.List<java.lang.Integer> getSeenModuleIdListList();
    /**
     * <code>repeated uint32 seen_module_id_list = 13;</code>
     * @return The count of seenModuleIdList.
     */
    int getSeenModuleIdListCount();
    /**
     * <code>repeated uint32 seen_module_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The seenModuleIdList at the given index.
     */
    int getSeenModuleIdList(int index);

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4821
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeModuleSeenRsp}
   */
  public static final class HomeModuleSeenRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeModuleSeenRsp)
      HomeModuleSeenRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeModuleSeenRsp.newBuilder() to construct.
    private HomeModuleSeenRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeModuleSeenRsp() {
      seenModuleIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeModuleSeenRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.internal_static_HomeModuleSeenRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.internal_static_HomeModuleSeenRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.class, emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.Builder.class);
    }

    public static final int SEEN_MODULE_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList seenModuleIdList_;
    /**
     * <code>repeated uint32 seen_module_id_list = 13;</code>
     * @return A list containing the seenModuleIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSeenModuleIdListList() {
      return seenModuleIdList_;
    }
    /**
     * <code>repeated uint32 seen_module_id_list = 13;</code>
     * @return The count of seenModuleIdList.
     */
    public int getSeenModuleIdListCount() {
      return seenModuleIdList_.size();
    }
    /**
     * <code>repeated uint32 seen_module_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The seenModuleIdList at the given index.
     */
    public int getSeenModuleIdList(int index) {
      return seenModuleIdList_.getInt(index);
    }
    private int seenModuleIdListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (getSeenModuleIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(seenModuleIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < seenModuleIdList_.size(); i++) {
        output.writeUInt32NoTag(seenModuleIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < seenModuleIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(seenModuleIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSeenModuleIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        seenModuleIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp other = (emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp) obj;

      if (!getSeenModuleIdListList()
          .equals(other.getSeenModuleIdListList())) return false;
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
      if (getSeenModuleIdListCount() > 0) {
        hash = (37 * hash) + SEEN_MODULE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSeenModuleIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp prototype) {
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
     * CmdId: 4821
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeModuleSeenRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeModuleSeenRsp)
        emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.internal_static_HomeModuleSeenRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.internal_static_HomeModuleSeenRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.class, emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        seenModuleIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.internal_static_HomeModuleSeenRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp build() {
        emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp buildPartial() {
        emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp result = new emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          seenModuleIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.seenModuleIdList_ = seenModuleIdList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp other) {
        if (other == emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp.getDefaultInstance()) return this;
        if (!other.seenModuleIdList_.isEmpty()) {
          if (seenModuleIdList_.isEmpty()) {
            seenModuleIdList_ = other.seenModuleIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSeenModuleIdListIsMutable();
            seenModuleIdList_.addAll(other.seenModuleIdList_);
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
              case 64: {
                retcode_ = input.readInt32();

                break;
              } // case 64
              case 104: {
                int v = input.readUInt32();
                ensureSeenModuleIdListIsMutable();
                seenModuleIdList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSeenModuleIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  seenModuleIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 106
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

      private com.google.protobuf.Internal.IntList seenModuleIdList_ = emptyIntList();
      private void ensureSeenModuleIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          seenModuleIdList_ = mutableCopy(seenModuleIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @return A list containing the seenModuleIdList.
       */
      public java.util.List<java.lang.Integer>
          getSeenModuleIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(seenModuleIdList_) : seenModuleIdList_;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @return The count of seenModuleIdList.
       */
      public int getSeenModuleIdListCount() {
        return seenModuleIdList_.size();
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The seenModuleIdList at the given index.
       */
      public int getSeenModuleIdList(int index) {
        return seenModuleIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The seenModuleIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSeenModuleIdList(
          int index, int value) {
        ensureSeenModuleIdListIsMutable();
        seenModuleIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @param value The seenModuleIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSeenModuleIdList(int value) {
        ensureSeenModuleIdListIsMutable();
        seenModuleIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @param values The seenModuleIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSeenModuleIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSeenModuleIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, seenModuleIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeenModuleIdList() {
        seenModuleIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
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


      // @@protoc_insertion_point(builder_scope:HomeModuleSeenRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeModuleSeenRsp)
    private static final emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp();
    }

    public static emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeModuleSeenRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeModuleSeenRsp>() {
      @java.lang.Override
      public HomeModuleSeenRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeModuleSeenRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeModuleSeenRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeModuleSeenRspOuterClass.HomeModuleSeenRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeModuleSeenRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeModuleSeenRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeModuleSeenRsp.proto\"A\n\021HomeModuleS" +
      "eenRsp\022\033\n\023seen_module_id_list\030\r \003(\r\022\017\n\007r" +
      "etcode\030\010 \001(\005B\036\n\034emu.grasscutter.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeModuleSeenRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeModuleSeenRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeModuleSeenRsp_descriptor,
        new java.lang.String[] { "SeenModuleIdList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}