package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card46Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsSuits(Suit.LEADER)) {
			int bonus = 15;
			if (handcards.containsOneOf(CardId.SWORD_OF_KETH)) {
				bonus = 40;
			}

			card.setBonusPoints(bonus);
		}
	}

}
