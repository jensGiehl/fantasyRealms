package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card17Penalty implements CardPenalty {

	@Override
	public void accept(Card card, HandCards handcards) {
		int landCount = handcards.countSuits(Suit.LAND);

		int bonus = -2 * landCount;

		card.setBonusPoints(bonus);
	}

}
