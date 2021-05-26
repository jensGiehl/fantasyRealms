package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card30Penalty implements CardPenalty {

	@Override
	public void accept(Card card, HandCards handcards) {
		if (handcards.containsSuits(Suit.WIZARD)) {
			card.setBonusPoints(-40);
		}
	}

}
