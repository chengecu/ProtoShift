// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_LBIDBGLGKCJ.proto

package emu.grasscutter.net.newproto;

public final class Unk2700LBIDBGLGKCJ {
  private Unk2700LBIDBGLGKCJ() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_LBIDBGLGKCJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_LBIDBGLGKCJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_CKLDFNJKMBL = 5;</code>
     * @return The unk3250CKLDFNJKMBL.
     */
    int getUnk3250CKLDFNJKMBL();

    /**
     * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
     * @return The unk3250JGMHPGKOLEP.
     */
    boolean getUnk3250JGMHPGKOLEP();

    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code Unk2700_LBIDBGLGKCJ}
   */
  public static final class Unk2700_LBIDBGLGKCJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_LBIDBGLGKCJ)
      Unk2700_LBIDBGLGKCJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_LBIDBGLGKCJ.newBuilder() to construct.
    private Unk2700_LBIDBGLGKCJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_LBIDBGLGKCJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_LBIDBGLGKCJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.internal_static_Unk2700_LBIDBGLGKCJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.internal_static_Unk2700_LBIDBGLGKCJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.class, emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.Builder.class);
    }

    public static final int UNK3250_CKLDFNJKMBL_FIELD_NUMBER = 5;
    private int unk3250CKLDFNJKMBL_;
    /**
     * <code>uint32 Unk3250_CKLDFNJKMBL = 5;</code>
     * @return The unk3250CKLDFNJKMBL.
     */
    @java.lang.Override
    public int getUnk3250CKLDFNJKMBL() {
      return unk3250CKLDFNJKMBL_;
    }

    public static final int UNK3250_JGMHPGKOLEP_FIELD_NUMBER = 6;
    private boolean unk3250JGMHPGKOLEP_;
    /**
     * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
     * @return The unk3250JGMHPGKOLEP.
     */
    @java.lang.Override
    public boolean getUnk3250JGMHPGKOLEP() {
      return unk3250JGMHPGKOLEP_;
    }

    public static final int ID_FIELD_NUMBER = 14;
    private int id_;
    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (unk3250CKLDFNJKMBL_ != 0) {
        output.writeUInt32(5, unk3250CKLDFNJKMBL_);
      }
      if (unk3250JGMHPGKOLEP_ != false) {
        output.writeBool(6, unk3250JGMHPGKOLEP_);
      }
      if (id_ != 0) {
        output.writeUInt32(14, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250CKLDFNJKMBL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3250CKLDFNJKMBL_);
      }
      if (unk3250JGMHPGKOLEP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, unk3250JGMHPGKOLEP_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, id_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ other = (emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ) obj;

      if (getUnk3250CKLDFNJKMBL()
          != other.getUnk3250CKLDFNJKMBL()) return false;
      if (getUnk3250JGMHPGKOLEP()
          != other.getUnk3250JGMHPGKOLEP()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + UNK3250_CKLDFNJKMBL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250CKLDFNJKMBL();
      hash = (37 * hash) + UNK3250_JGMHPGKOLEP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250JGMHPGKOLEP());
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ prototype) {
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
     * Protobuf type {@code Unk2700_LBIDBGLGKCJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_LBIDBGLGKCJ)
        emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.internal_static_Unk2700_LBIDBGLGKCJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.internal_static_Unk2700_LBIDBGLGKCJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.class, emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250CKLDFNJKMBL_ = 0;

        unk3250JGMHPGKOLEP_ = false;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.internal_static_Unk2700_LBIDBGLGKCJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ build() {
        emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ buildPartial() {
        emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ result = new emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ(this);
        result.unk3250CKLDFNJKMBL_ = unk3250CKLDFNJKMBL_;
        result.unk3250JGMHPGKOLEP_ = unk3250JGMHPGKOLEP_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ other) {
        if (other == emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ.getDefaultInstance()) return this;
        if (other.getUnk3250CKLDFNJKMBL() != 0) {
          setUnk3250CKLDFNJKMBL(other.getUnk3250CKLDFNJKMBL());
        }
        if (other.getUnk3250JGMHPGKOLEP() != false) {
          setUnk3250JGMHPGKOLEP(other.getUnk3250JGMHPGKOLEP());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
              case 40: {
                unk3250CKLDFNJKMBL_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                unk3250JGMHPGKOLEP_ = input.readBool();

                break;
              } // case 48
              case 112: {
                id_ = input.readUInt32();

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

      private int unk3250CKLDFNJKMBL_ ;
      /**
       * <code>uint32 Unk3250_CKLDFNJKMBL = 5;</code>
       * @return The unk3250CKLDFNJKMBL.
       */
      @java.lang.Override
      public int getUnk3250CKLDFNJKMBL() {
        return unk3250CKLDFNJKMBL_;
      }
      /**
       * <code>uint32 Unk3250_CKLDFNJKMBL = 5;</code>
       * @param value The unk3250CKLDFNJKMBL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250CKLDFNJKMBL(int value) {
        
        unk3250CKLDFNJKMBL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_CKLDFNJKMBL = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250CKLDFNJKMBL() {
        
        unk3250CKLDFNJKMBL_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3250JGMHPGKOLEP_ ;
      /**
       * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
       * @return The unk3250JGMHPGKOLEP.
       */
      @java.lang.Override
      public boolean getUnk3250JGMHPGKOLEP() {
        return unk3250JGMHPGKOLEP_;
      }
      /**
       * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
       * @param value The unk3250JGMHPGKOLEP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JGMHPGKOLEP(boolean value) {
        
        unk3250JGMHPGKOLEP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JGMHPGKOLEP() {
        
        unk3250JGMHPGKOLEP_ = false;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 14;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 14;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_LBIDBGLGKCJ)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_LBIDBGLGKCJ)
    private static final emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ();
    }

    public static emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_LBIDBGLGKCJ>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_LBIDBGLGKCJ>() {
      @java.lang.Override
      public Unk2700_LBIDBGLGKCJ parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_LBIDBGLGKCJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_LBIDBGLGKCJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700LBIDBGLGKCJ.Unk2700_LBIDBGLGKCJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_LBIDBGLGKCJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_LBIDBGLGKCJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_LBIDBGLGKCJ.proto\"[\n\023Unk2700_L" +
      "BIDBGLGKCJ\022\033\n\023Unk3250_CKLDFNJKMBL\030\005 \001(\r\022" +
      "\033\n\023Unk3250_JGMHPGKOLEP\030\006 \001(\010\022\n\n\002id\030\016 \001(\r" +
      "B\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_LBIDBGLGKCJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_LBIDBGLGKCJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_LBIDBGLGKCJ_descriptor,
        new java.lang.String[] { "Unk3250CKLDFNJKMBL", "Unk3250JGMHPGKOLEP", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
