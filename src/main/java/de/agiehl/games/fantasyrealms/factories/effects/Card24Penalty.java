package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card24Penalty implements CardPenalty {

	private Suit[] penatlySuits = new Suit[] { Suit.ARMY };

	@Override
	public void accept(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(penatlySuits);

		int bonus = -2 * armyCount;

		card.setBonusPoints(bonus);
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
