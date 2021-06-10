package de.agiehl.games.fantasyrealms.factories.effects;

import static java.util.function.Predicate.not;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card48Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		long count = handcards.getCards().stream().filter(not(Card::isBlanked)).map(Card::getSuit).distinct().count();

		long bonus = 50 * count;

		card.setBonusPoints((int) bonus);
	}

}
