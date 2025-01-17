// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientNewMailNotify.proto

package emu.grasscutter.net.newproto;

public final class ClientNewMailNotifyOuterClass {
  private ClientNewMailNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientNewMailNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientNewMailNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 not_got_attachment_num = 13;</code>
     * @return The notGotAttachmentNum.
     */
    int getNotGotAttachmentNum();

    /**
     * <code>uint32 not_read_num = 2;</code>
     * @return The notReadNum.
     */
    int getNotReadNum();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1457;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientNewMailNotify}
   */
  public static final class ClientNewMailNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientNewMailNotify)
      ClientNewMailNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientNewMailNotify.newBuilder() to construct.
    private ClientNewMailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientNewMailNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientNewMailNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.class, emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.Builder.class);
    }

    public static final int NOT_GOT_ATTACHMENT_NUM_FIELD_NUMBER = 13;
    private int notGotAttachmentNum_;
    /**
     * <code>uint32 not_got_attachment_num = 13;</code>
     * @return The notGotAttachmentNum.
     */
    @java.lang.Override
    public int getNotGotAttachmentNum() {
      return notGotAttachmentNum_;
    }

    public static final int NOT_READ_NUM_FIELD_NUMBER = 2;
    private int notReadNum_;
    /**
     * <code>uint32 not_read_num = 2;</code>
     * @return The notReadNum.
     */
    @java.lang.Override
    public int getNotReadNum() {
      return notReadNum_;
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
      if (notReadNum_ != 0) {
        output.writeUInt32(2, notReadNum_);
      }
      if (notGotAttachmentNum_ != 0) {
        output.writeUInt32(13, notGotAttachmentNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (notReadNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, notReadNum_);
      }
      if (notGotAttachmentNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, notGotAttachmentNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify other = (emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) obj;

      if (getNotGotAttachmentNum()
          != other.getNotGotAttachmentNum()) return false;
      if (getNotReadNum()
          != other.getNotReadNum()) return false;
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
      hash = (37 * hash) + NOT_GOT_ATTACHMENT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNotGotAttachmentNum();
      hash = (37 * hash) + NOT_READ_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNotReadNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify prototype) {
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
     *   CMD_ID = 1457;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientNewMailNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientNewMailNotify)
        emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.class, emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        notGotAttachmentNum_ = 0;

        notReadNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify build() {
        emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify buildPartial() {
        emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify result = new emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify(this);
        result.notGotAttachmentNum_ = notGotAttachmentNum_;
        result.notReadNum_ = notReadNum_;
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
        if (other instanceof emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify other) {
        if (other == emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.getDefaultInstance()) return this;
        if (other.getNotGotAttachmentNum() != 0) {
          setNotGotAttachmentNum(other.getNotGotAttachmentNum());
        }
        if (other.getNotReadNum() != 0) {
          setNotReadNum(other.getNotReadNum());
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
                notReadNum_ = input.readUInt32();

                break;
              } // case 16
              case 104: {
                notGotAttachmentNum_ = input.readUInt32();

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

      private int notGotAttachmentNum_ ;
      /**
       * <code>uint32 not_got_attachment_num = 13;</code>
       * @return The notGotAttachmentNum.
       */
      @java.lang.Override
      public int getNotGotAttachmentNum() {
        return notGotAttachmentNum_;
      }
      /**
       * <code>uint32 not_got_attachment_num = 13;</code>
       * @param value The notGotAttachmentNum to set.
       * @return This builder for chaining.
       */
      public Builder setNotGotAttachmentNum(int value) {
        
        notGotAttachmentNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 not_got_attachment_num = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNotGotAttachmentNum() {
        
        notGotAttachmentNum_ = 0;
        onChanged();
        return this;
      }

      private int notReadNum_ ;
      /**
       * <code>uint32 not_read_num = 2;</code>
       * @return The notReadNum.
       */
      @java.lang.Override
      public int getNotReadNum() {
        return notReadNum_;
      }
      /**
       * <code>uint32 not_read_num = 2;</code>
       * @param value The notReadNum to set.
       * @return This builder for chaining.
       */
      public Builder setNotReadNum(int value) {
        
        notReadNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 not_read_num = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNotReadNum() {
        
        notReadNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientNewMailNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientNewMailNotify)
    private static final emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify();
    }

    public static emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientNewMailNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientNewMailNotify>() {
      @java.lang.Override
      public ClientNewMailNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientNewMailNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientNewMailNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ClientNewMailNotifyOuterClass.ClientNewMailNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientNewMailNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientNewMailNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ClientNewMailNotify.proto\"K\n\023ClientNew" +
      "MailNotify\022\036\n\026not_got_attachment_num\030\r \001" +
      "(\r\022\024\n\014not_read_num\030\002 \001(\rB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientNewMailNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientNewMailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientNewMailNotify_descriptor,
        new java.lang.String[] { "NotGotAttachmentNum", "NotReadNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
