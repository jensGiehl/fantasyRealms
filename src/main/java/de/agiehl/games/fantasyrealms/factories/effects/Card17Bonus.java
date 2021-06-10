package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.BaseGameCards;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card17Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsAllOf(BaseGameCards.BOOK_OF_CHANGES.getId(), BaseGameCards.BELL_TOWER.getId())
				&& handcards.containsSuits(Suit.WIZARD)) {
			card.setBonusPoints(100);
		}
	}

}
