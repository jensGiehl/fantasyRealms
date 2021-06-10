package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card44Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(BaseGameCards.ELVEN_ARCHERS.getId(), BaseGameCards.WARLORD.getId(),
				BaseGameCards.BEASTMASTER.getId())) {
			card.setBonusPoints(30);
		}
	}

}
