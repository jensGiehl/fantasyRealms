package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card29Penalty implements CardPenalty {

	private Suit[] penatlySuits = new Suit[] { Suit.LEADER, Suit.WIZARD };

	@Override
	public void accept(Card card, HandCards handcards) {
		int cards = handcards.countSuits(penatlySuits);

		int bonus = -10 * cards;

		card.setBonusPoints(bonus);
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
