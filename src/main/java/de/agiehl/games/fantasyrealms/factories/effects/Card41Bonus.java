package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card41Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		handcards.getAllPenaltyEffectsWithSuit(Suit.FLOOD).stream().forEach(p -> p.removePenaltyForSuits(Suit.ARMY));
	}

}
