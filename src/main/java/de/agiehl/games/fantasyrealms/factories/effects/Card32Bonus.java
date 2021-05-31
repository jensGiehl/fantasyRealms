package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card32Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(Suit.ARMY);

		int bonus = 0;
		if (handcards.containsOneOf(31)) {
			bonus = 20 * armyCount;
		} else {
			bonus = 5 * armyCount;
		}

		card.setBonusPoints(bonus);

	}

}
