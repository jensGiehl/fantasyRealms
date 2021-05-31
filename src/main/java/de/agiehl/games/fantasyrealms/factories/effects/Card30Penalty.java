package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card30Penalty implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.WIZARD };

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsSuits(penatlySuits)) {
			card.setBonusPoints(-40);
		}
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
