// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_GCEGJJJIMEM.proto

package emu.grasscutter.net.newproto;

public final class Unk3150GCEGJJJIMEM {
  private Unk3150GCEGJJJIMEM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_GCEGJJJIMEMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_GCEGJJJIMEM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_ADMFPENNLLK = 3;</code>
     * @return The unk3250ADMFPENNLLK.
     */
    int getUnk3250ADMFPENNLLK();

    /**
     * <code>uint32 Unk3150_GDPEMGOFDNJ = 13;</code>
     * @return The unk3150GDPEMGOFDNJ.
     */
    int getUnk3150GDPEMGOFDNJ();
  }
  /**
   * Protobuf type {@code Unk3150_GCEGJJJIMEM}
   */
  public static final class Unk3150_GCEGJJJIMEM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_GCEGJJJIMEM)
      Unk3150_GCEGJJJIMEMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_GCEGJJJIMEM.newBuilder() to construct.
    private Unk3150_GCEGJJJIMEM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_GCEGJJJIMEM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_GCEGJJJIMEM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.internal_static_Unk3150_GCEGJJJIMEM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.internal_static_Unk3150_GCEGJJJIMEM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.class, emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.Builder.class);
    }

    public static final int UNK3250_ADMFPENNLLK_FIELD_NUMBER = 3;
    private int unk3250ADMFPENNLLK_;
    /**
     * <code>uint32 Unk3250_ADMFPENNLLK = 3;</code>
     * @return The unk3250ADMFPENNLLK.
     */
    @java.lang.Override
    public int getUnk3250ADMFPENNLLK() {
      return unk3250ADMFPENNLLK_;
    }

    public static final int UNK3150_GDPEMGOFDNJ_FIELD_NUMBER = 13;
    private int unk3150GDPEMGOFDNJ_;
    /**
     * <code>uint32 Unk3150_GDPEMGOFDNJ = 13;</code>
     * @return The unk3150GDPEMGOFDNJ.
     */
    @java.lang.Override
    public int getUnk3150GDPEMGOFDNJ() {
      return unk3150GDPEMGOFDNJ_;
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
      if (unk3250ADMFPENNLLK_ != 0) {
        output.writeUInt32(3, unk3250ADMFPENNLLK_);
      }
      if (unk3150GDPEMGOFDNJ_ != 0) {
        output.writeUInt32(13, unk3150GDPEMGOFDNJ_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250ADMFPENNLLK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3250ADMFPENNLLK_);
      }
      if (unk3150GDPEMGOFDNJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3150GDPEMGOFDNJ_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM other = (emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM) obj;

      if (getUnk3250ADMFPENNLLK()
          != other.getUnk3250ADMFPENNLLK()) return false;
      if (getUnk3150GDPEMGOFDNJ()
          != other.getUnk3150GDPEMGOFDNJ()) return false;
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
      hash = (37 * hash) + UNK3250_ADMFPENNLLK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250ADMFPENNLLK();
      hash = (37 * hash) + UNK3150_GDPEMGOFDNJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150GDPEMGOFDNJ();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM prototype) {
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
     * Protobuf type {@code Unk3150_GCEGJJJIMEM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_GCEGJJJIMEM)
        emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.internal_static_Unk3150_GCEGJJJIMEM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.internal_static_Unk3150_GCEGJJJIMEM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.class, emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250ADMFPENNLLK_ = 0;

        unk3150GDPEMGOFDNJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.internal_static_Unk3150_GCEGJJJIMEM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM build() {
        emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM buildPartial() {
        emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM result = new emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM(this);
        result.unk3250ADMFPENNLLK_ = unk3250ADMFPENNLLK_;
        result.unk3150GDPEMGOFDNJ_ = unk3150GDPEMGOFDNJ_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM other) {
        if (other == emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM.getDefaultInstance()) return this;
        if (other.getUnk3250ADMFPENNLLK() != 0) {
          setUnk3250ADMFPENNLLK(other.getUnk3250ADMFPENNLLK());
        }
        if (other.getUnk3150GDPEMGOFDNJ() != 0) {
          setUnk3150GDPEMGOFDNJ(other.getUnk3150GDPEMGOFDNJ());
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
                unk3250ADMFPENNLLK_ = input.readUInt32();

                break;
              } // case 24
              case 104: {
                unk3150GDPEMGOFDNJ_ = input.readUInt32();

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

      private int unk3250ADMFPENNLLK_ ;
      /**
       * <code>uint32 Unk3250_ADMFPENNLLK = 3;</code>
       * @return The unk3250ADMFPENNLLK.
       */
      @java.lang.Override
      public int getUnk3250ADMFPENNLLK() {
        return unk3250ADMFPENNLLK_;
      }
      /**
       * <code>uint32 Unk3250_ADMFPENNLLK = 3;</code>
       * @param value The unk3250ADMFPENNLLK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250ADMFPENNLLK(int value) {
        
        unk3250ADMFPENNLLK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_ADMFPENNLLK = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250ADMFPENNLLK() {
        
        unk3250ADMFPENNLLK_ = 0;
        onChanged();
        return this;
      }

      private int unk3150GDPEMGOFDNJ_ ;
      /**
       * <code>uint32 Unk3150_GDPEMGOFDNJ = 13;</code>
       * @return The unk3150GDPEMGOFDNJ.
       */
      @java.lang.Override
      public int getUnk3150GDPEMGOFDNJ() {
        return unk3150GDPEMGOFDNJ_;
      }
      /**
       * <code>uint32 Unk3150_GDPEMGOFDNJ = 13;</code>
       * @param value The unk3150GDPEMGOFDNJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150GDPEMGOFDNJ(int value) {
        
        unk3150GDPEMGOFDNJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_GDPEMGOFDNJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150GDPEMGOFDNJ() {
        
        unk3150GDPEMGOFDNJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_GCEGJJJIMEM)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_GCEGJJJIMEM)
    private static final emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM();
    }

    public static emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_GCEGJJJIMEM>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_GCEGJJJIMEM>() {
      @java.lang.Override
      public Unk3150_GCEGJJJIMEM parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_GCEGJJJIMEM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_GCEGJJJIMEM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150GCEGJJJIMEM.Unk3150_GCEGJJJIMEM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_GCEGJJJIMEM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_GCEGJJJIMEM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_GCEGJJJIMEM.proto\"O\n\023Unk3150_G" +
      "CEGJJJIMEM\022\033\n\023Unk3250_ADMFPENNLLK\030\003 \001(\r\022" +
      "\033\n\023Unk3150_GDPEMGOFDNJ\030\r \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_GCEGJJJIMEM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_GCEGJJJIMEM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_GCEGJJJIMEM_descriptor,
        new java.lang.String[] { "Unk3250ADMFPENNLLK", "Unk3150GDPEMGOFDNJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}