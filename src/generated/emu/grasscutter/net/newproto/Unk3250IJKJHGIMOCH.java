// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_IJKJHGIMOCH.proto

package emu.grasscutter.net.newproto;

public final class Unk3250IJKJHGIMOCH {
  private Unk3250IJKJHGIMOCH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_IJKJHGIMOCHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_IJKJHGIMOCH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_IINBPJAHCGA = 7;</code>
     * @return The unk3250IINBPJAHCGA.
     */
    int getUnk3250IINBPJAHCGA();

    /**
     * <code>uint32 Unk3250_ILFONNMPIMI = 4;</code>
     * @return The unk3250ILFONNMPIMI.
     */
    int getUnk3250ILFONNMPIMI();

    /**
     * <code>uint32 Unk3250_GAIAJKMNFDD = 12;</code>
     * @return The unk3250GAIAJKMNFDD.
     */
    int getUnk3250GAIAJKMNFDD();

    /**
     * <code>uint32 score = 8;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * Protobuf type {@code Unk3250_IJKJHGIMOCH}
   */
  public static final class Unk3250_IJKJHGIMOCH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_IJKJHGIMOCH)
      Unk3250_IJKJHGIMOCHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_IJKJHGIMOCH.newBuilder() to construct.
    private Unk3250_IJKJHGIMOCH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_IJKJHGIMOCH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_IJKJHGIMOCH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.internal_static_Unk3250_IJKJHGIMOCH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.internal_static_Unk3250_IJKJHGIMOCH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.class, emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.Builder.class);
    }

    public static final int UNK3250_IINBPJAHCGA_FIELD_NUMBER = 7;
    private int unk3250IINBPJAHCGA_;
    /**
     * <code>uint32 Unk3250_IINBPJAHCGA = 7;</code>
     * @return The unk3250IINBPJAHCGA.
     */
    @java.lang.Override
    public int getUnk3250IINBPJAHCGA() {
      return unk3250IINBPJAHCGA_;
    }

    public static final int UNK3250_ILFONNMPIMI_FIELD_NUMBER = 4;
    private int unk3250ILFONNMPIMI_;
    /**
     * <code>uint32 Unk3250_ILFONNMPIMI = 4;</code>
     * @return The unk3250ILFONNMPIMI.
     */
    @java.lang.Override
    public int getUnk3250ILFONNMPIMI() {
      return unk3250ILFONNMPIMI_;
    }

    public static final int UNK3250_GAIAJKMNFDD_FIELD_NUMBER = 12;
    private int unk3250GAIAJKMNFDD_;
    /**
     * <code>uint32 Unk3250_GAIAJKMNFDD = 12;</code>
     * @return The unk3250GAIAJKMNFDD.
     */
    @java.lang.Override
    public int getUnk3250GAIAJKMNFDD() {
      return unk3250GAIAJKMNFDD_;
    }

    public static final int SCORE_FIELD_NUMBER = 8;
    private int score_;
    /**
     * <code>uint32 score = 8;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (unk3250ILFONNMPIMI_ != 0) {
        output.writeUInt32(4, unk3250ILFONNMPIMI_);
      }
      if (unk3250IINBPJAHCGA_ != 0) {
        output.writeUInt32(7, unk3250IINBPJAHCGA_);
      }
      if (score_ != 0) {
        output.writeUInt32(8, score_);
      }
      if (unk3250GAIAJKMNFDD_ != 0) {
        output.writeUInt32(12, unk3250GAIAJKMNFDD_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250ILFONNMPIMI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3250ILFONNMPIMI_);
      }
      if (unk3250IINBPJAHCGA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3250IINBPJAHCGA_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, score_);
      }
      if (unk3250GAIAJKMNFDD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3250GAIAJKMNFDD_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH other = (emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH) obj;

      if (getUnk3250IINBPJAHCGA()
          != other.getUnk3250IINBPJAHCGA()) return false;
      if (getUnk3250ILFONNMPIMI()
          != other.getUnk3250ILFONNMPIMI()) return false;
      if (getUnk3250GAIAJKMNFDD()
          != other.getUnk3250GAIAJKMNFDD()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + UNK3250_IINBPJAHCGA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250IINBPJAHCGA();
      hash = (37 * hash) + UNK3250_ILFONNMPIMI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250ILFONNMPIMI();
      hash = (37 * hash) + UNK3250_GAIAJKMNFDD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250GAIAJKMNFDD();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH prototype) {
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
     * Protobuf type {@code Unk3250_IJKJHGIMOCH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_IJKJHGIMOCH)
        emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.internal_static_Unk3250_IJKJHGIMOCH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.internal_static_Unk3250_IJKJHGIMOCH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.class, emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250IINBPJAHCGA_ = 0;

        unk3250ILFONNMPIMI_ = 0;

        unk3250GAIAJKMNFDD_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.internal_static_Unk3250_IJKJHGIMOCH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH build() {
        emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH buildPartial() {
        emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH result = new emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH(this);
        result.unk3250IINBPJAHCGA_ = unk3250IINBPJAHCGA_;
        result.unk3250ILFONNMPIMI_ = unk3250ILFONNMPIMI_;
        result.unk3250GAIAJKMNFDD_ = unk3250GAIAJKMNFDD_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH other) {
        if (other == emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH.getDefaultInstance()) return this;
        if (other.getUnk3250IINBPJAHCGA() != 0) {
          setUnk3250IINBPJAHCGA(other.getUnk3250IINBPJAHCGA());
        }
        if (other.getUnk3250ILFONNMPIMI() != 0) {
          setUnk3250ILFONNMPIMI(other.getUnk3250ILFONNMPIMI());
        }
        if (other.getUnk3250GAIAJKMNFDD() != 0) {
          setUnk3250GAIAJKMNFDD(other.getUnk3250GAIAJKMNFDD());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
              case 32: {
                unk3250ILFONNMPIMI_ = input.readUInt32();

                break;
              } // case 32
              case 56: {
                unk3250IINBPJAHCGA_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                score_ = input.readUInt32();

                break;
              } // case 64
              case 96: {
                unk3250GAIAJKMNFDD_ = input.readUInt32();

                break;
              } // case 96
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

      private int unk3250IINBPJAHCGA_ ;
      /**
       * <code>uint32 Unk3250_IINBPJAHCGA = 7;</code>
       * @return The unk3250IINBPJAHCGA.
       */
      @java.lang.Override
      public int getUnk3250IINBPJAHCGA() {
        return unk3250IINBPJAHCGA_;
      }
      /**
       * <code>uint32 Unk3250_IINBPJAHCGA = 7;</code>
       * @param value The unk3250IINBPJAHCGA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IINBPJAHCGA(int value) {
        
        unk3250IINBPJAHCGA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_IINBPJAHCGA = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IINBPJAHCGA() {
        
        unk3250IINBPJAHCGA_ = 0;
        onChanged();
        return this;
      }

      private int unk3250ILFONNMPIMI_ ;
      /**
       * <code>uint32 Unk3250_ILFONNMPIMI = 4;</code>
       * @return The unk3250ILFONNMPIMI.
       */
      @java.lang.Override
      public int getUnk3250ILFONNMPIMI() {
        return unk3250ILFONNMPIMI_;
      }
      /**
       * <code>uint32 Unk3250_ILFONNMPIMI = 4;</code>
       * @param value The unk3250ILFONNMPIMI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250ILFONNMPIMI(int value) {
        
        unk3250ILFONNMPIMI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_ILFONNMPIMI = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250ILFONNMPIMI() {
        
        unk3250ILFONNMPIMI_ = 0;
        onChanged();
        return this;
      }

      private int unk3250GAIAJKMNFDD_ ;
      /**
       * <code>uint32 Unk3250_GAIAJKMNFDD = 12;</code>
       * @return The unk3250GAIAJKMNFDD.
       */
      @java.lang.Override
      public int getUnk3250GAIAJKMNFDD() {
        return unk3250GAIAJKMNFDD_;
      }
      /**
       * <code>uint32 Unk3250_GAIAJKMNFDD = 12;</code>
       * @param value The unk3250GAIAJKMNFDD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250GAIAJKMNFDD(int value) {
        
        unk3250GAIAJKMNFDD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_GAIAJKMNFDD = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250GAIAJKMNFDD() {
        
        unk3250GAIAJKMNFDD_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 8;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 8;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_IJKJHGIMOCH)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_IJKJHGIMOCH)
    private static final emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH();
    }

    public static emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_IJKJHGIMOCH>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_IJKJHGIMOCH>() {
      @java.lang.Override
      public Unk3250_IJKJHGIMOCH parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_IJKJHGIMOCH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_IJKJHGIMOCH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250IJKJHGIMOCH.Unk3250_IJKJHGIMOCH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_IJKJHGIMOCH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_IJKJHGIMOCH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_IJKJHGIMOCH.proto\"{\n\023Unk3250_I" +
      "JKJHGIMOCH\022\033\n\023Unk3250_IINBPJAHCGA\030\007 \001(\r\022" +
      "\033\n\023Unk3250_ILFONNMPIMI\030\004 \001(\r\022\033\n\023Unk3250_" +
      "GAIAJKMNFDD\030\014 \001(\r\022\r\n\005score\030\010 \001(\rB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_IJKJHGIMOCH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_IJKJHGIMOCH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_IJKJHGIMOCH_descriptor,
        new java.lang.String[] { "Unk3250IINBPJAHCGA", "Unk3250ILFONNMPIMI", "Unk3250GAIAJKMNFDD", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}