// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Vector.proto

package emu.grasscutter.net.oldproto;

public final class VectorOuterClass {
  private VectorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VectorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Vector)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float x = 1;</code>
     * @return The x.
     */
    float getX();

    /**
     * <code>float y = 2;</code>
     * @return The y.
     */
    float getY();

    /**
     * <code>float z = 3;</code>
     * @return The z.
     */
    float getZ();
  }
  /**
   * Protobuf type {@code Vector}
   */
  public static final class Vector extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Vector)
      VectorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Vector.newBuilder() to construct.
    private Vector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Vector() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Vector();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.VectorOuterClass.internal_static_Vector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.VectorOuterClass.internal_static_Vector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.class, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private float x_;
    /**
     * <code>float x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public float getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private float y_;
    /**
     * <code>float y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public float getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private float z_;
    /**
     * <code>float z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public float getZ() {
      return z_;
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
      if (java.lang.Float.floatToRawIntBits(x_) != 0) {
        output.writeFloat(1, x_);
      }
      if (java.lang.Float.floatToRawIntBits(y_) != 0) {
        output.writeFloat(2, y_);
      }
      if (java.lang.Float.floatToRawIntBits(z_) != 0) {
        output.writeFloat(3, z_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, x_);
      }
      if (java.lang.Float.floatToRawIntBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, y_);
      }
      if (java.lang.Float.floatToRawIntBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, z_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.VectorOuterClass.Vector)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.VectorOuterClass.Vector other = (emu.grasscutter.net.oldproto.VectorOuterClass.Vector) obj;

      if (java.lang.Float.floatToIntBits(getX())
          != java.lang.Float.floatToIntBits(
              other.getX())) return false;
      if (java.lang.Float.floatToIntBits(getY())
          != java.lang.Float.floatToIntBits(
              other.getY())) return false;
      if (java.lang.Float.floatToIntBits(getZ())
          != java.lang.Float.floatToIntBits(
              other.getZ())) return false;
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
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getX());
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getY());
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getZ());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.VectorOuterClass.Vector prototype) {
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
     * Protobuf type {@code Vector}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Vector)
        emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.VectorOuterClass.internal_static_Vector_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.VectorOuterClass.internal_static_Vector_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.VectorOuterClass.Vector.class, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0F;

        y_ = 0F;

        z_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.VectorOuterClass.internal_static_Vector_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector build() {
        emu.grasscutter.net.oldproto.VectorOuterClass.Vector result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector buildPartial() {
        emu.grasscutter.net.oldproto.VectorOuterClass.Vector result = new emu.grasscutter.net.oldproto.VectorOuterClass.Vector(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
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
        if (other instanceof emu.grasscutter.net.oldproto.VectorOuterClass.Vector) {
          return mergeFrom((emu.grasscutter.net.oldproto.VectorOuterClass.Vector)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.VectorOuterClass.Vector other) {
        if (other == emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance()) return this;
        if (other.getX() != 0F) {
          setX(other.getX());
        }
        if (other.getY() != 0F) {
          setY(other.getY());
        }
        if (other.getZ() != 0F) {
          setZ(other.getZ());
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
              case 13: {
                x_ = input.readFloat();

                break;
              } // case 13
              case 21: {
                y_ = input.readFloat();

                break;
              } // case 21
              case 29: {
                z_ = input.readFloat();

                break;
              } // case 29
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

      private float x_ ;
      /**
       * <code>float x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public float getX() {
        return x_;
      }
      /**
       * <code>float x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(float value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0F;
        onChanged();
        return this;
      }

      private float y_ ;
      /**
       * <code>float y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public float getY() {
        return y_;
      }
      /**
       * <code>float y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(float value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0F;
        onChanged();
        return this;
      }

      private float z_ ;
      /**
       * <code>float z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public float getZ() {
        return z_;
      }
      /**
       * <code>float z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(float value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:Vector)
    }

    // @@protoc_insertion_point(class_scope:Vector)
    private static final emu.grasscutter.net.oldproto.VectorOuterClass.Vector DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.VectorOuterClass.Vector();
    }

    public static emu.grasscutter.net.oldproto.VectorOuterClass.Vector getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Vector>
        PARSER = new com.google.protobuf.AbstractParser<Vector>() {
      @java.lang.Override
      public Vector parsePartialFrom(
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

    public static com.google.protobuf.Parser<Vector> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Vector> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Vector_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Vector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Vector.proto\")\n\006Vector\022\t\n\001x\030\001 \001(\002\022\t\n\001y" +
      "\030\002 \001(\002\022\t\n\001z\030\003 \001(\002B\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Vector_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Vector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Vector_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}