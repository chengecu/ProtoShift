// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtFaceToDirInfo.proto

package emu.grasscutter.net.newproto;

public final class EvtFaceToDirInfoOuterClass {
  private EvtFaceToDirInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtFaceToDirInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtFaceToDirInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector face_dir = 2;</code>
     * @return Whether the faceDir field is set.
     */
    boolean hasFaceDir();
    /**
     * <code>.Vector face_dir = 2;</code>
     * @return The faceDir.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getFaceDir();
    /**
     * <code>.Vector face_dir = 2;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getFaceDirOrBuilder();

    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code EvtFaceToDirInfo}
   */
  public static final class EvtFaceToDirInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtFaceToDirInfo)
      EvtFaceToDirInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtFaceToDirInfo.newBuilder() to construct.
    private EvtFaceToDirInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtFaceToDirInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtFaceToDirInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.internal_static_EvtFaceToDirInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.internal_static_EvtFaceToDirInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.class, emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder.class);
    }

    public static final int FACE_DIR_FIELD_NUMBER = 2;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector faceDir_;
    /**
     * <code>.Vector face_dir = 2;</code>
     * @return Whether the faceDir field is set.
     */
    @java.lang.Override
    public boolean hasFaceDir() {
      return faceDir_ != null;
    }
    /**
     * <code>.Vector face_dir = 2;</code>
     * @return The faceDir.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getFaceDir() {
      return faceDir_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : faceDir_;
    }
    /**
     * <code>.Vector face_dir = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getFaceDirOrBuilder() {
      return getFaceDir();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 5;</code>
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
      if (faceDir_ != null) {
        output.writeMessage(2, getFaceDir());
      }
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (faceDir_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getFaceDir());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo other = (emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo) obj;

      if (hasFaceDir() != other.hasFaceDir()) return false;
      if (hasFaceDir()) {
        if (!getFaceDir()
            .equals(other.getFaceDir())) return false;
      }
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
      if (hasFaceDir()) {
        hash = (37 * hash) + FACE_DIR_FIELD_NUMBER;
        hash = (53 * hash) + getFaceDir().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo prototype) {
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
     * Protobuf type {@code EvtFaceToDirInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtFaceToDirInfo)
        emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.internal_static_EvtFaceToDirInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.internal_static_EvtFaceToDirInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.class, emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (faceDirBuilder_ == null) {
          faceDir_ = null;
        } else {
          faceDir_ = null;
          faceDirBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.internal_static_EvtFaceToDirInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo build() {
        emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo buildPartial() {
        emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo result = new emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo(this);
        if (faceDirBuilder_ == null) {
          result.faceDir_ = faceDir_;
        } else {
          result.faceDir_ = faceDirBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo other) {
        if (other == emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo.getDefaultInstance()) return this;
        if (other.hasFaceDir()) {
          mergeFaceDir(other.getFaceDir());
        }
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
              case 18: {
                input.readMessage(
                    getFaceDirFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
              case 40: {
                entityId_ = input.readUInt32();

                break;
              } // case 40
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

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector faceDir_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> faceDirBuilder_;
      /**
       * <code>.Vector face_dir = 2;</code>
       * @return Whether the faceDir field is set.
       */
      public boolean hasFaceDir() {
        return faceDirBuilder_ != null || faceDir_ != null;
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       * @return The faceDir.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getFaceDir() {
        if (faceDirBuilder_ == null) {
          return faceDir_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : faceDir_;
        } else {
          return faceDirBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      public Builder setFaceDir(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (faceDirBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          faceDir_ = value;
          onChanged();
        } else {
          faceDirBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      public Builder setFaceDir(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (faceDirBuilder_ == null) {
          faceDir_ = builderForValue.build();
          onChanged();
        } else {
          faceDirBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      public Builder mergeFaceDir(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (faceDirBuilder_ == null) {
          if (faceDir_ != null) {
            faceDir_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(faceDir_).mergeFrom(value).buildPartial();
          } else {
            faceDir_ = value;
          }
          onChanged();
        } else {
          faceDirBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      public Builder clearFaceDir() {
        if (faceDirBuilder_ == null) {
          faceDir_ = null;
          onChanged();
        } else {
          faceDir_ = null;
          faceDirBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getFaceDirBuilder() {
        
        onChanged();
        return getFaceDirFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getFaceDirOrBuilder() {
        if (faceDirBuilder_ != null) {
          return faceDirBuilder_.getMessageOrBuilder();
        } else {
          return faceDir_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : faceDir_;
        }
      }
      /**
       * <code>.Vector face_dir = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getFaceDirFieldBuilder() {
        if (faceDirBuilder_ == null) {
          faceDirBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getFaceDir(),
                  getParentForChildren(),
                  isClean());
          faceDir_ = null;
        }
        return faceDirBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
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


      // @@protoc_insertion_point(builder_scope:EvtFaceToDirInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtFaceToDirInfo)
    private static final emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo();
    }

    public static emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtFaceToDirInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtFaceToDirInfo>() {
      @java.lang.Override
      public EvtFaceToDirInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtFaceToDirInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtFaceToDirInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EvtFaceToDirInfoOuterClass.EvtFaceToDirInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtFaceToDirInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtFaceToDirInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026EvtFaceToDirInfo.proto\032\014Vector.proto\"@" +
      "\n\020EvtFaceToDirInfo\022\031\n\010face_dir\030\002 \001(\0132\007.V" +
      "ector\022\021\n\tentity_id\030\005 \001(\rB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtFaceToDirInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtFaceToDirInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtFaceToDirInfo_descriptor,
        new java.lang.String[] { "FaceDir", "EntityId", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
