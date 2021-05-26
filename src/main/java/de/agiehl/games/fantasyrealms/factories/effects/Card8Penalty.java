package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card8Penalty implements BiConsumer<Card, HandCards> {

	@Override
	public void accept(Card card, HandCards handcards) {
		List<Card> blankedCards = handcards.getCardsBySuits(Suit.ARMY, Suit.LAND, Suit.FLAME).stream()
				.filter(c -> c.getCardId() != 19 && c.getCardId() != 1).collect(Collectors.toList());

		blankedCards.forEach(c -> c.setBlanked(true));
	}

}