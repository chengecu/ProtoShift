// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_MOIPPIJMIJC.proto

package emu.grasscutter.net.newproto;

public final class Unk3000MOIPPIJMIJC {
  private Unk3000MOIPPIJMIJC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_MOIPPIJMIJCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_MOIPPIJMIJC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3000_BBNOIPMEOOJ = 1;</code>
     * @return The unk3000BBNOIPMEOOJ.
     */
    int getUnk3000BBNOIPMEOOJ();

    /**
     * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
     * @return The enum numeric value on the wire for unk3000ABHKMADEKEA.
     */
    int getUnk3000ABHKMADEKEAValue();
    /**
     * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
     * @return The unk3000ABHKMADEKEA.
     */
    emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG getUnk3000ABHKMADEKEA();
  }
  /**
   * <pre>
   * CmdId: 3389
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_MOIPPIJMIJC}
   */
  public static final class Unk3000_MOIPPIJMIJC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_MOIPPIJMIJC)
      Unk3000_MOIPPIJMIJCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_MOIPPIJMIJC.newBuilder() to construct.
    private Unk3000_MOIPPIJMIJC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_MOIPPIJMIJC() {
      unk3000ABHKMADEKEA_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_MOIPPIJMIJC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.internal_static_Unk3000_MOIPPIJMIJC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.internal_static_Unk3000_MOIPPIJMIJC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.class, emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.Builder.class);
    }

    public static final int UNK3000_BBNOIPMEOOJ_FIELD_NUMBER = 1;
    private int unk3000BBNOIPMEOOJ_;
    /**
     * <code>uint32 Unk3000_BBNOIPMEOOJ = 1;</code>
     * @return The unk3000BBNOIPMEOOJ.
     */
    @java.lang.Override
    public int getUnk3000BBNOIPMEOOJ() {
      return unk3000BBNOIPMEOOJ_;
    }

    public static final int UNK3000_ABHKMADEKEA_FIELD_NUMBER = 6;
    private int unk3000ABHKMADEKEA_;
    /**
     * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
     * @return The enum numeric value on the wire for unk3000ABHKMADEKEA.
     */
    @java.lang.Override public int getUnk3000ABHKMADEKEAValue() {
      return unk3000ABHKMADEKEA_;
    }
    /**
     * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
     * @return The unk3000ABHKMADEKEA.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG getUnk3000ABHKMADEKEA() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG result = emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG.valueOf(unk3000ABHKMADEKEA_);
      return result == null ? emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG.UNRECOGNIZED : result;
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
      if (unk3000BBNOIPMEOOJ_ != 0) {
        output.writeUInt32(1, unk3000BBNOIPMEOOJ_);
      }
      if (unk3000ABHKMADEKEA_ != emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG.Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA.getNumber()) {
        output.writeEnum(6, unk3000ABHKMADEKEA_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000BBNOIPMEOOJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3000BBNOIPMEOOJ_);
      }
      if (unk3000ABHKMADEKEA_ != emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG.Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, unk3000ABHKMADEKEA_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC other = (emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC) obj;

      if (getUnk3000BBNOIPMEOOJ()
          != other.getUnk3000BBNOIPMEOOJ()) return false;
      if (unk3000ABHKMADEKEA_ != other.unk3000ABHKMADEKEA_) return false;
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
      hash = (37 * hash) + UNK3000_BBNOIPMEOOJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000BBNOIPMEOOJ();
      hash = (37 * hash) + UNK3000_ABHKMADEKEA_FIELD_NUMBER;
      hash = (53 * hash) + unk3000ABHKMADEKEA_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC prototype) {
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
     * CmdId: 3389
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_MOIPPIJMIJC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_MOIPPIJMIJC)
        emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.internal_static_Unk3000_MOIPPIJMIJC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.internal_static_Unk3000_MOIPPIJMIJC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.class, emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3000BBNOIPMEOOJ_ = 0;

        unk3000ABHKMADEKEA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.internal_static_Unk3000_MOIPPIJMIJC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC build() {
        emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC buildPartial() {
        emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC result = new emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC(this);
        result.unk3000BBNOIPMEOOJ_ = unk3000BBNOIPMEOOJ_;
        result.unk3000ABHKMADEKEA_ = unk3000ABHKMADEKEA_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC other) {
        if (other == emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC.getDefaultInstance()) return this;
        if (other.getUnk3000BBNOIPMEOOJ() != 0) {
          setUnk3000BBNOIPMEOOJ(other.getUnk3000BBNOIPMEOOJ());
        }
        if (other.unk3000ABHKMADEKEA_ != 0) {
          setUnk3000ABHKMADEKEAValue(other.getUnk3000ABHKMADEKEAValue());
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
                unk3000BBNOIPMEOOJ_ = input.readUInt32();

                break;
              } // case 8
              case 48: {
                unk3000ABHKMADEKEA_ = input.readEnum();

                break;
              } // case 48
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

      private int unk3000BBNOIPMEOOJ_ ;
      /**
       * <code>uint32 Unk3000_BBNOIPMEOOJ = 1;</code>
       * @return The unk3000BBNOIPMEOOJ.
       */
      @java.lang.Override
      public int getUnk3000BBNOIPMEOOJ() {
        return unk3000BBNOIPMEOOJ_;
      }
      /**
       * <code>uint32 Unk3000_BBNOIPMEOOJ = 1;</code>
       * @param value The unk3000BBNOIPMEOOJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000BBNOIPMEOOJ(int value) {
        
        unk3000BBNOIPMEOOJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_BBNOIPMEOOJ = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000BBNOIPMEOOJ() {
        
        unk3000BBNOIPMEOOJ_ = 0;
        onChanged();
        return this;
      }

      private int unk3000ABHKMADEKEA_ = 0;
      /**
       * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
       * @return The enum numeric value on the wire for unk3000ABHKMADEKEA.
       */
      @java.lang.Override public int getUnk3000ABHKMADEKEAValue() {
        return unk3000ABHKMADEKEA_;
      }
      /**
       * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
       * @param value The enum numeric value on the wire for unk3000ABHKMADEKEA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000ABHKMADEKEAValue(int value) {
        
        unk3000ABHKMADEKEA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
       * @return The unk3000ABHKMADEKEA.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG getUnk3000ABHKMADEKEA() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG result = emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG.valueOf(unk3000ABHKMADEKEA_);
        return result == null ? emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
       * @param value The unk3000ABHKMADEKEA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000ABHKMADEKEA(emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.Unk3000_INJDOLGMLAG value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk3000ABHKMADEKEA_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk3000_INJDOLGMLAG Unk3000_ABHKMADEKEA = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000ABHKMADEKEA() {
        
        unk3000ABHKMADEKEA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_MOIPPIJMIJC)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_MOIPPIJMIJC)
    private static final emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC();
    }

    public static emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_MOIPPIJMIJC>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_MOIPPIJMIJC>() {
      @java.lang.Override
      public Unk3000_MOIPPIJMIJC parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_MOIPPIJMIJC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_MOIPPIJMIJC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000MOIPPIJMIJC.Unk3000_MOIPPIJMIJC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_MOIPPIJMIJC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_MOIPPIJMIJC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_MOIPPIJMIJC.proto\032\031Unk3000_INJ" +
      "DOLGMLAG.proto\"e\n\023Unk3000_MOIPPIJMIJC\022\033\n" +
      "\023Unk3000_BBNOIPMEOOJ\030\001 \001(\r\0221\n\023Unk3000_AB" +
      "HKMADEKEA\030\006 \001(\0162\024.Unk3000_INJDOLGMLAGB\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.getDescriptor(),
        });
    internal_static_Unk3000_MOIPPIJMIJC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_MOIPPIJMIJC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_MOIPPIJMIJC_descriptor,
        new java.lang.String[] { "Unk3000BBNOIPMEOOJ", "Unk3000ABHKMADEKEA", });
    emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
