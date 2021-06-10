package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card28Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		handcards.addCard(card.getChoosenCard());
	}

}
