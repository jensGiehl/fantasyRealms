package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card30Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int cardCount = handcards.countSuits(Suit.LAND, Suit.WEATHER, Suit.FLOOD, Suit.FLAME);

		int bonus = 5 * cardCount;

		card.setBonusPoints(bonus);
	}

}
