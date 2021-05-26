package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card27Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		int cards = handcards.countSuits(Suit.BEAST);

		int bonus = 9 * cards;

		card.setBonusPoints(bonus);

		handcards.getCardsBySuits(Suit.BEAST).forEach(c -> c.setCleared(true));
	}

}
