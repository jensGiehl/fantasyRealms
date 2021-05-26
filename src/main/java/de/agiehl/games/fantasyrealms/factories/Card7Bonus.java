package de.agiehl.games.fantasyrealms.factories;

import java.util.function.BiConsumer;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card7Bonus implements BiConsumer<Card, HandCards> {

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
