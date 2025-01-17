// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworksLaunchDataNotify.proto

package emu.grasscutter.net.oldproto;

public final class FireworksLaunchDataNotifyOuterClass {
  private FireworksLaunchDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireworksLaunchDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireworksLaunchDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData> 
        getSchemeDataListList();
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeDataList(int index);
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    int getSchemeDataListCount();
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> 
        getSchemeDataListOrBuilderList();
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataListOrBuilder(
        int index);

    /**
     * <code>uint32 last_use_scheme_id = 4;</code>
     * @return The lastUseSchemeId.
     */
    int getLastUseSchemeId();
  }
  /**
   * <pre>
   * CmdId: 5928
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FireworksLaunchDataNotify}
   */
  public static final class FireworksLaunchDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireworksLaunchDataNotify)
      FireworksLaunchDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireworksLaunchDataNotify.newBuilder() to construct.
    private FireworksLaunchDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireworksLaunchDataNotify() {
      schemeDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireworksLaunchDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.internal_static_FireworksLaunchDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.internal_static_FireworksLaunchDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.class, emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.Builder.class);
    }

    public static final int SCHEME_DATA_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData> schemeDataList_;
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData> getSchemeDataListList() {
      return schemeDataList_;
    }
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> 
        getSchemeDataListOrBuilderList() {
      return schemeDataList_;
    }
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    @java.lang.Override
    public int getSchemeDataListCount() {
      return schemeDataList_.size();
    }
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeDataList(int index) {
      return schemeDataList_.get(index);
    }
    /**
     * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataListOrBuilder(
        int index) {
      return schemeDataList_.get(index);
    }

    public static final int LAST_USE_SCHEME_ID_FIELD_NUMBER = 4;
    private int lastUseSchemeId_;
    /**
     * <code>uint32 last_use_scheme_id = 4;</code>
     * @return The lastUseSchemeId.
     */
    @java.lang.Override
    public int getLastUseSchemeId() {
      return lastUseSchemeId_;
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
      if (lastUseSchemeId_ != 0) {
        output.writeUInt32(4, lastUseSchemeId_);
      }
      for (int i = 0; i < schemeDataList_.size(); i++) {
        output.writeMessage(12, schemeDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lastUseSchemeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lastUseSchemeId_);
      }
      for (int i = 0; i < schemeDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, schemeDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify other = (emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify) obj;

      if (!getSchemeDataListList()
          .equals(other.getSchemeDataListList())) return false;
      if (getLastUseSchemeId()
          != other.getLastUseSchemeId()) return false;
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
      if (getSchemeDataListCount() > 0) {
        hash = (37 * hash) + SCHEME_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSchemeDataListList().hashCode();
      }
      hash = (37 * hash) + LAST_USE_SCHEME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLastUseSchemeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify prototype) {
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
     * CmdId: 5928
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FireworksLaunchDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireworksLaunchDataNotify)
        emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.internal_static_FireworksLaunchDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.internal_static_FireworksLaunchDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.class, emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (schemeDataListBuilder_ == null) {
          schemeDataList_ = java.util.Collections.emptyList();
        } else {
          schemeDataList_ = null;
          schemeDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        lastUseSchemeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.internal_static_FireworksLaunchDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify build() {
        emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify buildPartial() {
        emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify result = new emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (schemeDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            schemeDataList_ = java.util.Collections.unmodifiableList(schemeDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.schemeDataList_ = schemeDataList_;
        } else {
          result.schemeDataList_ = schemeDataListBuilder_.build();
        }
        result.lastUseSchemeId_ = lastUseSchemeId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify other) {
        if (other == emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.getDefaultInstance()) return this;
        if (schemeDataListBuilder_ == null) {
          if (!other.schemeDataList_.isEmpty()) {
            if (schemeDataList_.isEmpty()) {
              schemeDataList_ = other.schemeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSchemeDataListIsMutable();
              schemeDataList_.addAll(other.schemeDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.schemeDataList_.isEmpty()) {
            if (schemeDataListBuilder_.isEmpty()) {
              schemeDataListBuilder_.dispose();
              schemeDataListBuilder_ = null;
              schemeDataList_ = other.schemeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              schemeDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSchemeDataListFieldBuilder() : null;
            } else {
              schemeDataListBuilder_.addAllMessages(other.schemeDataList_);
            }
          }
        }
        if (other.getLastUseSchemeId() != 0) {
          setLastUseSchemeId(other.getLastUseSchemeId());
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
                lastUseSchemeId_ = input.readUInt32();

                break;
              } // case 32
              case 98: {
                emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.parser(),
                        extensionRegistry);
                if (schemeDataListBuilder_ == null) {
                  ensureSchemeDataListIsMutable();
                  schemeDataList_.add(m);
                } else {
                  schemeDataListBuilder_.addMessage(m);
                }
                break;
              } // case 98
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

      private java.util.List<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData> schemeDataList_ =
        java.util.Collections.emptyList();
      private void ensureSchemeDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          schemeDataList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData>(schemeDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> schemeDataListBuilder_;

      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData> getSchemeDataListList() {
        if (schemeDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(schemeDataList_);
        } else {
          return schemeDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public int getSchemeDataListCount() {
        if (schemeDataListBuilder_ == null) {
          return schemeDataList_.size();
        } else {
          return schemeDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeDataList(int index) {
        if (schemeDataListBuilder_ == null) {
          return schemeDataList_.get(index);
        } else {
          return schemeDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder setSchemeDataList(
          int index, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSchemeDataListIsMutable();
          schemeDataList_.set(index, value);
          onChanged();
        } else {
          schemeDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder setSchemeDataList(
          int index, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder builderForValue) {
        if (schemeDataListBuilder_ == null) {
          ensureSchemeDataListIsMutable();
          schemeDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          schemeDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder addSchemeDataList(emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSchemeDataListIsMutable();
          schemeDataList_.add(value);
          onChanged();
        } else {
          schemeDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder addSchemeDataList(
          int index, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSchemeDataListIsMutable();
          schemeDataList_.add(index, value);
          onChanged();
        } else {
          schemeDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder addSchemeDataList(
          emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder builderForValue) {
        if (schemeDataListBuilder_ == null) {
          ensureSchemeDataListIsMutable();
          schemeDataList_.add(builderForValue.build());
          onChanged();
        } else {
          schemeDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder addSchemeDataList(
          int index, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder builderForValue) {
        if (schemeDataListBuilder_ == null) {
          ensureSchemeDataListIsMutable();
          schemeDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          schemeDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder addAllSchemeDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData> values) {
        if (schemeDataListBuilder_ == null) {
          ensureSchemeDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, schemeDataList_);
          onChanged();
        } else {
          schemeDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder clearSchemeDataList() {
        if (schemeDataListBuilder_ == null) {
          schemeDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          schemeDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public Builder removeSchemeDataList(int index) {
        if (schemeDataListBuilder_ == null) {
          ensureSchemeDataListIsMutable();
          schemeDataList_.remove(index);
          onChanged();
        } else {
          schemeDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder getSchemeDataListBuilder(
          int index) {
        return getSchemeDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataListOrBuilder(
          int index) {
        if (schemeDataListBuilder_ == null) {
          return schemeDataList_.get(index);  } else {
          return schemeDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> 
           getSchemeDataListOrBuilderList() {
        if (schemeDataListBuilder_ != null) {
          return schemeDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(schemeDataList_);
        }
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder addSchemeDataListBuilder() {
        return getSchemeDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder addSchemeDataListBuilder(
          int index) {
        return getSchemeDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworksLaunchSchemeData scheme_data_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder> 
           getSchemeDataListBuilderList() {
        return getSchemeDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> 
          getSchemeDataListFieldBuilder() {
        if (schemeDataListBuilder_ == null) {
          schemeDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder>(
                  schemeDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          schemeDataList_ = null;
        }
        return schemeDataListBuilder_;
      }

      private int lastUseSchemeId_ ;
      /**
       * <code>uint32 last_use_scheme_id = 4;</code>
       * @return The lastUseSchemeId.
       */
      @java.lang.Override
      public int getLastUseSchemeId() {
        return lastUseSchemeId_;
      }
      /**
       * <code>uint32 last_use_scheme_id = 4;</code>
       * @param value The lastUseSchemeId to set.
       * @return This builder for chaining.
       */
      public Builder setLastUseSchemeId(int value) {
        
        lastUseSchemeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_use_scheme_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastUseSchemeId() {
        
        lastUseSchemeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FireworksLaunchDataNotify)
    }

    // @@protoc_insertion_point(class_scope:FireworksLaunchDataNotify)
    private static final emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify();
    }

    public static emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireworksLaunchDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<FireworksLaunchDataNotify>() {
      @java.lang.Override
      public FireworksLaunchDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FireworksLaunchDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireworksLaunchDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireworksLaunchDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireworksLaunchDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037FireworksLaunchDataNotify.proto\032\037Firew" +
      "orksLaunchSchemeData.proto\"m\n\031FireworksL" +
      "aunchDataNotify\0224\n\020scheme_data_list\030\014 \003(" +
      "\0132\032.FireworksLaunchSchemeData\022\032\n\022last_us" +
      "e_scheme_id\030\004 \001(\rB\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.getDescriptor(),
        });
    internal_static_FireworksLaunchDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireworksLaunchDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireworksLaunchDataNotify_descriptor,
        new java.lang.String[] { "SchemeDataList", "LastUseSchemeId", });
    emu.grasscutter.net.oldproto.FireworksLaunchSchemeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
