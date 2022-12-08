// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamResonanceChangeNotify.proto

package emu.grasscutter.net.newproto;

public final class TeamResonanceChangeNotifyOuterClass {
  private TeamResonanceChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamResonanceChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamResonanceChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo> 
        getInfoListList();
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getInfoList(int index);
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    int getInfoListCount();
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder> 
        getInfoListOrBuilderList();
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder getInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1090;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TeamResonanceChangeNotify}
   */
  public static final class TeamResonanceChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamResonanceChangeNotify)
      TeamResonanceChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamResonanceChangeNotify.newBuilder() to construct.
    private TeamResonanceChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamResonanceChangeNotify() {
      infoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamResonanceChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.internal_static_TeamResonanceChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.internal_static_TeamResonanceChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.class, emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.Builder.class);
    }

    public static final int INFO_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo> infoList_;
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo> getInfoListList() {
      return infoList_;
    }
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder> 
        getInfoListOrBuilderList() {
      return infoList_;
    }
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    @java.lang.Override
    public int getInfoListCount() {
      return infoList_.size();
    }
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getInfoList(int index) {
      return infoList_.get(index);
    }
    /**
     * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder getInfoListOrBuilder(
        int index) {
      return infoList_.get(index);
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
      for (int i = 0; i < infoList_.size(); i++) {
        output.writeMessage(9, infoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < infoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, infoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify other = (emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify) obj;

      if (!getInfoListList()
          .equals(other.getInfoListList())) return false;
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
      if (getInfoListCount() > 0) {
        hash = (37 * hash) + INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify prototype) {
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
     *   CMD_ID = 1090;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TeamResonanceChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamResonanceChangeNotify)
        emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.internal_static_TeamResonanceChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.internal_static_TeamResonanceChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.class, emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (infoListBuilder_ == null) {
          infoList_ = java.util.Collections.emptyList();
        } else {
          infoList_ = null;
          infoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.internal_static_TeamResonanceChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify build() {
        emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify buildPartial() {
        emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify result = new emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (infoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            infoList_ = java.util.Collections.unmodifiableList(infoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.infoList_ = infoList_;
        } else {
          result.infoList_ = infoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify other) {
        if (other == emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify.getDefaultInstance()) return this;
        if (infoListBuilder_ == null) {
          if (!other.infoList_.isEmpty()) {
            if (infoList_.isEmpty()) {
              infoList_ = other.infoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInfoListIsMutable();
              infoList_.addAll(other.infoList_);
            }
            onChanged();
          }
        } else {
          if (!other.infoList_.isEmpty()) {
            if (infoListBuilder_.isEmpty()) {
              infoListBuilder_.dispose();
              infoListBuilder_ = null;
              infoList_ = other.infoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              infoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInfoListFieldBuilder() : null;
            } else {
              infoListBuilder_.addAllMessages(other.infoList_);
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
              case 74: {
                emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.parser(),
                        extensionRegistry);
                if (infoListBuilder_ == null) {
                  ensureInfoListIsMutable();
                  infoList_.add(m);
                } else {
                  infoListBuilder_.addMessage(m);
                }
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
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo> infoList_ =
        java.util.Collections.emptyList();
      private void ensureInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          infoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo>(infoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder> infoListBuilder_;

      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo> getInfoListList() {
        if (infoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(infoList_);
        } else {
          return infoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public int getInfoListCount() {
        if (infoListBuilder_ == null) {
          return infoList_.size();
        } else {
          return infoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getInfoList(int index) {
        if (infoListBuilder_ == null) {
          return infoList_.get(index);
        } else {
          return infoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder setInfoList(
          int index, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo value) {
        if (infoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfoListIsMutable();
          infoList_.set(index, value);
          onChanged();
        } else {
          infoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder setInfoList(
          int index, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder builderForValue) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          infoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder addInfoList(emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo value) {
        if (infoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfoListIsMutable();
          infoList_.add(value);
          onChanged();
        } else {
          infoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder addInfoList(
          int index, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo value) {
        if (infoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfoListIsMutable();
          infoList_.add(index, value);
          onChanged();
        } else {
          infoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder addInfoList(
          emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder builderForValue) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.add(builderForValue.build());
          onChanged();
        } else {
          infoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder addInfoList(
          int index, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder builderForValue) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          infoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder addAllInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo> values) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, infoList_);
          onChanged();
        } else {
          infoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder clearInfoList() {
        if (infoListBuilder_ == null) {
          infoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          infoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public Builder removeInfoList(int index) {
        if (infoListBuilder_ == null) {
          ensureInfoListIsMutable();
          infoList_.remove(index);
          onChanged();
        } else {
          infoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder getInfoListBuilder(
          int index) {
        return getInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder getInfoListOrBuilder(
          int index) {
        if (infoListBuilder_ == null) {
          return infoList_.get(index);  } else {
          return infoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder> 
           getInfoListOrBuilderList() {
        if (infoListBuilder_ != null) {
          return infoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(infoList_);
        }
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder addInfoListBuilder() {
        return getInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder addInfoListBuilder(
          int index) {
        return getInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarTeamResonanceInfo info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder> 
           getInfoListBuilderList() {
        return getInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder> 
          getInfoListFieldBuilder() {
        if (infoListBuilder_ == null) {
          infoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder, emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder>(
                  infoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          infoList_ = null;
        }
        return infoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TeamResonanceChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:TeamResonanceChangeNotify)
    private static final emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify();
    }

    public static emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamResonanceChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<TeamResonanceChangeNotify>() {
      @java.lang.Override
      public TeamResonanceChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<TeamResonanceChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamResonanceChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.TeamResonanceChangeNotifyOuterClass.TeamResonanceChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamResonanceChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamResonanceChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037TeamResonanceChangeNotify.proto\032\035Avata" +
      "rTeamResonanceInfo.proto\"H\n\031TeamResonanc" +
      "eChangeNotify\022+\n\tinfo_list\030\t \003(\0132\030.Avata" +
      "rTeamResonanceInfoB\036\n\034emu.grasscutter.ne" +
      "t.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.getDescriptor(),
        });
    internal_static_TeamResonanceChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamResonanceChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamResonanceChangeNotify_descriptor,
        new java.lang.String[] { "InfoList", });
    emu.grasscutter.net.newproto.AvatarTeamResonanceInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}