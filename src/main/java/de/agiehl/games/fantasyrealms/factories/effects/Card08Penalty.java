package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.List;
import java.util.stream.Collectors;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card08Penalty implements CardPenalty {

	private Suit[] penatlySuits = new Suit[] { Suit.ARMY, Suit.LAND, Suit.FLAME };

	@Override
	public void accept(Card card, HandCards handcards) {
		List<Card> blankedCards = handcards.getCardsBySuits(penatlySuits).stream()
				.filter(c -> c.getCardId() != 19 && c.getCardId() != 1).collect(Collectors.toList());

		blankedCards.forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
