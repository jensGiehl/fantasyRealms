package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card35Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int armyCount = handcards.countSuits(Suit.ARMY);

		int bonus = 10 * armyCount;

		card.setBonusPoints(bonus);
	}

}
