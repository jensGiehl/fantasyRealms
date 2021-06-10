package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.PenaltyEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card45Penalty implements PenaltyEffect {

	private Suit[] penatlyWithoutSuits = new Suit[] { Suit.ARMY };
	private Suit[] penatlyWithSuits = new Suit[] { Suit.WEATHER };

	@Override
	public void apply(Card card, HandCards handcards) {
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