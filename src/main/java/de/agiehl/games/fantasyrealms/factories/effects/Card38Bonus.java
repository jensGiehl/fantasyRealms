package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card38Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		boolean bonusApplied = handcards.containsSuits(Suit.LEADER, Suit.WIZARD);

		if (bonusApplied) {
			card.setBonusPoints(14);
		}
	}

}
