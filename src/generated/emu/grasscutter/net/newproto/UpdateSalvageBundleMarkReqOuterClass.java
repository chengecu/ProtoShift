// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdateSalvageBundleMarkReq.proto

package emu.grasscutter.net.newproto;

public final class UpdateSalvageBundleMarkReqOuterClass {
  private UpdateSalvageBundleMarkReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdateSalvageBundleMarkReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdateSalvageBundleMarkReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_type = 6;</code>
     * @return The challengeType.
     */
    int getChallengeType();

    /**
     * <code>uint32 stage_id = 11;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8906;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UpdateSalvageBundleMarkReq}
   */
  public static final class UpdateSalvageBundleMarkReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdateSalvageBundleMarkReq)
      UpdateSalvageBundleMarkReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateSalvageBundleMarkReq.newBuilder() to construct.
    private UpdateSalvageBundleMarkReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateSalvageBundleMarkReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdateSalvageBundleMarkReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.internal_static_UpdateSalvageBundleMarkReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.internal_static_UpdateSalvageBundleMarkReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.class, emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.Builder.class);
    }

    public static final int CHALLENGE_TYPE_FIELD_NUMBER = 6;
    private int challengeType_;
    /**
     * <code>uint32 challenge_type = 6;</code>
     * @return The challengeType.
     */
    @java.lang.Override
    public int getChallengeType() {
      return challengeType_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 11;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 11;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (challengeType_ != 0) {
        output.writeUInt32(6, challengeType_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(11, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, challengeType_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq other = (emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq) obj;

      if (getChallengeType()
          != other.getChallengeType()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + CHALLENGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeType();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq prototype) {
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
     *   CMD_ID = 8906;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UpdateSalvageBundleMarkReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdateSalvageBundleMarkReq)
        emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.internal_static_UpdateSalvageBundleMarkReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.internal_static_UpdateSalvageBundleMarkReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.class, emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        challengeType_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.internal_static_UpdateSalvageBundleMarkReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq build() {
        emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq buildPartial() {
        emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq result = new emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq(this);
        result.challengeType_ = challengeType_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq) {
          return mergeFrom((emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq other) {
        if (other == emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq.getDefaultInstance()) return this;
        if (other.getChallengeType() != 0) {
          setChallengeType(other.getChallengeType());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
              case 48: {
                challengeType_ = input.readUInt32();

                break;
              } // case 48
              case 88: {
                stageId_ = input.readUInt32();

                break;
              } // case 88
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

      private int challengeType_ ;
      /**
       * <code>uint32 challenge_type = 6;</code>
       * @return The challengeType.
       */
      @java.lang.Override
      public int getChallengeType() {
        return challengeType_;
      }
      /**
       * <code>uint32 challenge_type = 6;</code>
       * @param value The challengeType to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeType(int value) {
        
        challengeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeType() {
        
        challengeType_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 11;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 11;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UpdateSalvageBundleMarkReq)
    }

    // @@protoc_insertion_point(class_scope:UpdateSalvageBundleMarkReq)
    private static final emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq();
    }

    public static emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdateSalvageBundleMarkReq>
        PARSER = new com.google.protobuf.AbstractParser<UpdateSalvageBundleMarkReq>() {
      @java.lang.Override
      public UpdateSalvageBundleMarkReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<UpdateSalvageBundleMarkReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateSalvageBundleMarkReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.UpdateSalvageBundleMarkReqOuterClass.UpdateSalvageBundleMarkReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateSalvageBundleMarkReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateSalvageBundleMarkReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n UpdateSalvageBundleMarkReq.proto\"F\n\032Up" +
      "dateSalvageBundleMarkReq\022\026\n\016challenge_ty" +
      "pe\030\006 \001(\r\022\020\n\010stage_id\030\013 \001(\rB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdateSalvageBundleMarkReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdateSalvageBundleMarkReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateSalvageBundleMarkReq_descriptor,
        new java.lang.String[] { "ChallengeType", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}