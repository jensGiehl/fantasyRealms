package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card19Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.containsOneOf(11)) {
			card.setBonusPoints(30);
		}
	}

}
