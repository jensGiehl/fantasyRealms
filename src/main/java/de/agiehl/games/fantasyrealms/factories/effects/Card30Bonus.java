package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.function.BiConsumer;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card30Bonus implements BiConsumer<Card, HandCards> {

	@Override
	public void accept(Card card, HandCards handcards) {
		int cardCount = handcards.countSuits(Suit.LAND, Suit.WEATHER, Suit.FLOOD, Suit.FLAME);

		int bonus = 5 * cardCount;

		card.setBonusPoints(bonus);
	}

}
