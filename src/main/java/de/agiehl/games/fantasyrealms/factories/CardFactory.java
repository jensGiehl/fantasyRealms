package de.agiehl.games.fantasyrealms.factories;

import static de.agiehl.games.fantasyrealms.factories.CardIds.AIR_ELEMENTAL;
import static de.agiehl.games.fantasyrealms.factories.CardIds.BASILISK;
import static de.agiehl.games.fantasyrealms.factories.CardIds.BEASTMASTER;
import static de.agiehl.games.fantasyrealms.factories.CardIds.BELL_TOWER;
import static de.agiehl.games.fantasyrealms.factories.CardIds.BLIZZARD;
import static de.agiehl.games.fantasyrealms.factories.CardIds.BOOK_OF_CHANGES;
import static de.agiehl.games.fantasyrealms.factories.CardIds.CANDLE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.CAVERN;
import static de.agiehl.games.fantasyrealms.factories.CardIds.COLLECTOR;
import static de.agiehl.games.fantasyrealms.factories.CardIds.DOPPELGAENGER;
import static de.agiehl.games.fantasyrealms.factories.CardIds.DRAGON;
import static de.agiehl.games.fantasyrealms.factories.CardIds.DWARVISH_INFANTRY;
import static de.agiehl.games.fantasyrealms.factories.CardIds.EARTH_ELEMENTAL;
import static de.agiehl.games.fantasyrealms.factories.CardIds.ELVEN_ARCHERS;
import static de.agiehl.games.fantasyrealms.factories.CardIds.ELVEN_LONGBOW;
import static de.agiehl.games.fantasyrealms.factories.CardIds.EMPRESS;
import static de.agiehl.games.fantasyrealms.factories.CardIds.ENCHANTRESS;
import static de.agiehl.games.fantasyrealms.factories.CardIds.FIRE_ELEMENTAL;
import static de.agiehl.games.fantasyrealms.factories.CardIds.FOREST;
import static de.agiehl.games.fantasyrealms.factories.CardIds.FORGE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.FOUNTAIN_OF_LIFE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.GEM_OF_ORDER;
import static de.agiehl.games.fantasyrealms.factories.CardIds.GREAT_FLOOD;
import static de.agiehl.games.fantasyrealms.factories.CardIds.HYDRA;
import static de.agiehl.games.fantasyrealms.factories.CardIds.ISLAND;
import static de.agiehl.games.fantasyrealms.factories.CardIds.KING;
import static de.agiehl.games.fantasyrealms.factories.CardIds.KNIGHTS;
import static de.agiehl.games.fantasyrealms.factories.CardIds.LIGHTNING;
import static de.agiehl.games.fantasyrealms.factories.CardIds.LIGHT_CAVALRY;
import static de.agiehl.games.fantasyrealms.factories.CardIds.MAGIC_WAND;
import static de.agiehl.games.fantasyrealms.factories.CardIds.MIRAGE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.MOUNTAIN;
import static de.agiehl.games.fantasyrealms.factories.CardIds.NECROMANCER;
import static de.agiehl.games.fantasyrealms.factories.CardIds.PRINCESS;
import static de.agiehl.games.fantasyrealms.factories.CardIds.PROTECTION_RUNE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.QUEEN;
import static de.agiehl.games.fantasyrealms.factories.CardIds.RAINSTORM;
import static de.agiehl.games.fantasyrealms.factories.CardIds.RANGERS;
import static de.agiehl.games.fantasyrealms.factories.CardIds.SHAPESHIFTER;
import static de.agiehl.games.fantasyrealms.factories.CardIds.SHIELD_OF_KETH;
import static de.agiehl.games.fantasyrealms.factories.CardIds.SMOKE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.SWAMP;
import static de.agiehl.games.fantasyrealms.factories.CardIds.SWORD_OF_KETH;
import static de.agiehl.games.fantasyrealms.factories.CardIds.UNICORN;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WARHORSE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WARLOCK_LORD;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WARLORD;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WARSHIP;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WAR_DIRIGIBLE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WATER_ELEMENTAL;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WHIRLWIND;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WILDFIRE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WORLD_TREE;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import de.agiehl.games.fantasyrealms.factories.effects.Card01Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card02Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card03Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card04Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card06Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card07Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card07Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card08Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card09Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card10Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card11Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card11Penatly;
import de.agiehl.games.fantasyrealms.factories.effects.Card12Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card13Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card14Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card15Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card16Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card17Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card17Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card18Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card19Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card20Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card21Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card22Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card24Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card25Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card26Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card27Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card28PlayerAction;
import de.agiehl.games.fantasyrealms.factories.effects.Card29Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card30Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card30Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card31Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card32Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card33Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card34Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card35Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card35Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card36Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card37Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card38Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card40Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card41Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card41Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card42Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card43Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card44Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card45Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card46Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card47Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card48Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card49PlayerAction;
import de.agiehl.games.fantasyrealms.factories.effects.Card50Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card51PlayerAction;
import de.agiehl.games.fantasyrealms.factories.effects.Card52PlayerAction;
import de.agiehl.games.fantasyrealms.factories.effects.Card53PlayerAction;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Suit;

@Component
public class CardFactory {

	public CardFactory() {
		super();
	}

	private List<Card> createBaseGameCardDeck() {
		List<Card> cards = new ArrayList<>(53);

		cards.add(Card.builder().cardId(MOUNTAIN.getId()).baseStrength(9).suit(Suit.LAND).bonus(new Card01Bonus())
				.build());
		cards.add(
				Card.builder().cardId(CAVERN.getId()).baseStrength(6).suit(Suit.LAND).bonus(new Card02Bonus()).build());
		cards.add(Card.builder().cardId(BELL_TOWER.getId()).baseStrength(8).suit(Suit.LAND).bonus(new Card03Bonus())
				.build());
		cards.add(
				Card.builder().cardId(FOREST.getId()).baseStrength(7).suit(Suit.LAND).bonus(new Card07Bonus()).build());
		cards.add(Card.builder().cardId(EARTH_ELEMENTAL.getId()).baseStrength(4).suit(Suit.LAND)
				.bonus(new Card04Bonus()).build());

		cards.add(Card.builder().cardId(FOUNTAIN_OF_LIFE.getId()).baseStrength(1).suit(Suit.FLOOD)
				.bonus(new Card06Bonus()).build());
		cards.add(Card.builder().cardId(SWAMP.getId()).baseStrength(18).suit(Suit.FLOOD).penalty(new Card07Penalty())
				.build());
		cards.add(Card.builder().cardId(GREAT_FLOOD.getId()).baseStrength(32).suit(Suit.FLOOD)
				.penalty(new Card08Penalty()).build());
		cards.add(Card.builder().cardId(ISLAND.getId()).baseStrength(14).suit(Suit.FLOOD).bonus(new Card09Bonus())
				.build());
		cards.add(Card.builder().cardId(WATER_ELEMENTAL.getId()).baseStrength(4).suit(Suit.FLOOD)
				.bonus(new Card10Bonus()).build());

		cards.add(Card.builder().cardId(RAINSTORM.getId()).baseStrength(8).suit(Suit.WEATHER).bonus(new Card11Bonus())
				.penalty(new Card11Penatly()).build());
		cards.add(Card.builder().cardId(BLIZZARD.getId()).baseStrength(30).suit(Suit.WEATHER)
				.penalty(new Card12Penalty()).build());
		cards.add(Card.builder().cardId(SMOKE.getId()).baseStrength(27).suit(Suit.WEATHER).penalty(new Card13Penalty())
				.build());
		cards.add(Card.builder().cardId(WHIRLWIND.getId()).baseStrength(13).suit(Suit.WEATHER).bonus(new Card14Bonus())
				.build());
		cards.add(Card.builder().cardId(AIR_ELEMENTAL.getId()).baseStrength(4).suit(Suit.WEATHER)
				.bonus(new Card15Bonus()).build());

		cards.add(Card.builder().cardId(WILDFIRE.getId()).baseStrength(40).suit(Suit.FLAME).penalty(new Card16Penalty())
				.build());
		cards.add(Card.builder().cardId(CANDLE.getId()).baseStrength(2).suit(Suit.FLAME).bonus(new Card17Bonus())
				.build());
		cards.add(
				Card.builder().cardId(FORGE.getId()).baseStrength(9).suit(Suit.FLAME).bonus(new Card18Bonus()).build());
		cards.add(Card.builder().cardId(LIGHTNING.getId()).baseStrength(11).suit(Suit.FLAME).bonus(new Card19Bonus())
				.build());
		cards.add(Card.builder().cardId(FIRE_ELEMENTAL.getId()).baseStrength(4).suit(Suit.FLAME)
				.bonus(new Card20Bonus()).build());

		cards.add(Card.builder().cardId(KNIGHTS.getId()).baseStrength(20).suit(Suit.ARMY).penalty(new Card21Penalty())
				.build());
		cards.add(Card.builder().cardId(ELVEN_ARCHERS.getId()).baseStrength(10).suit(Suit.ARMY).bonus(new Card22Bonus())
				.build());
		cards.add(Card.builder().cardId(LIGHT_CAVALRY.getId()).baseStrength(17).suit(Suit.ARMY)
				.penalty(new Card17Penalty()).build());
		cards.add(Card.builder().cardId(DWARVISH_INFANTRY.getId()).baseStrength(15).suit(Suit.ARMY)
				.penalty(new Card24Penalty()).build());
		cards.add(Card.builder().cardId(RANGERS.getId()).baseStrength(5).suit(Suit.ARMY).bonus(new Card25Bonus())
				.build());

		cards.add(Card.builder().cardId(COLLECTOR.getId()).baseStrength(7).suit(Suit.WIZARD).bonus(new Card26Bonus())
				.build());
		cards.add(Card.builder().cardId(BEASTMASTER.getId()).baseStrength(9).suit(Suit.WIZARD).bonus(new Card27Bonus())
				.build());
		cards.add(Card.builder().cardId(NECROMANCER.getId()).baseStrength(3).suit(Suit.WIZARD)
				.playerAction(new Card28PlayerAction()).build());
		cards.add(Card.builder().cardId(WARLOCK_LORD.getId()).baseStrength(25).suit(Suit.WIZARD)
				.penalty(new Card29Penalty()).build());
		cards.add(Card.builder().cardId(ENCHANTRESS.getId()).baseStrength(5).suit(Suit.WIZARD).bonus(new Card30Bonus())
				.build());

		cards.add(
				Card.builder().cardId(KING.getId()).baseStrength(8).suit(Suit.LEADER).bonus(new Card31Bonus()).build());
		cards.add(Card.builder().cardId(QUEEN.getId()).baseStrength(6).suit(Suit.LEADER).bonus(new Card32Bonus())
				.build());
		cards.add(Card.builder().cardId(PRINCESS.getId()).baseStrength(2).suit(Suit.LEADER).bonus(new Card33Bonus())
				.build());
		cards.add(Card.builder().cardId(WARLORD.getId()).baseStrength(4).suit(Suit.LEADER).bonus(new Card34Bonus())
				.build());
		cards.add(Card.builder().cardId(EMPRESS.getId()).baseStrength(15).suit(Suit.LEADER).bonus(new Card35Bonus())
				.penalty(new Card35Penalty()).build());

		cards.add(Card.builder().cardId(UNICORN.getId()).baseStrength(9).suit(Suit.BEAST).bonus(new Card36Bonus())
				.build());
		cards.add(Card.builder().cardId(BASILISK.getId()).baseStrength(35).suit(Suit.BEAST).penalty(new Card37Penalty())
				.build());
		cards.add(Card.builder().cardId(WARHORSE.getId()).baseStrength(6).suit(Suit.BEAST).bonus(new Card38Bonus())
				.build());
		cards.add(Card.builder().cardId(DRAGON.getId()).baseStrength(30).suit(Suit.BEAST).penalty(new Card30Penalty())
				.build());
		cards.add(Card.builder().cardId(HYDRA.getId()).baseStrength(12).suit(Suit.BEAST).bonus(new Card40Bonus())
				.build());

		cards.add(Card.builder().cardId(WARSHIP.getId()).baseStrength(23).suit(Suit.WEAPON).bonus(new Card41Bonus())
				.penalty(new Card41Penalty()).build());
		cards.add(Card.builder().cardId(MAGIC_WAND.getId()).baseStrength(1).suit(Suit.WEAPON).bonus(new Card42Bonus())
				.build());
		cards.add(Card.builder().cardId(SWORD_OF_KETH.getId()).baseStrength(7).suit(Suit.WEAPON)
				.bonus(new Card43Bonus()).build());
		cards.add(Card.builder().cardId(ELVEN_LONGBOW.getId()).baseStrength(3).suit(Suit.WEAPON)
				.bonus(new Card44Bonus()).build());
		cards.add(Card.builder().cardId(WAR_DIRIGIBLE.getId()).baseStrength(35).suit(Suit.WEAPON)
				.penalty(new Card45Penalty()).build());

		cards.add(Card.builder().cardId(SHIELD_OF_KETH.getId()).baseStrength(4).suit(Suit.ARTIFACT)
				.bonus(new Card46Bonus()).build());
		cards.add(Card.builder().cardId(GEM_OF_ORDER.getId()).baseStrength(5).suit(Suit.ARTIFACT)
				.bonus(new Card47Bonus()).build());
		cards.add(Card.builder().cardId(WORLD_TREE.getId()).baseStrength(2).suit(Suit.ARTIFACT).bonus(new Card48Bonus())
				.build());
		cards.add(Card.builder().cardId(BOOK_OF_CHANGES.getId()).baseStrength(3).suit(Suit.ARTIFACT)
				.playerAction(new Card49PlayerAction()).build());
		cards.add(Card.builder().cardId(PROTECTION_RUNE.getId()).baseStrength(1).suit(Suit.ARTIFACT)
				.bonus(new Card50Bonus()).build());

		cards.add(Card.builder().cardId(SHAPESHIFTER.getId()).baseStrength(0).suit(Suit.WILD)
				.playerAction(new Card51PlayerAction()).build());
		cards.add(Card.builder().cardId(MIRAGE.getId()).baseStrength(0).suit(Suit.WILD)
				.playerAction(new Card52PlayerAction()).build());
		cards.add(Card.builder().cardId(DOPPELGAENGER.getId()).baseStrength(0).suit(Suit.WILD)
				.playerAction(new Card53PlayerAction()).build());

		return cards;
	}

	public List<Card> getBaseGameCardDeck() {
		return createBaseGameCardDeck();
	}

}
