package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card02Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.containsOneOf(19, 24)) {
			card.setBonusPoints(25);
		}

		handcards.getCardsBySuits(Suit.WEATHER).stream().forEach(c -> c.setCleared(true));
	}

}
