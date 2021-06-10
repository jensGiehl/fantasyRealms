package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card54Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {

		int oddCards = (int) handcards.getCards().stream().mapToInt(Card::getBaseStrength)
				.filter(strength -> strength % 2 != 0).count();
		int handcardSize = handcards.getCards().size();

		if (oddCards == handcardSize) {
			card.setBonusPoints(50);
		} else {
			card.setBonusPoints(5 * oddCards);
		}

	}

}
