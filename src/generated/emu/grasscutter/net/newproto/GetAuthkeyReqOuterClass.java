// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAuthkeyReq.proto

package emu.grasscutter.net.newproto;

public final class GetAuthkeyReqOuterClass {
  private GetAuthkeyReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAuthkeyReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAuthkeyReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_FGBHHPOKCJH = 6;</code>
     * @return The unk3300FGBHHPOKCJH.
     */
    int getUnk3300FGBHHPOKCJH();

    /**
     * <code>string auth_appid = 13;</code>
     * @return The authAppid.
     */
    java.lang.String getAuthAppid();
    /**
     * <code>string auth_appid = 13;</code>
     * @return The bytes for authAppid.
     */
    com.google.protobuf.ByteString
        getAuthAppidBytes();

    /**
     * <code>uint32 Unk3300_DODLFCNOAMB = 15;</code>
     * @return The unk3300DODLFCNOAMB.
     */
    int getUnk3300DODLFCNOAMB();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1447;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetAuthkeyReq}
   */
  public static final class GetAuthkeyReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAuthkeyReq)
      GetAuthkeyReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAuthkeyReq.newBuilder() to construct.
    private GetAuthkeyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAuthkeyReq() {
      authAppid_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAuthkeyReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.class, emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.Builder.class);
    }

    public static final int UNK3300_FGBHHPOKCJH_FIELD_NUMBER = 6;
    private int unk3300FGBHHPOKCJH_;
    /**
     * <code>uint32 Unk3300_FGBHHPOKCJH = 6;</code>
     * @return The unk3300FGBHHPOKCJH.
     */
    @java.lang.Override
    public int getUnk3300FGBHHPOKCJH() {
      return unk3300FGBHHPOKCJH_;
    }

    public static final int AUTH_APPID_FIELD_NUMBER = 13;
    private volatile java.lang.Object authAppid_;
    /**
     * <code>string auth_appid = 13;</code>
     * @return The authAppid.
     */
    @java.lang.Override
    public java.lang.String getAuthAppid() {
      java.lang.Object ref = authAppid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authAppid_ = s;
        return s;
      }
    }
    /**
     * <code>string auth_appid = 13;</code>
     * @return The bytes for authAppid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthAppidBytes() {
      java.lang.Object ref = authAppid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authAppid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3300_DODLFCNOAMB_FIELD_NUMBER = 15;
    private int unk3300DODLFCNOAMB_;
    /**
     * <code>uint32 Unk3300_DODLFCNOAMB = 15;</code>
     * @return The unk3300DODLFCNOAMB.
     */
    @java.lang.Override
    public int getUnk3300DODLFCNOAMB() {
      return unk3300DODLFCNOAMB_;
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
      if (unk3300FGBHHPOKCJH_ != 0) {
        output.writeUInt32(6, unk3300FGBHHPOKCJH_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authAppid_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, authAppid_);
      }
      if (unk3300DODLFCNOAMB_ != 0) {
        output.writeUInt32(15, unk3300DODLFCNOAMB_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300FGBHHPOKCJH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3300FGBHHPOKCJH_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authAppid_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, authAppid_);
      }
      if (unk3300DODLFCNOAMB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3300DODLFCNOAMB_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq other = (emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq) obj;

      if (getUnk3300FGBHHPOKCJH()
          != other.getUnk3300FGBHHPOKCJH()) return false;
      if (!getAuthAppid()
          .equals(other.getAuthAppid())) return false;
      if (getUnk3300DODLFCNOAMB()
          != other.getUnk3300DODLFCNOAMB()) return false;
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
      hash = (37 * hash) + UNK3300_FGBHHPOKCJH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FGBHHPOKCJH();
      hash = (37 * hash) + AUTH_APPID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthAppid().hashCode();
      hash = (37 * hash) + UNK3300_DODLFCNOAMB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300DODLFCNOAMB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq prototype) {
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
     *   CMD_ID = 1447;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetAuthkeyReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAuthkeyReq)
        emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.class, emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300FGBHHPOKCJH_ = 0;

        authAppid_ = "";

        unk3300DODLFCNOAMB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq build() {
        emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq buildPartial() {
        emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq result = new emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq(this);
        result.unk3300FGBHHPOKCJH_ = unk3300FGBHHPOKCJH_;
        result.authAppid_ = authAppid_;
        result.unk3300DODLFCNOAMB_ = unk3300DODLFCNOAMB_;
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
        if (other instanceof emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq) {
          return mergeFrom((emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq other) {
        if (other == emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq.getDefaultInstance()) return this;
        if (other.getUnk3300FGBHHPOKCJH() != 0) {
          setUnk3300FGBHHPOKCJH(other.getUnk3300FGBHHPOKCJH());
        }
        if (!other.getAuthAppid().isEmpty()) {
          authAppid_ = other.authAppid_;
          onChanged();
        }
        if (other.getUnk3300DODLFCNOAMB() != 0) {
          setUnk3300DODLFCNOAMB(other.getUnk3300DODLFCNOAMB());
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
                unk3300FGBHHPOKCJH_ = input.readUInt32();

                break;
              } // case 48
              case 106: {
                authAppid_ = input.readStringRequireUtf8();

                break;
              } // case 106
              case 120: {
                unk3300DODLFCNOAMB_ = input.readUInt32();

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

      private int unk3300FGBHHPOKCJH_ ;
      /**
       * <code>uint32 Unk3300_FGBHHPOKCJH = 6;</code>
       * @return The unk3300FGBHHPOKCJH.
       */
      @java.lang.Override
      public int getUnk3300FGBHHPOKCJH() {
        return unk3300FGBHHPOKCJH_;
      }
      /**
       * <code>uint32 Unk3300_FGBHHPOKCJH = 6;</code>
       * @param value The unk3300FGBHHPOKCJH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FGBHHPOKCJH(int value) {
        
        unk3300FGBHHPOKCJH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FGBHHPOKCJH = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FGBHHPOKCJH() {
        
        unk3300FGBHHPOKCJH_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object authAppid_ = "";
      /**
       * <code>string auth_appid = 13;</code>
       * @return The authAppid.
       */
      public java.lang.String getAuthAppid() {
        java.lang.Object ref = authAppid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authAppid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string auth_appid = 13;</code>
       * @return The bytes for authAppid.
       */
      public com.google.protobuf.ByteString
          getAuthAppidBytes() {
        java.lang.Object ref = authAppid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authAppid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string auth_appid = 13;</code>
       * @param value The authAppid to set.
       * @return This builder for chaining.
       */
      public Builder setAuthAppid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        authAppid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string auth_appid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthAppid() {
        
        authAppid_ = getDefaultInstance().getAuthAppid();
        onChanged();
        return this;
      }
      /**
       * <code>string auth_appid = 13;</code>
       * @param value The bytes for authAppid to set.
       * @return This builder for chaining.
       */
      public Builder setAuthAppidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        authAppid_ = value;
        onChanged();
        return this;
      }

      private int unk3300DODLFCNOAMB_ ;
      /**
       * <code>uint32 Unk3300_DODLFCNOAMB = 15;</code>
       * @return The unk3300DODLFCNOAMB.
       */
      @java.lang.Override
      public int getUnk3300DODLFCNOAMB() {
        return unk3300DODLFCNOAMB_;
      }
      /**
       * <code>uint32 Unk3300_DODLFCNOAMB = 15;</code>
       * @param value The unk3300DODLFCNOAMB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DODLFCNOAMB(int value) {
        
        unk3300DODLFCNOAMB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_DODLFCNOAMB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DODLFCNOAMB() {
        
        unk3300DODLFCNOAMB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetAuthkeyReq)
    }

    // @@protoc_insertion_point(class_scope:GetAuthkeyReq)
    private static final emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq();
    }

    public static emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAuthkeyReq>
        PARSER = new com.google.protobuf.AbstractParser<GetAuthkeyReq>() {
      @java.lang.Override
      public GetAuthkeyReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetAuthkeyReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAuthkeyReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetAuthkeyReqOuterClass.GetAuthkeyReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAuthkeyReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAuthkeyReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GetAuthkeyReq.proto\"]\n\rGetAuthkeyReq\022\033" +
      "\n\023Unk3300_FGBHHPOKCJH\030\006 \001(\r\022\022\n\nauth_appi" +
      "d\030\r \001(\t\022\033\n\023Unk3300_DODLFCNOAMB\030\017 \001(\rB\036\n\034" +
      "emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAuthkeyReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAuthkeyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAuthkeyReq_descriptor,
        new java.lang.String[] { "Unk3300FGBHHPOKCJH", "AuthAppid", "Unk3300DODLFCNOAMB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}