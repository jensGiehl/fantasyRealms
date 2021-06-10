package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card14Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(BaseGameCards.RAINSTORM.getId())) {
			if (handcards.containsOneOf(BaseGameCards.GREAT_FLOOD.getId(), BaseGameCards.BLIZZARD.getId())) {
				card.setBonusPoints(40);
			}
		}
	}

}
