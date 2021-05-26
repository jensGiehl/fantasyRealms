package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card50Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		handcards.getCards().forEach(c -> c.setCleared(true));
	}

}