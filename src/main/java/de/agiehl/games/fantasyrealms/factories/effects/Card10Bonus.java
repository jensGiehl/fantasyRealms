package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card10Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int floodCount = handcards.countSuits(Suit.FLOOD);

		int bonus = 15 * floodCount;

		card.setBonusPoints(bonus);
	}

}
