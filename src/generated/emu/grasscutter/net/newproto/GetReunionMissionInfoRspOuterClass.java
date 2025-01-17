// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetReunionMissionInfoRsp.proto

package emu.grasscutter.net.newproto;

public final class GetReunionMissionInfoRspOuterClass {
  private GetReunionMissionInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetReunionMissionInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetReunionMissionInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.ReunionMissionInfo mission_info = 4;</code>
     * @return Whether the missionInfo field is set.
     */
    boolean hasMissionInfo();
    /**
     * <code>.ReunionMissionInfo mission_info = 4;</code>
     * @return The missionInfo.
     */
    emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo();
    /**
     * <code>.ReunionMissionInfo mission_info = 4;</code>
     */
    emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder getMissionInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5084;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetReunionMissionInfoRsp}
   */
  public static final class GetReunionMissionInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetReunionMissionInfoRsp)
      GetReunionMissionInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetReunionMissionInfoRsp.newBuilder() to construct.
    private GetReunionMissionInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetReunionMissionInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetReunionMissionInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.class, emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MISSION_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo missionInfo_;
    /**
     * <code>.ReunionMissionInfo mission_info = 4;</code>
     * @return Whether the missionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMissionInfo() {
      return missionInfo_ != null;
    }
    /**
     * <code>.ReunionMissionInfo mission_info = 4;</code>
     * @return The missionInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo() {
      return missionInfo_ == null ? emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.getDefaultInstance() : missionInfo_;
    }
    /**
     * <code>.ReunionMissionInfo mission_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder getMissionInfoOrBuilder() {
      return getMissionInfo();
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (missionInfo_ != null) {
        output.writeMessage(4, getMissionInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (missionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getMissionInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp other = (emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasMissionInfo() != other.hasMissionInfo()) return false;
      if (hasMissionInfo()) {
        if (!getMissionInfo()
            .equals(other.getMissionInfo())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasMissionInfo()) {
        hash = (37 * hash) + MISSION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMissionInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp prototype) {
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
     *   CMD_ID = 5084;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetReunionMissionInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetReunionMissionInfoRsp)
        emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.class, emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (missionInfoBuilder_ == null) {
          missionInfo_ = null;
        } else {
          missionInfo_ = null;
          missionInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp build() {
        emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp buildPartial() {
        emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp result = new emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp(this);
        result.retcode_ = retcode_;
        if (missionInfoBuilder_ == null) {
          result.missionInfo_ = missionInfo_;
        } else {
          result.missionInfo_ = missionInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp other) {
        if (other == emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasMissionInfo()) {
          mergeMissionInfo(other.getMissionInfo());
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
                retcode_ = input.readInt32();

                break;
              } // case 16
              case 34: {
                input.readMessage(
                    getMissionInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 34
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo missionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo, emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder, emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder> missionInfoBuilder_;
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       * @return Whether the missionInfo field is set.
       */
      public boolean hasMissionInfo() {
        return missionInfoBuilder_ != null || missionInfo_ != null;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       * @return The missionInfo.
       */
      public emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo() {
        if (missionInfoBuilder_ == null) {
          return missionInfo_ == null ? emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.getDefaultInstance() : missionInfo_;
        } else {
          return missionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      public Builder setMissionInfo(emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo value) {
        if (missionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          missionInfo_ = value;
          onChanged();
        } else {
          missionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      public Builder setMissionInfo(
          emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder builderForValue) {
        if (missionInfoBuilder_ == null) {
          missionInfo_ = builderForValue.build();
          onChanged();
        } else {
          missionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      public Builder mergeMissionInfo(emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo value) {
        if (missionInfoBuilder_ == null) {
          if (missionInfo_ != null) {
            missionInfo_ =
              emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.newBuilder(missionInfo_).mergeFrom(value).buildPartial();
          } else {
            missionInfo_ = value;
          }
          onChanged();
        } else {
          missionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      public Builder clearMissionInfo() {
        if (missionInfoBuilder_ == null) {
          missionInfo_ = null;
          onChanged();
        } else {
          missionInfo_ = null;
          missionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      public emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder getMissionInfoBuilder() {
        
        onChanged();
        return getMissionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      public emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder getMissionInfoOrBuilder() {
        if (missionInfoBuilder_ != null) {
          return missionInfoBuilder_.getMessageOrBuilder();
        } else {
          return missionInfo_ == null ?
              emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.getDefaultInstance() : missionInfo_;
        }
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo, emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder, emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder> 
          getMissionInfoFieldBuilder() {
        if (missionInfoBuilder_ == null) {
          missionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo, emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder, emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder>(
                  getMissionInfo(),
                  getParentForChildren(),
                  isClean());
          missionInfo_ = null;
        }
        return missionInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetReunionMissionInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetReunionMissionInfoRsp)
    private static final emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp();
    }

    public static emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetReunionMissionInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetReunionMissionInfoRsp>() {
      @java.lang.Override
      public GetReunionMissionInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetReunionMissionInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetReunionMissionInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReunionMissionInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReunionMissionInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetReunionMissionInfoRsp.proto\032\030Reunio" +
      "nMissionInfo.proto\"V\n\030GetReunionMissionI" +
      "nfoRsp\022\017\n\007retcode\030\002 \001(\005\022)\n\014mission_info\030" +
      "\004 \001(\0132\023.ReunionMissionInfoB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.getDescriptor(),
        });
    internal_static_GetReunionMissionInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetReunionMissionInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReunionMissionInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "MissionInfo", });
    emu.grasscutter.net.newproto.ReunionMissionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
