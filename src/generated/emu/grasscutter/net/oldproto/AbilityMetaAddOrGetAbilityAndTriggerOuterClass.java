// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaAddOrGetAbilityAndTrigger.proto

package emu.grasscutter.net.oldproto;

public final class AbilityMetaAddOrGetAbilityAndTriggerOuterClass {
  private AbilityMetaAddOrGetAbilityAndTriggerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaAddOrGetAbilityAndTriggerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaAddOrGetAbilityAndTrigger)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilityString ability_name = 13;</code>
     * @return Whether the abilityName field is set.
     */
    boolean hasAbilityName();
    /**
     * <code>.AbilityString ability_name = 13;</code>
     * @return The abilityName.
     */
    emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString getAbilityName();
    /**
     * <code>.AbilityString ability_name = 13;</code>
     */
    emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder();

    /**
     * <code>float trigger_argument = 3;</code>
     * @return The triggerArgument.
     */
    float getTriggerArgument();

    /**
     * <code>.AbilityString ability_override = 8;</code>
     * @return Whether the abilityOverride field is set.
     */
    boolean hasAbilityOverride();
    /**
     * <code>.AbilityString ability_override = 8;</code>
     * @return The abilityOverride.
     */
    emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString getAbilityOverride();
    /**
     * <code>.AbilityString ability_override = 8;</code>
     */
    emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder();
  }
  /**
   * Protobuf type {@code AbilityMetaAddOrGetAbilityAndTrigger}
   */
  public static final class AbilityMetaAddOrGetAbilityAndTrigger extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaAddOrGetAbilityAndTrigger)
      AbilityMetaAddOrGetAbilityAndTriggerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaAddOrGetAbilityAndTrigger.newBuilder() to construct.
    private AbilityMetaAddOrGetAbilityAndTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaAddOrGetAbilityAndTrigger() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaAddOrGetAbilityAndTrigger();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.internal_static_AbilityMetaAddOrGetAbilityAndTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.internal_static_AbilityMetaAddOrGetAbilityAndTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.class, emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.Builder.class);
    }

    public static final int ABILITY_NAME_FIELD_NUMBER = 13;
    private emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString abilityName_;
    /**
     * <code>.AbilityString ability_name = 13;</code>
     * @return Whether the abilityName field is set.
     */
    @java.lang.Override
    public boolean hasAbilityName() {
      return abilityName_ != null;
    }
    /**
     * <code>.AbilityString ability_name = 13;</code>
     * @return The abilityName.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString getAbilityName() {
      return abilityName_ == null ? emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
    }
    /**
     * <code>.AbilityString ability_name = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
      return getAbilityName();
    }

    public static final int TRIGGER_ARGUMENT_FIELD_NUMBER = 3;
    private float triggerArgument_;
    /**
     * <code>float trigger_argument = 3;</code>
     * @return The triggerArgument.
     */
    @java.lang.Override
    public float getTriggerArgument() {
      return triggerArgument_;
    }

    public static final int ABILITY_OVERRIDE_FIELD_NUMBER = 8;
    private emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString abilityOverride_;
    /**
     * <code>.AbilityString ability_override = 8;</code>
     * @return Whether the abilityOverride field is set.
     */
    @java.lang.Override
    public boolean hasAbilityOverride() {
      return abilityOverride_ != null;
    }
    /**
     * <code>.AbilityString ability_override = 8;</code>
     * @return The abilityOverride.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString getAbilityOverride() {
      return abilityOverride_ == null ? emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityOverride_;
    }
    /**
     * <code>.AbilityString ability_override = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder() {
      return getAbilityOverride();
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
      if (java.lang.Float.floatToRawIntBits(triggerArgument_) != 0) {
        output.writeFloat(3, triggerArgument_);
      }
      if (abilityOverride_ != null) {
        output.writeMessage(8, getAbilityOverride());
      }
      if (abilityName_ != null) {
        output.writeMessage(13, getAbilityName());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(triggerArgument_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, triggerArgument_);
      }
      if (abilityOverride_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getAbilityOverride());
      }
      if (abilityName_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getAbilityName());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger other = (emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger) obj;

      if (hasAbilityName() != other.hasAbilityName()) return false;
      if (hasAbilityName()) {
        if (!getAbilityName()
            .equals(other.getAbilityName())) return false;
      }
      if (java.lang.Float.floatToIntBits(getTriggerArgument())
          != java.lang.Float.floatToIntBits(
              other.getTriggerArgument())) return false;
      if (hasAbilityOverride() != other.hasAbilityOverride()) return false;
      if (hasAbilityOverride()) {
        if (!getAbilityOverride()
            .equals(other.getAbilityOverride())) return false;
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
      if (hasAbilityName()) {
        hash = (37 * hash) + ABILITY_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityName().hashCode();
      }
      hash = (37 * hash) + TRIGGER_ARGUMENT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getTriggerArgument());
      if (hasAbilityOverride()) {
        hash = (37 * hash) + ABILITY_OVERRIDE_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityOverride().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger prototype) {
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
     * Protobuf type {@code AbilityMetaAddOrGetAbilityAndTrigger}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaAddOrGetAbilityAndTrigger)
        emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTriggerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.internal_static_AbilityMetaAddOrGetAbilityAndTrigger_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.internal_static_AbilityMetaAddOrGetAbilityAndTrigger_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.class, emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (abilityNameBuilder_ == null) {
          abilityName_ = null;
        } else {
          abilityName_ = null;
          abilityNameBuilder_ = null;
        }
        triggerArgument_ = 0F;

        if (abilityOverrideBuilder_ == null) {
          abilityOverride_ = null;
        } else {
          abilityOverride_ = null;
          abilityOverrideBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.internal_static_AbilityMetaAddOrGetAbilityAndTrigger_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger build() {
        emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger buildPartial() {
        emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger result = new emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger(this);
        if (abilityNameBuilder_ == null) {
          result.abilityName_ = abilityName_;
        } else {
          result.abilityName_ = abilityNameBuilder_.build();
        }
        result.triggerArgument_ = triggerArgument_;
        if (abilityOverrideBuilder_ == null) {
          result.abilityOverride_ = abilityOverride_;
        } else {
          result.abilityOverride_ = abilityOverrideBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger) {
          return mergeFrom((emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger other) {
        if (other == emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger.getDefaultInstance()) return this;
        if (other.hasAbilityName()) {
          mergeAbilityName(other.getAbilityName());
        }
        if (other.getTriggerArgument() != 0F) {
          setTriggerArgument(other.getTriggerArgument());
        }
        if (other.hasAbilityOverride()) {
          mergeAbilityOverride(other.getAbilityOverride());
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
              case 29: {
                triggerArgument_ = input.readFloat();

                break;
              } // case 29
              case 66: {
                input.readMessage(
                    getAbilityOverrideFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 66
              case 106: {
                input.readMessage(
                    getAbilityNameFieldBuilder().getBuilder(),
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

      private emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString abilityName_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder> abilityNameBuilder_;
      /**
       * <code>.AbilityString ability_name = 13;</code>
       * @return Whether the abilityName field is set.
       */
      public boolean hasAbilityName() {
        return abilityNameBuilder_ != null || abilityName_ != null;
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       * @return The abilityName.
       */
      public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString getAbilityName() {
        if (abilityNameBuilder_ == null) {
          return abilityName_ == null ? emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
        } else {
          return abilityNameBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      public Builder setAbilityName(emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString value) {
        if (abilityNameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityName_ = value;
          onChanged();
        } else {
          abilityNameBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      public Builder setAbilityName(
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (abilityNameBuilder_ == null) {
          abilityName_ = builderForValue.build();
          onChanged();
        } else {
          abilityNameBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      public Builder mergeAbilityName(emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString value) {
        if (abilityNameBuilder_ == null) {
          if (abilityName_ != null) {
            abilityName_ =
              emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.newBuilder(abilityName_).mergeFrom(value).buildPartial();
          } else {
            abilityName_ = value;
          }
          onChanged();
        } else {
          abilityNameBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      public Builder clearAbilityName() {
        if (abilityNameBuilder_ == null) {
          abilityName_ = null;
          onChanged();
        } else {
          abilityName_ = null;
          abilityNameBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder getAbilityNameBuilder() {
        
        onChanged();
        return getAbilityNameFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
        if (abilityNameBuilder_ != null) {
          return abilityNameBuilder_.getMessageOrBuilder();
        } else {
          return abilityName_ == null ?
              emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
        }
      }
      /**
       * <code>.AbilityString ability_name = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getAbilityNameFieldBuilder() {
        if (abilityNameBuilder_ == null) {
          abilityNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getAbilityName(),
                  getParentForChildren(),
                  isClean());
          abilityName_ = null;
        }
        return abilityNameBuilder_;
      }

      private float triggerArgument_ ;
      /**
       * <code>float trigger_argument = 3;</code>
       * @return The triggerArgument.
       */
      @java.lang.Override
      public float getTriggerArgument() {
        return triggerArgument_;
      }
      /**
       * <code>float trigger_argument = 3;</code>
       * @param value The triggerArgument to set.
       * @return This builder for chaining.
       */
      public Builder setTriggerArgument(float value) {
        
        triggerArgument_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float trigger_argument = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTriggerArgument() {
        
        triggerArgument_ = 0F;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString abilityOverride_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder> abilityOverrideBuilder_;
      /**
       * <code>.AbilityString ability_override = 8;</code>
       * @return Whether the abilityOverride field is set.
       */
      public boolean hasAbilityOverride() {
        return abilityOverrideBuilder_ != null || abilityOverride_ != null;
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       * @return The abilityOverride.
       */
      public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString getAbilityOverride() {
        if (abilityOverrideBuilder_ == null) {
          return abilityOverride_ == null ? emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityOverride_;
        } else {
          return abilityOverrideBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      public Builder setAbilityOverride(emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString value) {
        if (abilityOverrideBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityOverride_ = value;
          onChanged();
        } else {
          abilityOverrideBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      public Builder setAbilityOverride(
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (abilityOverrideBuilder_ == null) {
          abilityOverride_ = builderForValue.build();
          onChanged();
        } else {
          abilityOverrideBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      public Builder mergeAbilityOverride(emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString value) {
        if (abilityOverrideBuilder_ == null) {
          if (abilityOverride_ != null) {
            abilityOverride_ =
              emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.newBuilder(abilityOverride_).mergeFrom(value).buildPartial();
          } else {
            abilityOverride_ = value;
          }
          onChanged();
        } else {
          abilityOverrideBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      public Builder clearAbilityOverride() {
        if (abilityOverrideBuilder_ == null) {
          abilityOverride_ = null;
          onChanged();
        } else {
          abilityOverride_ = null;
          abilityOverrideBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder getAbilityOverrideBuilder() {
        
        onChanged();
        return getAbilityOverrideFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      public emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder() {
        if (abilityOverrideBuilder_ != null) {
          return abilityOverrideBuilder_.getMessageOrBuilder();
        } else {
          return abilityOverride_ == null ?
              emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityOverride_;
        }
      }
      /**
       * <code>.AbilityString ability_override = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getAbilityOverrideFieldBuilder() {
        if (abilityOverrideBuilder_ == null) {
          abilityOverrideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getAbilityOverride(),
                  getParentForChildren(),
                  isClean());
          abilityOverride_ = null;
        }
        return abilityOverrideBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaAddOrGetAbilityAndTrigger)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaAddOrGetAbilityAndTrigger)
    private static final emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger();
    }

    public static emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaAddOrGetAbilityAndTrigger>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaAddOrGetAbilityAndTrigger>() {
      @java.lang.Override
      public AbilityMetaAddOrGetAbilityAndTrigger parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMetaAddOrGetAbilityAndTrigger> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaAddOrGetAbilityAndTrigger> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityMetaAddOrGetAbilityAndTriggerOuterClass.AbilityMetaAddOrGetAbilityAndTrigger getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaAddOrGetAbilityAndTrigger_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaAddOrGetAbilityAndTrigger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*AbilityMetaAddOrGetAbilityAndTrigger.p" +
      "roto\032\023AbilityString.proto\"\220\001\n$AbilityMet" +
      "aAddOrGetAbilityAndTrigger\022$\n\014ability_na" +
      "me\030\r \001(\0132\016.AbilityString\022\030\n\020trigger_argu" +
      "ment\030\003 \001(\002\022(\n\020ability_override\030\010 \001(\0132\016.A" +
      "bilityStringB\036\n\034emu.grasscutter.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.AbilityStringOuterClass.getDescriptor(),
        });
    internal_static_AbilityMetaAddOrGetAbilityAndTrigger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaAddOrGetAbilityAndTrigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaAddOrGetAbilityAndTrigger_descriptor,
        new java.lang.String[] { "AbilityName", "TriggerArgument", "AbilityOverride", });
    emu.grasscutter.net.oldproto.AbilityStringOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
