package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card31Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(Suit.ARMY);

		int bonus = 0;
		if (handcards.containsOneOf(32)) {
			bonus = 20 * armyCount;
		} else {
			bonus = 5 * armyCount;
		}

		card.setBonusPoints(bonus);
	}

}
