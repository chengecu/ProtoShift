// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DynamicSVONode.proto

package emu.grasscutter.net.oldproto;

public final class DynamicSVONodeOuterClass {
  private DynamicSVONodeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DynamicSVONodeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DynamicSVONode)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 index = 8;</code>
     * @return The index.
     */
    long getIndex();

    /**
     * <code>int32 area = 5;</code>
     * @return The area.
     */
    int getArea();

    /**
     * <code>.Vector refer_pos = 1;</code>
     * @return Whether the referPos field is set.
     */
    boolean hasReferPos();
    /**
     * <code>.Vector refer_pos = 1;</code>
     * @return The referPos.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getReferPos();
    /**
     * <code>.Vector refer_pos = 1;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getReferPosOrBuilder();
  }
  /**
   * Protobuf type {@code DynamicSVONode}
   */
  public static final class DynamicSVONode extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DynamicSVONode)
      DynamicSVONodeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DynamicSVONode.newBuilder() to construct.
    private DynamicSVONode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DynamicSVONode() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DynamicSVONode();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.internal_static_DynamicSVONode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.internal_static_DynamicSVONode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.class, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder.class);
    }

    public static final int INDEX_FIELD_NUMBER = 8;
    private long index_;
    /**
     * <code>int64 index = 8;</code>
     * @return The index.
     */
    @java.lang.Override
    public long getIndex() {
      return index_;
    }

    public static final int AREA_FIELD_NUMBER = 5;
    private int area_;
    /**
     * <code>int32 area = 5;</code>
     * @return The area.
     */
    @java.lang.Override
    public int getArea() {
      return area_;
    }

    public static final int REFER_POS_FIELD_NUMBER = 1;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector referPos_;
    /**
     * <code>.Vector refer_pos = 1;</code>
     * @return Whether the referPos field is set.
     */
    @java.lang.Override
    public boolean hasReferPos() {
      return referPos_ != null;
    }
    /**
     * <code>.Vector refer_pos = 1;</code>
     * @return The referPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getReferPos() {
      return referPos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : referPos_;
    }
    /**
     * <code>.Vector refer_pos = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getReferPosOrBuilder() {
      return getReferPos();
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
      if (referPos_ != null) {
        output.writeMessage(1, getReferPos());
      }
      if (area_ != 0) {
        output.writeInt32(5, area_);
      }
      if (index_ != 0L) {
        output.writeInt64(8, index_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (referPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getReferPos());
      }
      if (area_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, area_);
      }
      if (index_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, index_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode other = (emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (getArea()
          != other.getArea()) return false;
      if (hasReferPos() != other.hasReferPos()) return false;
      if (hasReferPos()) {
        if (!getReferPos()
            .equals(other.getReferPos())) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getIndex());
      hash = (37 * hash) + AREA_FIELD_NUMBER;
      hash = (53 * hash) + getArea();
      if (hasReferPos()) {
        hash = (37 * hash) + REFER_POS_FIELD_NUMBER;
        hash = (53 * hash) + getReferPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode prototype) {
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
     * Protobuf type {@code DynamicSVONode}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DynamicSVONode)
        emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.internal_static_DynamicSVONode_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.internal_static_DynamicSVONode_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.class, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        index_ = 0L;

        area_ = 0;

        if (referPosBuilder_ == null) {
          referPos_ = null;
        } else {
          referPos_ = null;
          referPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.internal_static_DynamicSVONode_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode build() {
        emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode buildPartial() {
        emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode result = new emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode(this);
        result.index_ = index_;
        result.area_ = area_;
        if (referPosBuilder_ == null) {
          result.referPos_ = referPos_;
        } else {
          result.referPos_ = referPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode) {
          return mergeFrom((emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode other) {
        if (other == emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.getDefaultInstance()) return this;
        if (other.getIndex() != 0L) {
          setIndex(other.getIndex());
        }
        if (other.getArea() != 0) {
          setArea(other.getArea());
        }
        if (other.hasReferPos()) {
          mergeReferPos(other.getReferPos());
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
              case 10: {
                input.readMessage(
                    getReferPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 40: {
                area_ = input.readInt32();

                break;
              } // case 40
              case 64: {
                index_ = input.readInt64();

                break;
              } // case 64
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

      private long index_ ;
      /**
       * <code>int64 index = 8;</code>
       * @return The index.
       */
      @java.lang.Override
      public long getIndex() {
        return index_;
      }
      /**
       * <code>int64 index = 8;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(long value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 index = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0L;
        onChanged();
        return this;
      }

      private int area_ ;
      /**
       * <code>int32 area = 5;</code>
       * @return The area.
       */
      @java.lang.Override
      public int getArea() {
        return area_;
      }
      /**
       * <code>int32 area = 5;</code>
       * @param value The area to set.
       * @return This builder for chaining.
       */
      public Builder setArea(int value) {
        
        area_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 area = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearArea() {
        
        area_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector referPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> referPosBuilder_;
      /**
       * <code>.Vector refer_pos = 1;</code>
       * @return Whether the referPos field is set.
       */
      public boolean hasReferPos() {
        return referPosBuilder_ != null || referPos_ != null;
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       * @return The referPos.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getReferPos() {
        if (referPosBuilder_ == null) {
          return referPos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : referPos_;
        } else {
          return referPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      public Builder setReferPos(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (referPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          referPos_ = value;
          onChanged();
        } else {
          referPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      public Builder setReferPos(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (referPosBuilder_ == null) {
          referPos_ = builderForValue.build();
          onChanged();
        } else {
          referPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      public Builder mergeReferPos(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (referPosBuilder_ == null) {
          if (referPos_ != null) {
            referPos_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(referPos_).mergeFrom(value).buildPartial();
          } else {
            referPos_ = value;
          }
          onChanged();
        } else {
          referPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      public Builder clearReferPos() {
        if (referPosBuilder_ == null) {
          referPos_ = null;
          onChanged();
        } else {
          referPos_ = null;
          referPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getReferPosBuilder() {
        
        onChanged();
        return getReferPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getReferPosOrBuilder() {
        if (referPosBuilder_ != null) {
          return referPosBuilder_.getMessageOrBuilder();
        } else {
          return referPos_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : referPos_;
        }
      }
      /**
       * <code>.Vector refer_pos = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getReferPosFieldBuilder() {
        if (referPosBuilder_ == null) {
          referPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getReferPos(),
                  getParentForChildren(),
                  isClean());
          referPos_ = null;
        }
        return referPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DynamicSVONode)
    }

    // @@protoc_insertion_point(class_scope:DynamicSVONode)
    private static final emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode();
    }

    public static emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DynamicSVONode>
        PARSER = new com.google.protobuf.AbstractParser<DynamicSVONode>() {
      @java.lang.Override
      public DynamicSVONode parsePartialFrom(
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

    public static com.google.protobuf.Parser<DynamicSVONode> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DynamicSVONode> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DynamicSVONode_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DynamicSVONode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024DynamicSVONode.proto\032\014Vector.proto\"I\n\016" +
      "DynamicSVONode\022\r\n\005index\030\010 \001(\003\022\014\n\004area\030\005 " +
      "\001(\005\022\032\n\trefer_pos\030\001 \001(\0132\007.VectorB\036\n\034emu.g" +
      "rasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_DynamicSVONode_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DynamicSVONode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DynamicSVONode_descriptor,
        new java.lang.String[] { "Index", "Area", "ReferPos", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}