package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card35Penalty implements CardPenalty {

	@Override
	public void accept(Card card, HandCards handcards) {
		int leadersWithoutThisCard = handcards.countSuits(Suit.LEADER) - 1;

		int bonus = -5 * leadersWithoutThisCard;

		int currentBonus = card.getBonusPoints();

		card.setBonusPoints(currentBonus + bonus);
	}

}
