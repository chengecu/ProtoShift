// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_NPEHDBFMGAB.proto

package emu.grasscutter.net.newproto;

public final class Unk3150NPEHDBFMGAB {
  private Unk3150NPEHDBFMGAB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_NPEHDBFMGABOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_NPEHDBFMGAB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3150_FFGBHONGEJJ = 4;</code>
     * @return The unk3150FFGBHONGEJJ.
     */
    int getUnk3150FFGBHONGEJJ();

    /**
     * <code>uint32 Unk3150_IPJEGPFCAJG = 13;</code>
     * @return The unk3150IPJEGPFCAJG.
     */
    int getUnk3150IPJEGPFCAJG();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 6;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();
  }
  /**
   * <pre>
   * CmdId: 24471
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_NPEHDBFMGAB}
   */
  public static final class Unk3150_NPEHDBFMGAB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_NPEHDBFMGAB)
      Unk3150_NPEHDBFMGABOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_NPEHDBFMGAB.newBuilder() to construct.
    private Unk3150_NPEHDBFMGAB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_NPEHDBFMGAB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_NPEHDBFMGAB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.internal_static_Unk3150_NPEHDBFMGAB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.internal_static_Unk3150_NPEHDBFMGAB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.class, emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.Builder.class);
    }

    public static final int UNK3150_FFGBHONGEJJ_FIELD_NUMBER = 4;
    private int unk3150FFGBHONGEJJ_;
    /**
     * <code>uint32 Unk3150_FFGBHONGEJJ = 4;</code>
     * @return The unk3150FFGBHONGEJJ.
     */
    @java.lang.Override
    public int getUnk3150FFGBHONGEJJ() {
      return unk3150FFGBHONGEJJ_;
    }

    public static final int UNK3150_IPJEGPFCAJG_FIELD_NUMBER = 13;
    private int unk3150IPJEGPFCAJG_;
    /**
     * <code>uint32 Unk3150_IPJEGPFCAJG = 13;</code>
     * @return The unk3150IPJEGPFCAJG.
     */
    @java.lang.Override
    public int getUnk3150IPJEGPFCAJG() {
      return unk3150IPJEGPFCAJG_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 6;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 6;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
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
      if (unk3150FFGBHONGEJJ_ != 0) {
        output.writeUInt32(4, unk3150FFGBHONGEJJ_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(6, unk3250PPIHJFNMEFB_);
      }
      if (unk3150IPJEGPFCAJG_ != 0) {
        output.writeUInt32(13, unk3150IPJEGPFCAJG_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150FFGBHONGEJJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3150FFGBHONGEJJ_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3250PPIHJFNMEFB_);
      }
      if (unk3150IPJEGPFCAJG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3150IPJEGPFCAJG_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB other = (emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB) obj;

      if (getUnk3150FFGBHONGEJJ()
          != other.getUnk3150FFGBHONGEJJ()) return false;
      if (getUnk3150IPJEGPFCAJG()
          != other.getUnk3150IPJEGPFCAJG()) return false;
      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
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
      hash = (37 * hash) + UNK3150_FFGBHONGEJJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150FFGBHONGEJJ();
      hash = (37 * hash) + UNK3150_IPJEGPFCAJG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150IPJEGPFCAJG();
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB prototype) {
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
     * CmdId: 24471
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_NPEHDBFMGAB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_NPEHDBFMGAB)
        emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGABOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.internal_static_Unk3150_NPEHDBFMGAB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.internal_static_Unk3150_NPEHDBFMGAB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.class, emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150FFGBHONGEJJ_ = 0;

        unk3150IPJEGPFCAJG_ = 0;

        unk3250PPIHJFNMEFB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.internal_static_Unk3150_NPEHDBFMGAB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB build() {
        emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB buildPartial() {
        emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB result = new emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB(this);
        result.unk3150FFGBHONGEJJ_ = unk3150FFGBHONGEJJ_;
        result.unk3150IPJEGPFCAJG_ = unk3150IPJEGPFCAJG_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB other) {
        if (other == emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB.getDefaultInstance()) return this;
        if (other.getUnk3150FFGBHONGEJJ() != 0) {
          setUnk3150FFGBHONGEJJ(other.getUnk3150FFGBHONGEJJ());
        }
        if (other.getUnk3150IPJEGPFCAJG() != 0) {
          setUnk3150IPJEGPFCAJG(other.getUnk3150IPJEGPFCAJG());
        }
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
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
              case 32: {
                unk3150FFGBHONGEJJ_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                unk3250PPIHJFNMEFB_ = input.readUInt32();

                break;
              } // case 48
              case 104: {
                unk3150IPJEGPFCAJG_ = input.readUInt32();

                break;
              } // case 104
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

      private int unk3150FFGBHONGEJJ_ ;
      /**
       * <code>uint32 Unk3150_FFGBHONGEJJ = 4;</code>
       * @return The unk3150FFGBHONGEJJ.
       */
      @java.lang.Override
      public int getUnk3150FFGBHONGEJJ() {
        return unk3150FFGBHONGEJJ_;
      }
      /**
       * <code>uint32 Unk3150_FFGBHONGEJJ = 4;</code>
       * @param value The unk3150FFGBHONGEJJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150FFGBHONGEJJ(int value) {
        
        unk3150FFGBHONGEJJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_FFGBHONGEJJ = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150FFGBHONGEJJ() {
        
        unk3150FFGBHONGEJJ_ = 0;
        onChanged();
        return this;
      }

      private int unk3150IPJEGPFCAJG_ ;
      /**
       * <code>uint32 Unk3150_IPJEGPFCAJG = 13;</code>
       * @return The unk3150IPJEGPFCAJG.
       */
      @java.lang.Override
      public int getUnk3150IPJEGPFCAJG() {
        return unk3150IPJEGPFCAJG_;
      }
      /**
       * <code>uint32 Unk3150_IPJEGPFCAJG = 13;</code>
       * @param value The unk3150IPJEGPFCAJG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150IPJEGPFCAJG(int value) {
        
        unk3150IPJEGPFCAJG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_IPJEGPFCAJG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150IPJEGPFCAJG() {
        
        unk3150IPJEGPFCAJG_ = 0;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 6;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 6;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_NPEHDBFMGAB)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_NPEHDBFMGAB)
    private static final emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB();
    }

    public static emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_NPEHDBFMGAB>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_NPEHDBFMGAB>() {
      @java.lang.Override
      public Unk3150_NPEHDBFMGAB parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_NPEHDBFMGAB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_NPEHDBFMGAB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150NPEHDBFMGAB.Unk3150_NPEHDBFMGAB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_NPEHDBFMGAB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_NPEHDBFMGAB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_NPEHDBFMGAB.proto\"l\n\023Unk3150_N" +
      "PEHDBFMGAB\022\033\n\023Unk3150_FFGBHONGEJJ\030\004 \001(\r\022" +
      "\033\n\023Unk3150_IPJEGPFCAJG\030\r \001(\r\022\033\n\023Unk3250_" +
      "PPIHJFNMEFB\030\006 \001(\rB\036\n\034emu.grasscutter.net" +
      ".newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_NPEHDBFMGAB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_NPEHDBFMGAB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_NPEHDBFMGAB_descriptor,
        new java.lang.String[] { "Unk3150FFGBHONGEJJ", "Unk3150IPJEGPFCAJG", "Unk3250PPIHJFNMEFB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
