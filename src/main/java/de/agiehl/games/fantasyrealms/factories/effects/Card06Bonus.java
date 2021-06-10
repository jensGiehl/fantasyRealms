package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.OptionalInt;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card06Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		OptionalInt max = handcards.getCardsBySuits(Suit.WEAPON, Suit.FLOOD, Suit.FLAME, Suit.LAND, Suit.WEATHER)
				.stream().mapToInt(Card::getBaseStrength).max();

		if (max.isPresent()) {
			card.setBonusPoints(max.getAsInt());
		}

	}

}
