// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupLinkBundle.proto

package emu.grasscutter.net.oldproto;

public final class GroupLinkBundleOuterClass {
  private GroupLinkBundleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupLinkBundleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GroupLinkBundle)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector center = 4;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>.Vector center = 4;</code>
     * @return The center.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getCenter();
    /**
     * <code>.Vector center = 4;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder();

    /**
     * <code>bool is_activated = 12;</code>
     * @return The isActivated.
     */
    boolean getIsActivated();

    /**
     * <code>uint32 bundle_id = 3;</code>
     * @return The bundleId.
     */
    int getBundleId();

    /**
     * <code>bool is_show_mark = 14;</code>
     * @return The isShowMark.
     */
    boolean getIsShowMark();

    /**
     * <code>uint32 scene_id = 5;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 radius = 1;</code>
     * @return The radius.
     */
    int getRadius();
  }
  /**
   * Protobuf type {@code GroupLinkBundle}
   */
  public static final class GroupLinkBundle extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GroupLinkBundle)
      GroupLinkBundleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupLinkBundle.newBuilder() to construct.
    private GroupLinkBundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupLinkBundle() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupLinkBundle();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.class, emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder.class);
    }

    public static final int CENTER_FIELD_NUMBER = 4;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector center_;
    /**
     * <code>.Vector center = 4;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return center_ != null;
    }
    /**
     * <code>.Vector center = 4;</code>
     * @return The center.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getCenter() {
      return center_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : center_;
    }
    /**
     * <code>.Vector center = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
      return getCenter();
    }

    public static final int IS_ACTIVATED_FIELD_NUMBER = 12;
    private boolean isActivated_;
    /**
     * <code>bool is_activated = 12;</code>
     * @return The isActivated.
     */
    @java.lang.Override
    public boolean getIsActivated() {
      return isActivated_;
    }

    public static final int BUNDLE_ID_FIELD_NUMBER = 3;
    private int bundleId_;
    /**
     * <code>uint32 bundle_id = 3;</code>
     * @return The bundleId.
     */
    @java.lang.Override
    public int getBundleId() {
      return bundleId_;
    }

    public static final int IS_SHOW_MARK_FIELD_NUMBER = 14;
    private boolean isShowMark_;
    /**
     * <code>bool is_show_mark = 14;</code>
     * @return The isShowMark.
     */
    @java.lang.Override
    public boolean getIsShowMark() {
      return isShowMark_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 5;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 5;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int RADIUS_FIELD_NUMBER = 1;
    private int radius_;
    /**
     * <code>uint32 radius = 1;</code>
     * @return The radius.
     */
    @java.lang.Override
    public int getRadius() {
      return radius_;
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
      if (radius_ != 0) {
        output.writeUInt32(1, radius_);
      }
      if (bundleId_ != 0) {
        output.writeUInt32(3, bundleId_);
      }
      if (center_ != null) {
        output.writeMessage(4, getCenter());
      }
      if (sceneId_ != 0) {
        output.writeUInt32(5, sceneId_);
      }
      if (isActivated_ != false) {
        output.writeBool(12, isActivated_);
      }
      if (isShowMark_ != false) {
        output.writeBool(14, isShowMark_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (radius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, radius_);
      }
      if (bundleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, bundleId_);
      }
      if (center_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getCenter());
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, sceneId_);
      }
      if (isActivated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isActivated_);
      }
      if (isShowMark_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isShowMark_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle other = (emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle) obj;

      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (getIsActivated()
          != other.getIsActivated()) return false;
      if (getBundleId()
          != other.getBundleId()) return false;
      if (getIsShowMark()
          != other.getIsShowMark()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getRadius()
          != other.getRadius()) return false;
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
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      hash = (37 * hash) + IS_ACTIVATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActivated());
      hash = (37 * hash) + BUNDLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBundleId();
      hash = (37 * hash) + IS_SHOW_MARK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShowMark());
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getRadius();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle prototype) {
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
     * Protobuf type {@code GroupLinkBundle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GroupLinkBundle)
        emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.class, emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          center_ = null;
          centerBuilder_ = null;
        }
        isActivated_ = false;

        bundleId_ = 0;

        isShowMark_ = false;

        sceneId_ = 0;

        radius_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle build() {
        emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle buildPartial() {
        emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle result = new emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle(this);
        if (centerBuilder_ == null) {
          result.center_ = center_;
        } else {
          result.center_ = centerBuilder_.build();
        }
        result.isActivated_ = isActivated_;
        result.bundleId_ = bundleId_;
        result.isShowMark_ = isShowMark_;
        result.sceneId_ = sceneId_;
        result.radius_ = radius_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle) {
          return mergeFrom((emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle other) {
        if (other == emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance()) return this;
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.getIsActivated() != false) {
          setIsActivated(other.getIsActivated());
        }
        if (other.getBundleId() != 0) {
          setBundleId(other.getBundleId());
        }
        if (other.getIsShowMark() != false) {
          setIsShowMark(other.getIsShowMark());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getRadius() != 0) {
          setRadius(other.getRadius());
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
                radius_ = input.readUInt32();

                break;
              } // case 8
              case 24: {
                bundleId_ = input.readUInt32();

                break;
              } // case 24
              case 34: {
                input.readMessage(
                    getCenterFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 34
              case 40: {
                sceneId_ = input.readUInt32();

                break;
              } // case 40
              case 96: {
                isActivated_ = input.readBool();

                break;
              } // case 96
              case 112: {
                isShowMark_ = input.readBool();

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

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> centerBuilder_;
      /**
       * <code>.Vector center = 4;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return centerBuilder_ != null || center_ != null;
      }
      /**
       * <code>.Vector center = 4;</code>
       * @return The center.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder setCenter(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder setCenter(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder mergeCenter(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (center_ != null) {
            center_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          center_ = null;
          centerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getCenterBuilder() {
        
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>.Vector center = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private boolean isActivated_ ;
      /**
       * <code>bool is_activated = 12;</code>
       * @return The isActivated.
       */
      @java.lang.Override
      public boolean getIsActivated() {
        return isActivated_;
      }
      /**
       * <code>bool is_activated = 12;</code>
       * @param value The isActivated to set.
       * @return This builder for chaining.
       */
      public Builder setIsActivated(boolean value) {
        
        isActivated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_activated = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActivated() {
        
        isActivated_ = false;
        onChanged();
        return this;
      }

      private int bundleId_ ;
      /**
       * <code>uint32 bundle_id = 3;</code>
       * @return The bundleId.
       */
      @java.lang.Override
      public int getBundleId() {
        return bundleId_;
      }
      /**
       * <code>uint32 bundle_id = 3;</code>
       * @param value The bundleId to set.
       * @return This builder for chaining.
       */
      public Builder setBundleId(int value) {
        
        bundleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bundle_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBundleId() {
        
        bundleId_ = 0;
        onChanged();
        return this;
      }

      private boolean isShowMark_ ;
      /**
       * <code>bool is_show_mark = 14;</code>
       * @return The isShowMark.
       */
      @java.lang.Override
      public boolean getIsShowMark() {
        return isShowMark_;
      }
      /**
       * <code>bool is_show_mark = 14;</code>
       * @param value The isShowMark to set.
       * @return This builder for chaining.
       */
      public Builder setIsShowMark(boolean value) {
        
        isShowMark_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_show_mark = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShowMark() {
        
        isShowMark_ = false;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 5;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 5;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int radius_ ;
      /**
       * <code>uint32 radius = 1;</code>
       * @return The radius.
       */
      @java.lang.Override
      public int getRadius() {
        return radius_;
      }
      /**
       * <code>uint32 radius = 1;</code>
       * @param value The radius to set.
       * @return This builder for chaining.
       */
      public Builder setRadius(int value) {
        
        radius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 radius = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRadius() {
        
        radius_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GroupLinkBundle)
    }

    // @@protoc_insertion_point(class_scope:GroupLinkBundle)
    private static final emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle();
    }

    public static emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupLinkBundle>
        PARSER = new com.google.protobuf.AbstractParser<GroupLinkBundle>() {
      @java.lang.Override
      public GroupLinkBundle parsePartialFrom(
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

    public static com.google.protobuf.Parser<GroupLinkBundle> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupLinkBundle> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupLinkBundle_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupLinkBundle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GroupLinkBundle.proto\032\014Vector.proto\"\213\001" +
      "\n\017GroupLinkBundle\022\027\n\006center\030\004 \001(\0132\007.Vect" +
      "or\022\024\n\014is_activated\030\014 \001(\010\022\021\n\tbundle_id\030\003 " +
      "\001(\r\022\024\n\014is_show_mark\030\016 \001(\010\022\020\n\010scene_id\030\005 " +
      "\001(\r\022\016\n\006radius\030\001 \001(\rB\036\n\034emu.grasscutter.n" +
      "et.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_GroupLinkBundle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GroupLinkBundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupLinkBundle_descriptor,
        new java.lang.String[] { "Center", "IsActivated", "BundleId", "IsShowMark", "SceneId", "Radius", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
