package de.agiehl.games.fantasyrealms.factories;

import java.util.function.BiConsumer;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card24Penalty implements BiConsumer<Card, HandCards> {

	@Override
	public void accept(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(Suit.ARMY);

		int bonus = -2 * armyCount;

		card.setBonusPoints(bonus);
	}

}
