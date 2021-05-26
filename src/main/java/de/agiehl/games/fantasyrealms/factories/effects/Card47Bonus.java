package de.agiehl.games.fantasyrealms.factories.effects;

import static java.util.stream.Collectors.toList;

import java.util.List;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardBonus;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card47Bonus implements CardBonus {

	@Override
	public void accept(Card card, HandCards handcards) {
		List<Integer> allBaseStrength = handcards.getCards().stream().map(Card::getBaseStrength).sorted()
				.collect(toList());

		// TODO: Implement it :)

	}

}
