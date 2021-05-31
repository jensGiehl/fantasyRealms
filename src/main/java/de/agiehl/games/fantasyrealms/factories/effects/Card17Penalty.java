package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card17Penalty implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.LAND };

	@Override
	public void apply(Card card, HandCards handcards) {
		int landCount = handcards.countSuits(penatlySuits);

		int bonus = -2 * landCount;

		card.setBonusPoints(bonus);
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
