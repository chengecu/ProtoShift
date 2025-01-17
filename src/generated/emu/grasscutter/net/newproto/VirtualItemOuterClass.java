// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VirtualItem.proto

package emu.grasscutter.net.newproto;

public final class VirtualItemOuterClass {
  private VirtualItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code VirtualItem}
   */
  public enum VirtualItem
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_NONE = 0;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_NONE(0),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_AVATAR_EXP = 101;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_AVATAR_EXP(101),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_PLAYER_EXP = 102;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_PLAYER_EXP(102),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FETTER_EXP = 105;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_FETTER_EXP(105),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_RESIN = 106;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_RESIN(106),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LEGENDARY_KEY = 107;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_LEGENDARY_KEY(107),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ASTER_PROGRESS = 108;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ASTER_PROGRESS(108),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ASTER_CREDIT = 109;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ASTER_CREDIT(109),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ASTER_TOKEN = 110;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ASTER_TOKEN(110),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SHIMMERING_ESSENCE = 111;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SHIMMERING_ESSENCE(111),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WARM_ESSENCE = 112;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_WARM_ESSENCE(112),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WONDROUS_ESSENCE = 113;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_WONDROUS_ESSENCE(113),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_TREASURE_MAP_TOKEN = 114;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_TREASURE_MAP_TOKEN(114),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_COIN = 115;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_COIN(115),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_POPULARITY = 116;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_POPULARITY(116),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_MECHANICUS_COIN = 117;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_MECHANICUS_COIN(117),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_CREDIT = 118;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_CREDIT(118),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_TOKEN = 119;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_TOKEN(119),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WATER_SPIRIT_COIN = 120;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_WATER_SPIRIT_COIN(120),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HOME_EXP = 121;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_HOME_EXP(121),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_CHANNELLER_SLAB_TOKEN = 122;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_CHANNELLER_SLAB_TOKEN(122),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HIDE_AND_SEEK_COIN = 123;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_HIDE_AND_SEEK_COIN(123),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_DRAFT_WOOD = 124;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_DRAFT_WOOD(124),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_MINI_HARPASTUM = 125;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_MINI_HARPASTUM(125),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BOUNCE_CONJURING_COIN = 126;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_BOUNCE_CONJURING_COIN(126),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_A = 127;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_A(127),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_B = 128;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_B(128),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_CHESS_EXP = 129;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_CHESS_EXP(129),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_CHESS_COIN = 130;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_CHESS_COIN(130),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LUNA_RITE_ATMOSPHERE = 131;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_LUNA_RITE_ATMOSPHERE(131),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_A = 132;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_A(132),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_B = 133;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_B(133),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_C = 134;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_C(134),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_A = 135;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_A(135),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_B = 136;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_B(136),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_A = 137;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_A(137),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_B = 138;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_B(138),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_C = 139;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_C(139),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_COIN = 140;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_COIN(140),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_V2_COIN = 141;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_V2_COIN(141),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_DUNGEON_COIN = 142;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_DUNGEON_COIN(142),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_A = 143;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_A(143),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_B = 144;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_B(144),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_TREASURE_SEELIE_COIN = 145;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_TREASURE_SEELIE_COIN(145),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_POPULARITY = 147;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_VINTAGE_POPULARITY(147),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GCG_EXP = 146;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_GCG_EXP(146),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_A = 148;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_A(148),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_B = 149;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_B(149),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_C = 150;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_C(150),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_CAPTURE_COIN = 151;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_CAPTURE_COIN(151),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_TRAINING_COIN = 152;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_TRAINING_COIN(152),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_EFFIGY_CHALLENGE_V2_COIN = 153;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_EFFIGY_CHALLENGE_V2_COIN(153),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BRICK_BREAKER_COIN = 155;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_BRICK_BREAKER_COIN(155),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HCOIN = 201;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_HCOIN(201),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SCOIN = 202;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SCOIN(202),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_MCOIN = 203;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_MCOIN(203),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HOME_COIN = 204;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_HOME_COIN(204),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GCG_COIN = 205;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_GCG_COIN(205),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_INAZUMA_REPUTATION = 314;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_INAZUMA_REPUTATION(314),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_MENGDE_REPUTATION = 315;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_MENGDE_REPUTATION(315),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMERU_REPUTATION = 316;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_SUMERU_REPUTATION(316),
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LIYUE_REPUTATION = 317;</code>
     */
    VIRTUAL_ITEM_VIRTUAL_LIYUE_REPUTATION(317),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_NONE = 0;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_NONE_VALUE = 0;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_AVATAR_EXP = 101;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_AVATAR_EXP_VALUE = 101;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_PLAYER_EXP = 102;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_PLAYER_EXP_VALUE = 102;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FETTER_EXP = 105;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_FETTER_EXP_VALUE = 105;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_RESIN = 106;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_RESIN_VALUE = 106;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LEGENDARY_KEY = 107;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_LEGENDARY_KEY_VALUE = 107;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ASTER_PROGRESS = 108;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ASTER_PROGRESS_VALUE = 108;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ASTER_CREDIT = 109;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ASTER_CREDIT_VALUE = 109;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ASTER_TOKEN = 110;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ASTER_TOKEN_VALUE = 110;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SHIMMERING_ESSENCE = 111;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SHIMMERING_ESSENCE_VALUE = 111;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WARM_ESSENCE = 112;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_WARM_ESSENCE_VALUE = 112;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WONDROUS_ESSENCE = 113;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_WONDROUS_ESSENCE_VALUE = 113;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_TREASURE_MAP_TOKEN = 114;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_TREASURE_MAP_TOKEN_VALUE = 114;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_COIN = 115;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_COIN_VALUE = 115;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_POPULARITY = 116;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_POPULARITY_VALUE = 116;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_MECHANICUS_COIN = 117;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_MECHANICUS_COIN_VALUE = 117;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_CREDIT = 118;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_CREDIT_VALUE = 118;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_TOKEN = 119;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_TOKEN_VALUE = 119;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WATER_SPIRIT_COIN = 120;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_WATER_SPIRIT_COIN_VALUE = 120;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HOME_EXP = 121;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_HOME_EXP_VALUE = 121;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_CHANNELLER_SLAB_TOKEN = 122;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_CHANNELLER_SLAB_TOKEN_VALUE = 122;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HIDE_AND_SEEK_COIN = 123;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_HIDE_AND_SEEK_COIN_VALUE = 123;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_DRAFT_WOOD = 124;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_DRAFT_WOOD_VALUE = 124;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_MINI_HARPASTUM = 125;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_MINI_HARPASTUM_VALUE = 125;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BOUNCE_CONJURING_COIN = 126;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_BOUNCE_CONJURING_COIN_VALUE = 126;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_A = 127;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_A_VALUE = 127;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_B = 128;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_B_VALUE = 128;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_CHESS_EXP = 129;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_CHESS_EXP_VALUE = 129;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_CHESS_COIN = 130;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_CHESS_COIN_VALUE = 130;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LUNA_RITE_ATMOSPHERE = 131;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_LUNA_RITE_ATMOSPHERE_VALUE = 131;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_A = 132;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_A_VALUE = 132;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_B = 133;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_B_VALUE = 133;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_C = 134;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_C_VALUE = 134;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_A = 135;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_A_VALUE = 135;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_B = 136;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_B_VALUE = 136;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_A = 137;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_A_VALUE = 137;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_B = 138;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_B_VALUE = 138;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_C = 139;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_C_VALUE = 139;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_COIN = 140;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_COIN_VALUE = 140;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_V2_COIN = 141;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_V2_COIN_VALUE = 141;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_DUNGEON_COIN = 142;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_DUNGEON_COIN_VALUE = 142;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_A = 143;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_A_VALUE = 143;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_B = 144;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_B_VALUE = 144;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_TREASURE_SEELIE_COIN = 145;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_TREASURE_SEELIE_COIN_VALUE = 145;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_POPULARITY = 147;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_VINTAGE_POPULARITY_VALUE = 147;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GCG_EXP = 146;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_GCG_EXP_VALUE = 146;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_A = 148;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_A_VALUE = 148;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_B = 149;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_B_VALUE = 149;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_C = 150;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_C_VALUE = 150;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_CAPTURE_COIN = 151;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_CAPTURE_COIN_VALUE = 151;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_TRAINING_COIN = 152;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_TRAINING_COIN_VALUE = 152;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_EFFIGY_CHALLENGE_V2_COIN = 153;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_EFFIGY_CHALLENGE_V2_COIN_VALUE = 153;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_BRICK_BREAKER_COIN = 155;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_BRICK_BREAKER_COIN_VALUE = 155;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HCOIN = 201;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_HCOIN_VALUE = 201;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SCOIN = 202;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SCOIN_VALUE = 202;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_MCOIN = 203;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_MCOIN_VALUE = 203;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_HOME_COIN = 204;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_HOME_COIN_VALUE = 204;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_GCG_COIN = 205;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_GCG_COIN_VALUE = 205;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_INAZUMA_REPUTATION = 314;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_INAZUMA_REPUTATION_VALUE = 314;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_MENGDE_REPUTATION = 315;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_MENGDE_REPUTATION_VALUE = 315;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_SUMERU_REPUTATION = 316;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_SUMERU_REPUTATION_VALUE = 316;
    /**
     * <code>VIRTUAL_ITEM_VIRTUAL_LIYUE_REPUTATION = 317;</code>
     */
    public static final int VIRTUAL_ITEM_VIRTUAL_LIYUE_REPUTATION_VALUE = 317;


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
    public static VirtualItem valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VirtualItem forNumber(int value) {
      switch (value) {
        case 0: return VIRTUAL_ITEM_VIRTUAL_NONE;
        case 101: return VIRTUAL_ITEM_VIRTUAL_AVATAR_EXP;
        case 102: return VIRTUAL_ITEM_VIRTUAL_PLAYER_EXP;
        case 105: return VIRTUAL_ITEM_VIRTUAL_FETTER_EXP;
        case 106: return VIRTUAL_ITEM_VIRTUAL_RESIN;
        case 107: return VIRTUAL_ITEM_VIRTUAL_LEGENDARY_KEY;
        case 108: return VIRTUAL_ITEM_VIRTUAL_ASTER_PROGRESS;
        case 109: return VIRTUAL_ITEM_VIRTUAL_ASTER_CREDIT;
        case 110: return VIRTUAL_ITEM_VIRTUAL_ASTER_TOKEN;
        case 111: return VIRTUAL_ITEM_VIRTUAL_SHIMMERING_ESSENCE;
        case 112: return VIRTUAL_ITEM_VIRTUAL_WARM_ESSENCE;
        case 113: return VIRTUAL_ITEM_VIRTUAL_WONDROUS_ESSENCE;
        case 114: return VIRTUAL_ITEM_VIRTUAL_TREASURE_MAP_TOKEN;
        case 115: return VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_COIN;
        case 116: return VIRTUAL_ITEM_VIRTUAL_SEA_LAMP_POPULARITY;
        case 117: return VIRTUAL_ITEM_VIRTUAL_MECHANICUS_COIN;
        case 118: return VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_CREDIT;
        case 119: return VIRTUAL_ITEM_VIRTUAL_FLEUR_FAIR_TOKEN;
        case 120: return VIRTUAL_ITEM_VIRTUAL_WATER_SPIRIT_COIN;
        case 121: return VIRTUAL_ITEM_VIRTUAL_HOME_EXP;
        case 122: return VIRTUAL_ITEM_VIRTUAL_CHANNELLER_SLAB_TOKEN;
        case 123: return VIRTUAL_ITEM_VIRTUAL_HIDE_AND_SEEK_COIN;
        case 124: return VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_DRAFT_WOOD;
        case 125: return VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_MINI_HARPASTUM;
        case 126: return VIRTUAL_ITEM_VIRTUAL_BOUNCE_CONJURING_COIN;
        case 127: return VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_A;
        case 128: return VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_B;
        case 129: return VIRTUAL_ITEM_VIRTUAL_CHESS_EXP;
        case 130: return VIRTUAL_ITEM_VIRTUAL_CHESS_COIN;
        case 131: return VIRTUAL_ITEM_VIRTUAL_LUNA_RITE_ATMOSPHERE;
        case 132: return VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_A;
        case 133: return VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_B;
        case 134: return VIRTUAL_ITEM_VIRTUAL_ROGUELIKE_COIN_C;
        case 135: return VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_A;
        case 136: return VIRTUAL_ITEM_VIRTUAL_WINTER_CAMP_COIN_B;
        case 137: return VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_A;
        case 138: return VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_B;
        case 139: return VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_C;
        case 140: return VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_COIN;
        case 141: return VIRTUAL_ITEM_VIRTUAL_SUMMER_TIME_V2_COIN;
        case 142: return VIRTUAL_ITEM_VIRTUAL_ROGUE_DIARY_DUNGEON_COIN;
        case 143: return VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_A;
        case 144: return VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_COIN_B;
        case 145: return VIRTUAL_ITEM_VIRTUAL_TREASURE_SEELIE_COIN;
        case 147: return VIRTUAL_ITEM_VIRTUAL_VINTAGE_POPULARITY;
        case 146: return VIRTUAL_ITEM_VIRTUAL_GCG_EXP;
        case 148: return VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_A;
        case 149: return VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_B;
        case 150: return VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN_C;
        case 151: return VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_CAPTURE_COIN;
        case 152: return VIRTUAL_ITEM_VIRTUAL_FUNGUS_FIGHTER_TRAINING_COIN;
        case 153: return VIRTUAL_ITEM_VIRTUAL_EFFIGY_CHALLENGE_V2_COIN;
        case 155: return VIRTUAL_ITEM_VIRTUAL_BRICK_BREAKER_COIN;
        case 201: return VIRTUAL_ITEM_VIRTUAL_HCOIN;
        case 202: return VIRTUAL_ITEM_VIRTUAL_SCOIN;
        case 203: return VIRTUAL_ITEM_VIRTUAL_MCOIN;
        case 204: return VIRTUAL_ITEM_VIRTUAL_HOME_COIN;
        case 205: return VIRTUAL_ITEM_VIRTUAL_GCG_COIN;
        case 314: return VIRTUAL_ITEM_VIRTUAL_INAZUMA_REPUTATION;
        case 315: return VIRTUAL_ITEM_VIRTUAL_MENGDE_REPUTATION;
        case 316: return VIRTUAL_ITEM_VIRTUAL_SUMERU_REPUTATION;
        case 317: return VIRTUAL_ITEM_VIRTUAL_LIYUE_REPUTATION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VirtualItem>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VirtualItem> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VirtualItem>() {
            public VirtualItem findValueByNumber(int number) {
              return VirtualItem.forNumber(number);
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
      return emu.grasscutter.net.newproto.VirtualItemOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final VirtualItem[] VALUES = values();

    public static VirtualItem valueOf(
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

    private VirtualItem(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:VirtualItem)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021VirtualItem.proto*\231\025\n\013VirtualItem\022\035\n\031V" +
      "IRTUAL_ITEM_VIRTUAL_NONE\020\000\022#\n\037VIRTUAL_IT" +
      "EM_VIRTUAL_AVATAR_EXP\020e\022#\n\037VIRTUAL_ITEM_" +
      "VIRTUAL_PLAYER_EXP\020f\022#\n\037VIRTUAL_ITEM_VIR" +
      "TUAL_FETTER_EXP\020i\022\036\n\032VIRTUAL_ITEM_VIRTUA" +
      "L_RESIN\020j\022&\n\"VIRTUAL_ITEM_VIRTUAL_LEGEND" +
      "ARY_KEY\020k\022\'\n#VIRTUAL_ITEM_VIRTUAL_ASTER_" +
      "PROGRESS\020l\022%\n!VIRTUAL_ITEM_VIRTUAL_ASTER" +
      "_CREDIT\020m\022$\n VIRTUAL_ITEM_VIRTUAL_ASTER_" +
      "TOKEN\020n\022+\n\'VIRTUAL_ITEM_VIRTUAL_SHIMMERI" +
      "NG_ESSENCE\020o\022%\n!VIRTUAL_ITEM_VIRTUAL_WAR" +
      "M_ESSENCE\020p\022)\n%VIRTUAL_ITEM_VIRTUAL_WOND" +
      "ROUS_ESSENCE\020q\022+\n\'VIRTUAL_ITEM_VIRTUAL_T" +
      "REASURE_MAP_TOKEN\020r\022&\n\"VIRTUAL_ITEM_VIRT" +
      "UAL_SEA_LAMP_COIN\020s\022,\n(VIRTUAL_ITEM_VIRT" +
      "UAL_SEA_LAMP_POPULARITY\020t\022(\n$VIRTUAL_ITE" +
      "M_VIRTUAL_MECHANICUS_COIN\020u\022*\n&VIRTUAL_I" +
      "TEM_VIRTUAL_FLEUR_FAIR_CREDIT\020v\022)\n%VIRTU" +
      "AL_ITEM_VIRTUAL_FLEUR_FAIR_TOKEN\020w\022*\n&VI" +
      "RTUAL_ITEM_VIRTUAL_WATER_SPIRIT_COIN\020x\022!" +
      "\n\035VIRTUAL_ITEM_VIRTUAL_HOME_EXP\020y\022.\n*VIR" +
      "TUAL_ITEM_VIRTUAL_CHANNELLER_SLAB_TOKEN\020" +
      "z\022+\n\'VIRTUAL_ITEM_VIRTUAL_HIDE_AND_SEEK_" +
      "COIN\020{\022/\n+VIRTUAL_ITEM_VIRTUAL_SUMMER_TI" +
      "ME_DRAFT_WOOD\020|\0223\n/VIRTUAL_ITEM_VIRTUAL_" +
      "SUMMER_TIME_MINI_HARPASTUM\020}\022.\n*VIRTUAL_" +
      "ITEM_VIRTUAL_BOUNCE_CONJURING_COIN\020~\022*\n&" +
      "VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN_A\020\177" +
      "\022+\n&VIRTUAL_ITEM_VIRTUAL_BLITZ_RUSH_COIN" +
      "_B\020\200\001\022#\n\036VIRTUAL_ITEM_VIRTUAL_CHESS_EXP\020" +
      "\201\001\022$\n\037VIRTUAL_ITEM_VIRTUAL_CHESS_COIN\020\202\001" +
      "\022.\n)VIRTUAL_ITEM_VIRTUAL_LUNA_RITE_ATMOS" +
      "PHERE\020\203\001\022*\n%VIRTUAL_ITEM_VIRTUAL_ROGUELI" +
      "KE_COIN_A\020\204\001\022*\n%VIRTUAL_ITEM_VIRTUAL_ROG" +
      "UELIKE_COIN_B\020\205\001\022*\n%VIRTUAL_ITEM_VIRTUAL" +
      "_ROGUELIKE_COIN_C\020\206\001\022,\n\'VIRTUAL_ITEM_VIR" +
      "TUAL_WINTER_CAMP_COIN_A\020\207\001\022,\n\'VIRTUAL_IT" +
      "EM_VIRTUAL_WINTER_CAMP_COIN_B\020\210\001\022-\n(VIRT" +
      "UAL_ITEM_VIRTUAL_LANTERN_RITE_COIN_A\020\211\001\022" +
      "-\n(VIRTUAL_ITEM_VIRTUAL_LANTERN_RITE_COI" +
      "N_B\020\212\001\022-\n(VIRTUAL_ITEM_VIRTUAL_LANTERN_R" +
      "ITE_COIN_C\020\213\001\022*\n%VIRTUAL_ITEM_VIRTUAL_RO" +
      "GUE_DIARY_COIN\020\214\001\022-\n(VIRTUAL_ITEM_VIRTUA" +
      "L_SUMMER_TIME_V2_COIN\020\215\001\0222\n-VIRTUAL_ITEM" +
      "_VIRTUAL_ROGUE_DIARY_DUNGEON_COIN\020\216\001\0221\n," +
      "VIRTUAL_ITEM_VIRTUAL_GRAVEN_INNOCENCE_CO" +
      "IN_A\020\217\001\0221\n,VIRTUAL_ITEM_VIRTUAL_GRAVEN_I" +
      "NNOCENCE_COIN_B\020\220\001\022.\n)VIRTUAL_ITEM_VIRTU" +
      "AL_TREASURE_SEELIE_COIN\020\221\001\022,\n\'VIRTUAL_IT" +
      "EM_VIRTUAL_VINTAGE_POPULARITY\020\223\001\022!\n\034VIRT" +
      "UAL_ITEM_VIRTUAL_GCG_EXP\020\222\001\022/\n*VIRTUAL_I" +
      "TEM_VIRTUAL_VINTAGE_MARKET_COIN_A\020\224\001\022/\n*" +
      "VIRTUAL_ITEM_VIRTUAL_VINTAGE_MARKET_COIN" +
      "_B\020\225\001\022/\n*VIRTUAL_ITEM_VIRTUAL_VINTAGE_MA" +
      "RKET_COIN_C\020\226\001\0225\n0VIRTUAL_ITEM_VIRTUAL_F" +
      "UNGUS_FIGHTER_CAPTURE_COIN\020\227\001\0226\n1VIRTUAL" +
      "_ITEM_VIRTUAL_FUNGUS_FIGHTER_TRAINING_CO" +
      "IN\020\230\001\0222\n-VIRTUAL_ITEM_VIRTUAL_EFFIGY_CHA" +
      "LLENGE_V2_COIN\020\231\001\022,\n\'VIRTUAL_ITEM_VIRTUA" +
      "L_BRICK_BREAKER_COIN\020\233\001\022\037\n\032VIRTUAL_ITEM_" +
      "VIRTUAL_HCOIN\020\311\001\022\037\n\032VIRTUAL_ITEM_VIRTUAL" +
      "_SCOIN\020\312\001\022\037\n\032VIRTUAL_ITEM_VIRTUAL_MCOIN\020" +
      "\313\001\022#\n\036VIRTUAL_ITEM_VIRTUAL_HOME_COIN\020\314\001\022" +
      "\"\n\035VIRTUAL_ITEM_VIRTUAL_GCG_COIN\020\315\001\022,\n\'V" +
      "IRTUAL_ITEM_VIRTUAL_INAZUMA_REPUTATION\020\272" +
      "\002\022+\n&VIRTUAL_ITEM_VIRTUAL_MENGDE_REPUTAT" +
      "ION\020\273\002\022+\n&VIRTUAL_ITEM_VIRTUAL_SUMERU_RE" +
      "PUTATION\020\274\002\022*\n%VIRTUAL_ITEM_VIRTUAL_LIYU" +
      "E_REPUTATION\020\275\002B\036\n\034emu.grasscutter.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
