package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardIds;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card14Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(CardIds.RAINSTORM.getId())) {
			if (handcards.containsOneOf(CardIds.GREAT_FLOOD.getId(), CardIds.BLIZZARD.getId())) {
				card.setBonusPoints(40);
			}
		}
	}

}
