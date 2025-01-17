// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoSaveTeamReq.proto

package emu.grasscutter.net.newproto;

public final class SumoSaveTeamReqOuterClass {
  private SumoSaveTeamReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoSaveTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoSaveTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficulty_id = 6;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>uint32 stage_id = 14;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 activity_id = 1;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData> 
        getTeamListList();
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData getTeamList(int index);
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    int getTeamListCount();
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
        getTeamListOrBuilderList();
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder getTeamListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8022;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SumoSaveTeamReq}
   */
  public static final class SumoSaveTeamReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoSaveTeamReq)
      SumoSaveTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoSaveTeamReq.newBuilder() to construct.
    private SumoSaveTeamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoSaveTeamReq() {
      teamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoSaveTeamReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.class, emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.Builder.class);
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 6;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 6;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 14;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 14;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 1;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 1;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int TEAM_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData> teamList_;
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData> getTeamListList() {
      return teamList_;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
        getTeamListOrBuilderList() {
      return teamList_;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    @java.lang.Override
    public int getTeamListCount() {
      return teamList_.size();
    }
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData getTeamList(int index) {
      return teamList_.get(index);
    }
    /**
     * <code>repeated .SumoTeamData team_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder getTeamListOrBuilder(
        int index) {
      return teamList_.get(index);
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
      if (activityId_ != 0) {
        output.writeUInt32(1, activityId_);
      }
      for (int i = 0; i < teamList_.size(); i++) {
        output.writeMessage(2, teamList_.get(i));
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(6, difficultyId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(14, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, activityId_);
      }
      for (int i = 0; i < teamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, teamList_.get(i));
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, difficultyId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq other = (emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq) obj;

      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
      if (!getTeamListList()
          .equals(other.getTeamListList())) return false;
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
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      if (getTeamListCount() > 0) {
        hash = (37 * hash) + TEAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq prototype) {
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
     *   CMD_ID = 8022;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SumoSaveTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoSaveTeamReq)
        emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.class, emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        difficultyId_ = 0;

        stageId_ = 0;

        activityId_ = 0;

        if (teamListBuilder_ == null) {
          teamList_ = java.util.Collections.emptyList();
        } else {
          teamList_ = null;
          teamListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq build() {
        emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq buildPartial() {
        emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq result = new emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq(this);
        int from_bitField0_ = bitField0_;
        result.difficultyId_ = difficultyId_;
        result.stageId_ = stageId_;
        result.activityId_ = activityId_;
        if (teamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamList_ = java.util.Collections.unmodifiableList(teamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamList_ = teamList_;
        } else {
          result.teamList_ = teamListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq) {
          return mergeFrom((emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq other) {
        if (other == emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.getDefaultInstance()) return this;
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (teamListBuilder_ == null) {
          if (!other.teamList_.isEmpty()) {
            if (teamList_.isEmpty()) {
              teamList_ = other.teamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamListIsMutable();
              teamList_.addAll(other.teamList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamList_.isEmpty()) {
            if (teamListBuilder_.isEmpty()) {
              teamListBuilder_.dispose();
              teamListBuilder_ = null;
              teamList_ = other.teamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamListFieldBuilder() : null;
            } else {
              teamListBuilder_.addAllMessages(other.teamList_);
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
              case 8: {
                activityId_ = input.readUInt32();

                break;
              } // case 8
              case 18: {
                emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.parser(),
                        extensionRegistry);
                if (teamListBuilder_ == null) {
                  ensureTeamListIsMutable();
                  teamList_.add(m);
                } else {
                  teamListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 48: {
                difficultyId_ = input.readUInt32();

                break;
              } // case 48
              case 112: {
                stageId_ = input.readUInt32();

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

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 6;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 6;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 14;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 14;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 1;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 1;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData> teamList_ =
        java.util.Collections.emptyList();
      private void ensureTeamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData>(teamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> teamListBuilder_;

      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData> getTeamListList() {
        if (teamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamList_);
        } else {
          return teamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public int getTeamListCount() {
        if (teamListBuilder_ == null) {
          return teamList_.size();
        } else {
          return teamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData getTeamList(int index) {
        if (teamListBuilder_ == null) {
          return teamList_.get(index);
        } else {
          return teamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder setTeamList(
          int index, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData value) {
        if (teamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamListIsMutable();
          teamList_.set(index, value);
          onChanged();
        } else {
          teamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder setTeamList(
          int index, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder builderForValue) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder addTeamList(emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData value) {
        if (teamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamListIsMutable();
          teamList_.add(value);
          onChanged();
        } else {
          teamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder addTeamList(
          int index, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData value) {
        if (teamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamListIsMutable();
          teamList_.add(index, value);
          onChanged();
        } else {
          teamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder addTeamList(
          emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder builderForValue) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.add(builderForValue.build());
          onChanged();
        } else {
          teamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder addTeamList(
          int index, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder builderForValue) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder addAllTeamList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData> values) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamList_);
          onChanged();
        } else {
          teamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder clearTeamList() {
        if (teamListBuilder_ == null) {
          teamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public Builder removeTeamList(int index) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.remove(index);
          onChanged();
        } else {
          teamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder getTeamListBuilder(
          int index) {
        return getTeamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder getTeamListOrBuilder(
          int index) {
        if (teamListBuilder_ == null) {
          return teamList_.get(index);  } else {
          return teamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
           getTeamListOrBuilderList() {
        if (teamListBuilder_ != null) {
          return teamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamList_);
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder addTeamListBuilder() {
        return getTeamListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.getDefaultInstance());
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder addTeamListBuilder(
          int index) {
        return getTeamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.getDefaultInstance());
      }
      /**
       * <code>repeated .SumoTeamData team_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder> 
           getTeamListBuilderList() {
        return getTeamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
          getTeamListFieldBuilder() {
        if (teamListBuilder_ == null) {
          teamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamData.Builder, emu.grasscutter.net.newproto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder>(
                  teamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamList_ = null;
        }
        return teamListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SumoSaveTeamReq)
    }

    // @@protoc_insertion_point(class_scope:SumoSaveTeamReq)
    private static final emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq();
    }

    public static emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoSaveTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<SumoSaveTeamReq>() {
      @java.lang.Override
      public SumoSaveTeamReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SumoSaveTeamReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoSaveTeamReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoSaveTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoSaveTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SumoSaveTeamReq.proto\032\022SumoTeamData.pr" +
      "oto\"q\n\017SumoSaveTeamReq\022\025\n\rdifficulty_id\030" +
      "\006 \001(\r\022\020\n\010stage_id\030\016 \001(\r\022\023\n\013activity_id\030\001" +
      " \001(\r\022 \n\tteam_list\030\002 \003(\0132\r.SumoTeamDataB\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.SumoTeamDataOuterClass.getDescriptor(),
        });
    internal_static_SumoSaveTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoSaveTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoSaveTeamReq_descriptor,
        new java.lang.String[] { "DifficultyId", "StageId", "ActivityId", "TeamList", });
    emu.grasscutter.net.newproto.SumoTeamDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
