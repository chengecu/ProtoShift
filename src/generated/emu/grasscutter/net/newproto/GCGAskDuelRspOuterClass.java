// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGAskDuelRsp.proto

package emu.grasscutter.net.newproto;

public final class GCGAskDuelRspOuterClass {
  private GCGAskDuelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGAskDuelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGAskDuelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGDuel duel = 9;</code>
     * @return Whether the duel field is set.
     */
    boolean hasDuel();
    /**
     * <code>.GCGDuel duel = 9;</code>
     * @return The duel.
     */
    emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel getDuel();
    /**
     * <code>.GCGDuel duel = 9;</code>
     */
    emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuelOrBuilder getDuelOrBuilder();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7564;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGAskDuelRsp}
   */
  public static final class GCGAskDuelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGAskDuelRsp)
      GCGAskDuelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGAskDuelRsp.newBuilder() to construct.
    private GCGAskDuelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGAskDuelRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGAskDuelRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.internal_static_GCGAskDuelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.internal_static_GCGAskDuelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.class, emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.Builder.class);
    }

    public static final int DUEL_FIELD_NUMBER = 9;
    private emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel duel_;
    /**
     * <code>.GCGDuel duel = 9;</code>
     * @return Whether the duel field is set.
     */
    @java.lang.Override
    public boolean hasDuel() {
      return duel_ != null;
    }
    /**
     * <code>.GCGDuel duel = 9;</code>
     * @return The duel.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel getDuel() {
      return duel_ == null ? emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.getDefaultInstance() : duel_;
    }
    /**
     * <code>.GCGDuel duel = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuelOrBuilder getDuelOrBuilder() {
      return getDuel();
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
      if (duel_ != null) {
        output.writeMessage(9, getDuel());
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
      if (duel_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getDuel());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp other = (emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp) obj;

      if (hasDuel() != other.hasDuel()) return false;
      if (hasDuel()) {
        if (!getDuel()
            .equals(other.getDuel())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasDuel()) {
        hash = (37 * hash) + DUEL_FIELD_NUMBER;
        hash = (53 * hash) + getDuel().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp prototype) {
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
     *   CMD_ID = 7564;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGAskDuelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGAskDuelRsp)
        emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.internal_static_GCGAskDuelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.internal_static_GCGAskDuelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.class, emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (duelBuilder_ == null) {
          duel_ = null;
        } else {
          duel_ = null;
          duelBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.internal_static_GCGAskDuelRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp build() {
        emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp buildPartial() {
        emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp result = new emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp(this);
        if (duelBuilder_ == null) {
          result.duel_ = duel_;
        } else {
          result.duel_ = duelBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp other) {
        if (other == emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp.getDefaultInstance()) return this;
        if (other.hasDuel()) {
          mergeDuel(other.getDuel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 74: {
                input.readMessage(
                    getDuelFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 74
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

      private emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel duel_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel, emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.Builder, emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuelOrBuilder> duelBuilder_;
      /**
       * <code>.GCGDuel duel = 9;</code>
       * @return Whether the duel field is set.
       */
      public boolean hasDuel() {
        return duelBuilder_ != null || duel_ != null;
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       * @return The duel.
       */
      public emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel getDuel() {
        if (duelBuilder_ == null) {
          return duel_ == null ? emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.getDefaultInstance() : duel_;
        } else {
          return duelBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      public Builder setDuel(emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel value) {
        if (duelBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          duel_ = value;
          onChanged();
        } else {
          duelBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      public Builder setDuel(
          emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.Builder builderForValue) {
        if (duelBuilder_ == null) {
          duel_ = builderForValue.build();
          onChanged();
        } else {
          duelBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      public Builder mergeDuel(emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel value) {
        if (duelBuilder_ == null) {
          if (duel_ != null) {
            duel_ =
              emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.newBuilder(duel_).mergeFrom(value).buildPartial();
          } else {
            duel_ = value;
          }
          onChanged();
        } else {
          duelBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      public Builder clearDuel() {
        if (duelBuilder_ == null) {
          duel_ = null;
          onChanged();
        } else {
          duel_ = null;
          duelBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      public emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.Builder getDuelBuilder() {
        
        onChanged();
        return getDuelFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      public emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuelOrBuilder getDuelOrBuilder() {
        if (duelBuilder_ != null) {
          return duelBuilder_.getMessageOrBuilder();
        } else {
          return duel_ == null ?
              emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.getDefaultInstance() : duel_;
        }
      }
      /**
       * <code>.GCGDuel duel = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel, emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.Builder, emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuelOrBuilder> 
          getDuelFieldBuilder() {
        if (duelBuilder_ == null) {
          duelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel, emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuel.Builder, emu.grasscutter.net.newproto.GCGDuelOuterClass.GCGDuelOrBuilder>(
                  getDuel(),
                  getParentForChildren(),
                  isClean());
          duel_ = null;
        }
        return duelBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGAskDuelRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGAskDuelRsp)
    private static final emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp();
    }

    public static emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGAskDuelRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGAskDuelRsp>() {
      @java.lang.Override
      public GCGAskDuelRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGAskDuelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGAskDuelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGAskDuelRspOuterClass.GCGAskDuelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGAskDuelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGAskDuelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GCGAskDuelRsp.proto\032\rGCGDuel.proto\"8\n\r" +
      "GCGAskDuelRsp\022\026\n\004duel\030\t \001(\0132\010.GCGDuel\022\017\n" +
      "\007retcode\030\002 \001(\005B\036\n\034emu.grasscutter.net.ne" +
      "wprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGDuelOuterClass.getDescriptor(),
        });
    internal_static_GCGAskDuelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGAskDuelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGAskDuelRsp_descriptor,
        new java.lang.String[] { "Duel", "Retcode", });
    emu.grasscutter.net.newproto.GCGDuelOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
