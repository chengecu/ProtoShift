// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoundationReq.proto

package emu.grasscutter.net.oldproto;

public final class FoundationReqOuterClass {
  private FoundationReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FoundationReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FoundationReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 point_config_id = 12;</code>
     * @return The pointConfigId.
     */
    int getPointConfigId();

    /**
     * <code>uint32 building_id = 13;</code>
     * @return The buildingId.
     */
    int getBuildingId();

    /**
     * <code>.FoundationOpType op_type = 10;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.FoundationOpType op_type = 10;</code>
     * @return The opType.
     */
    emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType getOpType();
  }
  /**
   * <pre>
   * CmdId: 805
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code FoundationReq}
   */
  public static final class FoundationReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FoundationReq)
      FoundationReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FoundationReq.newBuilder() to construct.
    private FoundationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FoundationReq() {
      opType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FoundationReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FoundationReqOuterClass.internal_static_FoundationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FoundationReqOuterClass.internal_static_FoundationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.class, emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 14;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 14;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int POINT_CONFIG_ID_FIELD_NUMBER = 12;
    private int pointConfigId_;
    /**
     * <code>uint32 point_config_id = 12;</code>
     * @return The pointConfigId.
     */
    @java.lang.Override
    public int getPointConfigId() {
      return pointConfigId_;
    }

    public static final int BUILDING_ID_FIELD_NUMBER = 13;
    private int buildingId_;
    /**
     * <code>uint32 building_id = 13;</code>
     * @return The buildingId.
     */
    @java.lang.Override
    public int getBuildingId() {
      return buildingId_;
    }

    public static final int OP_TYPE_FIELD_NUMBER = 10;
    private int opType_;
    /**
     * <code>.FoundationOpType op_type = 10;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.FoundationOpType op_type = 10;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType result = emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType.valueOf(opType_);
      return result == null ? emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType.UNRECOGNIZED : result;
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
      if (opType_ != emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType.FOUNDATION_OP_TYPE_NONE.getNumber()) {
        output.writeEnum(10, opType_);
      }
      if (pointConfigId_ != 0) {
        output.writeUInt32(12, pointConfigId_);
      }
      if (buildingId_ != 0) {
        output.writeUInt32(13, buildingId_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(14, gadgetEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (opType_ != emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType.FOUNDATION_OP_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, opType_);
      }
      if (pointConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pointConfigId_);
      }
      if (buildingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, buildingId_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gadgetEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq other = (emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getPointConfigId()
          != other.getPointConfigId()) return false;
      if (getBuildingId()
          != other.getBuildingId()) return false;
      if (opType_ != other.opType_) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + POINT_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointConfigId();
      hash = (37 * hash) + BUILDING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingId();
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq prototype) {
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
     * CmdId: 805
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code FoundationReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FoundationReq)
        emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FoundationReqOuterClass.internal_static_FoundationReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FoundationReqOuterClass.internal_static_FoundationReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.class, emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gadgetEntityId_ = 0;

        pointConfigId_ = 0;

        buildingId_ = 0;

        opType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FoundationReqOuterClass.internal_static_FoundationReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq build() {
        emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq buildPartial() {
        emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq result = new emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        result.pointConfigId_ = pointConfigId_;
        result.buildingId_ = buildingId_;
        result.opType_ = opType_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq other) {
        if (other == emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getPointConfigId() != 0) {
          setPointConfigId(other.getPointConfigId());
        }
        if (other.getBuildingId() != 0) {
          setBuildingId(other.getBuildingId());
        }
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
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
                opType_ = input.readEnum();

                break;
              } // case 80
              case 96: {
                pointConfigId_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                buildingId_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 112
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

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int pointConfigId_ ;
      /**
       * <code>uint32 point_config_id = 12;</code>
       * @return The pointConfigId.
       */
      @java.lang.Override
      public int getPointConfigId() {
        return pointConfigId_;
      }
      /**
       * <code>uint32 point_config_id = 12;</code>
       * @param value The pointConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setPointConfigId(int value) {
        
        pointConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_config_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointConfigId() {
        
        pointConfigId_ = 0;
        onChanged();
        return this;
      }

      private int buildingId_ ;
      /**
       * <code>uint32 building_id = 13;</code>
       * @return The buildingId.
       */
      @java.lang.Override
      public int getBuildingId() {
        return buildingId_;
      }
      /**
       * <code>uint32 building_id = 13;</code>
       * @param value The buildingId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingId(int value) {
        
        buildingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 building_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingId() {
        
        buildingId_ = 0;
        onChanged();
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.FoundationOpType op_type = 10;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.FoundationOpType op_type = 10;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FoundationOpType op_type = 10;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType result = emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType.valueOf(opType_);
        return result == null ? emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.FoundationOpType op_type = 10;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.FoundationOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FoundationOpType op_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FoundationReq)
    }

    // @@protoc_insertion_point(class_scope:FoundationReq)
    private static final emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq();
    }

    public static emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FoundationReq>
        PARSER = new com.google.protobuf.AbstractParser<FoundationReq>() {
      @java.lang.Override
      public FoundationReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FoundationReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FoundationReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FoundationReqOuterClass.FoundationReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FoundationReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FoundationReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023FoundationReq.proto\032\026FoundationOpType." +
      "proto\"{\n\rFoundationReq\022\030\n\020gadget_entity_" +
      "id\030\016 \001(\r\022\027\n\017point_config_id\030\014 \001(\r\022\023\n\013bui" +
      "lding_id\030\r \001(\r\022\"\n\007op_type\030\n \001(\0162\021.Founda" +
      "tionOpTypeB\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.getDescriptor(),
        });
    internal_static_FoundationReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FoundationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FoundationReq_descriptor,
        new java.lang.String[] { "GadgetEntityId", "PointConfigId", "BuildingId", "OpType", });
    emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}