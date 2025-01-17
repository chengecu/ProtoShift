// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HuntingOfferData.proto

package emu.grasscutter.net.oldproto;

public final class HuntingOfferDataOuterClass {
  private HuntingOfferDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HuntingOfferDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HuntingOfferData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return Whether the huntingPair field is set.
     */
    boolean hasHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return The huntingPair.
     */
    emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     */
    emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();

    /**
     * <code>uint32 city_id = 8;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>.HuntingOfferState state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.HuntingOfferState state = 1;</code>
     * @return The state.
     */
    emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState getState();
  }
  /**
   * Protobuf type {@code HuntingOfferData}
   */
  public static final class HuntingOfferData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HuntingOfferData)
      HuntingOfferDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HuntingOfferData.newBuilder() to construct.
    private HuntingOfferData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HuntingOfferData() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HuntingOfferData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.class, emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.Builder.class);
    }

    public static final int HUNTING_PAIR_FIELD_NUMBER = 4;
    private emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair huntingPair_;
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return Whether the huntingPair field is set.
     */
    @java.lang.Override
    public boolean hasHuntingPair() {
      return huntingPair_ != null;
    }
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     * @return The huntingPair.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }
    /**
     * <code>.HuntingPair hunting_pair = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
      return getHuntingPair();
    }

    public static final int CITY_ID_FIELD_NUMBER = 8;
    private int cityId_;
    /**
     * <code>uint32 city_id = 8;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>.HuntingOfferState state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.HuntingOfferState state = 1;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState result = emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState.valueOf(state_);
      return result == null ? emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState.UNRECOGNIZED : result;
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
      if (state_ != emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState.HUNTING_OFFER_STATE_NONE.getNumber()) {
        output.writeEnum(1, state_);
      }
      if (huntingPair_ != null) {
        output.writeMessage(4, getHuntingPair());
      }
      if (cityId_ != 0) {
        output.writeUInt32(8, cityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState.HUNTING_OFFER_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, state_);
      }
      if (huntingPair_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getHuntingPair());
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData other = (emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData) obj;

      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHuntingPair())) return false;
      }
      if (getCityId()
          != other.getCityId()) return false;
      if (state_ != other.state_) return false;
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
      if (hasHuntingPair()) {
        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData prototype) {
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
     * Protobuf type {@code HuntingOfferData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HuntingOfferData)
        emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.class, emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }
        cityId_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData build() {
        emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData buildPartial() {
        emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData result = new emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData(this);
        if (huntingPairBuilder_ == null) {
          result.huntingPair_ = huntingPair_;
        } else {
          result.huntingPair_ = huntingPairBuilder_.build();
        }
        result.cityId_ = cityId_;
        result.state_ = state_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData) {
          return mergeFrom((emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData other) {
        if (other == emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData.getDefaultInstance()) return this;
        if (other.hasHuntingPair()) {
          mergeHuntingPair(other.getHuntingPair());
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
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
                state_ = input.readEnum();

                break;
              } // case 8
              case 34: {
                input.readMessage(
                    getHuntingPairFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 34
              case 64: {
                cityId_ = input.readUInt32();

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

      private emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       * @return Whether the huntingPair field is set.
       */
      public boolean hasHuntingPair() {
        return huntingPairBuilder_ != null || huntingPair_ != null;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       * @return The huntingPair.
       */
      public emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntingPair_ == null ? emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntingPairBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder setHuntingPair(emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder setHuntingPair(
          emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = builderForValue.build();
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder mergeHuntingPair(emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (huntingPair_ != null) {
            huntingPair_ =
              emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.newBuilder(huntingPair_).mergeFrom(value).buildPartial();
          } else {
            huntingPair_ = value;
          }
          onChanged();
        } else {
          huntingPairBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public Builder clearHuntingPair() {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
          onChanged();
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      public emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
        if (huntingPairBuilder_ != null) {
          return huntingPairBuilder_.getMessageOrBuilder();
        } else {
          return huntingPair_ == null ?
              emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean());
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 8;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 8;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.HuntingOfferState state = 1;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.HuntingOfferState state = 1;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingOfferState state = 1;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState result = emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState.valueOf(state_);
        return result == null ? emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState.UNRECOGNIZED : result;
      }
      /**
       * <code>.HuntingOfferState state = 1;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.HuntingOfferState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingOfferState state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HuntingOfferData)
    }

    // @@protoc_insertion_point(class_scope:HuntingOfferData)
    private static final emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData();
    }

    public static emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HuntingOfferData>
        PARSER = new com.google.protobuf.AbstractParser<HuntingOfferData>() {
      @java.lang.Override
      public HuntingOfferData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HuntingOfferData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HuntingOfferData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HuntingOfferDataOuterClass.HuntingOfferData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HuntingOfferData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HuntingOfferData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HuntingOfferData.proto\032\027HuntingOfferSt" +
      "ate.proto\032\021HuntingPair.proto\"j\n\020HuntingO" +
      "fferData\022\"\n\014hunting_pair\030\004 \001(\0132\014.Hunting" +
      "Pair\022\017\n\007city_id\030\010 \001(\r\022!\n\005state\030\001 \001(\0162\022.H" +
      "untingOfferStateB\036\n\034emu.grasscutter.net." +
      "oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.getDescriptor(),
          emu.grasscutter.net.oldproto.HuntingPairOuterClass.getDescriptor(),
        });
    internal_static_HuntingOfferData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HuntingOfferData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HuntingOfferData_descriptor,
        new java.lang.String[] { "HuntingPair", "CityId", "State", });
    emu.grasscutter.net.oldproto.HuntingOfferStateOuterClass.getDescriptor();
    emu.grasscutter.net.oldproto.HuntingPairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
