// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PbNavMeshStatsInfo.proto

package emu.grasscutter.net.newproto;

public final class PbNavMeshStatsInfoOuterClass {
  private PbNavMeshStatsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PbNavMeshStatsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PbNavMeshStatsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 Unk3300_MOKPJBIPHNI = 8;</code>
     * @return The unk3300MOKPJBIPHNI.
     */
    int getUnk3300MOKPJBIPHNI();

    /**
     * <code>int32 Unk3300_IMLHLJAOBLF = 3;</code>
     * @return The unk3300IMLHLJAOBLF.
     */
    int getUnk3300IMLHLJAOBLF();

    /**
     * <code>int32 Unk3300_DHJKKJLKDHB = 15;</code>
     * @return The unk3300DHJKKJLKDHB.
     */
    int getUnk3300DHJKKJLKDHB();

    /**
     * <code>int32 Unk3300_EEONKADBJME = 13;</code>
     * @return The unk3300EEONKADBJME.
     */
    int getUnk3300EEONKADBJME();
  }
  /**
   * Protobuf type {@code PbNavMeshStatsInfo}
   */
  public static final class PbNavMeshStatsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PbNavMeshStatsInfo)
      PbNavMeshStatsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PbNavMeshStatsInfo.newBuilder() to construct.
    private PbNavMeshStatsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PbNavMeshStatsInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PbNavMeshStatsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.class, emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder.class);
    }

    public static final int UNK3300_MOKPJBIPHNI_FIELD_NUMBER = 8;
    private int unk3300MOKPJBIPHNI_;
    /**
     * <code>int32 Unk3300_MOKPJBIPHNI = 8;</code>
     * @return The unk3300MOKPJBIPHNI.
     */
    @java.lang.Override
    public int getUnk3300MOKPJBIPHNI() {
      return unk3300MOKPJBIPHNI_;
    }

    public static final int UNK3300_IMLHLJAOBLF_FIELD_NUMBER = 3;
    private int unk3300IMLHLJAOBLF_;
    /**
     * <code>int32 Unk3300_IMLHLJAOBLF = 3;</code>
     * @return The unk3300IMLHLJAOBLF.
     */
    @java.lang.Override
    public int getUnk3300IMLHLJAOBLF() {
      return unk3300IMLHLJAOBLF_;
    }

    public static final int UNK3300_DHJKKJLKDHB_FIELD_NUMBER = 15;
    private int unk3300DHJKKJLKDHB_;
    /**
     * <code>int32 Unk3300_DHJKKJLKDHB = 15;</code>
     * @return The unk3300DHJKKJLKDHB.
     */
    @java.lang.Override
    public int getUnk3300DHJKKJLKDHB() {
      return unk3300DHJKKJLKDHB_;
    }

    public static final int UNK3300_EEONKADBJME_FIELD_NUMBER = 13;
    private int unk3300EEONKADBJME_;
    /**
     * <code>int32 Unk3300_EEONKADBJME = 13;</code>
     * @return The unk3300EEONKADBJME.
     */
    @java.lang.Override
    public int getUnk3300EEONKADBJME() {
      return unk3300EEONKADBJME_;
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
      if (unk3300IMLHLJAOBLF_ != 0) {
        output.writeInt32(3, unk3300IMLHLJAOBLF_);
      }
      if (unk3300MOKPJBIPHNI_ != 0) {
        output.writeInt32(8, unk3300MOKPJBIPHNI_);
      }
      if (unk3300EEONKADBJME_ != 0) {
        output.writeInt32(13, unk3300EEONKADBJME_);
      }
      if (unk3300DHJKKJLKDHB_ != 0) {
        output.writeInt32(15, unk3300DHJKKJLKDHB_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300IMLHLJAOBLF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, unk3300IMLHLJAOBLF_);
      }
      if (unk3300MOKPJBIPHNI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, unk3300MOKPJBIPHNI_);
      }
      if (unk3300EEONKADBJME_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, unk3300EEONKADBJME_);
      }
      if (unk3300DHJKKJLKDHB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, unk3300DHJKKJLKDHB_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo other = (emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) obj;

      if (getUnk3300MOKPJBIPHNI()
          != other.getUnk3300MOKPJBIPHNI()) return false;
      if (getUnk3300IMLHLJAOBLF()
          != other.getUnk3300IMLHLJAOBLF()) return false;
      if (getUnk3300DHJKKJLKDHB()
          != other.getUnk3300DHJKKJLKDHB()) return false;
      if (getUnk3300EEONKADBJME()
          != other.getUnk3300EEONKADBJME()) return false;
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
      hash = (37 * hash) + UNK3300_MOKPJBIPHNI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MOKPJBIPHNI();
      hash = (37 * hash) + UNK3300_IMLHLJAOBLF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IMLHLJAOBLF();
      hash = (37 * hash) + UNK3300_DHJKKJLKDHB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300DHJKKJLKDHB();
      hash = (37 * hash) + UNK3300_EEONKADBJME_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EEONKADBJME();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo prototype) {
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
     * Protobuf type {@code PbNavMeshStatsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PbNavMeshStatsInfo)
        emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.class, emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300MOKPJBIPHNI_ = 0;

        unk3300IMLHLJAOBLF_ = 0;

        unk3300DHJKKJLKDHB_ = 0;

        unk3300EEONKADBJME_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo build() {
        emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo buildPartial() {
        emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo result = new emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo(this);
        result.unk3300MOKPJBIPHNI_ = unk3300MOKPJBIPHNI_;
        result.unk3300IMLHLJAOBLF_ = unk3300IMLHLJAOBLF_;
        result.unk3300DHJKKJLKDHB_ = unk3300DHJKKJLKDHB_;
        result.unk3300EEONKADBJME_ = unk3300EEONKADBJME_;
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
        if (other instanceof emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo other) {
        if (other == emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance()) return this;
        if (other.getUnk3300MOKPJBIPHNI() != 0) {
          setUnk3300MOKPJBIPHNI(other.getUnk3300MOKPJBIPHNI());
        }
        if (other.getUnk3300IMLHLJAOBLF() != 0) {
          setUnk3300IMLHLJAOBLF(other.getUnk3300IMLHLJAOBLF());
        }
        if (other.getUnk3300DHJKKJLKDHB() != 0) {
          setUnk3300DHJKKJLKDHB(other.getUnk3300DHJKKJLKDHB());
        }
        if (other.getUnk3300EEONKADBJME() != 0) {
          setUnk3300EEONKADBJME(other.getUnk3300EEONKADBJME());
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
              case 24: {
                unk3300IMLHLJAOBLF_ = input.readInt32();

                break;
              } // case 24
              case 64: {
                unk3300MOKPJBIPHNI_ = input.readInt32();

                break;
              } // case 64
              case 104: {
                unk3300EEONKADBJME_ = input.readInt32();

                break;
              } // case 104
              case 120: {
                unk3300DHJKKJLKDHB_ = input.readInt32();

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

      private int unk3300MOKPJBIPHNI_ ;
      /**
       * <code>int32 Unk3300_MOKPJBIPHNI = 8;</code>
       * @return The unk3300MOKPJBIPHNI.
       */
      @java.lang.Override
      public int getUnk3300MOKPJBIPHNI() {
        return unk3300MOKPJBIPHNI_;
      }
      /**
       * <code>int32 Unk3300_MOKPJBIPHNI = 8;</code>
       * @param value The unk3300MOKPJBIPHNI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MOKPJBIPHNI(int value) {
        
        unk3300MOKPJBIPHNI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Unk3300_MOKPJBIPHNI = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MOKPJBIPHNI() {
        
        unk3300MOKPJBIPHNI_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IMLHLJAOBLF_ ;
      /**
       * <code>int32 Unk3300_IMLHLJAOBLF = 3;</code>
       * @return The unk3300IMLHLJAOBLF.
       */
      @java.lang.Override
      public int getUnk3300IMLHLJAOBLF() {
        return unk3300IMLHLJAOBLF_;
      }
      /**
       * <code>int32 Unk3300_IMLHLJAOBLF = 3;</code>
       * @param value The unk3300IMLHLJAOBLF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IMLHLJAOBLF(int value) {
        
        unk3300IMLHLJAOBLF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Unk3300_IMLHLJAOBLF = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IMLHLJAOBLF() {
        
        unk3300IMLHLJAOBLF_ = 0;
        onChanged();
        return this;
      }

      private int unk3300DHJKKJLKDHB_ ;
      /**
       * <code>int32 Unk3300_DHJKKJLKDHB = 15;</code>
       * @return The unk3300DHJKKJLKDHB.
       */
      @java.lang.Override
      public int getUnk3300DHJKKJLKDHB() {
        return unk3300DHJKKJLKDHB_;
      }
      /**
       * <code>int32 Unk3300_DHJKKJLKDHB = 15;</code>
       * @param value The unk3300DHJKKJLKDHB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DHJKKJLKDHB(int value) {
        
        unk3300DHJKKJLKDHB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Unk3300_DHJKKJLKDHB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DHJKKJLKDHB() {
        
        unk3300DHJKKJLKDHB_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EEONKADBJME_ ;
      /**
       * <code>int32 Unk3300_EEONKADBJME = 13;</code>
       * @return The unk3300EEONKADBJME.
       */
      @java.lang.Override
      public int getUnk3300EEONKADBJME() {
        return unk3300EEONKADBJME_;
      }
      /**
       * <code>int32 Unk3300_EEONKADBJME = 13;</code>
       * @param value The unk3300EEONKADBJME to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EEONKADBJME(int value) {
        
        unk3300EEONKADBJME_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 Unk3300_EEONKADBJME = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EEONKADBJME() {
        
        unk3300EEONKADBJME_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PbNavMeshStatsInfo)
    }

    // @@protoc_insertion_point(class_scope:PbNavMeshStatsInfo)
    private static final emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo();
    }

    public static emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PbNavMeshStatsInfo>
        PARSER = new com.google.protobuf.AbstractParser<PbNavMeshStatsInfo>() {
      @java.lang.Override
      public PbNavMeshStatsInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PbNavMeshStatsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PbNavMeshStatsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PbNavMeshStatsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PbNavMeshStatsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PbNavMeshStatsInfo.proto\"\210\001\n\022PbNavMesh" +
      "StatsInfo\022\033\n\023Unk3300_MOKPJBIPHNI\030\010 \001(\005\022\033" +
      "\n\023Unk3300_IMLHLJAOBLF\030\003 \001(\005\022\033\n\023Unk3300_D" +
      "HJKKJLKDHB\030\017 \001(\005\022\033\n\023Unk3300_EEONKADBJME\030" +
      "\r \001(\005B\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PbNavMeshStatsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PbNavMeshStatsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PbNavMeshStatsInfo_descriptor,
        new java.lang.String[] { "Unk3300MOKPJBIPHNI", "Unk3300IMLHLJAOBLF", "Unk3300DHJKKJLKDHB", "Unk3300EEONKADBJME", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}