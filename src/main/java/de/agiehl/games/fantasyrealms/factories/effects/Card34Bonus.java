package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card34Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		// TODO: pay attention to Doppelgaenger
		int bonus = handcards.getCardsBySuits(Suit.ARMY).stream().mapToInt(Card::getBaseStrength).sum();

		card.setBonusPoints(bonus);
	}

}
