// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DestroyMaterialReq.proto

package emu.grasscutter.net.newproto;

public final class DestroyMaterialReqOuterClass {
  private DestroyMaterialReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DestroyMaterialReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DestroyMaterialReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo> 
        getMaterialListList();
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo getMaterialList(int index);
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    int getMaterialListCount();
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
        getMaterialListOrBuilderList();
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 685;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DestroyMaterialReq}
   */
  public static final class DestroyMaterialReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DestroyMaterialReq)
      DestroyMaterialReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DestroyMaterialReq.newBuilder() to construct.
    private DestroyMaterialReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DestroyMaterialReq() {
      materialList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DestroyMaterialReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.class, emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.Builder.class);
    }

    public static final int MATERIAL_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo> materialList_;
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo> getMaterialListList() {
      return materialList_;
    }
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
        getMaterialListOrBuilderList() {
      return materialList_;
    }
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    @java.lang.Override
    public int getMaterialListCount() {
      return materialList_.size();
    }
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo getMaterialList(int index) {
      return materialList_.get(index);
    }
    /**
     * <code>repeated .MaterialInfo material_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(
        int index) {
      return materialList_.get(index);
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
      for (int i = 0; i < materialList_.size(); i++) {
        output.writeMessage(1, materialList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < materialList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, materialList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq other = (emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq) obj;

      if (!getMaterialListList()
          .equals(other.getMaterialListList())) return false;
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
      if (getMaterialListCount() > 0) {
        hash = (37 * hash) + MATERIAL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMaterialListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq prototype) {
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
     *   CMD_ID = 685;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DestroyMaterialReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DestroyMaterialReq)
        emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.class, emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (materialListBuilder_ == null) {
          materialList_ = java.util.Collections.emptyList();
        } else {
          materialList_ = null;
          materialListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.internal_static_DestroyMaterialReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq build() {
        emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq buildPartial() {
        emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq result = new emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq(this);
        int from_bitField0_ = bitField0_;
        if (materialListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            materialList_ = java.util.Collections.unmodifiableList(materialList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.materialList_ = materialList_;
        } else {
          result.materialList_ = materialListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq) {
          return mergeFrom((emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq other) {
        if (other == emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq.getDefaultInstance()) return this;
        if (materialListBuilder_ == null) {
          if (!other.materialList_.isEmpty()) {
            if (materialList_.isEmpty()) {
              materialList_ = other.materialList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMaterialListIsMutable();
              materialList_.addAll(other.materialList_);
            }
            onChanged();
          }
        } else {
          if (!other.materialList_.isEmpty()) {
            if (materialListBuilder_.isEmpty()) {
              materialListBuilder_.dispose();
              materialListBuilder_ = null;
              materialList_ = other.materialList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              materialListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMaterialListFieldBuilder() : null;
            } else {
              materialListBuilder_.addAllMessages(other.materialList_);
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
              case 10: {
                emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.parser(),
                        extensionRegistry);
                if (materialListBuilder_ == null) {
                  ensureMaterialListIsMutable();
                  materialList_.add(m);
                } else {
                  materialListBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo> materialList_ =
        java.util.Collections.emptyList();
      private void ensureMaterialListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          materialList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo>(materialList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder> materialListBuilder_;

      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo> getMaterialListList() {
        if (materialListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(materialList_);
        } else {
          return materialListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public int getMaterialListCount() {
        if (materialListBuilder_ == null) {
          return materialList_.size();
        } else {
          return materialListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo getMaterialList(int index) {
        if (materialListBuilder_ == null) {
          return materialList_.get(index);
        } else {
          return materialListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder setMaterialList(
          int index, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo value) {
        if (materialListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMaterialListIsMutable();
          materialList_.set(index, value);
          onChanged();
        } else {
          materialListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder setMaterialList(
          int index, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.set(index, builderForValue.build());
          onChanged();
        } else {
          materialListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder addMaterialList(emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo value) {
        if (materialListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMaterialListIsMutable();
          materialList_.add(value);
          onChanged();
        } else {
          materialListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder addMaterialList(
          int index, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo value) {
        if (materialListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMaterialListIsMutable();
          materialList_.add(index, value);
          onChanged();
        } else {
          materialListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder addMaterialList(
          emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.add(builderForValue.build());
          onChanged();
        } else {
          materialListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder addMaterialList(
          int index, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder builderForValue) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.add(index, builderForValue.build());
          onChanged();
        } else {
          materialListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder addAllMaterialList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo> values) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, materialList_);
          onChanged();
        } else {
          materialListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder clearMaterialList() {
        if (materialListBuilder_ == null) {
          materialList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          materialListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public Builder removeMaterialList(int index) {
        if (materialListBuilder_ == null) {
          ensureMaterialListIsMutable();
          materialList_.remove(index);
          onChanged();
        } else {
          materialListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder getMaterialListBuilder(
          int index) {
        return getMaterialListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder getMaterialListOrBuilder(
          int index) {
        if (materialListBuilder_ == null) {
          return materialList_.get(index);  } else {
          return materialListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
           getMaterialListOrBuilderList() {
        if (materialListBuilder_ != null) {
          return materialListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(materialList_);
        }
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder addMaterialListBuilder() {
        return getMaterialListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder addMaterialListBuilder(
          int index) {
        return getMaterialListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MaterialInfo material_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder> 
           getMaterialListBuilderList() {
        return getMaterialListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder> 
          getMaterialListFieldBuilder() {
        if (materialListBuilder_ == null) {
          materialListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfo.Builder, emu.grasscutter.net.newproto.MaterialInfoOuterClass.MaterialInfoOrBuilder>(
                  materialList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          materialList_ = null;
        }
        return materialListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DestroyMaterialReq)
    }

    // @@protoc_insertion_point(class_scope:DestroyMaterialReq)
    private static final emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq();
    }

    public static emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DestroyMaterialReq>
        PARSER = new com.google.protobuf.AbstractParser<DestroyMaterialReq>() {
      @java.lang.Override
      public DestroyMaterialReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DestroyMaterialReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DestroyMaterialReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DestroyMaterialReqOuterClass.DestroyMaterialReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DestroyMaterialReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DestroyMaterialReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030DestroyMaterialReq.proto\032\022MaterialInfo" +
      ".proto\":\n\022DestroyMaterialReq\022$\n\rmaterial" +
      "_list\030\001 \003(\0132\r.MaterialInfoB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.MaterialInfoOuterClass.getDescriptor(),
        });
    internal_static_DestroyMaterialReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DestroyMaterialReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DestroyMaterialReq_descriptor,
        new java.lang.String[] { "MaterialList", });
    emu.grasscutter.net.newproto.MaterialInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}