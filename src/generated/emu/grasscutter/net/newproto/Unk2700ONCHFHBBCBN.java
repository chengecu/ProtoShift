// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_ONCHFHBBCBN.proto

package emu.grasscutter.net.newproto;

public final class Unk2700ONCHFHBBCBN {
  private Unk2700ONCHFHBBCBN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_ONCHFHBBCBNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_ONCHFHBBCBN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hit_count = 2;</code>
     * @return The hitCount.
     */
    int getHitCount();

    /**
     * <code>uint32 timestamp = 11;</code>
     * @return The timestamp.
     */
    int getTimestamp();

    /**
     * <code>uint32 score = 9;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
     * @return Whether the playerInfo field is set.
     */
    boolean hasPlayerInfo();
    /**
     * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
     * @return The playerInfo.
     */
    emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH getPlayerInfo();
    /**
     * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
     */
    emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHHOrBuilder getPlayerInfoOrBuilder();
  }
  /**
   * Protobuf type {@code Unk2700_ONCHFHBBCBN}
   */
  public static final class Unk2700_ONCHFHBBCBN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_ONCHFHBBCBN)
      Unk2700_ONCHFHBBCBNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_ONCHFHBBCBN.newBuilder() to construct.
    private Unk2700_ONCHFHBBCBN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_ONCHFHBBCBN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_ONCHFHBBCBN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.internal_static_Unk2700_ONCHFHBBCBN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.internal_static_Unk2700_ONCHFHBBCBN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.class, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder.class);
    }

    public static final int HIT_COUNT_FIELD_NUMBER = 2;
    private int hitCount_;
    /**
     * <code>uint32 hit_count = 2;</code>
     * @return The hitCount.
     */
    @java.lang.Override
    public int getHitCount() {
      return hitCount_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 11;
    private int timestamp_;
    /**
     * <code>uint32 timestamp = 11;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public int getTimestamp() {
      return timestamp_;
    }

    public static final int SCORE_FIELD_NUMBER = 9;
    private int score_;
    /**
     * <code>uint32 score = 9;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int PLAYER_INFO_FIELD_NUMBER = 12;
    private emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH playerInfo_;
    /**
     * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
     * @return Whether the playerInfo field is set.
     */
    @java.lang.Override
    public boolean hasPlayerInfo() {
      return playerInfo_ != null;
    }
    /**
     * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
     * @return The playerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH getPlayerInfo() {
      return playerInfo_ == null ? emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.getDefaultInstance() : playerInfo_;
    }
    /**
     * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHHOrBuilder getPlayerInfoOrBuilder() {
      return getPlayerInfo();
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
      if (hitCount_ != 0) {
        output.writeUInt32(2, hitCount_);
      }
      if (score_ != 0) {
        output.writeUInt32(9, score_);
      }
      if (timestamp_ != 0) {
        output.writeUInt32(11, timestamp_);
      }
      if (playerInfo_ != null) {
        output.writeMessage(12, getPlayerInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, hitCount_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, score_);
      }
      if (timestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, timestamp_);
      }
      if (playerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getPlayerInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN other = (emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN) obj;

      if (getHitCount()
          != other.getHitCount()) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (hasPlayerInfo() != other.hasPlayerInfo()) return false;
      if (hasPlayerInfo()) {
        if (!getPlayerInfo()
            .equals(other.getPlayerInfo())) return false;
      }
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
      hash = (37 * hash) + HIT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getHitCount();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      if (hasPlayerInfo()) {
        hash = (37 * hash) + PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN prototype) {
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
     * Protobuf type {@code Unk2700_ONCHFHBBCBN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_ONCHFHBBCBN)
        emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.internal_static_Unk2700_ONCHFHBBCBN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.internal_static_Unk2700_ONCHFHBBCBN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.class, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hitCount_ = 0;

        timestamp_ = 0;

        score_ = 0;

        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.internal_static_Unk2700_ONCHFHBBCBN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN build() {
        emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN buildPartial() {
        emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN result = new emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN(this);
        result.hitCount_ = hitCount_;
        result.timestamp_ = timestamp_;
        result.score_ = score_;
        if (playerInfoBuilder_ == null) {
          result.playerInfo_ = playerInfo_;
        } else {
          result.playerInfo_ = playerInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN other) {
        if (other == emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.getDefaultInstance()) return this;
        if (other.getHitCount() != 0) {
          setHitCount(other.getHitCount());
        }
        if (other.getTimestamp() != 0) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.hasPlayerInfo()) {
          mergePlayerInfo(other.getPlayerInfo());
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
                hitCount_ = input.readUInt32();

                break;
              } // case 16
              case 72: {
                score_ = input.readUInt32();

                break;
              } // case 72
              case 88: {
                timestamp_ = input.readUInt32();

                break;
              } // case 88
              case 98: {
                input.readMessage(
                    getPlayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

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

      private int hitCount_ ;
      /**
       * <code>uint32 hit_count = 2;</code>
       * @return The hitCount.
       */
      @java.lang.Override
      public int getHitCount() {
        return hitCount_;
      }
      /**
       * <code>uint32 hit_count = 2;</code>
       * @param value The hitCount to set.
       * @return This builder for chaining.
       */
      public Builder setHitCount(int value) {
        
        hitCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hit_count = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitCount() {
        
        hitCount_ = 0;
        onChanged();
        return this;
      }

      private int timestamp_ ;
      /**
       * <code>uint32 timestamp = 11;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public int getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>uint32 timestamp = 11;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(int value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timestamp = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 9;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 9;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH playerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH, emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.Builder, emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHHOrBuilder> playerInfoBuilder_;
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       * @return Whether the playerInfo field is set.
       */
      public boolean hasPlayerInfo() {
        return playerInfoBuilder_ != null || playerInfo_ != null;
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       * @return The playerInfo.
       */
      public emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH getPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          return playerInfo_ == null ? emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.getDefaultInstance() : playerInfo_;
        } else {
          return playerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      public Builder setPlayerInfo(emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH value) {
        if (playerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerInfo_ = value;
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      public Builder setPlayerInfo(
          emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.Builder builderForValue) {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = builderForValue.build();
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      public Builder mergePlayerInfo(emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH value) {
        if (playerInfoBuilder_ == null) {
          if (playerInfo_ != null) {
            playerInfo_ =
              emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.newBuilder(playerInfo_).mergeFrom(value).buildPartial();
          } else {
            playerInfo_ = value;
          }
          onChanged();
        } else {
          playerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      public Builder clearPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
          onChanged();
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.Builder getPlayerInfoBuilder() {
        
        onChanged();
        return getPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHHOrBuilder getPlayerInfoOrBuilder() {
        if (playerInfoBuilder_ != null) {
          return playerInfoBuilder_.getMessageOrBuilder();
        } else {
          return playerInfo_ == null ?
              emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.getDefaultInstance() : playerInfo_;
        }
      }
      /**
       * <code>.Unk2700_OCDMIOKNHHH player_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH, emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.Builder, emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHHOrBuilder> 
          getPlayerInfoFieldBuilder() {
        if (playerInfoBuilder_ == null) {
          playerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH, emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHH.Builder, emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.Unk2700_OCDMIOKNHHHOrBuilder>(
                  getPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          playerInfo_ = null;
        }
        return playerInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_ONCHFHBBCBN)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_ONCHFHBBCBN)
    private static final emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN();
    }

    public static emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_ONCHFHBBCBN>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_ONCHFHBBCBN>() {
      @java.lang.Override
      public Unk2700_ONCHFHBBCBN parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_ONCHFHBBCBN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_ONCHFHBBCBN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_ONCHFHBBCBN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_ONCHFHBBCBN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_ONCHFHBBCBN.proto\032\031Unk2700_OCD" +
      "MIOKNHHH.proto\"u\n\023Unk2700_ONCHFHBBCBN\022\021\n" +
      "\thit_count\030\002 \001(\r\022\021\n\ttimestamp\030\013 \001(\r\022\r\n\005s" +
      "core\030\t \001(\r\022)\n\013player_info\030\014 \001(\0132\024.Unk270" +
      "0_OCDMIOKNHHHB\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.getDescriptor(),
        });
    internal_static_Unk2700_ONCHFHBBCBN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_ONCHFHBBCBN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_ONCHFHBBCBN_descriptor,
        new java.lang.String[] { "HitCount", "Timestamp", "Score", "PlayerInfo", });
    emu.grasscutter.net.newproto.Unk2700OCDMIOKNHHH.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
