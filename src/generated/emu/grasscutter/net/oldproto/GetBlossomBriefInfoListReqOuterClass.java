// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetBlossomBriefInfoListReq.proto

package emu.grasscutter.net.oldproto;

public final class GetBlossomBriefInfoListReqOuterClass {
  private GetBlossomBriefInfoListReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetBlossomBriefInfoListReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetBlossomBriefInfoListReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 city_id_list = 4;</code>
     * @return A list containing the cityIdList.
     */
    java.util.List<java.lang.Integer> getCityIdListList();
    /**
     * <code>repeated uint32 city_id_list = 4;</code>
     * @return The count of cityIdList.
     */
    int getCityIdListCount();
    /**
     * <code>repeated uint32 city_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The cityIdList at the given index.
     */
    int getCityIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 2772
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GetBlossomBriefInfoListReq}
   */
  public static final class GetBlossomBriefInfoListReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetBlossomBriefInfoListReq)
      GetBlossomBriefInfoListReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetBlossomBriefInfoListReq.newBuilder() to construct.
    private GetBlossomBriefInfoListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetBlossomBriefInfoListReq() {
      cityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetBlossomBriefInfoListReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.internal_static_GetBlossomBriefInfoListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.internal_static_GetBlossomBriefInfoListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.class, emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.Builder.class);
    }

    public static final int CITY_ID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList cityIdList_;
    /**
     * <code>repeated uint32 city_id_list = 4;</code>
     * @return A list containing the cityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCityIdListList() {
      return cityIdList_;
    }
    /**
     * <code>repeated uint32 city_id_list = 4;</code>
     * @return The count of cityIdList.
     */
    public int getCityIdListCount() {
      return cityIdList_.size();
    }
    /**
     * <code>repeated uint32 city_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The cityIdList at the given index.
     */
    public int getCityIdList(int index) {
      return cityIdList_.getInt(index);
    }
    private int cityIdListMemoizedSerializedSize = -1;

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
      if (getCityIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(cityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < cityIdList_.size(); i++) {
        output.writeUInt32NoTag(cityIdList_.getInt(i));
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
        for (int i = 0; i < cityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq other = (emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq) obj;

      if (!getCityIdListList()
          .equals(other.getCityIdListList())) return false;
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
      if (getCityIdListCount() > 0) {
        hash = (37 * hash) + CITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCityIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq prototype) {
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
     * CmdId: 2772
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GetBlossomBriefInfoListReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetBlossomBriefInfoListReq)
        emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.internal_static_GetBlossomBriefInfoListReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.internal_static_GetBlossomBriefInfoListReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.class, emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.internal_static_GetBlossomBriefInfoListReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq build() {
        emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq buildPartial() {
        emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq result = new emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cityIdList_ = cityIdList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq other) {
        if (other == emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq.getDefaultInstance()) return this;
        if (!other.cityIdList_.isEmpty()) {
          if (cityIdList_.isEmpty()) {
            cityIdList_ = other.cityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCityIdListIsMutable();
            cityIdList_.addAll(other.cityIdList_);
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
              case 32: {
                int v = input.readUInt32();
                ensureCityIdListIsMutable();
                cityIdList_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCityIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cityIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
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

      private com.google.protobuf.Internal.IntList cityIdList_ = emptyIntList();
      private void ensureCityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cityIdList_ = mutableCopy(cityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @return A list containing the cityIdList.
       */
      public java.util.List<java.lang.Integer>
          getCityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cityIdList_) : cityIdList_;
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @return The count of cityIdList.
       */
      public int getCityIdListCount() {
        return cityIdList_.size();
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The cityIdList at the given index.
       */
      public int getCityIdList(int index) {
        return cityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The cityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCityIdList(
          int index, int value) {
        ensureCityIdListIsMutable();
        cityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @param value The cityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCityIdList(int value) {
        ensureCityIdListIsMutable();
        cityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @param values The cityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 city_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityIdList() {
        cityIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GetBlossomBriefInfoListReq)
    }

    // @@protoc_insertion_point(class_scope:GetBlossomBriefInfoListReq)
    private static final emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq();
    }

    public static emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetBlossomBriefInfoListReq>
        PARSER = new com.google.protobuf.AbstractParser<GetBlossomBriefInfoListReq>() {
      @java.lang.Override
      public GetBlossomBriefInfoListReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetBlossomBriefInfoListReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlossomBriefInfoListReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GetBlossomBriefInfoListReqOuterClass.GetBlossomBriefInfoListReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBlossomBriefInfoListReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBlossomBriefInfoListReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetBlossomBriefInfoListReq.proto\"2\n\032Ge" +
      "tBlossomBriefInfoListReq\022\024\n\014city_id_list" +
      "\030\004 \003(\rB\036\n\034emu.grasscutter.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetBlossomBriefInfoListReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetBlossomBriefInfoListReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBlossomBriefInfoListReq_descriptor,
        new java.lang.String[] { "CityIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}