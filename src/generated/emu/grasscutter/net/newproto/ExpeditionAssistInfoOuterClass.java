// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionAssistInfo.proto

package emu.grasscutter.net.newproto;

public final class ExpeditionAssistInfoOuterClass {
  private ExpeditionAssistInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionAssistInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionAssistInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string target_nick_name = 1;</code>
     * @return The targetNickName.
     */
    java.lang.String getTargetNickName();
    /**
     * <code>string target_nick_name = 1;</code>
     * @return The bytes for targetNickName.
     */
    com.google.protobuf.ByteString
        getTargetNickNameBytes();

    /**
     * <code>uint32 costume_id = 7;</code>
     * @return The costumeId.
     */
    int getCostumeId();

    /**
     * <code>uint32 assist_time = 12;</code>
     * @return The assistTime.
     */
    int getAssistTime();

    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>string online_id = 13;</code>
     * @return The onlineId.
     */
    java.lang.String getOnlineId();
    /**
     * <code>string online_id = 13;</code>
     * @return The bytes for onlineId.
     */
    com.google.protobuf.ByteString
        getOnlineIdBytes();
  }
  /**
   * Protobuf type {@code ExpeditionAssistInfo}
   */
  public static final class ExpeditionAssistInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionAssistInfo)
      ExpeditionAssistInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionAssistInfo.newBuilder() to construct.
    private ExpeditionAssistInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionAssistInfo() {
      targetNickName_ = "";
      onlineId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionAssistInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.class, emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.Builder.class);
    }

    public static final int TARGET_NICK_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object targetNickName_;
    /**
     * <code>string target_nick_name = 1;</code>
     * @return The targetNickName.
     */
    @java.lang.Override
    public java.lang.String getTargetNickName() {
      java.lang.Object ref = targetNickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetNickName_ = s;
        return s;
      }
    }
    /**
     * <code>string target_nick_name = 1;</code>
     * @return The bytes for targetNickName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetNickNameBytes() {
      java.lang.Object ref = targetNickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetNickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 7;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 7;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
    }

    public static final int ASSIST_TIME_FIELD_NUMBER = 12;
    private int assistTime_;
    /**
     * <code>uint32 assist_time = 12;</code>
     * @return The assistTime.
     */
    @java.lang.Override
    public int getAssistTime() {
      return assistTime_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int ONLINE_ID_FIELD_NUMBER = 13;
    private volatile java.lang.Object onlineId_;
    /**
     * <code>string online_id = 13;</code>
     * @return The onlineId.
     */
    @java.lang.Override
    public java.lang.String getOnlineId() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onlineId_ = s;
        return s;
      }
    }
    /**
     * <code>string online_id = 13;</code>
     * @return The bytes for onlineId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOnlineIdBytes() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        onlineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetNickName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetNickName_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(5, avatarId_);
      }
      if (costumeId_ != 0) {
        output.writeUInt32(7, costumeId_);
      }
      if (assistTime_ != 0) {
        output.writeUInt32(12, assistTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, onlineId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetNickName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetNickName_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarId_);
      }
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, costumeId_);
      }
      if (assistTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, assistTime_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, onlineId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo other = (emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo) obj;

      if (!getTargetNickName()
          .equals(other.getTargetNickName())) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
      if (getAssistTime()
          != other.getAssistTime()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (!getOnlineId()
          .equals(other.getOnlineId())) return false;
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
      hash = (37 * hash) + TARGET_NICK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTargetNickName().hashCode();
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (37 * hash) + ASSIST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getAssistTime();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + ONLINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOnlineId().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo prototype) {
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
     * Protobuf type {@code ExpeditionAssistInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionAssistInfo)
        emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.class, emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetNickName_ = "";

        costumeId_ = 0;

        assistTime_ = 0;

        avatarId_ = 0;

        onlineId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.internal_static_ExpeditionAssistInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo build() {
        emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo buildPartial() {
        emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo result = new emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo(this);
        result.targetNickName_ = targetNickName_;
        result.costumeId_ = costumeId_;
        result.assistTime_ = assistTime_;
        result.avatarId_ = avatarId_;
        result.onlineId_ = onlineId_;
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
        if (other instanceof emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo other) {
        if (other == emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo.getDefaultInstance()) return this;
        if (!other.getTargetNickName().isEmpty()) {
          targetNickName_ = other.targetNickName_;
          onChanged();
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
        }
        if (other.getAssistTime() != 0) {
          setAssistTime(other.getAssistTime());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (!other.getOnlineId().isEmpty()) {
          onlineId_ = other.onlineId_;
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
              case 10: {
                targetNickName_ = input.readStringRequireUtf8();

                break;
              } // case 10
              case 40: {
                avatarId_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                costumeId_ = input.readUInt32();

                break;
              } // case 56
              case 96: {
                assistTime_ = input.readUInt32();

                break;
              } // case 96
              case 106: {
                onlineId_ = input.readStringRequireUtf8();

                break;
              } // case 106
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

      private java.lang.Object targetNickName_ = "";
      /**
       * <code>string target_nick_name = 1;</code>
       * @return The targetNickName.
       */
      public java.lang.String getTargetNickName() {
        java.lang.Object ref = targetNickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetNickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_nick_name = 1;</code>
       * @return The bytes for targetNickName.
       */
      public com.google.protobuf.ByteString
          getTargetNickNameBytes() {
        java.lang.Object ref = targetNickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetNickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_nick_name = 1;</code>
       * @param value The targetNickName to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetNickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string target_nick_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetNickName() {
        
        targetNickName_ = getDefaultInstance().getTargetNickName();
        onChanged();
        return this;
      }
      /**
       * <code>string target_nick_name = 1;</code>
       * @param value The bytes for targetNickName to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetNickName_ = value;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 7;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 7;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
        onChanged();
        return this;
      }

      private int assistTime_ ;
      /**
       * <code>uint32 assist_time = 12;</code>
       * @return The assistTime.
       */
      @java.lang.Override
      public int getAssistTime() {
        return assistTime_;
      }
      /**
       * <code>uint32 assist_time = 12;</code>
       * @param value The assistTime to set.
       * @return This builder for chaining.
       */
      public Builder setAssistTime(int value) {
        
        assistTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assist_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistTime() {
        
        assistTime_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object onlineId_ = "";
      /**
       * <code>string online_id = 13;</code>
       * @return The onlineId.
       */
      public java.lang.String getOnlineId() {
        java.lang.Object ref = onlineId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          onlineId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string online_id = 13;</code>
       * @return The bytes for onlineId.
       */
      public com.google.protobuf.ByteString
          getOnlineIdBytes() {
        java.lang.Object ref = onlineId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          onlineId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string online_id = 13;</code>
       * @param value The onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        onlineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnlineId() {
        
        onlineId_ = getDefaultInstance().getOnlineId();
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 13;</code>
       * @param value The bytes for onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        onlineId_ = value;
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


      // @@protoc_insertion_point(builder_scope:ExpeditionAssistInfo)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionAssistInfo)
    private static final emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo();
    }

    public static emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionAssistInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionAssistInfo>() {
      @java.lang.Override
      public ExpeditionAssistInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExpeditionAssistInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionAssistInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ExpeditionAssistInfoOuterClass.ExpeditionAssistInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionAssistInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionAssistInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ExpeditionAssistInfo.proto\"\177\n\024Expediti" +
      "onAssistInfo\022\030\n\020target_nick_name\030\001 \001(\t\022\022" +
      "\n\ncostume_id\030\007 \001(\r\022\023\n\013assist_time\030\014 \001(\r\022" +
      "\021\n\tavatar_id\030\005 \001(\r\022\021\n\tonline_id\030\r \001(\tB\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionAssistInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionAssistInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionAssistInfo_descriptor,
        new java.lang.String[] { "TargetNickName", "CostumeId", "AssistTime", "AvatarId", "OnlineId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
