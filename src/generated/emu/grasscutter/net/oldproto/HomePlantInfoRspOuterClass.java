// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantInfoRsp.proto

package emu.grasscutter.net.oldproto;

public final class HomePlantInfoRspOuterClass {
  private HomePlantInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData> 
        getFieldListList();
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData getFieldList(int index);
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    int getFieldListCount();
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
        getFieldListOrBuilderList();
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4701
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code HomePlantInfoRsp}
   */
  public static final class HomePlantInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantInfoRsp)
      HomePlantInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantInfoRsp.newBuilder() to construct.
    private HomePlantInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantInfoRsp() {
      fieldList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.internal_static_HomePlantInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.internal_static_HomePlantInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.class, emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int FIELD_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData> fieldList_;
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData> getFieldListList() {
      return fieldList_;
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
        getFieldListOrBuilderList() {
      return fieldList_;
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    @java.lang.Override
    public int getFieldListCount() {
      return fieldList_.size();
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData getFieldList(int index) {
      return fieldList_.get(index);
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldListOrBuilder(
        int index) {
      return fieldList_.get(index);
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
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      for (int i = 0; i < fieldList_.size(); i++) {
        output.writeMessage(15, fieldList_.get(i));
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
          .computeInt32Size(7, retcode_);
      }
      for (int i = 0; i < fieldList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, fieldList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp other = (emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getFieldListList()
          .equals(other.getFieldListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getFieldListCount() > 0) {
        hash = (37 * hash) + FIELD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFieldListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp prototype) {
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
     * CmdId: 4701
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code HomePlantInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantInfoRsp)
        emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.internal_static_HomePlantInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.internal_static_HomePlantInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.class, emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (fieldListBuilder_ == null) {
          fieldList_ = java.util.Collections.emptyList();
        } else {
          fieldList_ = null;
          fieldListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.internal_static_HomePlantInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp build() {
        emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp buildPartial() {
        emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp result = new emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (fieldListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fieldList_ = java.util.Collections.unmodifiableList(fieldList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fieldList_ = fieldList_;
        } else {
          result.fieldList_ = fieldListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp other) {
        if (other == emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (fieldListBuilder_ == null) {
          if (!other.fieldList_.isEmpty()) {
            if (fieldList_.isEmpty()) {
              fieldList_ = other.fieldList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFieldListIsMutable();
              fieldList_.addAll(other.fieldList_);
            }
            onChanged();
          }
        } else {
          if (!other.fieldList_.isEmpty()) {
            if (fieldListBuilder_.isEmpty()) {
              fieldListBuilder_.dispose();
              fieldListBuilder_ = null;
              fieldList_ = other.fieldList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fieldListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFieldListFieldBuilder() : null;
            } else {
              fieldListBuilder_.addAllMessages(other.fieldList_);
            }
          }
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
                retcode_ = input.readInt32();

                break;
              } // case 56
              case 122: {
                emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.parser(),
                        extensionRegistry);
                if (fieldListBuilder_ == null) {
                  ensureFieldListIsMutable();
                  fieldList_.add(m);
                } else {
                  fieldListBuilder_.addMessage(m);
                }
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData> fieldList_ =
        java.util.Collections.emptyList();
      private void ensureFieldListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fieldList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData>(fieldList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> fieldListBuilder_;

      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData> getFieldListList() {
        if (fieldListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fieldList_);
        } else {
          return fieldListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public int getFieldListCount() {
        if (fieldListBuilder_ == null) {
          return fieldList_.size();
        } else {
          return fieldListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData getFieldList(int index) {
        if (fieldListBuilder_ == null) {
          return fieldList_.get(index);
        } else {
          return fieldListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder setFieldList(
          int index, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldListIsMutable();
          fieldList_.set(index, value);
          onChanged();
        } else {
          fieldListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder setFieldList(
          int index, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.set(index, builderForValue.build());
          onChanged();
        } else {
          fieldListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder addFieldList(emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldListIsMutable();
          fieldList_.add(value);
          onChanged();
        } else {
          fieldListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder addFieldList(
          int index, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldListIsMutable();
          fieldList_.add(index, value);
          onChanged();
        } else {
          fieldListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder addFieldList(
          emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.add(builderForValue.build());
          onChanged();
        } else {
          fieldListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder addFieldList(
          int index, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.add(index, builderForValue.build());
          onChanged();
        } else {
          fieldListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder addAllFieldList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData> values) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fieldList_);
          onChanged();
        } else {
          fieldListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder clearFieldList() {
        if (fieldListBuilder_ == null) {
          fieldList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fieldListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public Builder removeFieldList(int index) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.remove(index);
          onChanged();
        } else {
          fieldListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder getFieldListBuilder(
          int index) {
        return getFieldListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldListOrBuilder(
          int index) {
        if (fieldListBuilder_ == null) {
          return fieldList_.get(index);  } else {
          return fieldListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
           getFieldListOrBuilderList() {
        if (fieldListBuilder_ != null) {
          return fieldListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fieldList_);
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder addFieldListBuilder() {
        return getFieldListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder addFieldListBuilder(
          int index) {
        return getFieldListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder> 
           getFieldListBuilderList() {
        return getFieldListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
          getFieldListFieldBuilder() {
        if (fieldListBuilder_ == null) {
          fieldListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder>(
                  fieldList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fieldList_ = null;
        }
        return fieldListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomePlantInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:HomePlantInfoRsp)
    private static final emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp();
    }

    public static emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantInfoRsp>() {
      @java.lang.Override
      public HomePlantInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomePlantInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomePlantInfoRspOuterClass.HomePlantInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HomePlantInfoRsp.proto\032\030HomePlantField" +
      "Data.proto\"L\n\020HomePlantInfoRsp\022\017\n\007retcod" +
      "e\030\007 \001(\005\022\'\n\nfield_list\030\017 \003(\0132\023.HomePlantF" +
      "ieldDataB\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.getDescriptor(),
        });
    internal_static_HomePlantInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "FieldList", });
    emu.grasscutter.net.oldproto.HomePlantFieldDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}