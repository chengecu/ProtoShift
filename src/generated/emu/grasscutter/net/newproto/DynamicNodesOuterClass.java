// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DynamicNodes.proto

package emu.grasscutter.net.newproto;

public final class DynamicNodesOuterClass {
  private DynamicNodesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DynamicNodesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DynamicNodes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes> 
        getNodesList();
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes getNodes(int index);
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    int getNodesCount();
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
        getNodesOrBuilderList();
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder getNodesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code DynamicNodes}
   */
  public static final class DynamicNodes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DynamicNodes)
      DynamicNodesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DynamicNodes.newBuilder() to construct.
    private DynamicNodes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DynamicNodes() {
      nodes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DynamicNodes();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DynamicNodesOuterClass.internal_static_DynamicNodes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DynamicNodesOuterClass.internal_static_DynamicNodes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.class, emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.Builder.class);
    }

    public static final int NODES_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes> nodes_;
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes> getNodesList() {
      return nodes_;
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
        getNodesOrBuilderList() {
      return nodes_;
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    @java.lang.Override
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes getNodes(int index) {
      return nodes_.get(index);
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder getNodesOrBuilder(
        int index) {
      return nodes_.get(index);
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
      for (int i = 0; i < nodes_.size(); i++) {
        output.writeMessage(4, nodes_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nodes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, nodes_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes other = (emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes) obj;

      if (!getNodesList()
          .equals(other.getNodesList())) return false;
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
      if (getNodesCount() > 0) {
        hash = (37 * hash) + NODES_FIELD_NUMBER;
        hash = (53 * hash) + getNodesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes prototype) {
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
     * Protobuf type {@code DynamicNodes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DynamicNodes)
        emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DynamicNodesOuterClass.internal_static_DynamicNodes_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DynamicNodesOuterClass.internal_static_DynamicNodes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.class, emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
        } else {
          nodes_ = null;
          nodesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DynamicNodesOuterClass.internal_static_DynamicNodes_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes build() {
        emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes buildPartial() {
        emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes result = new emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes(this);
        int from_bitField0_ = bitField0_;
        if (nodesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nodes_ = java.util.Collections.unmodifiableList(nodes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nodes_ = nodes_;
        } else {
          result.nodes_ = nodesBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes) {
          return mergeFrom((emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes other) {
        if (other == emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance()) return this;
        if (nodesBuilder_ == null) {
          if (!other.nodes_.isEmpty()) {
            if (nodes_.isEmpty()) {
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNodesIsMutable();
              nodes_.addAll(other.nodes_);
            }
            onChanged();
          }
        } else {
          if (!other.nodes_.isEmpty()) {
            if (nodesBuilder_.isEmpty()) {
              nodesBuilder_.dispose();
              nodesBuilder_ = null;
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nodesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNodesFieldBuilder() : null;
            } else {
              nodesBuilder_.addAllMessages(other.nodes_);
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
                emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.parser(),
                        extensionRegistry);
                if (nodesBuilder_ == null) {
                  ensureNodesIsMutable();
                  nodes_.add(m);
                } else {
                  nodesBuilder_.addMessage(m);
                }
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
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes> nodes_ =
        java.util.Collections.emptyList();
      private void ensureNodesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nodes_ = new java.util.ArrayList<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes>(nodes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> nodesBuilder_;

      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes> getNodesList() {
        if (nodesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodes_);
        } else {
          return nodesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public int getNodesCount() {
        if (nodesBuilder_ == null) {
          return nodes_.size();
        } else {
          return nodesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes getNodes(int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);
        } else {
          return nodesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.set(index, value);
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder addNodes(emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(index, value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder addNodes(
          emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder addAllNodes(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes> values) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nodes_);
          onChanged();
        } else {
          nodesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder clearNodes() {
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nodesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public Builder removeNodes(int index) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.remove(index);
          onChanged();
        } else {
          nodesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder getNodesBuilder(
          int index) {
        return getNodesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder getNodesOrBuilder(
          int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);  } else {
          return nodesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
           getNodesOrBuilderList() {
        if (nodesBuilder_ != null) {
          return nodesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodes_);
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder addNodesBuilder() {
        return getNodesFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.getDefaultInstance());
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder addNodesBuilder(
          int index) {
        return getNodesFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.getDefaultInstance());
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder> 
           getNodesBuilderList() {
        return getNodesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
          getNodesFieldBuilder() {
        if (nodesBuilder_ == null) {
          nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder, emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder>(
                  nodes_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nodes_ = null;
        }
        return nodesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DynamicNodes)
    }

    // @@protoc_insertion_point(class_scope:DynamicNodes)
    private static final emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes();
    }

    public static emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DynamicNodes>
        PARSER = new com.google.protobuf.AbstractParser<DynamicNodes>() {
      @java.lang.Override
      public DynamicNodes parsePartialFrom(
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

    public static com.google.protobuf.Parser<DynamicNodes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DynamicNodes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DynamicNodesOuterClass.DynamicNodes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DynamicNodes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DynamicNodes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DynamicNodes.proto\032\027DynamicLayerNodes." +
      "proto\"1\n\014DynamicNodes\022!\n\005nodes\030\004 \003(\0132\022.D" +
      "ynamicLayerNodesB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.getDescriptor(),
        });
    internal_static_DynamicNodes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DynamicNodes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DynamicNodes_descriptor,
        new java.lang.String[] { "Nodes", });
    emu.grasscutter.net.newproto.DynamicLayerNodesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}