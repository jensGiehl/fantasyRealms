package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card36Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int bonus = 0;

		if (handcards.containsOneOf(BaseGameCards.PRINCESS.getId())) {
			bonus = 30;
		} else {
			if (handcards.containsOneOf(BaseGameCards.EMPRESS.getId(), BaseGameCards.QUEEN.getId(),
					BaseGameCards.ENCHANTRESS.getId())) {
				bonus = 15;
			}
		}

		card.setBonusPoints(bonus);
	}

}
