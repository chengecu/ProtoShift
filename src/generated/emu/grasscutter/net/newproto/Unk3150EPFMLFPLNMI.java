// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_EPFMLFPLNMI.proto

package emu.grasscutter.net.newproto;

public final class Unk3150EPFMLFPLNMI {
  private Unk3150EPFMLFPLNMI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_EPFMLFPLNMIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_EPFMLFPLNMI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP> 
        getChallengeInfoListList();
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP getChallengeInfoList(int index);
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    int getChallengeInfoListCount();
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder> 
        getChallengeInfoListOrBuilderList();
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder getChallengeInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 next_refresh_time = 5;</code>
     * @return The nextRefreshTime.
     */
    int getNextRefreshTime();

    /**
     * <code>bool Unk3250_CCKACMNNCHC = 1;</code>
     * @return The unk3250CCKACMNNCHC.
     */
    boolean getUnk3250CCKACMNNCHC();
  }
  /**
   * <pre>
   * CmdId: 7120
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_EPFMLFPLNMI}
   */
  public static final class Unk3150_EPFMLFPLNMI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_EPFMLFPLNMI)
      Unk3150_EPFMLFPLNMIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_EPFMLFPLNMI.newBuilder() to construct.
    private Unk3150_EPFMLFPLNMI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_EPFMLFPLNMI() {
      challengeInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_EPFMLFPLNMI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.internal_static_Unk3150_EPFMLFPLNMI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.internal_static_Unk3150_EPFMLFPLNMI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.class, emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.Builder.class);
    }

    public static final int CHALLENGE_INFO_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP> challengeInfoList_;
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP> getChallengeInfoListList() {
      return challengeInfoList_;
    }
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder> 
        getChallengeInfoListOrBuilderList() {
      return challengeInfoList_;
    }
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    @java.lang.Override
    public int getChallengeInfoListCount() {
      return challengeInfoList_.size();
    }
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP getChallengeInfoList(int index) {
      return challengeInfoList_.get(index);
    }
    /**
     * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder getChallengeInfoListOrBuilder(
        int index) {
      return challengeInfoList_.get(index);
    }

    public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 5;
    private int nextRefreshTime_;
    /**
     * <code>uint32 next_refresh_time = 5;</code>
     * @return The nextRefreshTime.
     */
    @java.lang.Override
    public int getNextRefreshTime() {
      return nextRefreshTime_;
    }

    public static final int UNK3250_CCKACMNNCHC_FIELD_NUMBER = 1;
    private boolean unk3250CCKACMNNCHC_;
    /**
     * <code>bool Unk3250_CCKACMNNCHC = 1;</code>
     * @return The unk3250CCKACMNNCHC.
     */
    @java.lang.Override
    public boolean getUnk3250CCKACMNNCHC() {
      return unk3250CCKACMNNCHC_;
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
      if (unk3250CCKACMNNCHC_ != false) {
        output.writeBool(1, unk3250CCKACMNNCHC_);
      }
      if (nextRefreshTime_ != 0) {
        output.writeUInt32(5, nextRefreshTime_);
      }
      for (int i = 0; i < challengeInfoList_.size(); i++) {
        output.writeMessage(6, challengeInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250CCKACMNNCHC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, unk3250CCKACMNNCHC_);
      }
      if (nextRefreshTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, nextRefreshTime_);
      }
      for (int i = 0; i < challengeInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, challengeInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI other = (emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI) obj;

      if (!getChallengeInfoListList()
          .equals(other.getChallengeInfoListList())) return false;
      if (getNextRefreshTime()
          != other.getNextRefreshTime()) return false;
      if (getUnk3250CCKACMNNCHC()
          != other.getUnk3250CCKACMNNCHC()) return false;
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
      if (getChallengeInfoListCount() > 0) {
        hash = (37 * hash) + CHALLENGE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChallengeInfoListList().hashCode();
      }
      hash = (37 * hash) + NEXT_REFRESH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getNextRefreshTime();
      hash = (37 * hash) + UNK3250_CCKACMNNCHC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250CCKACMNNCHC());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI prototype) {
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
     * CmdId: 7120
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_EPFMLFPLNMI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_EPFMLFPLNMI)
        emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.internal_static_Unk3150_EPFMLFPLNMI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.internal_static_Unk3150_EPFMLFPLNMI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.class, emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (challengeInfoListBuilder_ == null) {
          challengeInfoList_ = java.util.Collections.emptyList();
        } else {
          challengeInfoList_ = null;
          challengeInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        nextRefreshTime_ = 0;

        unk3250CCKACMNNCHC_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.internal_static_Unk3150_EPFMLFPLNMI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI build() {
        emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI buildPartial() {
        emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI result = new emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI(this);
        int from_bitField0_ = bitField0_;
        if (challengeInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            challengeInfoList_ = java.util.Collections.unmodifiableList(challengeInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.challengeInfoList_ = challengeInfoList_;
        } else {
          result.challengeInfoList_ = challengeInfoListBuilder_.build();
        }
        result.nextRefreshTime_ = nextRefreshTime_;
        result.unk3250CCKACMNNCHC_ = unk3250CCKACMNNCHC_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI other) {
        if (other == emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI.getDefaultInstance()) return this;
        if (challengeInfoListBuilder_ == null) {
          if (!other.challengeInfoList_.isEmpty()) {
            if (challengeInfoList_.isEmpty()) {
              challengeInfoList_ = other.challengeInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureChallengeInfoListIsMutable();
              challengeInfoList_.addAll(other.challengeInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.challengeInfoList_.isEmpty()) {
            if (challengeInfoListBuilder_.isEmpty()) {
              challengeInfoListBuilder_.dispose();
              challengeInfoListBuilder_ = null;
              challengeInfoList_ = other.challengeInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              challengeInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChallengeInfoListFieldBuilder() : null;
            } else {
              challengeInfoListBuilder_.addAllMessages(other.challengeInfoList_);
            }
          }
        }
        if (other.getNextRefreshTime() != 0) {
          setNextRefreshTime(other.getNextRefreshTime());
        }
        if (other.getUnk3250CCKACMNNCHC() != false) {
          setUnk3250CCKACMNNCHC(other.getUnk3250CCKACMNNCHC());
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
                unk3250CCKACMNNCHC_ = input.readBool();

                break;
              } // case 8
              case 40: {
                nextRefreshTime_ = input.readUInt32();

                break;
              } // case 40
              case 50: {
                emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.parser(),
                        extensionRegistry);
                if (challengeInfoListBuilder_ == null) {
                  ensureChallengeInfoListIsMutable();
                  challengeInfoList_.add(m);
                } else {
                  challengeInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 50
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

      private java.util.List<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP> challengeInfoList_ =
        java.util.Collections.emptyList();
      private void ensureChallengeInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          challengeInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP>(challengeInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder> challengeInfoListBuilder_;

      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP> getChallengeInfoListList() {
        if (challengeInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(challengeInfoList_);
        } else {
          return challengeInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public int getChallengeInfoListCount() {
        if (challengeInfoListBuilder_ == null) {
          return challengeInfoList_.size();
        } else {
          return challengeInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP getChallengeInfoList(int index) {
        if (challengeInfoListBuilder_ == null) {
          return challengeInfoList_.get(index);
        } else {
          return challengeInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder setChallengeInfoList(
          int index, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP value) {
        if (challengeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.set(index, value);
          onChanged();
        } else {
          challengeInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder setChallengeInfoList(
          int index, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder builderForValue) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          challengeInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder addChallengeInfoList(emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP value) {
        if (challengeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(value);
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder addChallengeInfoList(
          int index, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP value) {
        if (challengeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(index, value);
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder addChallengeInfoList(
          emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder builderForValue) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder addChallengeInfoList(
          int index, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder builderForValue) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder addAllChallengeInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP> values) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, challengeInfoList_);
          onChanged();
        } else {
          challengeInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder clearChallengeInfoList() {
        if (challengeInfoListBuilder_ == null) {
          challengeInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          challengeInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public Builder removeChallengeInfoList(int index) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.remove(index);
          onChanged();
        } else {
          challengeInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder getChallengeInfoListBuilder(
          int index) {
        return getChallengeInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder getChallengeInfoListOrBuilder(
          int index) {
        if (challengeInfoListBuilder_ == null) {
          return challengeInfoList_.get(index);  } else {
          return challengeInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder> 
           getChallengeInfoListOrBuilderList() {
        if (challengeInfoListBuilder_ != null) {
          return challengeInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(challengeInfoList_);
        }
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder addChallengeInfoListBuilder() {
        return getChallengeInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder addChallengeInfoListBuilder(
          int index) {
        return getChallengeInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3150_LAPGCIILGKP challenge_info_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder> 
           getChallengeInfoListBuilderList() {
        return getChallengeInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder> 
          getChallengeInfoListFieldBuilder() {
        if (challengeInfoListBuilder_ == null) {
          challengeInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKP.Builder, emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.Unk3150_LAPGCIILGKPOrBuilder>(
                  challengeInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          challengeInfoList_ = null;
        }
        return challengeInfoListBuilder_;
      }

      private int nextRefreshTime_ ;
      /**
       * <code>uint32 next_refresh_time = 5;</code>
       * @return The nextRefreshTime.
       */
      @java.lang.Override
      public int getNextRefreshTime() {
        return nextRefreshTime_;
      }
      /**
       * <code>uint32 next_refresh_time = 5;</code>
       * @param value The nextRefreshTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextRefreshTime(int value) {
        
        nextRefreshTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 next_refresh_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextRefreshTime() {
        
        nextRefreshTime_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3250CCKACMNNCHC_ ;
      /**
       * <code>bool Unk3250_CCKACMNNCHC = 1;</code>
       * @return The unk3250CCKACMNNCHC.
       */
      @java.lang.Override
      public boolean getUnk3250CCKACMNNCHC() {
        return unk3250CCKACMNNCHC_;
      }
      /**
       * <code>bool Unk3250_CCKACMNNCHC = 1;</code>
       * @param value The unk3250CCKACMNNCHC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250CCKACMNNCHC(boolean value) {
        
        unk3250CCKACMNNCHC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_CCKACMNNCHC = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250CCKACMNNCHC() {
        
        unk3250CCKACMNNCHC_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_EPFMLFPLNMI)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_EPFMLFPLNMI)
    private static final emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI();
    }

    public static emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_EPFMLFPLNMI>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_EPFMLFPLNMI>() {
      @java.lang.Override
      public Unk3150_EPFMLFPLNMI parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_EPFMLFPLNMI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_EPFMLFPLNMI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150EPFMLFPLNMI.Unk3150_EPFMLFPLNMI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_EPFMLFPLNMI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_EPFMLFPLNMI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_EPFMLFPLNMI.proto\032\031Unk3150_LAP" +
      "GCIILGKP.proto\"\200\001\n\023Unk3150_EPFMLFPLNMI\0221" +
      "\n\023challenge_info_list\030\006 \003(\0132\024.Unk3150_LA" +
      "PGCIILGKP\022\031\n\021next_refresh_time\030\005 \001(\r\022\033\n\023" +
      "Unk3250_CCKACMNNCHC\030\001 \001(\010B\036\n\034emu.grasscu" +
      "tter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.getDescriptor(),
        });
    internal_static_Unk3150_EPFMLFPLNMI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_EPFMLFPLNMI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_EPFMLFPLNMI_descriptor,
        new java.lang.String[] { "ChallengeInfoList", "NextRefreshTime", "Unk3250CCKACMNNCHC", });
    emu.grasscutter.net.newproto.Unk3150LAPGCIILGKP.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
