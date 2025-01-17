// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterTrainingGallerySettleNotify.proto

package emu.grasscutter.net.newproto;

public final class FungusFighterTrainingGallerySettleNotifyOuterClass {
  private FungusFighterTrainingGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterTrainingGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterTrainingGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The reason.
     */
    emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason getReason();

    /**
     * <code>bool is_final_settle = 2;</code>
     * @return The isFinalSettle.
     */
    boolean getIsFinalSettle();

    /**
     * <code>uint32 total_used_time = 14;</code>
     * @return The totalUsedTime.
     */
    int getTotalUsedTime();

    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 Unk3300_KKFBMHLOLFC = 10;</code>
     * @return The unk3300KKFBMHLOLFC.
     */
    int getUnk3300KKFBMHLOLFC();

    /**
     * <code>uint32 Unk3300_BHOMHPHLOHL = 13;</code>
     * @return The unk3300BHOMHPHLOHL.
     */
    int getUnk3300BHOMHPHLOHL();

    /**
     * <code>uint32 Unk3300_POCDEGBHJEA = 15;</code>
     * @return The unk3300POCDEGBHJEA.
     */
    int getUnk3300POCDEGBHJEA();

    /**
     * <code>uint32 final_score = 5;</code>
     * @return The finalScore.
     */
    int getFinalScore();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 23475;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FungusFighterTrainingGallerySettleNotify}
   */
  public static final class FungusFighterTrainingGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterTrainingGallerySettleNotify)
      FungusFighterTrainingGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterTrainingGallerySettleNotify.newBuilder() to construct.
    private FungusFighterTrainingGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterTrainingGallerySettleNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterTrainingGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.class, emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 3;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
    }

    public static final int IS_FINAL_SETTLE_FIELD_NUMBER = 2;
    private boolean isFinalSettle_;
    /**
     * <code>bool is_final_settle = 2;</code>
     * @return The isFinalSettle.
     */
    @java.lang.Override
    public boolean getIsFinalSettle() {
      return isFinalSettle_;
    }

    public static final int TOTAL_USED_TIME_FIELD_NUMBER = 14;
    private int totalUsedTime_;
    /**
     * <code>uint32 total_used_time = 14;</code>
     * @return The totalUsedTime.
     */
    @java.lang.Override
    public int getTotalUsedTime() {
      return totalUsedTime_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 11;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 11;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int UNK3300_KKFBMHLOLFC_FIELD_NUMBER = 10;
    private int unk3300KKFBMHLOLFC_;
    /**
     * <code>uint32 Unk3300_KKFBMHLOLFC = 10;</code>
     * @return The unk3300KKFBMHLOLFC.
     */
    @java.lang.Override
    public int getUnk3300KKFBMHLOLFC() {
      return unk3300KKFBMHLOLFC_;
    }

    public static final int UNK3300_BHOMHPHLOHL_FIELD_NUMBER = 13;
    private int unk3300BHOMHPHLOHL_;
    /**
     * <code>uint32 Unk3300_BHOMHPHLOHL = 13;</code>
     * @return The unk3300BHOMHPHLOHL.
     */
    @java.lang.Override
    public int getUnk3300BHOMHPHLOHL() {
      return unk3300BHOMHPHLOHL_;
    }

    public static final int UNK3300_POCDEGBHJEA_FIELD_NUMBER = 15;
    private int unk3300POCDEGBHJEA_;
    /**
     * <code>uint32 Unk3300_POCDEGBHJEA = 15;</code>
     * @return The unk3300POCDEGBHJEA.
     */
    @java.lang.Override
    public int getUnk3300POCDEGBHJEA() {
      return unk3300POCDEGBHJEA_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 5;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 5;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
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
      if (isFinalSettle_ != false) {
        output.writeBool(2, isFinalSettle_);
      }
      if (reason_ != emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(3, reason_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(5, finalScore_);
      }
      if (unk3300KKFBMHLOLFC_ != 0) {
        output.writeUInt32(10, unk3300KKFBMHLOLFC_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(11, isNewRecord_);
      }
      if (unk3300BHOMHPHLOHL_ != 0) {
        output.writeUInt32(13, unk3300BHOMHPHLOHL_);
      }
      if (totalUsedTime_ != 0) {
        output.writeUInt32(14, totalUsedTime_);
      }
      if (unk3300POCDEGBHJEA_ != 0) {
        output.writeUInt32(15, unk3300POCDEGBHJEA_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinalSettle_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isFinalSettle_);
      }
      if (reason_ != emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, reason_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, finalScore_);
      }
      if (unk3300KKFBMHLOLFC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300KKFBMHLOLFC_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isNewRecord_);
      }
      if (unk3300BHOMHPHLOHL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300BHOMHPHLOHL_);
      }
      if (totalUsedTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, totalUsedTime_);
      }
      if (unk3300POCDEGBHJEA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3300POCDEGBHJEA_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify other = (emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify) obj;

      if (reason_ != other.reason_) return false;
      if (getIsFinalSettle()
          != other.getIsFinalSettle()) return false;
      if (getTotalUsedTime()
          != other.getTotalUsedTime()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getUnk3300KKFBMHLOLFC()
          != other.getUnk3300KKFBMHLOLFC()) return false;
      if (getUnk3300BHOMHPHLOHL()
          != other.getUnk3300BHOMHPHLOHL()) return false;
      if (getUnk3300POCDEGBHJEA()
          != other.getUnk3300POCDEGBHJEA()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + IS_FINAL_SETTLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinalSettle());
      hash = (37 * hash) + TOTAL_USED_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTotalUsedTime();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + UNK3300_KKFBMHLOLFC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300KKFBMHLOLFC();
      hash = (37 * hash) + UNK3300_BHOMHPHLOHL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300BHOMHPHLOHL();
      hash = (37 * hash) + UNK3300_POCDEGBHJEA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300POCDEGBHJEA();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify prototype) {
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
     *   CMD_ID = 23475;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FungusFighterTrainingGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterTrainingGallerySettleNotify)
        emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.class, emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        isFinalSettle_ = false;

        totalUsedTime_ = 0;

        isNewRecord_ = false;

        unk3300KKFBMHLOLFC_ = 0;

        unk3300BHOMHPHLOHL_ = 0;

        unk3300POCDEGBHJEA_ = 0;

        finalScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify build() {
        emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify buildPartial() {
        emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify result = new emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify(this);
        result.reason_ = reason_;
        result.isFinalSettle_ = isFinalSettle_;
        result.totalUsedTime_ = totalUsedTime_;
        result.isNewRecord_ = isNewRecord_;
        result.unk3300KKFBMHLOLFC_ = unk3300KKFBMHLOLFC_;
        result.unk3300BHOMHPHLOHL_ = unk3300BHOMHPHLOHL_;
        result.unk3300POCDEGBHJEA_ = unk3300POCDEGBHJEA_;
        result.finalScore_ = finalScore_;
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
        if (other instanceof emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify other) {
        if (other == emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getIsFinalSettle() != false) {
          setIsFinalSettle(other.getIsFinalSettle());
        }
        if (other.getTotalUsedTime() != 0) {
          setTotalUsedTime(other.getTotalUsedTime());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getUnk3300KKFBMHLOLFC() != 0) {
          setUnk3300KKFBMHLOLFC(other.getUnk3300KKFBMHLOLFC());
        }
        if (other.getUnk3300BHOMHPHLOHL() != 0) {
          setUnk3300BHOMHPHLOHL(other.getUnk3300BHOMHPHLOHL());
        }
        if (other.getUnk3300POCDEGBHJEA() != 0) {
          setUnk3300POCDEGBHJEA(other.getUnk3300POCDEGBHJEA());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
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
              case 16: {
                isFinalSettle_ = input.readBool();

                break;
              } // case 16
              case 24: {
                reason_ = input.readEnum();

                break;
              } // case 24
              case 40: {
                finalScore_ = input.readUInt32();

                break;
              } // case 40
              case 80: {
                unk3300KKFBMHLOLFC_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                isNewRecord_ = input.readBool();

                break;
              } // case 88
              case 104: {
                unk3300BHOMHPHLOHL_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                totalUsedTime_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                unk3300POCDEGBHJEA_ = input.readUInt32();

                break;
              } // case 120
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

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinalSettle_ ;
      /**
       * <code>bool is_final_settle = 2;</code>
       * @return The isFinalSettle.
       */
      @java.lang.Override
      public boolean getIsFinalSettle() {
        return isFinalSettle_;
      }
      /**
       * <code>bool is_final_settle = 2;</code>
       * @param value The isFinalSettle to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinalSettle(boolean value) {
        
        isFinalSettle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_final_settle = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinalSettle() {
        
        isFinalSettle_ = false;
        onChanged();
        return this;
      }

      private int totalUsedTime_ ;
      /**
       * <code>uint32 total_used_time = 14;</code>
       * @return The totalUsedTime.
       */
      @java.lang.Override
      public int getTotalUsedTime() {
        return totalUsedTime_;
      }
      /**
       * <code>uint32 total_used_time = 14;</code>
       * @param value The totalUsedTime to set.
       * @return This builder for chaining.
       */
      public Builder setTotalUsedTime(int value) {
        
        totalUsedTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_used_time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalUsedTime() {
        
        totalUsedTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 11;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int unk3300KKFBMHLOLFC_ ;
      /**
       * <code>uint32 Unk3300_KKFBMHLOLFC = 10;</code>
       * @return The unk3300KKFBMHLOLFC.
       */
      @java.lang.Override
      public int getUnk3300KKFBMHLOLFC() {
        return unk3300KKFBMHLOLFC_;
      }
      /**
       * <code>uint32 Unk3300_KKFBMHLOLFC = 10;</code>
       * @param value The unk3300KKFBMHLOLFC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KKFBMHLOLFC(int value) {
        
        unk3300KKFBMHLOLFC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_KKFBMHLOLFC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KKFBMHLOLFC() {
        
        unk3300KKFBMHLOLFC_ = 0;
        onChanged();
        return this;
      }

      private int unk3300BHOMHPHLOHL_ ;
      /**
       * <code>uint32 Unk3300_BHOMHPHLOHL = 13;</code>
       * @return The unk3300BHOMHPHLOHL.
       */
      @java.lang.Override
      public int getUnk3300BHOMHPHLOHL() {
        return unk3300BHOMHPHLOHL_;
      }
      /**
       * <code>uint32 Unk3300_BHOMHPHLOHL = 13;</code>
       * @param value The unk3300BHOMHPHLOHL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BHOMHPHLOHL(int value) {
        
        unk3300BHOMHPHLOHL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_BHOMHPHLOHL = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BHOMHPHLOHL() {
        
        unk3300BHOMHPHLOHL_ = 0;
        onChanged();
        return this;
      }

      private int unk3300POCDEGBHJEA_ ;
      /**
       * <code>uint32 Unk3300_POCDEGBHJEA = 15;</code>
       * @return The unk3300POCDEGBHJEA.
       */
      @java.lang.Override
      public int getUnk3300POCDEGBHJEA() {
        return unk3300POCDEGBHJEA_;
      }
      /**
       * <code>uint32 Unk3300_POCDEGBHJEA = 15;</code>
       * @param value The unk3300POCDEGBHJEA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300POCDEGBHJEA(int value) {
        
        unk3300POCDEGBHJEA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_POCDEGBHJEA = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300POCDEGBHJEA() {
        
        unk3300POCDEGBHJEA_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 5;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 5;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterTrainingGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterTrainingGallerySettleNotify)
    private static final emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify();
    }

    public static emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterTrainingGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterTrainingGallerySettleNotify>() {
      @java.lang.Override
      public FungusFighterTrainingGallerySettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusFighterTrainingGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterTrainingGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.FungusFighterTrainingGallerySettleNoti" +
      "fy.proto\032\027GalleryStopReason.proto\"\203\002\n(Fu" +
      "ngusFighterTrainingGallerySettleNotify\022\"" +
      "\n\006reason\030\003 \001(\0162\022.GalleryStopReason\022\027\n\017is" +
      "_final_settle\030\002 \001(\010\022\027\n\017total_used_time\030\016" +
      " \001(\r\022\025\n\ris_new_record\030\013 \001(\010\022\033\n\023Unk3300_K" +
      "KFBMHLOLFC\030\n \001(\r\022\033\n\023Unk3300_BHOMHPHLOHL\030" +
      "\r \001(\r\022\033\n\023Unk3300_POCDEGBHJEA\030\017 \001(\r\022\023\n\013fi" +
      "nal_score\030\005 \001(\rB\036\n\034emu.grasscutter.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.getDescriptor(),
        });
    internal_static_FungusFighterTrainingGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterTrainingGallerySettleNotify_descriptor,
        new java.lang.String[] { "Reason", "IsFinalSettle", "TotalUsedTime", "IsNewRecord", "Unk3300KKFBMHLOLFC", "Unk3300BHOMHPHLOHL", "Unk3300POCDEGBHJEA", "FinalScore", });
    emu.grasscutter.net.newproto.GalleryStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
