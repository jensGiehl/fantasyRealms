package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.Arrays;
import java.util.List;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.CardPenalty;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card16Penalty implements CardPenalty {

	@Override
	public void accept(Card card, HandCards handcards) {
		List<Card> cards = handcards.getCardsExceptSuits(Suit.FLAME, Suit.WIZARD, Suit.WEATHER, Suit.WEAPON,
				Suit.ARTIFACT);

		List<Integer> cardsWhichAreNotBlanked = Arrays.asList(new Integer[] { 1, 36, 8, 39, 9 });

		cards.stream().filter(c -> !cardsWhichAreNotBlanked.contains(c.getCardId())).forEach(c -> c.setBlanked(true));

	}

}
