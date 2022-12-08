// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamKickReq.proto

package emu.grasscutter.net.newproto;

public final class DungeonCandidateTeamKickReqOuterClass {
  private DungeonCandidateTeamKickReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamKickReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamKickReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 player_uid = 7;</code>
     * @return The playerUid.
     */
    int getPlayerUid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 975;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamKickReq}
   */
  public static final class DungeonCandidateTeamKickReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamKickReq)
      DungeonCandidateTeamKickReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamKickReq.newBuilder() to construct.
    private DungeonCandidateTeamKickReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamKickReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamKickReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.internal_static_DungeonCandidateTeamKickReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.internal_static_DungeonCandidateTeamKickReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.class, emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.Builder.class);
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 7;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 7;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
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
      if (playerUid_ != 0) {
        output.writeUInt32(7, playerUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, playerUid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq other = (emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq) obj;

      if (getPlayerUid()
          != other.getPlayerUid()) return false;
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
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq prototype) {
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
     *   CMD_ID = 975;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamKickReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamKickReq)
        emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.internal_static_DungeonCandidateTeamKickReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.internal_static_DungeonCandidateTeamKickReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.class, emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        playerUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.internal_static_DungeonCandidateTeamKickReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq build() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq buildPartial() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq result = new emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq(this);
        result.playerUid_ = playerUid_;
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
        if (other instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq) {
          return mergeFrom((emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq other) {
        if (other == emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq.getDefaultInstance()) return this;
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
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
                playerUid_ = input.readUInt32();

                break;
              } // case 56
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

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 7;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 7;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamKickReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamKickReq)
    private static final emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq();
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamKickReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamKickReq>() {
      @java.lang.Override
      public DungeonCandidateTeamKickReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonCandidateTeamKickReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamKickReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonCandidateTeamKickReqOuterClass.DungeonCandidateTeamKickReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamKickReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamKickReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!DungeonCandidateTeamKickReq.proto\"1\n\033D" +
      "ungeonCandidateTeamKickReq\022\022\n\nplayer_uid" +
      "\030\007 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamKickReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamKickReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamKickReq_descriptor,
        new java.lang.String[] { "PlayerUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}