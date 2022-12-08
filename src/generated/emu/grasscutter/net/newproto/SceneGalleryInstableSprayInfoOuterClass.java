// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryInstableSprayInfo.proto

package emu.grasscutter.net.newproto;

public final class SceneGalleryInstableSprayInfoOuterClass {
  private SceneGalleryInstableSprayInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryInstableSprayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryInstableSprayInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo> 
        getBuffInfoListList();
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo getBuffInfoList(int index);
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    int getBuffInfoListCount();
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder> 
        getBuffInfoListOrBuilderList();
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder getBuffInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SceneGalleryInstableSprayInfo}
   */
  public static final class SceneGalleryInstableSprayInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryInstableSprayInfo)
      SceneGalleryInstableSprayInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryInstableSprayInfo.newBuilder() to construct.
    private SceneGalleryInstableSprayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryInstableSprayInfo() {
      buffInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryInstableSprayInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.class, emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 10;
    private int score_;
    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int BUFF_INFO_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo> buffInfoList_;
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo> getBuffInfoListList() {
      return buffInfoList_;
    }
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder> 
        getBuffInfoListOrBuilderList() {
      return buffInfoList_;
    }
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    @java.lang.Override
    public int getBuffInfoListCount() {
      return buffInfoList_.size();
    }
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo getBuffInfoList(int index) {
      return buffInfoList_.get(index);
    }
    /**
     * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder getBuffInfoListOrBuilder(
        int index) {
      return buffInfoList_.get(index);
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
      for (int i = 0; i < buffInfoList_.size(); i++) {
        output.writeMessage(4, buffInfoList_.get(i));
      }
      if (score_ != 0) {
        output.writeUInt32(10, score_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < buffInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, buffInfoList_.get(i));
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, score_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo other = (emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (!getBuffInfoListList()
          .equals(other.getBuffInfoListList())) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      if (getBuffInfoListCount() > 0) {
        hash = (37 * hash) + BUFF_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBuffInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo prototype) {
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
     * Protobuf type {@code SceneGalleryInstableSprayInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryInstableSprayInfo)
        emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.class, emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        score_ = 0;

        if (buffInfoListBuilder_ == null) {
          buffInfoList_ = java.util.Collections.emptyList();
        } else {
          buffInfoList_ = null;
          buffInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo build() {
        emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo buildPartial() {
        emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo result = new emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo(this);
        int from_bitField0_ = bitField0_;
        result.score_ = score_;
        if (buffInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            buffInfoList_ = java.util.Collections.unmodifiableList(buffInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.buffInfoList_ = buffInfoList_;
        } else {
          result.buffInfoList_ = buffInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo other) {
        if (other == emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (buffInfoListBuilder_ == null) {
          if (!other.buffInfoList_.isEmpty()) {
            if (buffInfoList_.isEmpty()) {
              buffInfoList_ = other.buffInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBuffInfoListIsMutable();
              buffInfoList_.addAll(other.buffInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.buffInfoList_.isEmpty()) {
            if (buffInfoListBuilder_.isEmpty()) {
              buffInfoListBuilder_.dispose();
              buffInfoListBuilder_ = null;
              buffInfoList_ = other.buffInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              buffInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBuffInfoListFieldBuilder() : null;
            } else {
              buffInfoListBuilder_.addAllMessages(other.buffInfoList_);
            }
          }
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
              case 34: {
                emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.parser(),
                        extensionRegistry);
                if (buffInfoListBuilder_ == null) {
                  ensureBuffInfoListIsMutable();
                  buffInfoList_.add(m);
                } else {
                  buffInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 80: {
                score_ = input.readUInt32();

                break;
              } // case 80
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
      private int bitField0_;

      private int score_ ;
      /**
       * <code>uint32 score = 10;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo> buffInfoList_ =
        java.util.Collections.emptyList();
      private void ensureBuffInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          buffInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo>(buffInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder> buffInfoListBuilder_;

      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo> getBuffInfoListList() {
        if (buffInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(buffInfoList_);
        } else {
          return buffInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public int getBuffInfoListCount() {
        if (buffInfoListBuilder_ == null) {
          return buffInfoList_.size();
        } else {
          return buffInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo getBuffInfoList(int index) {
        if (buffInfoListBuilder_ == null) {
          return buffInfoList_.get(index);
        } else {
          return buffInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder setBuffInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo value) {
        if (buffInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuffInfoListIsMutable();
          buffInfoList_.set(index, value);
          onChanged();
        } else {
          buffInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder setBuffInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder builderForValue) {
        if (buffInfoListBuilder_ == null) {
          ensureBuffInfoListIsMutable();
          buffInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          buffInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder addBuffInfoList(emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo value) {
        if (buffInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuffInfoListIsMutable();
          buffInfoList_.add(value);
          onChanged();
        } else {
          buffInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder addBuffInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo value) {
        if (buffInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuffInfoListIsMutable();
          buffInfoList_.add(index, value);
          onChanged();
        } else {
          buffInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder addBuffInfoList(
          emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder builderForValue) {
        if (buffInfoListBuilder_ == null) {
          ensureBuffInfoListIsMutable();
          buffInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          buffInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder addBuffInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder builderForValue) {
        if (buffInfoListBuilder_ == null) {
          ensureBuffInfoListIsMutable();
          buffInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          buffInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder addAllBuffInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo> values) {
        if (buffInfoListBuilder_ == null) {
          ensureBuffInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, buffInfoList_);
          onChanged();
        } else {
          buffInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder clearBuffInfoList() {
        if (buffInfoListBuilder_ == null) {
          buffInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          buffInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public Builder removeBuffInfoList(int index) {
        if (buffInfoListBuilder_ == null) {
          ensureBuffInfoListIsMutable();
          buffInfoList_.remove(index);
          onChanged();
        } else {
          buffInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder getBuffInfoListBuilder(
          int index) {
        return getBuffInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder getBuffInfoListOrBuilder(
          int index) {
        if (buffInfoListBuilder_ == null) {
          return buffInfoList_.get(index);  } else {
          return buffInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder> 
           getBuffInfoListOrBuilderList() {
        if (buffInfoListBuilder_ != null) {
          return buffInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(buffInfoList_);
        }
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder addBuffInfoListBuilder() {
        return getBuffInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder addBuffInfoListBuilder(
          int index) {
        return getBuffInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneGalleryInstableSprayBuffInfo buff_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder> 
           getBuffInfoListBuilderList() {
        return getBuffInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder> 
          getBuffInfoListFieldBuilder() {
        if (buffInfoListBuilder_ == null) {
          buffInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfo.Builder, emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.SceneGalleryInstableSprayBuffInfoOrBuilder>(
                  buffInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          buffInfoList_ = null;
        }
        return buffInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryInstableSprayInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryInstableSprayInfo)
    private static final emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo();
    }

    public static emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryInstableSprayInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryInstableSprayInfo>() {
      @java.lang.Override
      public SceneGalleryInstableSprayInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryInstableSprayInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryInstableSprayInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryInstableSprayInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryInstableSprayInfo.proto\032\'S" +
      "ceneGalleryInstableSprayBuffInfo.proto\"j" +
      "\n\035SceneGalleryInstableSprayInfo\022\r\n\005score" +
      "\030\n \001(\r\022:\n\016buff_info_list\030\004 \003(\0132\".SceneGa" +
      "lleryInstableSprayBuffInfoB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryInstableSprayInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryInstableSprayInfo_descriptor,
        new java.lang.String[] { "Score", "BuffInfoList", });
    emu.grasscutter.net.newproto.SceneGalleryInstableSprayBuffInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}