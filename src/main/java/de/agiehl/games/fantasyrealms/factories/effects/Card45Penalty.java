package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card45Penalty implements CardPenalty {

	private Suit[] penatlyWithoutSuits = new Suit[] { Suit.ARMY };
	private Suit[] penatlyWithSuits = new Suit[] { Suit.WEATHER };

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.notContainsSuits(penatlyWithoutSuits) || handcards.containsSuits(penatlyWithSuits)) {
			card.setBlanked(true);
		}
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlyWithoutSuits = ArrayUtils.removeSuitsFrom(penatlyWithoutSuits, suits);
		penatlyWithSuits = ArrayUtils.removeSuitsFrom(penatlyWithSuits, suits);
	}

}