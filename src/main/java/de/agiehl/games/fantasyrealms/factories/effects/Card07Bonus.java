package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card07Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int beastCount = handcards.countSuits(Suit.BEAST);

		int bonus = beastCount * 12;

		if (handcards.containsOneOf(CardId.ELVEN_ARCHERS)) {
			bonus += 12;
		}

		card.setBonusPoints(bonus);
	}

}
