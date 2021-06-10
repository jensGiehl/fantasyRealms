package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card18Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		int cards = handcards.countSuits(Suit.WEAPON, Suit.ARTIFACT);

		int bonus = 9 * cards;

		card.setBonusPoints(bonus);
	}

}
