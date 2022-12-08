// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetRecommendCustomDungeonReq.proto

package emu.grasscutter.net.oldproto;

public final class GetRecommendCustomDungeonReqOuterClass {
  private GetRecommendCustomDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetRecommendCustomDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetRecommendCustomDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_refresh = 13;</code>
     * @return The isRefresh.
     */
    boolean getIsRefresh();
  }
  /**
   * <pre>
   * CmdId: 6235
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GetRecommendCustomDungeonReq}
   */
  public static final class GetRecommendCustomDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetRecommendCustomDungeonReq)
      GetRecommendCustomDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetRecommendCustomDungeonReq.newBuilder() to construct.
    private GetRecommendCustomDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetRecommendCustomDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetRecommendCustomDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.internal_static_GetRecommendCustomDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.internal_static_GetRecommendCustomDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.class, emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.Builder.class);
    }

    public static final int IS_REFRESH_FIELD_NUMBER = 13;
    private boolean isRefresh_;
    /**
     * <code>bool is_refresh = 13;</code>
     * @return The isRefresh.
     */
    @java.lang.Override
    public boolean getIsRefresh() {
      return isRefresh_;
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
      if (isRefresh_ != false) {
        output.writeBool(13, isRefresh_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isRefresh_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isRefresh_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq other = (emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq) obj;

      if (getIsRefresh()
          != other.getIsRefresh()) return false;
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
      hash = (37 * hash) + IS_REFRESH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRefresh());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq prototype) {
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
     * CmdId: 6235
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GetRecommendCustomDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetRecommendCustomDungeonReq)
        emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.internal_static_GetRecommendCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.internal_static_GetRecommendCustomDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.class, emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isRefresh_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.internal_static_GetRecommendCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq build() {
        emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq buildPartial() {
        emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq result = new emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq(this);
        result.isRefresh_ = isRefresh_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq other) {
        if (other == emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq.getDefaultInstance()) return this;
        if (other.getIsRefresh() != false) {
          setIsRefresh(other.getIsRefresh());
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
              case 104: {
                isRefresh_ = input.readBool();

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

      private boolean isRefresh_ ;
      /**
       * <code>bool is_refresh = 13;</code>
       * @return The isRefresh.
       */
      @java.lang.Override
      public boolean getIsRefresh() {
        return isRefresh_;
      }
      /**
       * <code>bool is_refresh = 13;</code>
       * @param value The isRefresh to set.
       * @return This builder for chaining.
       */
      public Builder setIsRefresh(boolean value) {
        
        isRefresh_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_refresh = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRefresh() {
        
        isRefresh_ = false;
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


      // @@protoc_insertion_point(builder_scope:GetRecommendCustomDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:GetRecommendCustomDungeonReq)
    private static final emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq();
    }

    public static emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetRecommendCustomDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<GetRecommendCustomDungeonReq>() {
      @java.lang.Override
      public GetRecommendCustomDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetRecommendCustomDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetRecommendCustomDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GetRecommendCustomDungeonReqOuterClass.GetRecommendCustomDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRecommendCustomDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetRecommendCustomDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GetRecommendCustomDungeonReq.proto\"2\n\034" +
      "GetRecommendCustomDungeonReq\022\022\n\nis_refre" +
      "sh\030\r \001(\010B\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetRecommendCustomDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetRecommendCustomDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetRecommendCustomDungeonReq_descriptor,
        new java.lang.String[] { "IsRefresh", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}