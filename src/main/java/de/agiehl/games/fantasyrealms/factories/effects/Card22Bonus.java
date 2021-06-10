package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card22Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.notContainsSuits(Suit.WEATHER)) {
			card.setBonusPoints(5);
		}
	}

}
