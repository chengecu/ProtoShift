// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_BDBJPNHCNJD.proto

package emu.grasscutter.net.newproto;

public final class Unk3250BDBJPNHCNJD {
  private Unk3250BDBJPNHCNJD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_BDBJPNHCNJDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_BDBJPNHCNJD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3150_JAKPANLHCEF = 9;</code>
     * @return The unk3150JAKPANLHCEF.
     */
    int getUnk3150JAKPANLHCEF();
  }
  /**
   * Protobuf type {@code Unk3250_BDBJPNHCNJD}
   */
  public static final class Unk3250_BDBJPNHCNJD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_BDBJPNHCNJD)
      Unk3250_BDBJPNHCNJDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_BDBJPNHCNJD.newBuilder() to construct.
    private Unk3250_BDBJPNHCNJD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_BDBJPNHCNJD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_BDBJPNHCNJD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.internal_static_Unk3250_BDBJPNHCNJD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.internal_static_Unk3250_BDBJPNHCNJD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.class, emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.Builder.class);
    }

    public static final int UNK3150_JAKPANLHCEF_FIELD_NUMBER = 9;
    private int unk3150JAKPANLHCEF_;
    /**
     * <code>uint32 Unk3150_JAKPANLHCEF = 9;</code>
     * @return The unk3150JAKPANLHCEF.
     */
    @java.lang.Override
    public int getUnk3150JAKPANLHCEF() {
      return unk3150JAKPANLHCEF_;
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
      if (unk3150JAKPANLHCEF_ != 0) {
        output.writeUInt32(9, unk3150JAKPANLHCEF_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150JAKPANLHCEF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3150JAKPANLHCEF_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD other = (emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD) obj;

      if (getUnk3150JAKPANLHCEF()
          != other.getUnk3150JAKPANLHCEF()) return false;
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
      hash = (37 * hash) + UNK3150_JAKPANLHCEF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150JAKPANLHCEF();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD prototype) {
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
     * Protobuf type {@code Unk3250_BDBJPNHCNJD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_BDBJPNHCNJD)
        emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.internal_static_Unk3250_BDBJPNHCNJD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.internal_static_Unk3250_BDBJPNHCNJD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.class, emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150JAKPANLHCEF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.internal_static_Unk3250_BDBJPNHCNJD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD build() {
        emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD buildPartial() {
        emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD result = new emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD(this);
        result.unk3150JAKPANLHCEF_ = unk3150JAKPANLHCEF_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD other) {
        if (other == emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD.getDefaultInstance()) return this;
        if (other.getUnk3150JAKPANLHCEF() != 0) {
          setUnk3150JAKPANLHCEF(other.getUnk3150JAKPANLHCEF());
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
              case 72: {
                unk3150JAKPANLHCEF_ = input.readUInt32();

                break;
              } // case 72
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

      private int unk3150JAKPANLHCEF_ ;
      /**
       * <code>uint32 Unk3150_JAKPANLHCEF = 9;</code>
       * @return The unk3150JAKPANLHCEF.
       */
      @java.lang.Override
      public int getUnk3150JAKPANLHCEF() {
        return unk3150JAKPANLHCEF_;
      }
      /**
       * <code>uint32 Unk3150_JAKPANLHCEF = 9;</code>
       * @param value The unk3150JAKPANLHCEF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150JAKPANLHCEF(int value) {
        
        unk3150JAKPANLHCEF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_JAKPANLHCEF = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150JAKPANLHCEF() {
        
        unk3150JAKPANLHCEF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_BDBJPNHCNJD)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_BDBJPNHCNJD)
    private static final emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD();
    }

    public static emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_BDBJPNHCNJD>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_BDBJPNHCNJD>() {
      @java.lang.Override
      public Unk3250_BDBJPNHCNJD parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_BDBJPNHCNJD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_BDBJPNHCNJD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250BDBJPNHCNJD.Unk3250_BDBJPNHCNJD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_BDBJPNHCNJD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_BDBJPNHCNJD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_BDBJPNHCNJD.proto\"2\n\023Unk3250_B" +
      "DBJPNHCNJD\022\033\n\023Unk3150_JAKPANLHCEF\030\t \001(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_BDBJPNHCNJD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_BDBJPNHCNJD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_BDBJPNHCNJD_descriptor,
        new java.lang.String[] { "Unk3150JAKPANLHCEF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
