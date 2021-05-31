package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card21Penalty implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.LEADER };

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.notContainsSuits(penatlySuits)) {
			card.setBonusPoints(-8);
		}
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
