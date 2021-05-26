package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card33Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		int cards = handcards.countSuits(Suit.ARMY, Suit.WIZARD, Suit.LEADER);

		int bonus = 8 * cards;

		card.setBonusPoints(bonus);
	}

}
