package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card36Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int bonus = 0;

		if (handcards.containsOneOf(33)) {
			bonus = 30;
		} else {
			if (handcards.containsOneOf(35, 32, 30)) {
				bonus = 15;
			}
		}

		card.setBonusPoints(bonus);
	}

}
