package de.agiehl.games.fantasyrealms.factories.effects;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card26Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		Map<Suit, Long> countOfSuits = handcards.getCardsExceptSuits(Suit.WILD).stream()
				.collect(groupingBy(Card::getSuit, counting()));

		int bonus = 0;

		for (Suit s : countOfSuits.keySet()) {
			Long count = countOfSuits.get(s);
			if (count == 3) {
				bonus += 10;
			}
			if (count == 4) {
				bonus += 40;
			}
			if (count >= 5) {
				bonus += 100;
			}
		}

		card.setBonusPoints(bonus);
	}

}
