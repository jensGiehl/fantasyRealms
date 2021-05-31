package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card33Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int cards = handcards.countSuits(Suit.ARMY, Suit.WIZARD, Suit.LEADER);

		int bonus = 8 * cards;

		card.setBonusPoints(bonus);
	}

}
