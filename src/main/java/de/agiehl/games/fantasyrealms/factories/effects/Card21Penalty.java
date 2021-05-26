package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card21Penalty implements CardPenalty {

	private Suit[] penatlySuits = new Suit[] { Suit.LEADER };

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.notContainsSuits(penatlySuits)) {
			card.setBonusPoints(-8);
		}
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
