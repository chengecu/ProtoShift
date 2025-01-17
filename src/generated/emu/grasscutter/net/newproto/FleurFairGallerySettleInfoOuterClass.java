// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairGallerySettleInfo.proto

package emu.grasscutter.net.newproto;

public final class FleurFairGallerySettleInfoOuterClass {
  private FleurFairGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 8;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */
    int getEnergyStatMapCount();
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */
    boolean containsEnergyStatMap(
        int key);
    /**
     * Use {@link #getEnergyStatMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getEnergyStatMap();
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getEnergyStatMapMap();
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */

    int getEnergyStatMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */

    int getEnergyStatMapOrThrow(
        int key);

    /**
     * <code>uint32 energy = 3;</code>
     * @return The energy.
     */
    int getEnergy();

    /**
     * <code>uint32 gallery_stage_index = 6;</code>
     * @return The galleryStageIndex.
     */
    int getGalleryStageIndex();

    /**
     * <code>uint32 gallery_stage_count = 15;</code>
     * @return The galleryStageCount.
     */
    int getGalleryStageCount();
  }
  /**
   * Protobuf type {@code FleurFairGallerySettleInfo}
   */
  public static final class FleurFairGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairGallerySettleInfo)
      FleurFairGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairGallerySettleInfo.newBuilder() to construct.
    private FleurFairGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairGallerySettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.internal_static_FleurFairGallerySettleInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetEnergyStatMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.internal_static_FleurFairGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.class, emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 8;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 8;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int ENERGY_STAT_MAP_FIELD_NUMBER = 2;
    private static final class EnergyStatMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.internal_static_FleurFairGallerySettleInfo_EnergyStatMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> energyStatMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetEnergyStatMap() {
      if (energyStatMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            EnergyStatMapDefaultEntryHolder.defaultEntry);
      }
      return energyStatMap_;
    }

    public int getEnergyStatMapCount() {
      return internalGetEnergyStatMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */

    @java.lang.Override
    public boolean containsEnergyStatMap(
        int key) {
      
      return internalGetEnergyStatMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getEnergyStatMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getEnergyStatMap() {
      return getEnergyStatMapMap();
    }
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getEnergyStatMapMap() {
      return internalGetEnergyStatMap().getMap();
    }
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */
    @java.lang.Override

    public int getEnergyStatMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetEnergyStatMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
     */
    @java.lang.Override

    public int getEnergyStatMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetEnergyStatMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int ENERGY_FIELD_NUMBER = 3;
    private int energy_;
    /**
     * <code>uint32 energy = 3;</code>
     * @return The energy.
     */
    @java.lang.Override
    public int getEnergy() {
      return energy_;
    }

    public static final int GALLERY_STAGE_INDEX_FIELD_NUMBER = 6;
    private int galleryStageIndex_;
    /**
     * <code>uint32 gallery_stage_index = 6;</code>
     * @return The galleryStageIndex.
     */
    @java.lang.Override
    public int getGalleryStageIndex() {
      return galleryStageIndex_;
    }

    public static final int GALLERY_STAGE_COUNT_FIELD_NUMBER = 15;
    private int galleryStageCount_;
    /**
     * <code>uint32 gallery_stage_count = 15;</code>
     * @return The galleryStageCount.
     */
    @java.lang.Override
    public int getGalleryStageCount() {
      return galleryStageCount_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetEnergyStatMap(),
          EnergyStatMapDefaultEntryHolder.defaultEntry,
          2);
      if (energy_ != 0) {
        output.writeUInt32(3, energy_);
      }
      if (galleryStageIndex_ != 0) {
        output.writeUInt32(6, galleryStageIndex_);
      }
      if (isSuccess_ != false) {
        output.writeBool(8, isSuccess_);
      }
      if (galleryStageCount_ != 0) {
        output.writeUInt32(15, galleryStageCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetEnergyStatMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        energyStatMap__ = EnergyStatMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, energyStatMap__);
      }
      if (energy_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, energy_);
      }
      if (galleryStageIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, galleryStageIndex_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isSuccess_);
      }
      if (galleryStageCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, galleryStageCount_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo other = (emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (!internalGetEnergyStatMap().equals(
          other.internalGetEnergyStatMap())) return false;
      if (getEnergy()
          != other.getEnergy()) return false;
      if (getGalleryStageIndex()
          != other.getGalleryStageIndex()) return false;
      if (getGalleryStageCount()
          != other.getGalleryStageCount()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      if (!internalGetEnergyStatMap().getMap().isEmpty()) {
        hash = (37 * hash) + ENERGY_STAT_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetEnergyStatMap().hashCode();
      }
      hash = (37 * hash) + ENERGY_FIELD_NUMBER;
      hash = (53 * hash) + getEnergy();
      hash = (37 * hash) + GALLERY_STAGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryStageIndex();
      hash = (37 * hash) + GALLERY_STAGE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryStageCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo prototype) {
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
     * Protobuf type {@code FleurFairGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairGallerySettleInfo)
        emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.internal_static_FleurFairGallerySettleInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetEnergyStatMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableEnergyStatMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.internal_static_FleurFairGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.class, emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isSuccess_ = false;

        internalGetMutableEnergyStatMap().clear();
        energy_ = 0;

        galleryStageIndex_ = 0;

        galleryStageCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.internal_static_FleurFairGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo build() {
        emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo buildPartial() {
        emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo result = new emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo(this);
        int from_bitField0_ = bitField0_;
        result.isSuccess_ = isSuccess_;
        result.energyStatMap_ = internalGetEnergyStatMap();
        result.energyStatMap_.makeImmutable();
        result.energy_ = energy_;
        result.galleryStageIndex_ = galleryStageIndex_;
        result.galleryStageCount_ = galleryStageCount_;
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
        if (other instanceof emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo other) {
        if (other == emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        internalGetMutableEnergyStatMap().mergeFrom(
            other.internalGetEnergyStatMap());
        if (other.getEnergy() != 0) {
          setEnergy(other.getEnergy());
        }
        if (other.getGalleryStageIndex() != 0) {
          setGalleryStageIndex(other.getGalleryStageIndex());
        }
        if (other.getGalleryStageCount() != 0) {
          setGalleryStageCount(other.getGalleryStageCount());
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
              case 18: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                energyStatMap__ = input.readMessage(
                    EnergyStatMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableEnergyStatMap().getMutableMap().put(
                    energyStatMap__.getKey(), energyStatMap__.getValue());
                break;
              } // case 18
              case 24: {
                energy_ = input.readUInt32();

                break;
              } // case 24
              case 48: {
                galleryStageIndex_ = input.readUInt32();

                break;
              } // case 48
              case 64: {
                isSuccess_ = input.readBool();

                break;
              } // case 64
              case 120: {
                galleryStageCount_ = input.readUInt32();

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

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 8;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 8;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> energyStatMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetEnergyStatMap() {
        if (energyStatMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              EnergyStatMapDefaultEntryHolder.defaultEntry);
        }
        return energyStatMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableEnergyStatMap() {
        onChanged();;
        if (energyStatMap_ == null) {
          energyStatMap_ = com.google.protobuf.MapField.newMapField(
              EnergyStatMapDefaultEntryHolder.defaultEntry);
        }
        if (!energyStatMap_.isMutable()) {
          energyStatMap_ = energyStatMap_.copy();
        }
        return energyStatMap_;
      }

      public int getEnergyStatMapCount() {
        return internalGetEnergyStatMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */

      @java.lang.Override
      public boolean containsEnergyStatMap(
          int key) {
        
        return internalGetEnergyStatMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getEnergyStatMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getEnergyStatMap() {
        return getEnergyStatMapMap();
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getEnergyStatMapMap() {
        return internalGetEnergyStatMap().getMap();
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */
      @java.lang.Override

      public int getEnergyStatMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetEnergyStatMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */
      @java.lang.Override

      public int getEnergyStatMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetEnergyStatMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearEnergyStatMap() {
        internalGetMutableEnergyStatMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */

      public Builder removeEnergyStatMap(
          int key) {
        
        internalGetMutableEnergyStatMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableEnergyStatMap() {
        return internalGetMutableEnergyStatMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */
      public Builder putEnergyStatMap(
          int key,
          int value) {
        
        
        internalGetMutableEnergyStatMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, int32&gt; energy_stat_map = 2;</code>
       */

      public Builder putAllEnergyStatMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableEnergyStatMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int energy_ ;
      /**
       * <code>uint32 energy = 3;</code>
       * @return The energy.
       */
      @java.lang.Override
      public int getEnergy() {
        return energy_;
      }
      /**
       * <code>uint32 energy = 3;</code>
       * @param value The energy to set.
       * @return This builder for chaining.
       */
      public Builder setEnergy(int value) {
        
        energy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 energy = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnergy() {
        
        energy_ = 0;
        onChanged();
        return this;
      }

      private int galleryStageIndex_ ;
      /**
       * <code>uint32 gallery_stage_index = 6;</code>
       * @return The galleryStageIndex.
       */
      @java.lang.Override
      public int getGalleryStageIndex() {
        return galleryStageIndex_;
      }
      /**
       * <code>uint32 gallery_stage_index = 6;</code>
       * @param value The galleryStageIndex to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryStageIndex(int value) {
        
        galleryStageIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_stage_index = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryStageIndex() {
        
        galleryStageIndex_ = 0;
        onChanged();
        return this;
      }

      private int galleryStageCount_ ;
      /**
       * <code>uint32 gallery_stage_count = 15;</code>
       * @return The galleryStageCount.
       */
      @java.lang.Override
      public int getGalleryStageCount() {
        return galleryStageCount_;
      }
      /**
       * <code>uint32 gallery_stage_count = 15;</code>
       * @param value The galleryStageCount to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryStageCount(int value) {
        
        galleryStageCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_stage_count = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryStageCount() {
        
        galleryStageCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:FleurFairGallerySettleInfo)
    private static final emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo();
    }

    public static emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairGallerySettleInfo>() {
      @java.lang.Override
      public FleurFairGallerySettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<FleurFairGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FleurFairGallerySettleInfoOuterClass.FleurFairGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairGallerySettleInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairGallerySettleInfo_EnergyStatMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairGallerySettleInfo_EnergyStatMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FleurFairGallerySettleInfo.proto\"\371\001\n\032F" +
      "leurFairGallerySettleInfo\022\022\n\nis_success\030" +
      "\010 \001(\010\022G\n\017energy_stat_map\030\002 \003(\0132..FleurFa" +
      "irGallerySettleInfo.EnergyStatMapEntry\022\016" +
      "\n\006energy\030\003 \001(\r\022\033\n\023gallery_stage_index\030\006 " +
      "\001(\r\022\033\n\023gallery_stage_count\030\017 \001(\r\0324\n\022Ener" +
      "gyStatMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001" +
      "(\005:\0028\001B\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairGallerySettleInfo_descriptor,
        new java.lang.String[] { "IsSuccess", "EnergyStatMap", "Energy", "GalleryStageIndex", "GalleryStageCount", });
    internal_static_FleurFairGallerySettleInfo_EnergyStatMapEntry_descriptor =
      internal_static_FleurFairGallerySettleInfo_descriptor.getNestedTypes().get(0);
    internal_static_FleurFairGallerySettleInfo_EnergyStatMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairGallerySettleInfo_EnergyStatMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
