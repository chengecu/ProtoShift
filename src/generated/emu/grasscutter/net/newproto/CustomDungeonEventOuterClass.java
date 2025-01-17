// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonEvent.proto

package emu.grasscutter.net.newproto;

public final class CustomDungeonEventOuterClass {
  private CustomDungeonEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CustomDungeonEvent}
   */
  public enum CustomDungeonEvent
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CUSTOM_DUNGEON_EVENT_NONE = 0;</code>
     */
    CUSTOM_DUNGEON_EVENT_NONE(0),
    /**
     * <code>CUSTOM_DUNGEON_EVENT_OFFICIAL_RESTART = 1;</code>
     */
    CUSTOM_DUNGEON_EVENT_OFFICIAL_RESTART(1),
    /**
     * <code>CUSTOM_DUNGEON_EVENT_OUT_STUCK = 2;</code>
     */
    CUSTOM_DUNGEON_EVENT_OUT_STUCK(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CUSTOM_DUNGEON_EVENT_NONE = 0;</code>
     */
    public static final int CUSTOM_DUNGEON_EVENT_NONE_VALUE = 0;
    /**
     * <code>CUSTOM_DUNGEON_EVENT_OFFICIAL_RESTART = 1;</code>
     */
    public static final int CUSTOM_DUNGEON_EVENT_OFFICIAL_RESTART_VALUE = 1;
    /**
     * <code>CUSTOM_DUNGEON_EVENT_OUT_STUCK = 2;</code>
     */
    public static final int CUSTOM_DUNGEON_EVENT_OUT_STUCK_VALUE = 2;


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
    public static CustomDungeonEvent valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomDungeonEvent forNumber(int value) {
      switch (value) {
        case 0: return CUSTOM_DUNGEON_EVENT_NONE;
        case 1: return CUSTOM_DUNGEON_EVENT_OFFICIAL_RESTART;
        case 2: return CUSTOM_DUNGEON_EVENT_OUT_STUCK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomDungeonEvent>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomDungeonEvent> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomDungeonEvent>() {
            public CustomDungeonEvent findValueByNumber(int number) {
              return CustomDungeonEvent.forNumber(number);
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
      return emu.grasscutter.net.newproto.CustomDungeonEventOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomDungeonEvent[] VALUES = values();

    public static CustomDungeonEvent valueOf(
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

    private CustomDungeonEvent(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CustomDungeonEvent)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030CustomDungeonEvent.proto*\202\001\n\022CustomDun" +
      "geonEvent\022\035\n\031CUSTOM_DUNGEON_EVENT_NONE\020\000" +
      "\022)\n%CUSTOM_DUNGEON_EVENT_OFFICIAL_RESTAR" +
      "T\020\001\022\"\n\036CUSTOM_DUNGEON_EVENT_OUT_STUCK\020\002B" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
