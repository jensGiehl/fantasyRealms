package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.factories.CardIds.SMOKE;
import static de.agiehl.games.fantasyrealms.factories.CardIds.WILDFIRE;

import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card01Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsAllOf(SMOKE.getId(), WILDFIRE.getId())) {
			card.setBonusPoints(50);
		}

		handcards.getCardsBySuits(Suit.FLOOD).forEach(c -> c.setCleared(true));
	}

}
