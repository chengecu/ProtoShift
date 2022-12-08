// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteSacrificeReq.proto

package emu.grasscutter.net.oldproto;

public final class LunaRiteSacrificeReqOuterClass {
  private LunaRiteSacrificeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteSacrificeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteSacrificeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 area_id = 15;</code>
     * @return The areaId.
     */
    int getAreaId();

    /**
     * <code>uint32 index = 14;</code>
     * @return The index.
     */
    int getIndex();
  }
  /**
   * <pre>
   * CmdId: 8805
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code LunaRiteSacrificeReq}
   */
  public static final class LunaRiteSacrificeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteSacrificeReq)
      LunaRiteSacrificeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteSacrificeReq.newBuilder() to construct.
    private LunaRiteSacrificeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteSacrificeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteSacrificeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.class, emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.Builder.class);
    }

    public static final int AREA_ID_FIELD_NUMBER = 15;
    private int areaId_;
    /**
     * <code>uint32 area_id = 15;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }

    public static final int INDEX_FIELD_NUMBER = 14;
    private int index_;
    /**
     * <code>uint32 index = 14;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
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
      if (index_ != 0) {
        output.writeUInt32(14, index_);
      }
      if (areaId_ != 0) {
        output.writeUInt32(15, areaId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, index_);
      }
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, areaId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq other = (emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq) obj;

      if (getAreaId()
          != other.getAreaId()) return false;
      if (getIndex()
          != other.getIndex()) return false;
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
      hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq prototype) {
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
     * CmdId: 8805
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code LunaRiteSacrificeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteSacrificeReq)
        emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.class, emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        areaId_ = 0;

        index_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.internal_static_LunaRiteSacrificeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq build() {
        emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq buildPartial() {
        emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq result = new emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq(this);
        result.areaId_ = areaId_;
        result.index_ = index_;
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
        if (other instanceof emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq other) {
        if (other == emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq.getDefaultInstance()) return this;
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
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
              case 112: {
                index_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                areaId_ = input.readUInt32();

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

      private int areaId_ ;
      /**
       * <code>uint32 area_id = 15;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 area_id = 15;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 14;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 14;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LunaRiteSacrificeReq)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteSacrificeReq)
    private static final emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq();
    }

    public static emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteSacrificeReq>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteSacrificeReq>() {
      @java.lang.Override
      public LunaRiteSacrificeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<LunaRiteSacrificeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteSacrificeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.LunaRiteSacrificeReqOuterClass.LunaRiteSacrificeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteSacrificeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteSacrificeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032LunaRiteSacrificeReq.proto\"6\n\024LunaRite" +
      "SacrificeReq\022\017\n\007area_id\030\017 \001(\r\022\r\n\005index\030\016" +
      " \001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteSacrificeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteSacrificeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteSacrificeReq_descriptor,
        new java.lang.String[] { "AreaId", "Index", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}