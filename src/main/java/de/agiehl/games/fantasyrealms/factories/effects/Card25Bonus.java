package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card25Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		int landCount = handcards.countSuits(Suit.LAND);

		int bonus = 10 * landCount;

		card.setBonusPoints(bonus);

		handcards.getAllPenaltyEffects().forEach(p -> p.removePenaltyForSuits(Suit.ARMY));
	}

}
