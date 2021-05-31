package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card46Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsSuits(Suit.LEADER)) {
			int bonus = 15;
			if (handcards.containsOneOf(43)) {
				bonus = 40;
			}

			card.setBonusPoints(bonus);
		}
	}

}
