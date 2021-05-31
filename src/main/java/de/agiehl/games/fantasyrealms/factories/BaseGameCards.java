package de.agiehl.games.fantasyrealms.factories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BaseGameCards {

	MOUNTAIN(1), CAVERN(2), BELL_TOWER(3), FOREST(4), EARTH_ELEMENTAL(5), FOUNTAIN_OF_LIFE(6), SWAMP(7), GREAT_FLOOD(8),
	ISLAND(9), WATER_ELEMENTAL(10), RAINSTORM(11), BLIZZARD(12), SMOKE(13), WHIRLWIND(14), AIR_ELEMENTAL(15),
	WILDFIRE(16), CANDLE(17), FORGE(18), LIGHTNING(19), FIRE_ELEMENTAL(20), KNIGHTS(21), ELVEN_ARCHERS(22),
	LIGHT_CAVALRY(23), DWARVISH_INFANTRY(24), RANGERS(25), COLLECTOR(26), BEASTMASTER(27), NECROMANCER(28),
	WARLOCK_LORD(29), ENCHANTRESS(30), KING(31), QUEEN(32), PRINCESS(33), WARLORD(34), EMPRESS(35), UNICORN(36),
	BASILISK(37), WARHORSE(38), DRAGON(39), HYDRA(40), WARSHIP(41), MAGIC_WAND(42), SWORD_OF_KETH(43),
	ELVEN_LONGBOW(44), WAR_DIRIGIBLE(45), SHIELD_OF_KETH(46), GEM_OF_ORDER(47), WORLD_TREE(48), BOOK_OF_CHANGES(49),
	PROTECTION_RUNE(50), SHAPESHIFTER(51), MIRAGE(52), DOPPELGAENGER(53), JESTER(54);

	private final int id;

}
