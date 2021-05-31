package de.agiehl.games.fantasyrealms.factories.effects;

import static java.util.stream.Collectors.toList;

import java.util.List;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.BonusStrength;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card47Bonus implements BonusStrength {

	@Override
	public void apply(Card card, HandCards handcards) {
		List<Integer> allBaseStrength = handcards.getCards().stream().map(Card::getBaseStrength).sorted()
				.collect(toList());

		int maxStreetCount = getLongestStreet(allBaseStrength);

		int bonus = 0;
		switch (maxStreetCount) {
		case 3:
			bonus = 10;
			break;
		case 4:
			bonus = 30;
			break;
		case 5:
			bonus = 60;
			break;
		case 6:
			bonus = 100;
			break;
		case 7:
			bonus = 150;
			break;
		}

		card.setBonusPoints(bonus);

	}

	private int getLongestStreet(List<Integer> allBaseStrength) {
		int lastValue = -99;
		int streetCount = 0;
		int maxStreetCount = 0;
		for (int baseStrength : allBaseStrength) {
			if (lastValue + 1 == baseStrength) {
				streetCount++;
			} else {
				maxStreetCount = streetCount > maxStreetCount ? streetCount : maxStreetCount;
				streetCount = 0;
			}

			lastValue = baseStrength;
		}
		return maxStreetCount;
	}

}
