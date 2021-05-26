package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card13Penalty implements CardPenalty {

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.countSuits(Suit.FLAME) == 0) {
			card.setBlanked(true);
		}
	}

}
