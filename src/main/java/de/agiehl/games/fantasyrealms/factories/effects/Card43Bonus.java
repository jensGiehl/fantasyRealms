package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card43Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsSuits(Suit.LEADER)) {
			int bonus = 10;

			if (handcards.containsOneOf(BaseGameCards.SHIELD_OF_KETH.getId())) {
				bonus = 40;
			}

			card.setBonusPoints(bonus);
		}
	}

}
