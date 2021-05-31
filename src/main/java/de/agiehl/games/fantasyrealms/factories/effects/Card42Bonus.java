package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card42Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsSuits(Suit.WIZARD)) {
			card.setBonusPoints(25);
		}
	}

}
