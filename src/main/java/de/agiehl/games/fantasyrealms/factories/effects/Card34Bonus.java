package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card34Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		int bonus = handcards.getCardsBySuits(Suit.ARMY).stream().mapToInt(Card::getBaseStrength).sum();

		card.setBonusPoints(bonus);
	}

}
