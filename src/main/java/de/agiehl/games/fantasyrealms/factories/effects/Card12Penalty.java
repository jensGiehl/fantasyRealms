package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.function.BiConsumer;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card12Penalty implements BiConsumer<Card, HandCards> {

	@Override
	public void accept(Card card, HandCards handcards) {
		int cardCount = handcards.countSuits(Suit.ARMY, Suit.LEADER, Suit.BEAST, Suit.FLAME);

		int bonus = -5 * cardCount;

		card.setBonusPoints(bonus);

		handcards.getCardsBySuits(Suit.FLOOD).stream().forEach(c -> c.setBlanked(true));
	}

}
