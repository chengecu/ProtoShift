// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DigActivityChangeGadgetStateReq.proto

package emu.grasscutter.net.oldproto;

public final class DigActivityChangeGadgetStateReqOuterClass {
  private DigActivityChangeGadgetStateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DigActivityChangeGadgetStateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DigActivityChangeGadgetStateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 8464
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code DigActivityChangeGadgetStateReq}
   */
  public static final class DigActivityChangeGadgetStateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DigActivityChangeGadgetStateReq)
      DigActivityChangeGadgetStateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DigActivityChangeGadgetStateReq.newBuilder() to construct.
    private DigActivityChangeGadgetStateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DigActivityChangeGadgetStateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DigActivityChangeGadgetStateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.internal_static_DigActivityChangeGadgetStateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.internal_static_DigActivityChangeGadgetStateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.class, emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq other = (emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq prototype) {
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
     * CmdId: 8464
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code DigActivityChangeGadgetStateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DigActivityChangeGadgetStateReq)
        emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.internal_static_DigActivityChangeGadgetStateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.internal_static_DigActivityChangeGadgetStateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.class, emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.internal_static_DigActivityChangeGadgetStateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq build() {
        emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq buildPartial() {
        emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq result = new emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq(this);
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq other) {
        if (other == emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
              case 80: {
                entityId_ = input.readUInt32();

                break;
              } // case 80
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DigActivityChangeGadgetStateReq)
    }

    // @@protoc_insertion_point(class_scope:DigActivityChangeGadgetStateReq)
    private static final emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq();
    }

    public static emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DigActivityChangeGadgetStateReq>
        PARSER = new com.google.protobuf.AbstractParser<DigActivityChangeGadgetStateReq>() {
      @java.lang.Override
      public DigActivityChangeGadgetStateReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DigActivityChangeGadgetStateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DigActivityChangeGadgetStateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DigActivityChangeGadgetStateReqOuterClass.DigActivityChangeGadgetStateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DigActivityChangeGadgetStateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DigActivityChangeGadgetStateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%DigActivityChangeGadgetStateReq.proto\"" +
      "4\n\037DigActivityChangeGadgetStateReq\022\021\n\ten" +
      "tity_id\030\n \001(\rB\036\n\034emu.grasscutter.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DigActivityChangeGadgetStateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DigActivityChangeGadgetStateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DigActivityChangeGadgetStateReq_descriptor,
        new java.lang.String[] { "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}