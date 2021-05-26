package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.List;
import java.util.function.BiConsumer;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card11Penatly implements BiConsumer<Card, HandCards> {

	@Override
	public void accept(Card card, HandCards handcards) {
		List<Card> cards = handcards.getCardsBySuits(Suit.FLAME);

		cards.stream().filter(c -> c.getCardId() != 19).forEach(c -> c.setBlanked(true));
	}

}
