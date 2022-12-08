// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingData.proto

package emu.grasscutter.net.newproto;

public final class PlayerOfferingDataOuterClass {
  private PlayerOfferingDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerOfferingDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerOfferingData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 8;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 offering_id = 3;</code>
     * @return The offeringId.
     */
    int getOfferingId();

    /**
     * <code>bool is_new_max_level = 14;</code>
     * @return The isNewMaxLevel.
     */
    boolean getIsNewMaxLevel();

    /**
     * <code>bool is_first_interact = 9;</code>
     * @return The isFirstInteract.
     */
    boolean getIsFirstInteract();

    /**
     * <code>repeated uint32 taken_level_reward_list = 2;</code>
     * @return A list containing the takenLevelRewardList.
     */
    java.util.List<java.lang.Integer> getTakenLevelRewardListList();
    /**
     * <code>repeated uint32 taken_level_reward_list = 2;</code>
     * @return The count of takenLevelRewardList.
     */
    int getTakenLevelRewardListCount();
    /**
     * <code>repeated uint32 taken_level_reward_list = 2;</code>
     * @param index The index of the element to return.
     * @return The takenLevelRewardList at the given index.
     */
    int getTakenLevelRewardList(int index);
  }
  /**
   * Protobuf type {@code PlayerOfferingData}
   */
  public static final class PlayerOfferingData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerOfferingData)
      PlayerOfferingDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerOfferingData.newBuilder() to construct.
    private PlayerOfferingData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerOfferingData() {
      takenLevelRewardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerOfferingData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.class, emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 8;
    private int level_;
    /**
     * <code>uint32 level = 8;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int OFFERING_ID_FIELD_NUMBER = 3;
    private int offeringId_;
    /**
     * <code>uint32 offering_id = 3;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
    }

    public static final int IS_NEW_MAX_LEVEL_FIELD_NUMBER = 14;
    private boolean isNewMaxLevel_;
    /**
     * <code>bool is_new_max_level = 14;</code>
     * @return The isNewMaxLevel.
     */
    @java.lang.Override
    public boolean getIsNewMaxLevel() {
      return isNewMaxLevel_;
    }

    public static final int IS_FIRST_INTERACT_FIELD_NUMBER = 9;
    private boolean isFirstInteract_;
    /**
     * <code>bool is_first_interact = 9;</code>
     * @return The isFirstInteract.
     */
    @java.lang.Override
    public boolean getIsFirstInteract() {
      return isFirstInteract_;
    }

    public static final int TAKEN_LEVEL_REWARD_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList takenLevelRewardList_;
    /**
     * <code>repeated uint32 taken_level_reward_list = 2;</code>
     * @return A list containing the takenLevelRewardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTakenLevelRewardListList() {
      return takenLevelRewardList_;
    }
    /**
     * <code>repeated uint32 taken_level_reward_list = 2;</code>
     * @return The count of takenLevelRewardList.
     */
    public int getTakenLevelRewardListCount() {
      return takenLevelRewardList_.size();
    }
    /**
     * <code>repeated uint32 taken_level_reward_list = 2;</code>
     * @param index The index of the element to return.
     * @return The takenLevelRewardList at the given index.
     */
    public int getTakenLevelRewardList(int index) {
      return takenLevelRewardList_.getInt(index);
    }
    private int takenLevelRewardListMemoizedSerializedSize = -1;

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
      if (getTakenLevelRewardListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(takenLevelRewardListMemoizedSerializedSize);
      }
      for (int i = 0; i < takenLevelRewardList_.size(); i++) {
        output.writeUInt32NoTag(takenLevelRewardList_.getInt(i));
      }
      if (offeringId_ != 0) {
        output.writeUInt32(3, offeringId_);
      }
      if (level_ != 0) {
        output.writeUInt32(8, level_);
      }
      if (isFirstInteract_ != false) {
        output.writeBool(9, isFirstInteract_);
      }
      if (isNewMaxLevel_ != false) {
        output.writeBool(14, isNewMaxLevel_);
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
        for (int i = 0; i < takenLevelRewardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(takenLevelRewardList_.getInt(i));
        }
        size += dataSize;
        if (!getTakenLevelRewardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        takenLevelRewardListMemoizedSerializedSize = dataSize;
      }
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, offeringId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, level_);
      }
      if (isFirstInteract_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isFirstInteract_);
      }
      if (isNewMaxLevel_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isNewMaxLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData other = (emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getOfferingId()
          != other.getOfferingId()) return false;
      if (getIsNewMaxLevel()
          != other.getIsNewMaxLevel()) return false;
      if (getIsFirstInteract()
          != other.getIsFirstInteract()) return false;
      if (!getTakenLevelRewardListList()
          .equals(other.getTakenLevelRewardListList())) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + OFFERING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (37 * hash) + IS_NEW_MAX_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewMaxLevel());
      hash = (37 * hash) + IS_FIRST_INTERACT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstInteract());
      if (getTakenLevelRewardListCount() > 0) {
        hash = (37 * hash) + TAKEN_LEVEL_REWARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTakenLevelRewardListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData prototype) {
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
     * Protobuf type {@code PlayerOfferingData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerOfferingData)
        emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.class, emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        level_ = 0;

        offeringId_ = 0;

        isNewMaxLevel_ = false;

        isFirstInteract_ = false;

        takenLevelRewardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData build() {
        emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData buildPartial() {
        emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData result = new emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData(this);
        int from_bitField0_ = bitField0_;
        result.level_ = level_;
        result.offeringId_ = offeringId_;
        result.isNewMaxLevel_ = isNewMaxLevel_;
        result.isFirstInteract_ = isFirstInteract_;
        if (((bitField0_ & 0x00000001) != 0)) {
          takenLevelRewardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.takenLevelRewardList_ = takenLevelRewardList_;
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData other) {
        if (other == emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
        }
        if (other.getIsNewMaxLevel() != false) {
          setIsNewMaxLevel(other.getIsNewMaxLevel());
        }
        if (other.getIsFirstInteract() != false) {
          setIsFirstInteract(other.getIsFirstInteract());
        }
        if (!other.takenLevelRewardList_.isEmpty()) {
          if (takenLevelRewardList_.isEmpty()) {
            takenLevelRewardList_ = other.takenLevelRewardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTakenLevelRewardListIsMutable();
            takenLevelRewardList_.addAll(other.takenLevelRewardList_);
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
              case 16: {
                int v = input.readUInt32();
                ensureTakenLevelRewardListIsMutable();
                takenLevelRewardList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTakenLevelRewardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  takenLevelRewardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 24: {
                offeringId_ = input.readUInt32();

                break;
              } // case 24
              case 64: {
                level_ = input.readUInt32();

                break;
              } // case 64
              case 72: {
                isFirstInteract_ = input.readBool();

                break;
              } // case 72
              case 112: {
                isNewMaxLevel_ = input.readBool();

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
      private int bitField0_;

      private int level_ ;
      /**
       * <code>uint32 level = 8;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 8;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int offeringId_ ;
      /**
       * <code>uint32 offering_id = 3;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>uint32 offering_id = 3;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {
        
        offeringId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offering_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        
        offeringId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewMaxLevel_ ;
      /**
       * <code>bool is_new_max_level = 14;</code>
       * @return The isNewMaxLevel.
       */
      @java.lang.Override
      public boolean getIsNewMaxLevel() {
        return isNewMaxLevel_;
      }
      /**
       * <code>bool is_new_max_level = 14;</code>
       * @param value The isNewMaxLevel to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewMaxLevel(boolean value) {
        
        isNewMaxLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_max_level = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewMaxLevel() {
        
        isNewMaxLevel_ = false;
        onChanged();
        return this;
      }

      private boolean isFirstInteract_ ;
      /**
       * <code>bool is_first_interact = 9;</code>
       * @return The isFirstInteract.
       */
      @java.lang.Override
      public boolean getIsFirstInteract() {
        return isFirstInteract_;
      }
      /**
       * <code>bool is_first_interact = 9;</code>
       * @param value The isFirstInteract to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstInteract(boolean value) {
        
        isFirstInteract_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_first_interact = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstInteract() {
        
        isFirstInteract_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList takenLevelRewardList_ = emptyIntList();
      private void ensureTakenLevelRewardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          takenLevelRewardList_ = mutableCopy(takenLevelRewardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @return A list containing the takenLevelRewardList.
       */
      public java.util.List<java.lang.Integer>
          getTakenLevelRewardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(takenLevelRewardList_) : takenLevelRewardList_;
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @return The count of takenLevelRewardList.
       */
      public int getTakenLevelRewardListCount() {
        return takenLevelRewardList_.size();
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @param index The index of the element to return.
       * @return The takenLevelRewardList at the given index.
       */
      public int getTakenLevelRewardList(int index) {
        return takenLevelRewardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The takenLevelRewardList to set.
       * @return This builder for chaining.
       */
      public Builder setTakenLevelRewardList(
          int index, int value) {
        ensureTakenLevelRewardListIsMutable();
        takenLevelRewardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @param value The takenLevelRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addTakenLevelRewardList(int value) {
        ensureTakenLevelRewardListIsMutable();
        takenLevelRewardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @param values The takenLevelRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTakenLevelRewardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTakenLevelRewardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, takenLevelRewardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_level_reward_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakenLevelRewardList() {
        takenLevelRewardList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:PlayerOfferingData)
    }

    // @@protoc_insertion_point(class_scope:PlayerOfferingData)
    private static final emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData();
    }

    public static emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerOfferingData>
        PARSER = new com.google.protobuf.AbstractParser<PlayerOfferingData>() {
      @java.lang.Override
      public PlayerOfferingData parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerOfferingData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerOfferingData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerOfferingDataOuterClass.PlayerOfferingData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerOfferingData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerOfferingData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PlayerOfferingData.proto\"\216\001\n\022PlayerOff" +
      "eringData\022\r\n\005level\030\010 \001(\r\022\023\n\013offering_id\030" +
      "\003 \001(\r\022\030\n\020is_new_max_level\030\016 \001(\010\022\031\n\021is_fi" +
      "rst_interact\030\t \001(\010\022\037\n\027taken_level_reward" +
      "_list\030\002 \003(\rB\036\n\034emu.grasscutter.net.newpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerOfferingData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerOfferingData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerOfferingData_descriptor,
        new java.lang.String[] { "Level", "OfferingId", "IsNewMaxLevel", "IsFirstInteract", "TakenLevelRewardList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}