// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Achievement.proto

package emu.grasscutter.net.oldproto;

public final class AchievementOuterClass {
  private AchievementOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AchievementOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Achievement)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finish_timestamp = 11;</code>
     * @return The finishTimestamp.
     */
    int getFinishTimestamp();

    /**
     * <code>.Achievement.Status status = 13;</code>
     * @return The enum numeric value on the wire for status.
     */
    int getStatusValue();
    /**
     * <code>.Achievement.Status status = 13;</code>
     * @return The status.
     */
    emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status getStatus();

    /**
     * <code>uint32 cur_progress = 12;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 total_progress = 8;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();
  }
  /**
   * Protobuf type {@code Achievement}
   */
  public static final class Achievement extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Achievement)
      AchievementOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Achievement.newBuilder() to construct.
    private Achievement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Achievement() {
      status_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Achievement();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AchievementOuterClass.internal_static_Achievement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AchievementOuterClass.internal_static_Achievement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.class, emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Builder.class);
    }

    /**
     * Protobuf enum {@code Achievement.Status}
     */
    public enum Status
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATUS_INVALID = 0;</code>
       */
      STATUS_INVALID(0),
      /**
       * <code>STATUS_UNFINISHED = 1;</code>
       */
      STATUS_UNFINISHED(1),
      /**
       * <code>STATUS_FINISHED = 2;</code>
       */
      STATUS_FINISHED(2),
      /**
       * <code>STATUS_REWARD_TAKEN = 3;</code>
       */
      STATUS_REWARD_TAKEN(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATUS_INVALID = 0;</code>
       */
      public static final int STATUS_INVALID_VALUE = 0;
      /**
       * <code>STATUS_UNFINISHED = 1;</code>
       */
      public static final int STATUS_UNFINISHED_VALUE = 1;
      /**
       * <code>STATUS_FINISHED = 2;</code>
       */
      public static final int STATUS_FINISHED_VALUE = 2;
      /**
       * <code>STATUS_REWARD_TAKEN = 3;</code>
       */
      public static final int STATUS_REWARD_TAKEN_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Status valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Status forNumber(int value) {
        switch (value) {
          case 0: return STATUS_INVALID;
          case 1: return STATUS_UNFINISHED;
          case 2: return STATUS_FINISHED;
          case 3: return STATUS_REWARD_TAKEN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Status> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Status>() {
              public Status findValueByNumber(int number) {
                return Status.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.getDescriptor().getEnumTypes().get(0);
      }

      private static final Status[] VALUES = values();

      public static Status valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Status(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Achievement.Status)
    }

    public static final int FINISH_TIMESTAMP_FIELD_NUMBER = 11;
    private int finishTimestamp_;
    /**
     * <code>uint32 finish_timestamp = 11;</code>
     * @return The finishTimestamp.
     */
    @java.lang.Override
    public int getFinishTimestamp() {
      return finishTimestamp_;
    }

    public static final int STATUS_FIELD_NUMBER = 13;
    private int status_;
    /**
     * <code>.Achievement.Status status = 13;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.Achievement.Status status = 13;</code>
     * @return The status.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status getStatus() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status result = emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status.valueOf(status_);
      return result == null ? emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status.UNRECOGNIZED : result;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 12;
    private int curProgress_;
    /**
     * <code>uint32 cur_progress = 12;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
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

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 8;
    private int totalProgress_;
    /**
     * <code>uint32 total_progress = 8;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
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
      if (totalProgress_ != 0) {
        output.writeUInt32(8, totalProgress_);
      }
      if (finishTimestamp_ != 0) {
        output.writeUInt32(11, finishTimestamp_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(12, curProgress_);
      }
      if (status_ != emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status.STATUS_INVALID.getNumber()) {
        output.writeEnum(13, status_);
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
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, totalProgress_);
      }
      if (finishTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, finishTimestamp_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, curProgress_);
      }
      if (status_ != emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status.STATUS_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, status_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement other = (emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement) obj;

      if (getFinishTimestamp()
          != other.getFinishTimestamp()) return false;
      if (status_ != other.status_) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getId()
          != other.getId()) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
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
      hash = (37 * hash) + FINISH_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTimestamp();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement prototype) {
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
     * Protobuf type {@code Achievement}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Achievement)
        emu.grasscutter.net.oldproto.AchievementOuterClass.AchievementOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AchievementOuterClass.internal_static_Achievement_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AchievementOuterClass.internal_static_Achievement_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.class, emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishTimestamp_ = 0;

        status_ = 0;

        curProgress_ = 0;

        id_ = 0;

        totalProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AchievementOuterClass.internal_static_Achievement_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement build() {
        emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement buildPartial() {
        emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement result = new emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement(this);
        result.finishTimestamp_ = finishTimestamp_;
        result.status_ = status_;
        result.curProgress_ = curProgress_;
        result.id_ = id_;
        result.totalProgress_ = totalProgress_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement) {
          return mergeFrom((emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement other) {
        if (other == emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.getDefaultInstance()) return this;
        if (other.getFinishTimestamp() != 0) {
          setFinishTimestamp(other.getFinishTimestamp());
        }
        if (other.status_ != 0) {
          setStatusValue(other.getStatusValue());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
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
              case 64: {
                totalProgress_ = input.readUInt32();

                break;
              } // case 64
              case 88: {
                finishTimestamp_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                curProgress_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                status_ = input.readEnum();

                break;
              } // case 104
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

      private int finishTimestamp_ ;
      /**
       * <code>uint32 finish_timestamp = 11;</code>
       * @return The finishTimestamp.
       */
      @java.lang.Override
      public int getFinishTimestamp() {
        return finishTimestamp_;
      }
      /**
       * <code>uint32 finish_timestamp = 11;</code>
       * @param value The finishTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTimestamp(int value) {
        
        finishTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_timestamp = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTimestamp() {
        
        finishTimestamp_ = 0;
        onChanged();
        return this;
      }

      private int status_ = 0;
      /**
       * <code>.Achievement.Status status = 13;</code>
       * @return The enum numeric value on the wire for status.
       */
      @java.lang.Override public int getStatusValue() {
        return status_;
      }
      /**
       * <code>.Achievement.Status status = 13;</code>
       * @param value The enum numeric value on the wire for status to set.
       * @return This builder for chaining.
       */
      public Builder setStatusValue(int value) {
        
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Achievement.Status status = 13;</code>
       * @return The status.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status getStatus() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status result = emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status.valueOf(status_);
        return result == null ? emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status.UNRECOGNIZED : result;
      }
      /**
       * <code>.Achievement.Status status = 13;</code>
       * @param value The status to set.
       * @return This builder for chaining.
       */
      public Builder setStatus(emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        status_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Achievement.Status status = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStatus() {
        
        status_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 12;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 12;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        
        curProgress_ = 0;
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

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 8;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 8;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Achievement)
    }

    // @@protoc_insertion_point(class_scope:Achievement)
    private static final emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement();
    }

    public static emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Achievement>
        PARSER = new com.google.protobuf.AbstractParser<Achievement>() {
      @java.lang.Override
      public Achievement parsePartialFrom(
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

    public static com.google.protobuf.Parser<Achievement> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Achievement> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AchievementOuterClass.Achievement getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Achievement_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Achievement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021Achievement.proto\"\351\001\n\013Achievement\022\030\n\020f" +
      "inish_timestamp\030\013 \001(\r\022#\n\006status\030\r \001(\0162\023." +
      "Achievement.Status\022\024\n\014cur_progress\030\014 \001(\r" +
      "\022\n\n\002id\030\016 \001(\r\022\026\n\016total_progress\030\010 \001(\r\"a\n\006" +
      "Status\022\022\n\016STATUS_INVALID\020\000\022\025\n\021STATUS_UNF" +
      "INISHED\020\001\022\023\n\017STATUS_FINISHED\020\002\022\027\n\023STATUS" +
      "_REWARD_TAKEN\020\003B\036\n\034emu.grasscutter.net.o" +
      "ldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Achievement_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Achievement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Achievement_descriptor,
        new java.lang.String[] { "FinishTimestamp", "Status", "CurProgress", "Id", "TotalProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
