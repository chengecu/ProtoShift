// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuildingInfo.proto

package emu.grasscutter.net.newproto;

public final class BuildingInfoOuterClass {
  private BuildingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuildingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuildingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 building_id = 1;</code>
     * @return The buildingId.
     */
    int getBuildingId();

    /**
     * <code>uint32 point_config_id = 2;</code>
     * @return The pointConfigId.
     */
    int getPointConfigId();

    /**
     * <code>uint32 cost = 3;</code>
     * @return The cost.
     */
    int getCost();

    /**
     * <code>uint32 refund = 5;</code>
     * @return The refund.
     */
    int getRefund();

    /**
     * <code>uint32 owner_uid = 6;</code>
     * @return The ownerUid.
     */
    int getOwnerUid();

    /**
     * <code>uint32 current_num = 7;</code>
     * @return The currentNum.
     */
    int getCurrentNum();

    /**
     * <code>uint32 max_num = 8;</code>
     * @return The maxNum.
     */
    int getMaxNum();
  }
  /**
   * Protobuf type {@code BuildingInfo}
   */
  public static final class BuildingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuildingInfo)
      BuildingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuildingInfo.newBuilder() to construct.
    private BuildingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuildingInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuildingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BuildingInfoOuterClass.internal_static_BuildingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.class, emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.Builder.class);
    }

    public static final int BUILDING_ID_FIELD_NUMBER = 1;
    private int buildingId_;
    /**
     * <code>uint32 building_id = 1;</code>
     * @return The buildingId.
     */
    @java.lang.Override
    public int getBuildingId() {
      return buildingId_;
    }

    public static final int POINT_CONFIG_ID_FIELD_NUMBER = 2;
    private int pointConfigId_;
    /**
     * <code>uint32 point_config_id = 2;</code>
     * @return The pointConfigId.
     */
    @java.lang.Override
    public int getPointConfigId() {
      return pointConfigId_;
    }

    public static final int COST_FIELD_NUMBER = 3;
    private int cost_;
    /**
     * <code>uint32 cost = 3;</code>
     * @return The cost.
     */
    @java.lang.Override
    public int getCost() {
      return cost_;
    }

    public static final int REFUND_FIELD_NUMBER = 5;
    private int refund_;
    /**
     * <code>uint32 refund = 5;</code>
     * @return The refund.
     */
    @java.lang.Override
    public int getRefund() {
      return refund_;
    }

    public static final int OWNER_UID_FIELD_NUMBER = 6;
    private int ownerUid_;
    /**
     * <code>uint32 owner_uid = 6;</code>
     * @return The ownerUid.
     */
    @java.lang.Override
    public int getOwnerUid() {
      return ownerUid_;
    }

    public static final int CURRENT_NUM_FIELD_NUMBER = 7;
    private int currentNum_;
    /**
     * <code>uint32 current_num = 7;</code>
     * @return The currentNum.
     */
    @java.lang.Override
    public int getCurrentNum() {
      return currentNum_;
    }

    public static final int MAX_NUM_FIELD_NUMBER = 8;
    private int maxNum_;
    /**
     * <code>uint32 max_num = 8;</code>
     * @return The maxNum.
     */
    @java.lang.Override
    public int getMaxNum() {
      return maxNum_;
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
      if (buildingId_ != 0) {
        output.writeUInt32(1, buildingId_);
      }
      if (pointConfigId_ != 0) {
        output.writeUInt32(2, pointConfigId_);
      }
      if (cost_ != 0) {
        output.writeUInt32(3, cost_);
      }
      if (refund_ != 0) {
        output.writeUInt32(5, refund_);
      }
      if (ownerUid_ != 0) {
        output.writeUInt32(6, ownerUid_);
      }
      if (currentNum_ != 0) {
        output.writeUInt32(7, currentNum_);
      }
      if (maxNum_ != 0) {
        output.writeUInt32(8, maxNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (buildingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, buildingId_);
      }
      if (pointConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pointConfigId_);
      }
      if (cost_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, cost_);
      }
      if (refund_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, refund_);
      }
      if (ownerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, ownerUid_);
      }
      if (currentNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, currentNum_);
      }
      if (maxNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, maxNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo other = (emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo) obj;

      if (getBuildingId()
          != other.getBuildingId()) return false;
      if (getPointConfigId()
          != other.getPointConfigId()) return false;
      if (getCost()
          != other.getCost()) return false;
      if (getRefund()
          != other.getRefund()) return false;
      if (getOwnerUid()
          != other.getOwnerUid()) return false;
      if (getCurrentNum()
          != other.getCurrentNum()) return false;
      if (getMaxNum()
          != other.getMaxNum()) return false;
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
      hash = (37 * hash) + BUILDING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingId();
      hash = (37 * hash) + POINT_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointConfigId();
      hash = (37 * hash) + COST_FIELD_NUMBER;
      hash = (53 * hash) + getCost();
      hash = (37 * hash) + REFUND_FIELD_NUMBER;
      hash = (53 * hash) + getRefund();
      hash = (37 * hash) + OWNER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerUid();
      hash = (37 * hash) + CURRENT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentNum();
      hash = (37 * hash) + MAX_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getMaxNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo prototype) {
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
     * Protobuf type {@code BuildingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuildingInfo)
        emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BuildingInfoOuterClass.internal_static_BuildingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.class, emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        buildingId_ = 0;

        pointConfigId_ = 0;

        cost_ = 0;

        refund_ = 0;

        ownerUid_ = 0;

        currentNum_ = 0;

        maxNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BuildingInfoOuterClass.internal_static_BuildingInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo build() {
        emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo buildPartial() {
        emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo result = new emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo(this);
        result.buildingId_ = buildingId_;
        result.pointConfigId_ = pointConfigId_;
        result.cost_ = cost_;
        result.refund_ = refund_;
        result.ownerUid_ = ownerUid_;
        result.currentNum_ = currentNum_;
        result.maxNum_ = maxNum_;
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
        if (other instanceof emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo other) {
        if (other == emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo.getDefaultInstance()) return this;
        if (other.getBuildingId() != 0) {
          setBuildingId(other.getBuildingId());
        }
        if (other.getPointConfigId() != 0) {
          setPointConfigId(other.getPointConfigId());
        }
        if (other.getCost() != 0) {
          setCost(other.getCost());
        }
        if (other.getRefund() != 0) {
          setRefund(other.getRefund());
        }
        if (other.getOwnerUid() != 0) {
          setOwnerUid(other.getOwnerUid());
        }
        if (other.getCurrentNum() != 0) {
          setCurrentNum(other.getCurrentNum());
        }
        if (other.getMaxNum() != 0) {
          setMaxNum(other.getMaxNum());
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
              case 8: {
                buildingId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                pointConfigId_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                cost_ = input.readUInt32();

                break;
              } // case 24
              case 40: {
                refund_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                ownerUid_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                currentNum_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                maxNum_ = input.readUInt32();

                break;
              } // case 64
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

      private int buildingId_ ;
      /**
       * <code>uint32 building_id = 1;</code>
       * @return The buildingId.
       */
      @java.lang.Override
      public int getBuildingId() {
        return buildingId_;
      }
      /**
       * <code>uint32 building_id = 1;</code>
       * @param value The buildingId to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingId(int value) {
        
        buildingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 building_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingId() {
        
        buildingId_ = 0;
        onChanged();
        return this;
      }

      private int pointConfigId_ ;
      /**
       * <code>uint32 point_config_id = 2;</code>
       * @return The pointConfigId.
       */
      @java.lang.Override
      public int getPointConfigId() {
        return pointConfigId_;
      }
      /**
       * <code>uint32 point_config_id = 2;</code>
       * @param value The pointConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setPointConfigId(int value) {
        
        pointConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_config_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointConfigId() {
        
        pointConfigId_ = 0;
        onChanged();
        return this;
      }

      private int cost_ ;
      /**
       * <code>uint32 cost = 3;</code>
       * @return The cost.
       */
      @java.lang.Override
      public int getCost() {
        return cost_;
      }
      /**
       * <code>uint32 cost = 3;</code>
       * @param value The cost to set.
       * @return This builder for chaining.
       */
      public Builder setCost(int value) {
        
        cost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCost() {
        
        cost_ = 0;
        onChanged();
        return this;
      }

      private int refund_ ;
      /**
       * <code>uint32 refund = 5;</code>
       * @return The refund.
       */
      @java.lang.Override
      public int getRefund() {
        return refund_;
      }
      /**
       * <code>uint32 refund = 5;</code>
       * @param value The refund to set.
       * @return This builder for chaining.
       */
      public Builder setRefund(int value) {
        
        refund_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refund = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefund() {
        
        refund_ = 0;
        onChanged();
        return this;
      }

      private int ownerUid_ ;
      /**
       * <code>uint32 owner_uid = 6;</code>
       * @return The ownerUid.
       */
      @java.lang.Override
      public int getOwnerUid() {
        return ownerUid_;
      }
      /**
       * <code>uint32 owner_uid = 6;</code>
       * @param value The ownerUid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerUid(int value) {
        
        ownerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_uid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerUid() {
        
        ownerUid_ = 0;
        onChanged();
        return this;
      }

      private int currentNum_ ;
      /**
       * <code>uint32 current_num = 7;</code>
       * @return The currentNum.
       */
      @java.lang.Override
      public int getCurrentNum() {
        return currentNum_;
      }
      /**
       * <code>uint32 current_num = 7;</code>
       * @param value The currentNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurrentNum(int value) {
        
        currentNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 current_num = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrentNum() {
        
        currentNum_ = 0;
        onChanged();
        return this;
      }

      private int maxNum_ ;
      /**
       * <code>uint32 max_num = 8;</code>
       * @return The maxNum.
       */
      @java.lang.Override
      public int getMaxNum() {
        return maxNum_;
      }
      /**
       * <code>uint32 max_num = 8;</code>
       * @param value The maxNum to set.
       * @return This builder for chaining.
       */
      public Builder setMaxNum(int value) {
        
        maxNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_num = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxNum() {
        
        maxNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BuildingInfo)
    }

    // @@protoc_insertion_point(class_scope:BuildingInfo)
    private static final emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo();
    }

    public static emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuildingInfo>
        PARSER = new com.google.protobuf.AbstractParser<BuildingInfo>() {
      @java.lang.Override
      public BuildingInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BuildingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuildingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BuildingInfoOuterClass.BuildingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuildingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuildingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BuildingInfo.proto\"\223\001\n\014BuildingInfo\022\023\n" +
      "\013building_id\030\001 \001(\r\022\027\n\017point_config_id\030\002 " +
      "\001(\r\022\014\n\004cost\030\003 \001(\r\022\016\n\006refund\030\005 \001(\r\022\021\n\town" +
      "er_uid\030\006 \001(\r\022\023\n\013current_num\030\007 \001(\r\022\017\n\007max" +
      "_num\030\010 \001(\rB\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BuildingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuildingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuildingInfo_descriptor,
        new java.lang.String[] { "BuildingId", "PointConfigId", "Cost", "Refund", "OwnerUid", "CurrentNum", "MaxNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}