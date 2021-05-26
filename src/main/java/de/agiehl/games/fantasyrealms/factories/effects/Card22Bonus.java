package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card22Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.notContainsSuits(Suit.WEATHER)) {
			card.setBonusPoints(5);
		}
	}

}
