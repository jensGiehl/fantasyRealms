package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card02Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(CardId.LIGHTNING, CardId.DWARVISH_INFANTRY)) {
			card.setBonusPoints(25);
		}

		handcards.getCardsBySuits(Suit.WEATHER).stream().forEach(c -> c.setCleared(true));
	}

}
