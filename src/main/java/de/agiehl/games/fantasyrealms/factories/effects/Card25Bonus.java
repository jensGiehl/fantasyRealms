package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card25Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		int landCount = handcards.countSuits(Suit.LAND);

		int bonus = 10 * landCount;

		card.setBonusPoints(bonus);

		handcards.getAllPenaltyEffects().forEach(p -> p.removePenaltyForSuits(Suit.ARMY));
	}

}
