package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card35Penalty implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.LEADER };

	@Override
	public void apply(Card card, HandCards handcards) {
		int leadersWithoutThisCard = handcards.countSuits(penatlySuits) - 1;

		int bonus = -5 * leadersWithoutThisCard;

		int currentBonus = card.getBonusPoints();

		card.setBonusPoints(currentBonus + bonus);
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
