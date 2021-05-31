package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card12Penalty implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.ARMY, Suit.LEADER, Suit.BEAST, Suit.FLAME };

	@Override
	public void apply(Card card, HandCards handcards) {
		int cardCount = handcards.countSuits(penatlySuits);

		int bonus = -5 * cardCount;

		card.setBonusPoints(bonus);

		handcards.getCardsBySuits(Suit.FLOOD).stream().forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
