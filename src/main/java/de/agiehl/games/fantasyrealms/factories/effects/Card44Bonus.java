package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardIds;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card44Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(CardIds.ELVEN_ARCHERS.getId(), CardIds.WARLORD.getId(),
				CardIds.BEASTMASTER.getId())) {
			card.setBonusPoints(30);
		}
	}

}
