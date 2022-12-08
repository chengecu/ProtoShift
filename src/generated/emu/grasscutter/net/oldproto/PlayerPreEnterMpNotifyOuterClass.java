// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerPreEnterMpNotify.proto

package emu.grasscutter.net.oldproto;

public final class PlayerPreEnterMpNotifyOuterClass {
  private PlayerPreEnterMpNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerPreEnterMpNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerPreEnterMpNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
     * @return The state.
     */
    emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State getState();

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string nickname = 6;</code>
     * @return The nickname.
     */
    java.lang.String getNickname();
    /**
     * <code>string nickname = 6;</code>
     * @return The bytes for nickname.
     */
    com.google.protobuf.ByteString
        getNicknameBytes();
  }
  /**
   * <pre>
   * CmdId: 1822
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerPreEnterMpNotify}
   */
  public static final class PlayerPreEnterMpNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerPreEnterMpNotify)
      PlayerPreEnterMpNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerPreEnterMpNotify.newBuilder() to construct.
    private PlayerPreEnterMpNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerPreEnterMpNotify() {
      state_ = 0;
      nickname_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerPreEnterMpNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.class, emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerPreEnterMpNotify.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATE_INVALID = 0;</code>
       */
      STATE_INVALID(0),
      /**
       * <code>STATE_START = 1;</code>
       */
      STATE_START(1),
      /**
       * <code>STATE_TIMEOUT = 2;</code>
       */
      STATE_TIMEOUT(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATE_INVALID = 0;</code>
       */
      public static final int STATE_INVALID_VALUE = 0;
      /**
       * <code>STATE_START = 1;</code>
       */
      public static final int STATE_START_VALUE = 1;
      /**
       * <code>STATE_TIMEOUT = 2;</code>
       */
      public static final int STATE_TIMEOUT_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return STATE_INVALID;
          case 1: return STATE_START;
          case 2: return STATE_TIMEOUT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerPreEnterMpNotify.State)
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State result = emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State.valueOf(state_);
      return result == null ? emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State.UNRECOGNIZED : result;
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int NICKNAME_FIELD_NUMBER = 6;
    private volatile java.lang.Object nickname_;
    /**
     * <code>string nickname = 6;</code>
     * @return The nickname.
     */
    @java.lang.Override
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 6;</code>
     * @return The bytes for nickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
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
      if (state_ != emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State.STATE_INVALID.getNumber()) {
        output.writeEnum(2, state_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, nickname_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State.STATE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, state_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, nickname_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify other = (emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify) obj;

      if (state_ != other.state_) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
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
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify prototype) {
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
     * CmdId: 1822
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerPreEnterMpNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerPreEnterMpNotify)
        emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.class, emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        state_ = 0;

        uid_ = 0;

        nickname_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify build() {
        emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify buildPartial() {
        emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify result = new emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify(this);
        result.state_ = state_;
        result.uid_ = uid_;
        result.nickname_ = nickname_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify other) {
        if (other == emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.getDefaultInstance()) return this;
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
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
                state_ = input.readEnum();

                break;
              } // case 16
              case 50: {
                nickname_ = input.readStringRequireUtf8();

                break;
              } // case 50
              case 112: {
                uid_ = input.readUInt32();

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

      private int state_ = 0;
      /**
       * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State result = emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State.valueOf(state_);
        return result == null ? emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerPreEnterMpNotify.State state = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <code>string nickname = 6;</code>
       * @return The nickname.
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickname = 6;</code>
       * @return The bytes for nickname.
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 6;</code>
       * @param value The nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 6;</code>
       * @param value The bytes for nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
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


      // @@protoc_insertion_point(builder_scope:PlayerPreEnterMpNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerPreEnterMpNotify)
    private static final emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify();
    }

    public static emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerPreEnterMpNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerPreEnterMpNotify>() {
      @java.lang.Override
      public PlayerPreEnterMpNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerPreEnterMpNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerPreEnterMpNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPreEnterMpNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPreEnterMpNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PlayerPreEnterMpNotify.proto\"\245\001\n\026Playe" +
      "rPreEnterMpNotify\022,\n\005state\030\002 \001(\0162\035.Playe" +
      "rPreEnterMpNotify.State\022\013\n\003uid\030\016 \001(\r\022\020\n\010" +
      "nickname\030\006 \001(\t\">\n\005State\022\021\n\rSTATE_INVALID" +
      "\020\000\022\017\n\013STATE_START\020\001\022\021\n\rSTATE_TIMEOUT\020\002B\036" +
      "\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerPreEnterMpNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerPreEnterMpNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPreEnterMpNotify_descriptor,
        new java.lang.String[] { "State", "Uid", "Nickname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}