// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_EADGDJMAPOA.proto

package emu.grasscutter.net.newproto;

public final class Unk3150EADGDJMAPOA {
  private Unk3150EADGDJMAPOA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_EADGDJMAPOAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_EADGDJMAPOA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
     * @return The enum numeric value on the wire for option.
     */
    int getOptionValue();
    /**
     * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
     * @return The option.
     */
    emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD getOption();
  }
  /**
   * <pre>
   * CmdId: 7691
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_EADGDJMAPOA}
   */
  public static final class Unk3150_EADGDJMAPOA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_EADGDJMAPOA)
      Unk3150_EADGDJMAPOAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_EADGDJMAPOA.newBuilder() to construct.
    private Unk3150_EADGDJMAPOA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_EADGDJMAPOA() {
      option_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_EADGDJMAPOA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.internal_static_Unk3150_EADGDJMAPOA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.internal_static_Unk3150_EADGDJMAPOA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.class, emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.Builder.class);
    }

    public static final int OPTION_FIELD_NUMBER = 6;
    private int option_;
    /**
     * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
     * @return The enum numeric value on the wire for option.
     */
    @java.lang.Override public int getOptionValue() {
      return option_;
    }
    /**
     * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
     * @return The option.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD getOption() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD result = emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD.valueOf(option_);
      return result == null ? emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD.UNRECOGNIZED : result;
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
      if (option_ != emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD.Unk3150_CDDBALNPMDD_Unk3150_JNHKGJMBMDP.getNumber()) {
        output.writeEnum(6, option_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (option_ != emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD.Unk3150_CDDBALNPMDD_Unk3150_JNHKGJMBMDP.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, option_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA other = (emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA) obj;

      if (option_ != other.option_) return false;
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
      hash = (37 * hash) + OPTION_FIELD_NUMBER;
      hash = (53 * hash) + option_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA prototype) {
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
     * CmdId: 7691
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_EADGDJMAPOA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_EADGDJMAPOA)
        emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.internal_static_Unk3150_EADGDJMAPOA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.internal_static_Unk3150_EADGDJMAPOA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.class, emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        option_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.internal_static_Unk3150_EADGDJMAPOA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA build() {
        emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA buildPartial() {
        emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA result = new emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA(this);
        result.option_ = option_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA other) {
        if (other == emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA.getDefaultInstance()) return this;
        if (other.option_ != 0) {
          setOptionValue(other.getOptionValue());
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
                option_ = input.readEnum();

                break;
              } // case 48
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

      private int option_ = 0;
      /**
       * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
       * @return The enum numeric value on the wire for option.
       */
      @java.lang.Override public int getOptionValue() {
        return option_;
      }
      /**
       * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
       * @param value The enum numeric value on the wire for option to set.
       * @return This builder for chaining.
       */
      public Builder setOptionValue(int value) {
        
        option_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
       * @return The option.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD getOption() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD result = emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD.valueOf(option_);
        return result == null ? emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
       * @param value The option to set.
       * @return This builder for chaining.
       */
      public Builder setOption(emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.Unk3150_CDDBALNPMDD value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        option_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk3150_CDDBALNPMDD option = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOption() {
        
        option_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_EADGDJMAPOA)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_EADGDJMAPOA)
    private static final emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA();
    }

    public static emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_EADGDJMAPOA>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_EADGDJMAPOA>() {
      @java.lang.Override
      public Unk3150_EADGDJMAPOA parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_EADGDJMAPOA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_EADGDJMAPOA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150EADGDJMAPOA.Unk3150_EADGDJMAPOA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_EADGDJMAPOA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_EADGDJMAPOA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_EADGDJMAPOA.proto\032\031Unk3150_CDD" +
      "BALNPMDD.proto\";\n\023Unk3150_EADGDJMAPOA\022$\n" +
      "\006option\030\006 \001(\0162\024.Unk3150_CDDBALNPMDDB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.getDescriptor(),
        });
    internal_static_Unk3150_EADGDJMAPOA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_EADGDJMAPOA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_EADGDJMAPOA_descriptor,
        new java.lang.String[] { "Option", });
    emu.grasscutter.net.newproto.Unk3150CDDBALNPMDD.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
