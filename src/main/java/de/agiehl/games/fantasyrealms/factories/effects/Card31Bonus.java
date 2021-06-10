package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card31Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(Suit.ARMY);

		int bonus = 0;
		if (handcards.containsOneOf(CardId.QUEEN)) {
			bonus = 20 * armyCount;
		} else {
			bonus = 5 * armyCount;
		}

		card.setBonusPoints(bonus);
	}

}
