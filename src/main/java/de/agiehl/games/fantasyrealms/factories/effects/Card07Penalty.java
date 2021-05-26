package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card07Penalty implements CardPenalty {

	@Override
	public void accept(Card card, HandCards handcards) {
		int cards = handcards.countSuits(Suit.ARMY, Suit.FLAME);

		int bonus = -3 * cards;

		card.setBonusPoints(bonus);
	}

}
