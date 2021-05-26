package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card14Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.containsOneOf(11)) {
			if (handcards.containsOneOf(8, 12)) {
				card.setBonusPoints(40);
			}
		}
	}

}
