// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_OHBKIFCHBME.proto

package emu.grasscutter.net.newproto;

public final class Unk3250OHBKIFCHBME {
  private Unk3250OHBKIFCHBME() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_OHBKIFCHBMEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_OHBKIFCHBME)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string Unk3250_KCADABIKIMO = 3;</code>
     * @return The unk3250KCADABIKIMO.
     */
    java.lang.String getUnk3250KCADABIKIMO();
    /**
     * <code>string Unk3250_KCADABIKIMO = 3;</code>
     * @return The bytes for unk3250KCADABIKIMO.
     */
    com.google.protobuf.ByteString
        getUnk3250KCADABIKIMOBytes();

    /**
     * <code>uint32 Unk3250_OLNJBGIABKM = 14;</code>
     * @return The unk3250OLNJBGIABKM.
     */
    int getUnk3250OLNJBGIABKM();

    /**
     * <code>bool Unk3250_FGHLBIENAFB = 13;</code>
     * @return The unk3250FGHLBIENAFB.
     */
    boolean getUnk3250FGHLBIENAFB();
  }
  /**
   * <pre>
   * CmdId: 488
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_OHBKIFCHBME}
   */
  public static final class Unk3250_OHBKIFCHBME extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_OHBKIFCHBME)
      Unk3250_OHBKIFCHBMEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_OHBKIFCHBME.newBuilder() to construct.
    private Unk3250_OHBKIFCHBME(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_OHBKIFCHBME() {
      unk3250KCADABIKIMO_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_OHBKIFCHBME();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.internal_static_Unk3250_OHBKIFCHBME_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.internal_static_Unk3250_OHBKIFCHBME_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.class, emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.Builder.class);
    }

    public static final int UNK3250_KCADABIKIMO_FIELD_NUMBER = 3;
    private volatile java.lang.Object unk3250KCADABIKIMO_;
    /**
     * <code>string Unk3250_KCADABIKIMO = 3;</code>
     * @return The unk3250KCADABIKIMO.
     */
    @java.lang.Override
    public java.lang.String getUnk3250KCADABIKIMO() {
      java.lang.Object ref = unk3250KCADABIKIMO_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3250KCADABIKIMO_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3250_KCADABIKIMO = 3;</code>
     * @return The bytes for unk3250KCADABIKIMO.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3250KCADABIKIMOBytes() {
      java.lang.Object ref = unk3250KCADABIKIMO_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3250KCADABIKIMO_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3250_OLNJBGIABKM_FIELD_NUMBER = 14;
    private int unk3250OLNJBGIABKM_;
    /**
     * <code>uint32 Unk3250_OLNJBGIABKM = 14;</code>
     * @return The unk3250OLNJBGIABKM.
     */
    @java.lang.Override
    public int getUnk3250OLNJBGIABKM() {
      return unk3250OLNJBGIABKM_;
    }

    public static final int UNK3250_FGHLBIENAFB_FIELD_NUMBER = 13;
    private boolean unk3250FGHLBIENAFB_;
    /**
     * <code>bool Unk3250_FGHLBIENAFB = 13;</code>
     * @return The unk3250FGHLBIENAFB.
     */
    @java.lang.Override
    public boolean getUnk3250FGHLBIENAFB() {
      return unk3250FGHLBIENAFB_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3250KCADABIKIMO_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, unk3250KCADABIKIMO_);
      }
      if (unk3250FGHLBIENAFB_ != false) {
        output.writeBool(13, unk3250FGHLBIENAFB_);
      }
      if (unk3250OLNJBGIABKM_ != 0) {
        output.writeUInt32(14, unk3250OLNJBGIABKM_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3250KCADABIKIMO_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, unk3250KCADABIKIMO_);
      }
      if (unk3250FGHLBIENAFB_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, unk3250FGHLBIENAFB_);
      }
      if (unk3250OLNJBGIABKM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3250OLNJBGIABKM_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME other = (emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME) obj;

      if (!getUnk3250KCADABIKIMO()
          .equals(other.getUnk3250KCADABIKIMO())) return false;
      if (getUnk3250OLNJBGIABKM()
          != other.getUnk3250OLNJBGIABKM()) return false;
      if (getUnk3250FGHLBIENAFB()
          != other.getUnk3250FGHLBIENAFB()) return false;
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
      hash = (37 * hash) + UNK3250_KCADABIKIMO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250KCADABIKIMO().hashCode();
      hash = (37 * hash) + UNK3250_OLNJBGIABKM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250OLNJBGIABKM();
      hash = (37 * hash) + UNK3250_FGHLBIENAFB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250FGHLBIENAFB());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME prototype) {
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
     * CmdId: 488
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_OHBKIFCHBME}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_OHBKIFCHBME)
        emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBMEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.internal_static_Unk3250_OHBKIFCHBME_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.internal_static_Unk3250_OHBKIFCHBME_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.class, emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250KCADABIKIMO_ = "";

        unk3250OLNJBGIABKM_ = 0;

        unk3250FGHLBIENAFB_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.internal_static_Unk3250_OHBKIFCHBME_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME build() {
        emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME buildPartial() {
        emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME result = new emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME(this);
        result.unk3250KCADABIKIMO_ = unk3250KCADABIKIMO_;
        result.unk3250OLNJBGIABKM_ = unk3250OLNJBGIABKM_;
        result.unk3250FGHLBIENAFB_ = unk3250FGHLBIENAFB_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME other) {
        if (other == emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME.getDefaultInstance()) return this;
        if (!other.getUnk3250KCADABIKIMO().isEmpty()) {
          unk3250KCADABIKIMO_ = other.unk3250KCADABIKIMO_;
          onChanged();
        }
        if (other.getUnk3250OLNJBGIABKM() != 0) {
          setUnk3250OLNJBGIABKM(other.getUnk3250OLNJBGIABKM());
        }
        if (other.getUnk3250FGHLBIENAFB() != false) {
          setUnk3250FGHLBIENAFB(other.getUnk3250FGHLBIENAFB());
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
              case 26: {
                unk3250KCADABIKIMO_ = input.readStringRequireUtf8();

                break;
              } // case 26
              case 104: {
                unk3250FGHLBIENAFB_ = input.readBool();

                break;
              } // case 104
              case 112: {
                unk3250OLNJBGIABKM_ = input.readUInt32();

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

      private java.lang.Object unk3250KCADABIKIMO_ = "";
      /**
       * <code>string Unk3250_KCADABIKIMO = 3;</code>
       * @return The unk3250KCADABIKIMO.
       */
      public java.lang.String getUnk3250KCADABIKIMO() {
        java.lang.Object ref = unk3250KCADABIKIMO_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3250KCADABIKIMO_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3250_KCADABIKIMO = 3;</code>
       * @return The bytes for unk3250KCADABIKIMO.
       */
      public com.google.protobuf.ByteString
          getUnk3250KCADABIKIMOBytes() {
        java.lang.Object ref = unk3250KCADABIKIMO_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3250KCADABIKIMO_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3250_KCADABIKIMO = 3;</code>
       * @param value The unk3250KCADABIKIMO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250KCADABIKIMO(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3250KCADABIKIMO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3250_KCADABIKIMO = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250KCADABIKIMO() {
        
        unk3250KCADABIKIMO_ = getDefaultInstance().getUnk3250KCADABIKIMO();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3250_KCADABIKIMO = 3;</code>
       * @param value The bytes for unk3250KCADABIKIMO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250KCADABIKIMOBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3250KCADABIKIMO_ = value;
        onChanged();
        return this;
      }

      private int unk3250OLNJBGIABKM_ ;
      /**
       * <code>uint32 Unk3250_OLNJBGIABKM = 14;</code>
       * @return The unk3250OLNJBGIABKM.
       */
      @java.lang.Override
      public int getUnk3250OLNJBGIABKM() {
        return unk3250OLNJBGIABKM_;
      }
      /**
       * <code>uint32 Unk3250_OLNJBGIABKM = 14;</code>
       * @param value The unk3250OLNJBGIABKM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250OLNJBGIABKM(int value) {
        
        unk3250OLNJBGIABKM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_OLNJBGIABKM = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250OLNJBGIABKM() {
        
        unk3250OLNJBGIABKM_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3250FGHLBIENAFB_ ;
      /**
       * <code>bool Unk3250_FGHLBIENAFB = 13;</code>
       * @return The unk3250FGHLBIENAFB.
       */
      @java.lang.Override
      public boolean getUnk3250FGHLBIENAFB() {
        return unk3250FGHLBIENAFB_;
      }
      /**
       * <code>bool Unk3250_FGHLBIENAFB = 13;</code>
       * @param value The unk3250FGHLBIENAFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250FGHLBIENAFB(boolean value) {
        
        unk3250FGHLBIENAFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_FGHLBIENAFB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250FGHLBIENAFB() {
        
        unk3250FGHLBIENAFB_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_OHBKIFCHBME)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_OHBKIFCHBME)
    private static final emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME();
    }

    public static emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_OHBKIFCHBME>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_OHBKIFCHBME>() {
      @java.lang.Override
      public Unk3250_OHBKIFCHBME parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_OHBKIFCHBME> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_OHBKIFCHBME> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250OHBKIFCHBME.Unk3250_OHBKIFCHBME getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_OHBKIFCHBME_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_OHBKIFCHBME_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_OHBKIFCHBME.proto\"l\n\023Unk3250_O" +
      "HBKIFCHBME\022\033\n\023Unk3250_KCADABIKIMO\030\003 \001(\t\022" +
      "\033\n\023Unk3250_OLNJBGIABKM\030\016 \001(\r\022\033\n\023Unk3250_" +
      "FGHLBIENAFB\030\r \001(\010B\036\n\034emu.grasscutter.net" +
      ".newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_OHBKIFCHBME_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_OHBKIFCHBME_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_OHBKIFCHBME_descriptor,
        new java.lang.String[] { "Unk3250KCADABIKIMO", "Unk3250OLNJBGIABKM", "Unk3250FGHLBIENAFB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
