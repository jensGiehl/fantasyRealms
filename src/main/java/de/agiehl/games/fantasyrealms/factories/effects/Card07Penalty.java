package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.PenaltyEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card07Penalty implements PenaltyEffect {

	private Suit[] penatlySuits = new Suit[] { Suit.ARMY, Suit.FLAME };

	@Override
	public void apply(Card card, HandCards handcards) {
		int cards = handcards.countSuits(penatlySuits);

		int bonus = -3 * cards;

		card.setBonusPoints(bonus);
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
