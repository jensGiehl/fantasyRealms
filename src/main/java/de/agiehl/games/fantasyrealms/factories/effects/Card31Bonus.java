package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardIds;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card31Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(Suit.ARMY);

		int bonus = 0;
		if (handcards.containsOneOf(CardIds.QUEEN.getId())) {
			bonus = 20 * armyCount;
		} else {
			bonus = 5 * armyCount;
		}

		card.setBonusPoints(bonus);
	}

}
