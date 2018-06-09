package net.swordie.ms.handlers.header;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2/18/2017.
 */
public enum OutHeader {

    // CLogin::OnPacket
    CHECK_PASSWORD_RESULT(0),
    WORLD_INFORMATION(1),
    LATEST_CONNECTED_WORLD(2),
    RECOMMENDED_WORLD_MESSAGE(3),
    SET_CLIENT_KEY(4),
    SET_PHYSICAL_WORLD_ID(5),
    SELECT_WORLD_RESULT(6),
    SELECT_CHARACTER_RESULT(7),
    ACCOUNT_INFO_RESULT(8),
    CREATE_MAPLE_ACCOUNT_RESULT(9),
    CHECK_DUPLICATED_ID_RESULT(10),
    CREATE_NEW_CHARACTER_RESULT(11),
    DELETE_CHARACTER_RESULT(12),
    RESERVED_DELETE_CHARACTER_RESULT(13),
    RESERVED_DELETE_CHARACTER_CANCEL_RESULT(14),
    RENAME_CHARACTER_RESULT(15),
    MIGRATE_COMMAND(17),
    PING(18),
    HEARTBEAT_RESPONSE(23),
    CHANGE_SPW_RESULT(24),
    ALBA_RESULT(29),
    SET_AUTO_SELECTED_WORLD(32),
    WORLD_INFO_FOR_SHINING_RESULT(33),
    CLIENT_START(36),
    SERVER_STATUS(38),
    AUTH_SERVER(47),

    // CChatSocket::ProcessPacket
    CHAT_LOGIN_RESULT(1),
    CHAT_LOGOUT_RESULT(11),
    CHAT_ALIVE_REQ(13),
    CHAT_ENTER_GUILD_CHAT_ROOM_RESULT(15),
    CHAT_GUILD_CHAT_MESSAGE(18),
    CHAT_FRIEND_CHAT_MESSAGE(19),
    CHAT_BLOCK_GUILD_FRIEND_CHAT(28),

    // CWvsContext::OnPacket
    INVENTORY_OPERATION(71),
    INVENTORY_GROW(72),
    STAT_CHANGED(73),
    TEMPORARY_STAT_SET(74),
    TEMPORARY_STAT_RESET(75),
    FORCED_STAT_SET(76),
    FORCED_STAT_RESET(77),
    CHANGE_SKILL_RECORD_RESULT(78),
    CHANGE_STEAL_MEMORY_RESULT(79),
    USER_DAMAGE_ON_FALLING_CHECK(80),
    PERSONAL_SHOP_BUY_CHECK(81),
    MOB_DROP_MESO_PICKUP(82),
    BREAK_TIME_FIELD_ENTER(83),
    RUNE_ACT_SUCCESS(84),
    RESULT_STEAL_SKILL_LIST(85),
    SKILL_USE_RESULT(86),
    EXCL_REQUEST(87),
    GIVE_POPULARITY_RESULT(88),
    MESSAGE(89),
    MEMO_RESULT(90),
    MAP_TRANSFER_RESULT(91),
    ANTI_MACRO_RESULT(92),
    ANTI_MACRO_BOMB_RESULT(93),
    CLAIM_RESULT(95),
    SET_CLAIM_SVR_AVAILABLE_TIME(96),
    CLAIM_SVR_STATUS_CHANGED(97),
    STAR_PLANET_USER_COUNT(98),
    SET_TAMING_MOB_INFO(99),
    QUEST_CLEAR(100),
    ENTRUSTED_SHOP_CHECK_RESULT(101),
    SKILL_LEARN_ITEM_RESULT(102),
    SKILL_RESET_ITEM_RESULT(103),
    ABILITY_RESET_ITEM_RESULT(104),
    EXP_CONSUME_ITEM_RESULT(105),
    EXP_ITEM_GET_RESULT(106),
    CHAR_SLOT_INC_RESULT(107),
    CHAR_RENAME_RESULT(108),
    GATHER_ITEM_RESULT(109),
    SORT_ITEM_RESULT(110),
    CHARACTER_INFO(113),
    PARTY_RESULT(114),
    PARTY_MEMBER_CANDIDATE_RESULT(115),
    URUS_PARTY_MEMBER_CANDIDATE_RESULT(116),
    PARTY_CANDIDATE_RESULT(117),
    URUS_PARTY_RESULT(118),
    INTRUSION_FRIEND_CANDIDATE_RESULT(119),
    INTRUSION_LOBBY_CANDIDATE_RESULT(120),
    EXPEDITION_RESULT(122),
    FRIEND_RESULT(123),
    STAR_FRIEND_RESULT(124),
    LOAD_ACCOUNT_ID_OF_CHARACTER_FRIEND_RESULT(125),
    GUILD_REQUEST(126),
    GUILD_RESULT(127),
    ALLIANCE_RESULT(128),
    TOWN_PORTAL(129),
    BROADCAST_MSG(130),
    INCUBATOR_RESULT(132),
    INCUBATOR_HOT_ITEM_RESULT(133),
    SHOP_SCANNER_RESULT(134),
    SHOP_LINK_RESULT(135),
    AUCTION_RESULT(136),
    AUCTION_MESSAGE(137),
    MARRIAGE_REQUEST(138),
    MARRIAGE_RESULT(139),
    WEDDING_GIFT_RESULT(140),
    NOTIFY_MARRIED_PARTNER_MAP_TRANSFER(141),
    CASHPET_FOOD_RESULT(142),
    CASHPET_PICK_UP_ON_OFF_RESULT(143),
    CASHPET_SKILL_SETTING_RESULT(144),
    CASH_LOOK_CHANGE_RESULT(145),
    CASHPET_DYEING_RESULT(146),
    SET_WEEK_EVENT_MESSAGE(147),
    SET_POTION_DISCOUNT_RATE(148),
    BRIDLE_MOB_CATCH_FAIL(149),
    IMITATED_NPC_RESULT(150),
    IMITATED_NPC_DATA(151),
    LIMITED_NPC_DISABLE_INFO(153),
    MONSTER_BOOK_SET_CARD(154),
    MONSTER_BOOK_SET_COVER(155),
    HOUR_CHANGE(156),
    MINIMAP_ON_OFF(157),
    CONSULT_AUTH_KEY_UPDATE(158),
    CLASS_COMPETITION_AUTH_KEY_UPDATE(159),
    WEB_BOARD_AUTH_KEY_UPDATE(160),
    SESSION_VALUE(161),
    PARTY_VALUE(162),
    FIELD_SET_VARIABLE(163),
    FIELD_VALUE(164),
    BONUS_EXP_RATE_CHANGED(165),
    FAMILY_CHART_RESULT(166),
    FAMILY_INFO_RESULT(167),
    FAMILY_RESULT(168),
    FAMILY_JOIN_REQUEST(169),
    FAMILY_JOIN_REQUEST_RESULT(170),
    FAMILY_JOIN_ACCEPTED(171),
    FAMILY_PRIVILEGE_LIST(172),
    FAMILY_FAMOUS_POINT_INC_RESULT(173),
    FAMILY_NOTIFY_LOGIN_OR_LOGOUT(174),
    FAMILY_SET_PRIVILEGE(175),
    FAMILY_SUMMON_REQUEST(176),
    NOTIFY_LEVEL_UP(177),
    NOTIFY_WEDDING(178),
    NOTIFY_JOB_CHANGE(179),
    SET_BUY_EQUIP_EXT(180),
    SET_PASSENSER_REQUEST(181), // typo?
    SCRIPT_PROGRESS_MESSAGE_BY_SOUL(182),
    SCRIPT_PROGRESS_MESSAGE(183),
    SCRUOT_PROGRESS_ITEM_MESSAGE(184),
    STATIC_SCREEN_MESSAGE(185),
    OFF_STATIC_SCREEN_MESSAGE(186),
    WEATHER_EFFECT_NOTICE(187),
    WEATHER_EFFECT_NOTICE_Y(188),
    PROGRESS_MESSAGE_FONT(189),
    DATA_CRC_CHECK_FAILED(190),
    SHOW_SLOT_MESSAGE(191),
    WILD_HUNTER_INFO(192),
    ZERO_INFO(193),
    ZERO_WP(194),
    ZERO_INFO_SUB_HP(195),
    UI_OPEN(196),
    CLEAR_ANNOUNCED_QUEST(197),
    RESULT_INSTANCE_TABLE(198),
    COOL_TIME_SET(199),
    ITEM_POT_CHANGE(200),
    SET_ITEM_COOL_TIME(201),
    SET_AD_DISPLAY_INFO(202),
    SET_AD_DISPLAY_STATUS(203),
    SET_SON_OF_LINKED_SKILL_RESULT(204),
    SET_MAPLE_STYLE_INFO(205),
    SET_BUY_LIMIT_COUNT(206),
    RESET_BUY_LIMIT_COUNT(207),
    UPDATE_UI_EVENT_LIST_INFO(208),
    DOJANG_RANKING_RESULT(209),
    SHUTDOWN_MESSAGE(212),
    RESULT_SET_STEAL_SKILL(213),
    SLASH_COMMAND(214),
    START_NAVIGATION(215),
    FUNCKEY_SET_BY_SCRIPT(216),
    CHARACTER_POTENTIAL_SET(217),
    CHARACTER_POTENTIAL_RESET(218),
    CHARACTER_HONOR_EXP(219),
    ASWAN_RESULT(221),
    READY_FOR_RESPAWN(222),
    READY_FOR_RESPAWN_BY_POINT(223),
    OPEN_READY_FOR_RESPAWN_UI(224),
    CHARACTER_HONOR_GIFT(225),
    CROSS_HUNTER_COMPLETE_RESULT(226),
    CROSS_HUNTER_SHOP_RESULT(227),
    SET_CASH_ITEM_NOTICE(228),
    SET_SPECIAL_CASH_ITEM(229),
    SHOW_EVENT_NOTICE(230),
    BOARD_GAME_RESULT(231),
    YUT_GAME_RESULT(232),
    VALUE_PACK_RESULT(233),
    NAVI_FLYING_RESULT(234),
    SET_EXCL_REQUEST_SENT(235),
    CHECK_WEDDING_EX_RESULT(236),
    BINGO_RESULT(237),
    BINGO_CASSANDRA_RESULT(238),
    UPDATE_VIP_GRADE(239),
    MESO_RANGER_RESULT(240),
    SET_MAPLE_POINT(241),
    SET_MIRACLE_TIME_INFO(243),
    HYPER_SKILL_RESET_RESULT(244),
    GET_SERVER_TIME(245),
    GET_CHARACTER_POSITION(246),
    RETURN_EFFECT_CONFIRM(248),
    RETURN_EFFECT_MODIFIED(249),
    WHITE_ADDTIONAL_CUBE_RESULT(250),
    BLACK_CUBE_RESULT(251),
    MEMORIAL_CUBE_RESULT(252),
    MEMORIAL_CUBE_MODIFIED(253),
    DRESS_UP_INFO_MODIFIED(254),
    RESET_STATE_FOR_OFF_SKILL(255),
    SET_OFF_STATE_FOR_OFF_SKILL(256),
    ISSUE_RELOGIN_COOKIE(257),
    AVATAR_PACK_TEST(258),
    EVOLVING_RESULT(259),
    ACTIBAR_RESULT(260),
    GUILD_SEARCH_RESULT(262),
    HALLOWEEN_CANDY_RANKING_RESULT(264),
    GET_REWARD_RESULT(265),
    MENTORING(266),
    GET_LOTTERY_RESULT(267),
    CHECK_PROCESS_RESULT(268),
    COMPLETE_NPC_SPEECH_SUCCESS(269),
    COMPLETE_SPECIAL_CHECK_SUCCESS(270),
    SET_ACCOUNT_INFO(271),
    SET_GACHAPFEVER_TIME_INFO(272),
    AVATAR_MEGAPHONE_RES(273),
    SET_AVATAR_MEGAPHONE(274),
    CLEAR_AVATAR_MEGAPHONE(275),
    REQUEST_EVENT_LIST(276),
    LIKE_POINT(277),
    SIGN_ERROR_ACK(278),
    ASK_AFTER_ERROR_ACK(279),
    EVENT_NAME_TAG(280),
    ACQUIRE_EVENT_NAME_TAG(281),
    JOB_FREE_CHANGE_RESULT(282),
    EVENT_LOTTERY_OPEN(283),
    EVENT_LOTTERY_RESULT(284),
    SCREEN_MSG(292),
    LIMIT_GOODS_NOTICE_RESULT(293),
    MONSTER_BATTLE_SYSTEM_RESULT(295),
    MONSTER_BATTLE_COMBAT_RESULT(296),
    UNIVERSE_BOSS_IMPOSSIBLE(298),
    CASH_SHOP_PREVIEW_INFO(299),
    CHANGE_SOUL_COLLECTION_RESULT(300),
    SELECT_SOUL_COLLECTION_RESULT(301),
    MASTER_PIECE_REWARD(302),
    PENDANT_SLOT_INC_RESULT(303),
    BOSS_ARENA_MATCH_SUCCESS(304),
    BOSS_ARENA_MATCH_FAIL(305),
    BOSS_ARENA_MATCH_REQUEST_DONE(306),
    USER_SOUL_MATCHING(307),
    CATAPULT_UPGRADE_SKILL(308),
    CATAPULT_RESET_SKILL(309),
    PARTY_QUEST_RANKING_RESULT(310),
    SET_COORDINATICONTEST_INFO(311),
    WORLD_TRANSFER_RESULT(312),
    TRUNK_SLOT_INC_RESULT(313),
    ELITE_MOB_WMI(314),
    RANDOM_PORTAL_NOTICE(315),
    NOTIFY_WORLD_TRANSFER_HELPER(316),
    EQUIPMENT_ENCHANT(317),
    TOP_TOWER_RANK_RESULT(318),
    FRIEND_TOWER_RANK_RESULT(319),
    TOWER_RESULT_UI_OPEN(320),
    MANNEQUIN_RESULT(321),
    IRBOX_PACKET(322),
    CREATE_KOREAN_JUMPING_GAME(323),
    CREATE_SWING_GAME(324),
    UPDATE_MAPLE_TV_SHOW_TIME(325),
    RETURN_TO_TITLE(326),
    RETURN_TO_CHARACTER_SELECT(327),
    FLAME_WIZARD_FLAME_WALK_EFFECT(328),
    FLAME_WIZARD_FLARE_BLINK(329),
    SUMMONED_AVATAR_SYNC(330),
    CASH_SHOP_EVENT_INFO(331),
    BLACK_LIST(332),
    OPEN_UI_TEST(333),
    SWITCH_BLACK_LIST_VIEW(334),
    SCROLL_UPGRADE_FEVER_TIME(335),
    TEXT_EQUIP_INFO(336),
    TEXT_EQUIP_UI_OPEN(337),
    UI_STAR_PLANET_MINI_GAME_RESULT(338),
    UI_STAR_PLANET_TREND_SHOP(339),
    UI_STAR_PLANET_MINI_GAME_QUEUE(340),
    STAR_PLANET_ROUND_INFO(342),
    STAR_PLANET_RESULT(343),
    BACK_SPEED_CTRL(344),
    SET_MAZE_AREA(345),
    CHARACTER_BURNING(346),
    BATTLE_STAT_CORE_INFO(347),
    BATTLE_STAT_CORE_ACK(348),
    GACHAPTEST_RESULT(349),
    MASTER_PIECE_TEST_RESULT(350),
    ROYAL_STYLE_TEST_RESULT(351),
    BEAUTY_COUPTEST_RESULT(352),
    NICK_SKILL_EXPIRED(353),
    RANDOM_MISSIRESULT(354),
    ON_12TH_TRESURE_RESULT(355),
    ON_12TH_TRESURE_BUFF(356),
    ITEM_COLLECTION_RESULT(357),
    CHECK_COLLECTION_COMPLETE_RESULT(358),
    ITEM_COLLECTION_LIST(359),
    RECEIVE_TOADS_HAMMER_REQUEST_RESULT(360),
    RECEIVE_HYPER_STAT_SKILL_RESET_RESULT(361),
    INVENTORY_OPERATION_RESULT(362),
    GET_SAVED_URUS_SKILL(363),
    SET_ROLE_PLAYING_CHARACTER_INFO(364),
    MVP_ALARM(365),
    MONSTER_COLLECTION_RESULT(366),
    TOWER_CHAIR_SETTING_RESULT(367),
    NEED_CLIENT_RESPONSE(368),
    CHARACTER_MODIFIED(369),
    TRADE_KING_SHOP_ITEM(370),
    TRADE_KING_SHOP_RES(371),
    PLAT_FORMAR_ENTER_RESULT(372),
    PLAT_FORMAR_OXYZEN(373),
    GUILD_BBS_RESULT(384),

    MACRO_SYS_DATA_INIT(427),

    // CStage::OnPacket
    SET_FIELD(428),
    SET_FARM_FIELD(429),
    SET_CASH_SHOP(431),

    // CField::OnPacket (general)
    TRANSFER_FIELD_REQ_IGNORED(432),
    TRANSFER_CHANNEL_REQ_IGNORED(433),
    TRANSFER_PVP_REQ_IGNORED(434),
    FIELD_SPECIFIC_DATA(435),
    GROUP_MESSAGE(436),
    FIELD_UNIVERSE_MESSAGE(437),
    WHISPER(438),
    SUMMITEM_INAVAILABLE(439),
    FIELD_EFFECT(440),
    BLOW_WEATHER(448),
    PLAY_JUKE_BOX(449),
    ADMIN_RESULT(450),
    QUIZ(451),
    FIELD_SET_DESC(452),
    CLOCK(453),
    SET_QUEST_CLEAR(456),
    SET_QUEST_TIME(457),
    SET_OBJECT_STATE(458),
    DESTROY(459),
    STALK_RESULT(461),
    INIT(464),
    FOOT_HOLD_MOVE(465),
    CORRECT_FOOT_HOLD_MOVE(466),
    SMART_MOB_NOTICE(471),
    CHANGE_PHASE(472),
    CHANGE_MOB_ZONE(473),
    PV_P_MIGRATE_INFO_RESULT(475),
    CUR_NODE_EVENT_END(476),
    CREATE_FORCE_ATOM(477),
    SET_ACHIEVE_RATE(478),
    SET_QUICK_MOVE_INFO(479),
    CHANGE_ASWAN_SIEGE_WEAPGAUGE(480),
    CREATE_OBTACLE(481),
    CLEAR_OBTACLE(482),
    B2_FOOT_HOLD_CREATE(484),
    DEBUFF_OBJ_ON(485),
    CREATE_FALLING_CATCHER(486),
    CHASE_EFFECT_SET(487),
    MESO_EXCHANGE_RESULT(488),
    SET_MIRROR_DUNGEINFO(489),
    SET_INTRUSION(490),
    CANNOT_DROP(491),
    FOOT_HOLD_OFF(492),
    LADDER_ROPE_OFF(493),
    MOMENT_AREA_OFF(494),
    MOMENT_AREA_OFF_ALL(495),
    CHAT_LET_CLIENT_CONNECT(496),
    CHAT_INDUCE_CLIENT_CONNECT(497),
    PACKET(498),
    ELITE_STATE(499),
    PLAY_SOUND(500),
    STACK_EVENT_GAUGE(501),
    SET_UNIFIELD(502),
    STAR_PLANET_BURNING_TIME_INFO(504),
    PUBLIC_SHARE_STATE(505),
    FUNCTITEMP_BLOCK(506),
    UI_STATUS_BAR_PACKET(507),
    FIELD_SKILL_DELAY(508),
    WEATHER_PACKET_ADD(509),
    WEATHER_PACKET_REMOVE(510),
    WEATHER_PACKET_MSG(511),
    ADD_WRECKAGE(512),
    DEL_WRECKAGE(513),
    CREATE_MIRROR_IMAGE(514),
    FUNTION_FOOTHOLD_MAN(515),

    // CField_Massacre::OnPacket
    MASSACRE_INC_GAUGE(462),

    // CField_KillCount::OnPacket
    FIELD_KILL_COUNT(470),

    // CUserPool::OnPacket?
    USER_ENTER_FIELD(516),
    USER_LEAVE_FIELD(517),

    // CUserPool::OnCommonPacket
    CHAT(518),
    AD_BOARD(519),
    MINI_ROOM_BALLOON(520),
    SET_CONSUME_ITEM_EFFECT(521),
    SHOW_ITEM_UPGRADE_EFFECT(522),
    SHOW_ITEM_SKILL_SOCKET_UPGRADE_EFFECT(524),
    SHOW_ITEM_SKILL_OPTION_UPGRADE_EFFECT(525),
    SHOW_ITEM_RELEASE_EFFECT(526),
    SHOW_ITEM_UNRELEASE_EFFECT(527),
    SHOW_ITEM_LUCKY_ITEM_EFFECT(528),
    SHOW_ITEM_MEMORIAL_EFFECT(529),
    SHOW_ITEM_ADDITIONAL_UN_RELEASE_EFFECT(530),
    SHOW_ITEM_ADDITIONAL_SLOT_EXTEND_EFFECT(531),
    SHOW_ITEM_FIRE_WORKS_EFFEC(532),
    SHOW_ITEM_OPTICHANGE_EFFECT(533),
    RED_CUBE_RESULT(534),
    DAMAGE_BY_USER(535),
    FOLLOW_CHARACTER(540),
    SHOW_PQ_REWARD(541),
    SET_ONE_TIME_ACTION(542),
    MAKING_SKILL_RESULT(543),
    SET_MAKING_MEISTER_SKILL_EFF(544),
    GATHER_RESULT(545),
    USER_EXPLODE(546),
    USER_HIT_BY_COUNTER(547),
    PYRAMID_LETHAL_ATTACK(548),
    MIXER_RESULT(549),
    WAIT_QUEUE_RESPONSE(550),
    CATEGORY_EVENT_NAME_TAG(551),
    SET_DAMAGE_SKIN(552),
    SET_PREMIUM_DAMAGE_SKIN(553),
    SET_SOUL_EFFECT(554),
    SIT_RESULT(555),
    STAR_PLANET_POINT_INFO(556),
    STAR_PLANET_AVATAR_LOOK_SET(557),
    TOSSED_BY_MOB_SKILL(558),
    BATTLE_ATTACK_HIT(559),
    BATTLE_USER_HIT_BY_MOB(560),
    FREEZE_HOT_EVENT_INFO(561),
    EVENT_BEST_FRIEND_INFO(562),
    SET_REPEAT_ONE_TIME_ACTION(563),
    SET_REPLACE_MOVE_ACTION(564),
    IN_GAME_CUBE_RESULT(565),
    SET_ACTIVE_EMOTICON_ITEM(567),
    CREATE_PSYCHIC_LOCK(568),
    RECREATE_PATHPSYCHIC_LOCK(569),
    RELEASE_PSYCHIC_LOCK(570),
    RELEASE_PSYCHIC_LOCK_MOB(571),
    CREATE_PSYCHIC_AREA(572),
    RELEASE_PSYCHIC_AREA(573),
    RW_ZERO_BUNKER_MOB_BIND(574),
    BEAST_FORM_WING_OFF(575),
    SET_MESO_CHAIR_COUNT(576),
    REFRESH_NAME_TAG_MARK(577),
    STIGMA_EFFECT(578),
//    SHOW_POTENTIAL_BLACK_CUBE(529),

    // CUser::OnPetPacket
    PET_ACTIVATED(579),
    PET_MOVE(580),
    PET_ACTION(581),
    PET_ACTION_SPEAK(582),
    PET_NAME_CHANGED(583),
    PET_LOAD_EXCEPTION_LIST(584),
    PET_HUE_CHANGED(585),
    PET_MODIFIED(586),
    PET_ACTION_COMMAND(589),

    // CUser::OnDragonPacket
    DRAGON_CREATED(590),
    DRAGON_MOVE(591),
    DRAGON_REMOVE(592),
    DRAGON_REMOVE_RP_CHAR(593),

    // CUser::OnAndroidPacket
    ANDROID_CREATED(594),
    ANDROID_MOVE(595),
    ANDROID_ACTION_SET(596),
    ANDROID_MODIFIED(597),
    ANDROID_REMOVED(598),

    // CUser::OnFoxManPacket
    FOX_MAN_ENTER_FIELD(599),
    FOX_MAN_MOVE(600),
    FOX_MAN_EXCL_RESULT(601),
    FOX_MAN_SHOW_CHANGE_EFFECT(602),
    FOX_MAN_MODIFIED(603),
    FOX_MAN_LEAVE_FIELD(604),

    // CUser::OnSkillPetPacket
    SKILL_PET_MOVE(606),
    SKILL_PET_ACTION(607),
    SKILL_PET_STATE(608),

    // More here? Kmst goes from skill -> remote instantly, this doesn't

    // CUserRemote::OnPacket
    REMOTE_MOVE(633),
    REMOTE_MELEE_ATTACK(634),
    REMOTE_SHOOT_ATTACK(635),
    REMOTE_MAGIC_ATTACK(636),
    REMOTE_BODY(637),
    REMOTE_MOVING_SHOOT_ATTACK_PREPARE(639),
    REMOTE_SKILL_CANCEL(640),
    REMOTE_HIT(641),
    REMOTE_EMOTION(642),
    REMOTE_ANDROID_EMOTION(643),
    REMOTE_SET_ACTIVE_EFFECT_ITEM(644),
    REMOTE_SET_MONKEY_EFFECT_ITEM(645),
    REMOTE_SET_ACTIVE_NICK_ITEM(646),
    REMOTE_SET_DEFAULT_WING_ITEM(647),
    REMOTE_SET_KAISER_TRANSFORM_ITEM(648),
    REMOTE_SET_CUSTOM_RIDING(649),
    REMOTE_SHOW_UPGRADE_TOMB_EFFECT(650),
    REMOTE_SET_ACTIVE_PORTABLE_CHAIR(651),
    REMOTE_AVATAR_MODIFIED(652),
    REMOTE_SET_TEMPORARY_STAT(654),
    REMOTE_RESET_TEMPORARY_STAT(655),
    REMOTE_RECEIVE_HP(656),
    REMOTE_GUILD_NAME_CHANGED(657),
    REMOTE_GUILD_MARK_CHANGED(658),
    REMOTE_PVP_TEAM_CHANGED(659),
    REMOTE_UPDATE_PVP_HP_TAG(661),
    REMOTE_DRAGON_GLIDE(662),
    REMOTE_KEY_DOWN_AREA_MOVE_PATH(663),
    REMOTE_LASER_INFO_FOR_REMOTE(664),
    REMOTE_KAISER_COLOR_OR_MORPH_CHANGE(665),
    REMOTE_INTRUSION(669),
    REMOTE_ZERO_LAST_ASSIST_STATE(670),
    REMOTE_SCOUTER_MAX_DAMAGE_UPDATE(679),
    REMOTE_STIGMA_DELIVERY_RESPONSE(680),
    REMOTE_EFFECT(653),
    REMOTE_GATHER_ACTISET(660),
    REMOTE_DESTROY_GRENADE(666),
    REMOTE_SET_ITEM_ACTION(667),
    REMOTE_ZERO_TAG(668),
    REMOTE_SET_MOVE_GRENADE(671),
    REMOTE_SET_CUSTOMIZE_EFFECT(672),
    REMOTE_RUNE_STONE_ACTION(673),
    REMOTE_KINESIS_PSYCHIC_ENERGY_SHIELD_EFFECT(674),
    REMOTE_DRAGON_ACTION(675),
    REMOTE_DRAGON_BREATH_EARTH_EFFECT(676),
    REMOTE_RELEASE_RW_GRAB(677),
    REMOTE_RW_MULTI_CHARGE_CANCEL_REQUEST(678),
    REMOTE_THROW_GRENADE(684),

    // CUserLocal::OnPacket
    EMOTION(685),
    ANDROID_EMOTION(686),
    EFFECT(687),
    TELEPORT(688),
    MESO_GIVE_SUCCEEDED(690),
    MESO_GIVE_FAILED(691),
    QUEST_RESULT(692),
    NOTIFY_HP_DEC_BY_FIELD(693),
    USER_PET_SKILL_CHANGED(694),
    BALLOMSG(695),
    PLAY_EVENT_SOUND(696),
    PLAY_MINIGAME_SOUND(697),
    MAKER_RESULT(698),
    OPEN_CLASS_COMPETITIPAGE(700),
    OPEN_UI(701),
    CLOSE_UI(702),
    OPEN_UI_WITH_OPTION(703),
    OPEN_WEB_UI(704),
    SET_DIRECTIMODE(705),
    SET_IN_GAME_DIRECTIMODE(706),
    SET_STAND_ALONE_MODE(707),
    HIRE_TUTOR(708),
    TUTOR_MSG(709),
    HIRE_TUTOR_BY_ID(710),
    SET_PARTNER(711),
    SET_PARTNER_ACTION(712),
    SET_PARTNER_FORCE_FLIP(713),
    SWITCH_RP(714),
    MOD_COMBO_RESPONSE(715),
    INC_COMBO_RESPONSE_BY_COMBO_RECHARGE(716),
    RADIO_SCHEDULE(717),
    OPEN_SKILL_GUIDE(718),
    NOTICE_MSG(719),
    CHAT_MSG(720),
    SET_UTIL_DLG(721),
    BUFFZONE_EFFECT(722),
    TIME_BOMB_ATTACK(723),
    EXPLOSION_ATTACK(724),
    PASSIVE_MOVE(725),
    FOLLOW_CHARACTER_FAILED(726),
    SET_NEXT_SHOOT_EX_JABLIN(727),
    RESULT(728),
    GATHER_REQUEST_RESULT(729),
    RUNE_STONE_USE_ACK(730),
    BAG_ITEM_USE_RESULT(731),
    RANDOM_TELEPORT_KEY(732),
    SET_GAGE_POINT(733),
    IN_GAME_DIRECTIEVENT(734),
    MEDAL_REISSUE_RESULT(735),
    DODGE_SKILL_READY(736),
    REMOVE_MICRO_BUFF_SKILL(737),
    VIDEO_BY_SCRIPT(738),
    REWARD_MOB_LIST_RESULT(739),
    INC_JUDGEMENT_STACK_RESPONSE(740),
    INC_CHARM_BY_CASHP_R_MSG(741),
    SET_BUFF_PROTECTOR(742),
    INC_LARKNESS_RESPONSE(743),
    DETONATE_BOMB(744),
    AGGRO_RANK_INFO_NAME(745),
    DEATH_COUNT_INFO(746),
    DEATH_COUNT_INFO_2(747),
    SET_DRESS_CHANGED(748),
    SERVER_ACK_MOB_ZONE_STATE_CHANGE(749),
    RANDOM_EMOTION(752),
    SET_FLIP_THE_COIN_ENABLED(753),
    TRICK_OR_TREAT_RESULT(754),
    GIANT_PET_BUFF(755),
    B2_BODY_RESULT(756),
    SET_DEAD(757),
    OPEN_UI_DEAD(758),
    EXPIRED_NOTICE(759),
    DO_LOTTERY_UI(760),
    ROULETTE_START(761),
    SIT_TIME_CAPSULE(762),
    SIT_DUMMY_PORTABLE_CHAIR(763),
    GO_MONSTER_FARM(764),
    MONSTER_LIFE_INVITE_ITEM_RESULT(765),
    PHOTO_GET_RESULT(766),
    FINAL_ATTACK_REQUEST(767),
    SET_GUN(768),
    SET_AMMO(769),
    CREATE_GUN(770),
    CLEAR_GUN(771),
    RESULT_SHOOT_ATTACK_IN_FPS_MODE(772),
    MIRROR_DUNGEENTER_FAIL(773),
    MIRROR_DUNGEUNIT_CLEARED(774),
    REGISTER_MIRROR_DUNGEBOSS(775),
    MIRROR_DUNGERECORD(776),
    OPEN_URL(777),
    ZERO_COMBAT_RECOVERY(778),
    MIRROR_STUDY_UI_OPEN(779),
    SKILL_COOLTIME_REDUCE(780),
    MIRROR_READING_UI_OPEN(781),
    USER_CTRL_MOB_SKILL_Q_PUSH(782),
    ZERO_LEVEL_UP_ALARM(783),
    USER_CTRL_MOB_SKILL_Q_POP(784),
    USER_CTRL_MOB_SKILL_FAIL(785),
    FORCE_SUMMONED_REMOVE(786),
    USER_RESPAWN(787),
    USER_CTRL_MOB_SKILL_FORCED_POP(788),
    MONSTER_BATTLE_CAPTURE(789),
    IS_UNIVERSE(790),
    PORTAL_GROUP(791),
    SET_MOVABLE(792),
    USER_CTRL_MOB_SKILL_PUSH_COOL_TIME(793),
    MOVE_PARTICLE_EFF(794),
    DO_ACTIVE_EVENT_SKILL_BY_SCRIPT(795),
    SET_STATUSBAR_JOB_NAME_BLUR(796),
    RUNE_STONE_SKILL_ACK(797),
    RESET_RUNE_STONE_ACTION(798),
    MOVE_TO_CONTENTS_CANNOT_MIGRATE(799),
    PLAY_AMBIENT_SOUND(800),
    STOP_AMBIENT_SOUND(801),
    FLAME_WIZARD_ELEMENT_FLAME_SUMMON(802),
    CAMERA_MODE(803),
    SPOTLIGHT_TO_CHARACTER(804),
    BOSS_PARTY_CHECK_DONE(805),
    FREE_LOOK_CHANGE_UI_OPEN(806),
    FREE_LOOK_CHANGE_SUCCESS(807),
    GRAY_BACKGROUND(808),
    GET_NPC_CURRENT_ACTION(809),
    CAMERA_ROTATION(810),
    CAMERA_SWITCH(811),
    NETWORK(812),
    USER_SET_FIELD_FLOATING(813),
    ADD_POPUP_SAY(814),
    REMOVE_POPUP_SAY(815),
    JAGUAR_SKILL(816),
    ACTION_LAYER_RELMOVE(817),
    SEND_CLIENT_RESOLUTION(818),
    USER_BONUS_ATTACK_REQUEST(819),
    USER_RAND_AREA_ATTACK_REQUEST(820),
    JAGUAR_ACTIVE(821),
    SKILL_COOLTIME_SET_M(822),
    SET_CARRY_REACTOR_INFO(823),
    REACTOR_SKILL_USE_REQUEST(824),
    OPEN_BATTLE_PV_PCHAMP_SELECT_UI(825),
    BATTLE_PVP_ITEM_DROP_SOUND(826),
    SET_MESO_COUNT_BY_SCRIPT(827),
    PLANT_POT_CLICK_RESULT(828),
    PLANT_POT_EFFECT(829),
    DAMAGE(830),
    ROYAL_GUARD_ATTACK(831),
    DO_ACTIVE_PSYCHIC_AREA(832),
    ENTER_FIELD_PSYCHIC_INFO(833),
    LEAVE_FIELD_PSYCHIC_INFO(834),
    TOUCH_ME_STATE_RESULT(835),
    FIELD_SCORE_UPDATE(836),
    URUS_REUSLT_UI_OPEN(837),
    SET_NO_MORE_LIFE(838),
    SOME_DECODE4(839),
    CREATE_AREA_DOT_INFO(840),
    SET_SLOW_DOWN(841),
    REGISTER_EXTRA_SKILL(842),
    RES_WARRIOR_LIFT_MOB_INFO(843),
    USER_RENAME_RESULT(844),
    DAMAGE_SKIN_SAVE_RESULT(845),
    STIGMA_REMAIN_TIME(846),
    OPEN_MESO_SACK_SUCCESS(847),
    OPEN_MESO_SACK_FAIL(848),

    FAMILIAR_ADD_RESULT(862),

    MOD_HAYATO_COMBO(886),
    SKILL_COOLTIME_SET(890),

    // CSummonedPool::OnPacket
    SUMMONED_CREATED(892),
    SUMMONED_REMOVED(893),
    SUMMONED_MOVE(894),
    SUMMONED_ATTACK(895),
    SUMMONED_ATTACK_PVP(896),
    SUMMONED_SET_REFERENCE(897),
    SUMMONED_SKILL(898),
    SUMMONED_SKILL_PVP(899),
    SUMMONED_UPDATE_HP_TAG(900),
    SUMMONED_ATTACK_DONE(901),
    SUMMONED_SET_RESIST(902),
    SUMMONED_ACTION_CHANGE(903),
    SUMMONED_ASSIST_ATTACK_REQUEST(904),
    SUMMONED_SUMMON_ATTACK_ACTIVE(905),
    SUMMONED_BEHOLDER_REVENGE_ATTACK(906),
    SUMMONED_HIT(907),

    // CMobPool::OnPacket
    MOB_ENTER_FIELD(908),
    MOB_LEAVE_FIELD(909),
    MOB_CHANGE_CONTROLLER(910),
    MOB_SET_AFTER_ATTACK(911),
    MOB_BLOCK_ATTACK(912),
    MOB_CRC_KEY_CHANGED(924),

    // CMobPool::OnMobPacket
    MOB_MOVE(914),
    MOB_CONTROL_ACK(915),
    MOB_STAT_SET(917),
    MOB_STAT_RESET(918),
    MOB_SUSPEND_RESET(919),
    MOB_AFFECTED(920),
    MOB_DAMAGED(921),
    MOB_SPECIAL_EFFECT_BY_SKILL(922),
    MOB_CRC_DATA_REQUEST(925),
    MOB_HP_INDICATOR(926),
    MOB_CATCH_EFFECT(927),
    MOB_STEAL_EFFECT(928),
    MOB_EFFECT_BY_ITEM(929),
    MOB_SPEAKING(930),
    MOB_MESSAGING(931),
    MOB_SKILL_DELAY(932),
    ESCORT_FULL_PATH(933),
    ESCORT_STOP_END_PERMISSION(934),
    ESCORT_STOP_BY_SCRIPT(935),
    ESCORT_STOP_SAY(936),
    ESCORT_RETURN_BEFORE(937),
    MOB_NEXT_ATTACK(938),
    MOB_TELEPORT_REQUEST(939),
    MOB_FORCED_ACTION(940),
    MOB_FORCED_SKILL_ACTION(941),
    MOB_TIME_RESIST(943),
    MOB_ONEKILL_DAMAGE(944),
    MOB_ATTACK_BLOCK(945),
    MOB_ATTACK_PRIORITY(946),
    MOB_ATTACK_TIME_INFO(947),
    MOB_DAMAGE_SHARE_INFO_TO_LOCAL(948),
    MOB_DAMAGE_SHARE_INFO_TO_REMOTE(949),
    MOB_BREAK_DOWN_TIME_ZONE_TIME_OUT(950),
    MOB_MOVE_AREA_SET(951),
    MOB_DO_SKILL_BY_HIT(952),
    MOB_CASTING_BAR_SKILL(953),
    MOB_FLY_TARGET(954),
    MOB_BOUNCE_ATTACK_SKILL(955),
    MOB_AREA_INSTALL_BY_HIT(956),
    MOB_LTRB_DAMAGE_SKILL(957),
    MOB_SUMMSUB_BODY(958),
    MOB_LASER_CONTROL(959),
    MOB_SCALE(960),
    MOB_HANG_OVER_REQUEST(964),
    MOB_HANG_OVER_RELEASE_REQUEST(965),
    MOB_DEAD_FPS_MODE(966),
    MOB_AIR_HIT(967),
    MOB_DEMIAN_DELAYED_ATTACK_CREATE(968),
    MOB_REGISTER_REL_MOB_ZONE(969),
    MOB_UNREGISTER_REL_MOB_ZONE(970),
    MOB_NEXT_TARGET_FROM_SVR(971),
    MOB_ATTACKED_BY_MOB(978),

    // CMinionPool::OnPacket
    MINION_ENTER_FIELD(980),
    MINION_LEAVE_FIELD(981),
    MINION_CHANGE_CONTROLLER(982),
    MINION_GEN_BEYOND_SPLIT(983),

    // CNpcPool::OnPacket
    NPC_ENTER_FIELD(984),
    NPC_LEAVE_FIELD(985),
    NPC_ENTER_FIELD_FOR_QUICK_MOVE(986),
    NPC_CHANGE_CONTROLLER(987),
    NPC_IMITATE_DATA(151),
    NPC_UPDATE_LIMITED_DISABLE_INFO(153),
    SET_NPC_SCRIPT(1004),

    // CNpcPool::OnNpcPacket
    NPC_MOVE(988),
    NPC_UPDATE_LIMITED_INFO(989),
    NPC_SET_QUIZ_SCORE(990),
    NPC_SET_QUIZ_SCORE_ANI(991),
    NPC_SET_FORCE_MOVE(992),
    NPC_SET_FORCE_FLIP(993),
    NPC_SET_EMOTION(994),
    NPC_SET_CHARACTER_BASE_ACTION(995),
    NPC_VIEW_OR_HIDE(996),
    NPC_PRESENT_ITEM_SET(997),
    NPC_PRESENT_TIME_SET(998),
    NPC_RESET_SPECIAL_ACTION(999),
    NPC_SET_SCREEN_INFO(1000),
    NPC_LOCAL_NPC_REPEAT_EFFECT(1001),
    NPC_SET_NOTICE_BOARD_INFO(1002),
    NPC_SET_SPECIAL_ACTION(1003),

    // CField_MomentSwimArea::OnPacket
    MOMENT_SWIM_AREA_SET_WATER_LEVEL(1000),

    // CEmployeePool::OnPacket
    EMPLOYEE_ENTER_FIELD(1006),
    EMPLOYEE_LEAVE_FIELD(1007),
    EMPLOYEE_MINI_ROOM_BALLOON(1008),

    // CDropPool::OnPacket
    DROP_ENTER_FIELD(1009),
    DROP_LEAVE_FIELD(1011),

    // CMessageBoxPool::OnPacket
    CREATE_MESSAGE_BOX_FAILED(1012),
    MESSAGE_BOX_ENTER_FIELD(1013),
    MESSAGE_BOX_LEAVE_FIELD(1014),

    // CAffectedAreaPool::OnPacket
    AFFECTED_AREA_CREATED(1015),
    INSTALLED_AREA_FIRE(1016),
    AFFECTED_AREA_REMOVED(1017),

    // CTownPortalPool::OnPacket
    TOWN_PORTAL_CREATED(1018),
    TOWN_PORTAL_REMOVED(1019),

    // CRandomPortalPool::OnPacket
    RANDOM_PORTAL_CREATED(1019),
    RANDOM_PORTAL_TRY_ENTER_REQUEST(1020),
    RANDOM_PORTAL_REMOVED(1021),

    // COpenGatePool::OnPacket
    OPEN_GATE_CREATED(1023),
    OPEN_GATE_CLOSE(1024),
    OPEN_GATE_REMOVED(1025),


    // CReactorPool::OnPacket
    REACTOR_CHANGE_STATE(1026),
    REACTOR_IDK(1027),
    REACTOR_ENTER_FIELD(1028),
    REACTOR_RESET_STATE(1029),
    REACTOR_OWNER_INFO(1030),
    REACTOR_REMOVE(1031),
    REACTOR_LEAVE_FIELD(1032),

    // CFishingZonePool::OnPacket
    FISHING_INFO(1033),
    FISHING_REWARD(1034),
    FISHING_ZONE_INFO(1035),

    DECOMPOSER_ENTER_FIELD(1036),
    DECOMPOSER_LEAVE_FIELD(1037),

    // CField_GuildBoss::OnPacket
    GUILD_BOSS_HEALER_MOVE(1044),
    GUILD_BOSS_PULLEY_STATE_CHANGE(1045),

    // These are kinda scattered around
    MONSTER_CARNIVAL_CARNIVAL_ENTER(1046), // not a typo
    MONSTER_CARNIVAL_PERSONAL_CP(1047),
    MONSTER_CARNIVAL_TEAM_CSCORE(1048),
    MONSTER_CARNIVAL_SPELL_COOLTIME(1049),
    MONSTER_CARNIVAL_RESULT_SUCCESS(1050),
    MONSTER_CARNIVAL_RESULT_FAIL(1051),
    MONSTER_CARNIVAL_DEATH(1052),
    MONSTER_CARNIVAL_MEMBER_OUT(1053),
    MONSTER_CARNIVAL_SHOW_GAME_RESULT(1054),
    MONSTER_CARNIVAL_UPDATE_RANK_INFO(1055),

    // CField_AriantArena::OnPacket
    ARIANT_ARENA_SHOW_RESULT(460),
    ARIANT_ARENA_USER_SCORE(1056),

    // CField_Defense::OnPacket
    DEFENSE_WAVE(1075),
    DEFENSE_LIFE(1076),
    DEFENSE_POINT(1077),
    DEFENSE_SCORE_RANK(1078),
    DEFENSE_RESULT(1079),

    // CField_MultiStage::OnPacket
    MULTI_STAGE_SET_STAGE(1094),
    MULTI_STAGE_SET_MONSTER_GAUGE(1095),

    // CField_Piranha::OnPacket
    PIRANHA_INIT(1116),
    PIRANHA_INFO(1117),

    // CField_BossArena::OnPacket
    BOSS_ARENA_FIELD_STATE_CHANGE(1132),
    BOSS_ARENA_CURRENT_TEAM_INFO(1133),
    BOSS_ARENA_SELECTED_TEAM_INFO(1134),
    BOSS_ARENA_SELECT_OPPONENT_SELECT_BOSS(1135),
    BOSS_ARENA_SELECT_OPPONENT_CONFIRM(1136),
    BOSS_ARENA_SCORE(1141),
    BOSS_ARENA_RESULT_INFO(1142),
    BOSS_ARENA_FADE_IN_OUT(1144),
    BOSS_ARENA_SUMMON_HEAD_GEAR(1145),
    BOSS_ARENA_BOSS_INFO(1146),
    BOSS_ARENA_USER_HP_CHANGED(1147),

    // CField_BonusReward::OnPacket
    BONUS_REWARD_BOARD_FAO(1159),

    // CField_12th_Tresure::OnPacket
    TWELFTH_THREASURE_UPDATE_GAME_INFO(1164),
    TWELFTH_THREASURE_FIELD_STATE_CHANGE(1165),

    // CField_Demian::OnPacket
    DEMIAN_STIGMA_INCINERATE_OBJECT_PACKET(1171),
    DEMIAN_STIGMA_OBJECT_EFFECT(1172),
    DEMIAN_FLYING_SWORD_CREATE(1173),
    DEMIAN_FLYING_SWORD_MAKE_ENTER_REQUEST(1174),
    DEMIAN_FLYING_SWORD_MAKE_ENTER_INFO(1175),
    DEMIAN_FLYING_SWORD_NODE(1176),
    DEMIAN_FLYING_SWORD_TARGET(1177),
    DEMIAN_CORRUPTION_CHANGE(1178),

    // Kinda unplaced
    FIELD_ON_RANK_CREATE(1113),
    FIELD_RANK_SET_USERNAME(1114),
    FIELD_RANK_NOTIFY_DATA(1115),
    FIELD_FADE_OBJECT_INFO(1155),
    RUNE_STONE_CLEAR_AND_ALL_REGISTER(1156),
    RUNE_STONE_DISAPPEAR(1157),
    RUNE_STONE_APPEAR(1158),
    STAR_PLANET_SCREEN_WORLD_EVENT(1160),
    FIELD_STATE_CREATE(1161),
    FIELD_STATE_REMOVE(1162),
    CHASER_MOVE(1163),
    COMPLETE_RUNE(1166),
    HORNTAIL_TIMER(1207),
    ZAKUM_TIMER(1211),
    ZAKUM_TIMER2(1280),
    TRUNK_DLG(1308),
    RPS_GAME_DLG(1311),
    GO_STOP_RPS_GAME_DLG(1312),
    STAR_PLANET_GO_STOP_RPS_DLG(1313),
    UI_MESSENGER(1314),
    MINI_ROOM_BASE_DLG(1315),
    SET_CASH_SHOP_INITIAL_ITEM(1316),
    TRY_MIGRATE_CASH_SHOP(1317),
    PARCEL_DLG(1339),

    // CField_HundredBingo::OnPacket
    BINGO_ENTER_GAME(1179),
    BINGO_HOST_NUMBER(1180),
    BINGO_HOST_NUMBER_READY(1181),
    BINGO_ADD_RANK(1182),
    BINGO_REMOVE_RANK(1183),
    BINGO_FINISH_RANK(1184),
    BINGO_CHECK_NUMBER_ACK(1185),
    BINGO_GAME_STATE(1186),

    // CScriptMan::OnPacket
    SCRIPT_MESSAGE(1281),

    // CShopDlg::OnPacket
    SHOP_OPEN(1282),
    SHOP_RESULT(1283),

    // Field_Coordy::OnPacket
    COORDINATION_RUNWAY_AVATAR(1306),

    // CStoreBankDlg::OnPacket
    STORE_BANK_GET_ALL_RESULT(1309),
    STORE_BANK_RESULT(1310),

    // CAdminShopDlg::OnPacket
    ADMIN_SHOP_RESULT(1311),
    ADMIN_SHOP_COMMODITY(1312),

//    // CField_Soul::OnPacket not sure
//    SOUL_PIECE_CHANGE(1313),
//    SOUL_ITEM_USE_VOTE_REQUEST(1314),
//    SOUL_ITEM_USE_RESULT(1315),
//    SOUL_ITEM_MAP_INFO(1316),
//    SOUL_ITEM_MAP_CLOSE(1317),
//    SOUL_ITEM_DATA_CHANGE(1318),
//    SOUL_ITEM_VOTE_RESULT(1319),
//    SOUL_DUNGEON_EFFECT(1320),
//    SOUL_MINI_MAP_INFO(1321),

    // CField_GhostPark::OnPacket
    GHOST_PARK_RUNE_USE_ACK(1326),
    GHOST_PARK_RUNE_APPEAR(1327),
    GHOST_PARK_RUNE_DISAPPEAR(1328),
    GHOST_PARK_KILLED_MOB_BONUS_EXP_RATE_INFO(1329),
    GHOST_PARK_CURSE_LEVEL_EXP_RATE(1330),
    GHOST_PARK_HOMING_BULLET_CREATE(1331),

    // CCashShop::OnPacket
    CASH_SHOP_(1340),
    CASH_SHOP_QUERY_CASH_RESULT(1341),
    CASH_SHOP_CASH_ITEM_RESULT(1342),
    CASH_SHOP_PURCHASE_EXP_CHANGED(1343),
    CASH_SHOP_CHAR_STAT_CHANGED(1345),
    CASH_SHOP_IDK1(1347),
    CASH_SHOP_MVP_ITEM_GIVE_RESULT(1349), // probably
    CASH_SHOP_CHARGE_MILEAGE_NOTICE(1350),
    CASH_SHOP_IDK2(1352),
    CASH_SHOP_IDK3(1353),
    CASH_SHOP_IDK4(1355),
    CASH_SHOP_IDK5(1356),
    CASH_SHOP_IDK6(1357),
    CASH_SHOP_IDK7(1358),
    CASH_SHOP_IDK8(1359),
    CASH_SHOP_IDK9(1360),
    CASH_SHOP_IDK10(1363),
    CASH_SHOP_IDK11(1364),
    CASH_SHOP_IDK12(1368),
    CASH_SHOP_IDK13(1370),
    CASH_SHOP_IDK14(1371),
    CASH_SHOP_IDK15(1372),

    // CFuncKeyMappedMan::OnPacket
    FUNC_KEY_MAPPED_MAN_INIT(1425),
    PET_CONSUME_ITEM_INIT(1426),
    PET_CONSUME_MP_ITEM(1427),

    // CBattleRecordMan::OnPacket
    DOT_DAMAGE_INFO(1472),
    KILL_DAMAGE_INFO(1473),
    BATTLE_DAMAGE_INFO(1474),
    SERVER_ON_CALC_REQUEST_RESULT(1475),
    AGGRO_MONITORING_INFO(1476),
    SKILL_DAMAGE_LOG(1477),

    SOCKET_CREATE_RESULT(1481),
    ;

    private short value;

    OutHeader(int value) {
        this.value = (short) value;
    }

    public short getValue() {
        return value;
    }

    public static OutHeader getOutHeaderByOp(int op) {
        for (OutHeader outHeader : OutHeader.values()) {
            if (outHeader.getValue() == op) {
                return outHeader;
            }
        }
        return null;
    }

    public static boolean isSpamHeader(OutHeader outHeader) {
        List<OutHeader> spam = Arrays.asList(
                PING,
                HEARTBEAT_RESPONSE,
                MOB_CONTROL_ACK,
                CHAT_MSG,
                MOB_HP_INDICATOR,
                STAT_CHANGED,
                MOB_CHANGE_CONTROLLER,
                MOB_MOVE,
                REMOTE_MOVE,
                REMOTE_EMOTION,
                EXCL_REQUEST,
                NPC_MOVE,
                DROP_LEAVE_FIELD,
                TEMPORARY_STAT_RESET

                );
        return spam.contains(outHeader);
    }

}
