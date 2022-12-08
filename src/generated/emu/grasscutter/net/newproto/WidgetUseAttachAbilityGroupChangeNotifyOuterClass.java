// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetUseAttachAbilityGroupChangeNotify.proto

package emu.grasscutter.net.newproto;

public final class WidgetUseAttachAbilityGroupChangeNotifyOuterClass {
  private WidgetUseAttachAbilityGroupChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetUseAttachAbilityGroupChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetUseAttachAbilityGroupChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 material_id = 15;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool is_attach = 7;</code>
     * @return The isAttach.
     */
    boolean getIsAttach();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4290;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetUseAttachAbilityGroupChangeNotify}
   */
  public static final class WidgetUseAttachAbilityGroupChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetUseAttachAbilityGroupChangeNotify)
      WidgetUseAttachAbilityGroupChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetUseAttachAbilityGroupChangeNotify.newBuilder() to construct.
    private WidgetUseAttachAbilityGroupChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetUseAttachAbilityGroupChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetUseAttachAbilityGroupChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.class, emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.Builder.class);
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 15;
    private int materialId_;
    /**
     * <code>uint32 material_id = 15;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int IS_ATTACH_FIELD_NUMBER = 7;
    private boolean isAttach_;
    /**
     * <code>bool is_attach = 7;</code>
     * @return The isAttach.
     */
    @java.lang.Override
    public boolean getIsAttach() {
      return isAttach_;
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
      if (isAttach_ != false) {
        output.writeBool(7, isAttach_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(15, materialId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAttach_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isAttach_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, materialId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify other = (emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify) obj;

      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getIsAttach()
          != other.getIsAttach()) return false;
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
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + IS_ATTACH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAttach());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify prototype) {
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
     *   CMD_ID = 4290;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetUseAttachAbilityGroupChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetUseAttachAbilityGroupChangeNotify)
        emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.class, emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        materialId_ = 0;

        isAttach_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify build() {
        emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify buildPartial() {
        emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify result = new emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify(this);
        result.materialId_ = materialId_;
        result.isAttach_ = isAttach_;
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
        if (other instanceof emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify other) {
        if (other == emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.getDefaultInstance()) return this;
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getIsAttach() != false) {
          setIsAttach(other.getIsAttach());
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
              case 56: {
                isAttach_ = input.readBool();

                break;
              } // case 56
              case 120: {
                materialId_ = input.readUInt32();

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

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 15;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 15;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAttach_ ;
      /**
       * <code>bool is_attach = 7;</code>
       * @return The isAttach.
       */
      @java.lang.Override
      public boolean getIsAttach() {
        return isAttach_;
      }
      /**
       * <code>bool is_attach = 7;</code>
       * @param value The isAttach to set.
       * @return This builder for chaining.
       */
      public Builder setIsAttach(boolean value) {
        
        isAttach_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_attach = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAttach() {
        
        isAttach_ = false;
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


      // @@protoc_insertion_point(builder_scope:WidgetUseAttachAbilityGroupChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WidgetUseAttachAbilityGroupChangeNotify)
    private static final emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify();
    }

    public static emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetUseAttachAbilityGroupChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WidgetUseAttachAbilityGroupChangeNotify>() {
      @java.lang.Override
      public WidgetUseAttachAbilityGroupChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetUseAttachAbilityGroupChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetUseAttachAbilityGroupChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-WidgetUseAttachAbilityGroupChangeNotif" +
      "y.proto\"Q\n\'WidgetUseAttachAbilityGroupCh" +
      "angeNotify\022\023\n\013material_id\030\017 \001(\r\022\021\n\tis_at" +
      "tach\030\007 \001(\010B\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor,
        new java.lang.String[] { "MaterialId", "IsAttach", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}