// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriFillPoetryReq.proto

package emu.grasscutter.net.oldproto;

public final class IrodoriFillPoetryReqOuterClass {
  private IrodoriFillPoetryReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriFillPoetryReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriFillPoetryReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 theme_id = 9;</code>
     * @return The themeId.
     */
    int getThemeId();

    /**
     * <code>uint32 line_id = 13;</code>
     * @return The lineId.
     */
    int getLineId();
  }
  /**
   * <pre>
   * CmdId: 8129
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code IrodoriFillPoetryReq}
   */
  public static final class IrodoriFillPoetryReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriFillPoetryReq)
      IrodoriFillPoetryReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriFillPoetryReq.newBuilder() to construct.
    private IrodoriFillPoetryReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriFillPoetryReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriFillPoetryReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.class, emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.Builder.class);
    }

    public static final int THEME_ID_FIELD_NUMBER = 9;
    private int themeId_;
    /**
     * <code>uint32 theme_id = 9;</code>
     * @return The themeId.
     */
    @java.lang.Override
    public int getThemeId() {
      return themeId_;
    }

    public static final int LINE_ID_FIELD_NUMBER = 13;
    private int lineId_;
    /**
     * <code>uint32 line_id = 13;</code>
     * @return The lineId.
     */
    @java.lang.Override
    public int getLineId() {
      return lineId_;
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
      if (themeId_ != 0) {
        output.writeUInt32(9, themeId_);
      }
      if (lineId_ != 0) {
        output.writeUInt32(13, lineId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (themeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, themeId_);
      }
      if (lineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, lineId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq other = (emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq) obj;

      if (getThemeId()
          != other.getThemeId()) return false;
      if (getLineId()
          != other.getLineId()) return false;
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
      hash = (37 * hash) + THEME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getThemeId();
      hash = (37 * hash) + LINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLineId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq prototype) {
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
     * CmdId: 8129
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code IrodoriFillPoetryReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriFillPoetryReq)
        emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.class, emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        themeId_ = 0;

        lineId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq build() {
        emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq buildPartial() {
        emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq result = new emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq(this);
        result.themeId_ = themeId_;
        result.lineId_ = lineId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq other) {
        if (other == emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.getDefaultInstance()) return this;
        if (other.getThemeId() != 0) {
          setThemeId(other.getThemeId());
        }
        if (other.getLineId() != 0) {
          setLineId(other.getLineId());
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
                themeId_ = input.readUInt32();

                break;
              } // case 72
              case 104: {
                lineId_ = input.readUInt32();

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

      private int themeId_ ;
      /**
       * <code>uint32 theme_id = 9;</code>
       * @return The themeId.
       */
      @java.lang.Override
      public int getThemeId() {
        return themeId_;
      }
      /**
       * <code>uint32 theme_id = 9;</code>
       * @param value The themeId to set.
       * @return This builder for chaining.
       */
      public Builder setThemeId(int value) {
        
        themeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 theme_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearThemeId() {
        
        themeId_ = 0;
        onChanged();
        return this;
      }

      private int lineId_ ;
      /**
       * <code>uint32 line_id = 13;</code>
       * @return The lineId.
       */
      @java.lang.Override
      public int getLineId() {
        return lineId_;
      }
      /**
       * <code>uint32 line_id = 13;</code>
       * @param value The lineId to set.
       * @return This builder for chaining.
       */
      public Builder setLineId(int value) {
        
        lineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 line_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLineId() {
        
        lineId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriFillPoetryReq)
    }

    // @@protoc_insertion_point(class_scope:IrodoriFillPoetryReq)
    private static final emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq();
    }

    public static emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriFillPoetryReq>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriFillPoetryReq>() {
      @java.lang.Override
      public IrodoriFillPoetryReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriFillPoetryReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriFillPoetryReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriFillPoetryReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriFillPoetryReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IrodoriFillPoetryReq.proto\"9\n\024IrodoriF" +
      "illPoetryReq\022\020\n\010theme_id\030\t \001(\r\022\017\n\007line_i" +
      "d\030\r \001(\rB\036\n\034emu.grasscutter.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriFillPoetryReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriFillPoetryReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriFillPoetryReq_descriptor,
        new java.lang.String[] { "ThemeId", "LineId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}