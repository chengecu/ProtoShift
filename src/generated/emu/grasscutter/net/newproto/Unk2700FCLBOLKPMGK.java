// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FCLBOLKPMGK.proto

package emu.grasscutter.net.newproto;

public final class Unk2700FCLBOLKPMGK {
  private Unk2700FCLBOLKPMGK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FCLBOLKPMGKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FCLBOLKPMGK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 item_id_list = 9;</code>
     * @return A list containing the itemIdList.
     */
    java.util.List<java.lang.Integer> getItemIdListList();
    /**
     * <code>repeated uint32 item_id_list = 9;</code>
     * @return The count of itemIdList.
     */
    int getItemIdListCount();
    /**
     * <code>repeated uint32 item_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    int getItemIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 8378
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_FCLBOLKPMGK}
   */
  public static final class Unk2700_FCLBOLKPMGK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FCLBOLKPMGK)
      Unk2700_FCLBOLKPMGKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FCLBOLKPMGK.newBuilder() to construct.
    private Unk2700_FCLBOLKPMGK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FCLBOLKPMGK() {
      itemIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FCLBOLKPMGK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.internal_static_Unk2700_FCLBOLKPMGK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.internal_static_Unk2700_FCLBOLKPMGK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.class, emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.Builder.class);
    }

    public static final int ITEM_ID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList itemIdList_;
    /**
     * <code>repeated uint32 item_id_list = 9;</code>
     * @return A list containing the itemIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getItemIdListList() {
      return itemIdList_;
    }
    /**
     * <code>repeated uint32 item_id_list = 9;</code>
     * @return The count of itemIdList.
     */
    public int getItemIdListCount() {
      return itemIdList_.size();
    }
    /**
     * <code>repeated uint32 item_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    public int getItemIdList(int index) {
      return itemIdList_.getInt(index);
    }
    private int itemIdListMemoizedSerializedSize = -1;

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
      if (getItemIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(itemIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemIdList_.size(); i++) {
        output.writeUInt32NoTag(itemIdList_.getInt(i));
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
        for (int i = 0; i < itemIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemIdList_.getInt(i));
        }
        size += dataSize;
        if (!getItemIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK other = (emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK) obj;

      if (!getItemIdListList()
          .equals(other.getItemIdListList())) return false;
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
      if (getItemIdListCount() > 0) {
        hash = (37 * hash) + ITEM_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK prototype) {
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
     * CmdId: 8378
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_FCLBOLKPMGK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FCLBOLKPMGK)
        emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.internal_static_Unk2700_FCLBOLKPMGK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.internal_static_Unk2700_FCLBOLKPMGK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.class, emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.internal_static_Unk2700_FCLBOLKPMGK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK build() {
        emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK buildPartial() {
        emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK result = new emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          itemIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemIdList_ = itemIdList_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK other) {
        if (other == emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK.getDefaultInstance()) return this;
        if (!other.itemIdList_.isEmpty()) {
          if (itemIdList_.isEmpty()) {
            itemIdList_ = other.itemIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemIdListIsMutable();
            itemIdList_.addAll(other.itemIdList_);
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
              case 72: {
                int v = input.readUInt32();
                ensureItemIdListIsMutable();
                itemIdList_.addInt(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureItemIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  itemIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 74
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

      private com.google.protobuf.Internal.IntList itemIdList_ = emptyIntList();
      private void ensureItemIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemIdList_ = mutableCopy(itemIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @return A list containing the itemIdList.
       */
      public java.util.List<java.lang.Integer>
          getItemIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemIdList_) : itemIdList_;
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @return The count of itemIdList.
       */
      public int getItemIdListCount() {
        return itemIdList_.size();
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The itemIdList at the given index.
       */
      public int getItemIdList(int index) {
        return itemIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The itemIdList to set.
       * @return This builder for chaining.
       */
      public Builder setItemIdList(
          int index, int value) {
        ensureItemIdListIsMutable();
        itemIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @param value The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addItemIdList(int value) {
        ensureItemIdListIsMutable();
        itemIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @param values The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureItemIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemIdList() {
        itemIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FCLBOLKPMGK)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FCLBOLKPMGK)
    private static final emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK();
    }

    public static emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FCLBOLKPMGK>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FCLBOLKPMGK>() {
      @java.lang.Override
      public Unk2700_FCLBOLKPMGK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_FCLBOLKPMGK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FCLBOLKPMGK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700FCLBOLKPMGK.Unk2700_FCLBOLKPMGK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FCLBOLKPMGK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FCLBOLKPMGK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_FCLBOLKPMGK.proto\"+\n\023Unk2700_F" +
      "CLBOLKPMGK\022\024\n\014item_id_list\030\t \003(\rB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FCLBOLKPMGK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FCLBOLKPMGK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FCLBOLKPMGK_descriptor,
        new java.lang.String[] { "ItemIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}