package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card07Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int beastCount = handcards.countSuits(Suit.BEAST);

		int bonus = beastCount * 12;

		if (handcards.containsOneOf(BaseGameCards.ELVEN_ARCHERS.getId())) {
			bonus += 12;
		}

		card.setBonusPoints(bonus);
	}

}
