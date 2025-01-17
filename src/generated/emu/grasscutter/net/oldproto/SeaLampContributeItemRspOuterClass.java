// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampContributeItemRsp.proto

package emu.grasscutter.net.oldproto;

public final class SeaLampContributeItemRspOuterClass {
  private SeaLampContributeItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampContributeItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampContributeItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 add_contribution = 7;</code>
     * @return The addContribution.
     */
    int getAddContribution();

    /**
     * <code>uint32 add_progress = 1;</code>
     * @return The addProgress.
     */
    int getAddProgress();

    /**
     * <code>uint32 total_contribution = 14;</code>
     * @return The totalContribution.
     */
    int getTotalContribution();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2139
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SeaLampContributeItemRsp}
   */
  public static final class SeaLampContributeItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampContributeItemRsp)
      SeaLampContributeItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampContributeItemRsp.newBuilder() to construct.
    private SeaLampContributeItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampContributeItemRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampContributeItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.class, emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.Builder.class);
    }

    public static final int ADD_CONTRIBUTION_FIELD_NUMBER = 7;
    private int addContribution_;
    /**
     * <code>uint32 add_contribution = 7;</code>
     * @return The addContribution.
     */
    @java.lang.Override
    public int getAddContribution() {
      return addContribution_;
    }

    public static final int ADD_PROGRESS_FIELD_NUMBER = 1;
    private int addProgress_;
    /**
     * <code>uint32 add_progress = 1;</code>
     * @return The addProgress.
     */
    @java.lang.Override
    public int getAddProgress() {
      return addProgress_;
    }

    public static final int TOTAL_CONTRIBUTION_FIELD_NUMBER = 14;
    private int totalContribution_;
    /**
     * <code>uint32 total_contribution = 14;</code>
     * @return The totalContribution.
     */
    @java.lang.Override
    public int getTotalContribution() {
      return totalContribution_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
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
      if (addProgress_ != 0) {
        output.writeUInt32(1, addProgress_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (addContribution_ != 0) {
        output.writeUInt32(7, addContribution_);
      }
      if (totalContribution_ != 0) {
        output.writeUInt32(14, totalContribution_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (addProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, addProgress_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (addContribution_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, addContribution_);
      }
      if (totalContribution_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, totalContribution_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp other = (emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp) obj;

      if (getAddContribution()
          != other.getAddContribution()) return false;
      if (getAddProgress()
          != other.getAddProgress()) return false;
      if (getTotalContribution()
          != other.getTotalContribution()) return false;
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
      hash = (37 * hash) + ADD_CONTRIBUTION_FIELD_NUMBER;
      hash = (53 * hash) + getAddContribution();
      hash = (37 * hash) + ADD_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddProgress();
      hash = (37 * hash) + TOTAL_CONTRIBUTION_FIELD_NUMBER;
      hash = (53 * hash) + getTotalContribution();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp prototype) {
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
     * CmdId: 2139
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SeaLampContributeItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampContributeItemRsp)
        emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.class, emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        addContribution_ = 0;

        addProgress_ = 0;

        totalContribution_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.internal_static_SeaLampContributeItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp build() {
        emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp buildPartial() {
        emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp result = new emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp(this);
        result.addContribution_ = addContribution_;
        result.addProgress_ = addProgress_;
        result.totalContribution_ = totalContribution_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp other) {
        if (other == emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp.getDefaultInstance()) return this;
        if (other.getAddContribution() != 0) {
          setAddContribution(other.getAddContribution());
        }
        if (other.getAddProgress() != 0) {
          setAddProgress(other.getAddProgress());
        }
        if (other.getTotalContribution() != 0) {
          setTotalContribution(other.getTotalContribution());
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
              case 8: {
                addProgress_ = input.readUInt32();

                break;
              } // case 8
              case 48: {
                retcode_ = input.readInt32();

                break;
              } // case 48
              case 56: {
                addContribution_ = input.readUInt32();

                break;
              } // case 56
              case 112: {
                totalContribution_ = input.readUInt32();

                break;
              } // case 112
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

      private int addContribution_ ;
      /**
       * <code>uint32 add_contribution = 7;</code>
       * @return The addContribution.
       */
      @java.lang.Override
      public int getAddContribution() {
        return addContribution_;
      }
      /**
       * <code>uint32 add_contribution = 7;</code>
       * @param value The addContribution to set.
       * @return This builder for chaining.
       */
      public Builder setAddContribution(int value) {
        
        addContribution_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 add_contribution = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddContribution() {
        
        addContribution_ = 0;
        onChanged();
        return this;
      }

      private int addProgress_ ;
      /**
       * <code>uint32 add_progress = 1;</code>
       * @return The addProgress.
       */
      @java.lang.Override
      public int getAddProgress() {
        return addProgress_;
      }
      /**
       * <code>uint32 add_progress = 1;</code>
       * @param value The addProgress to set.
       * @return This builder for chaining.
       */
      public Builder setAddProgress(int value) {
        
        addProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 add_progress = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddProgress() {
        
        addProgress_ = 0;
        onChanged();
        return this;
      }

      private int totalContribution_ ;
      /**
       * <code>uint32 total_contribution = 14;</code>
       * @return The totalContribution.
       */
      @java.lang.Override
      public int getTotalContribution() {
        return totalContribution_;
      }
      /**
       * <code>uint32 total_contribution = 14;</code>
       * @param value The totalContribution to set.
       * @return This builder for chaining.
       */
      public Builder setTotalContribution(int value) {
        
        totalContribution_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_contribution = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalContribution() {
        
        totalContribution_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
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


      // @@protoc_insertion_point(builder_scope:SeaLampContributeItemRsp)
    }

    // @@protoc_insertion_point(class_scope:SeaLampContributeItemRsp)
    private static final emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp();
    }

    public static emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampContributeItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampContributeItemRsp>() {
      @java.lang.Override
      public SeaLampContributeItemRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SeaLampContributeItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampContributeItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SeaLampContributeItemRspOuterClass.SeaLampContributeItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampContributeItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampContributeItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SeaLampContributeItemRsp.proto\"w\n\030SeaL" +
      "ampContributeItemRsp\022\030\n\020add_contribution" +
      "\030\007 \001(\r\022\024\n\014add_progress\030\001 \001(\r\022\032\n\022total_co" +
      "ntribution\030\016 \001(\r\022\017\n\007retcode\030\006 \001(\005B\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampContributeItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampContributeItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampContributeItemRsp_descriptor,
        new java.lang.String[] { "AddContribution", "AddProgress", "TotalContribution", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
