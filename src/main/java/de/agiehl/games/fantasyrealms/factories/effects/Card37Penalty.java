package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card37Penalty implements CardPenalty {

	private Suit[] penatlySuits = new Suit[] { Suit.ARMY, Suit.LEADER, Suit.BEAST };

	@Override
	public void accept(Card card, HandCards handcards) {
		handcards.getCardsBySuits(penatlySuits).stream().filter(c -> c.getCardId() != card.getCardId())
				.forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
