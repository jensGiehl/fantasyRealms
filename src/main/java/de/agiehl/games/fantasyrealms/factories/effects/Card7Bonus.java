package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card7Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		int beastCount = handcards.countSuits(Suit.BEAST);

		int bonus = beastCount * 12;

		if (handcards.containsOneOf(22)) {
			bonus += 12;
		}

		card.setBonusPoints(bonus);
	}

}
