package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card01Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsAllOf(13, 16)) {
			card.setBonusPoints(50);
		}

		handcards.getCardsBySuits(Suit.FLOOD).forEach(c -> c.setCleared(true));
	}

}
