package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card02Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(BaseGameCards.LIGHTNING.getId(), BaseGameCards.DWARVISH_INFANTRY.getId())) {
			card.setBonusPoints(25);
		}

		handcards.getCardsBySuits(Suit.WEATHER).stream().forEach(c -> c.setCleared(true));
	}

}
