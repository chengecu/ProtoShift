// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerLocationInfo.proto

package emu.grasscutter.net.newproto;

public final class PlayerLocationInfoOuterClass {
  private PlayerLocationInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerLocationInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerLocationInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>.Vector rot = 13;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 13;</code>
     * @return The rot.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 13;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();

    /**
     * <code>.Vector pos = 3;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 3;</code>
     * @return The pos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 3;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code PlayerLocationInfo}
   */
  public static final class PlayerLocationInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerLocationInfo)
      PlayerLocationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerLocationInfo.newBuilder() to construct.
    private PlayerLocationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerLocationInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerLocationInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.internal_static_PlayerLocationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.internal_static_PlayerLocationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.class, emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 7;
    private int uid_;
    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int ROT_FIELD_NUMBER = 13;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 13;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 13;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
    }

    public static final int POS_FIELD_NUMBER = 3;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 3;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 3;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
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
      if (pos_ != null) {
        output.writeMessage(3, getPos());
      }
      if (uid_ != 0) {
        output.writeUInt32(7, uid_);
      }
      if (rot_ != null) {
        output.writeMessage(13, getRot());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPos());
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, uid_);
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getRot());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo other = (emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo) obj;

      if (getUid()
          != other.getUid()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo prototype) {
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
     * Protobuf type {@code PlayerLocationInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerLocationInfo)
        emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.internal_static_PlayerLocationInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.internal_static_PlayerLocationInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.class, emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = 0;

        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.internal_static_PlayerLocationInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo build() {
        emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo buildPartial() {
        emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo result = new emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo(this);
        result.uid_ = uid_;
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
        }
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo other) {
        if (other == emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
              case 26: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 26
              case 56: {
                uid_ = input.readUInt32();

                break;
              } // case 56
              case 106: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 106
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 7;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 13;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 13;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder setRot(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 3;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 3;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder setPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder mergePos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerLocationInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerLocationInfo)
    private static final emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo();
    }

    public static emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerLocationInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerLocationInfo>() {
      @java.lang.Override
      public PlayerLocationInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerLocationInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerLocationInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerLocationInfoOuterClass.PlayerLocationInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerLocationInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerLocationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PlayerLocationInfo.proto\032\014Vector.proto" +
      "\"M\n\022PlayerLocationInfo\022\013\n\003uid\030\007 \001(\r\022\024\n\003r" +
      "ot\030\r \001(\0132\007.Vector\022\024\n\003pos\030\003 \001(\0132\007.VectorB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_PlayerLocationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerLocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerLocationInfo_descriptor,
        new java.lang.String[] { "Uid", "Rot", "Pos", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}