package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.Arrays;
import java.util.List;

import de.agiehl.games.fantasyrealms.factories.CardIds;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card16Penalty implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.FLAME, Suit.WIZARD, Suit.WEATHER, Suit.WEAPON, Suit.ARTIFACT };

	@Override
	public void apply(Card card, HandCards handcards) {
		List<Card> cards = handcards.getCardsExceptSuits(penatlySuits);

		List<Integer> cardsWhichAreNotBlanked = Arrays.asList(new Integer[] { CardIds.MOUNTAIN.getId(),
				CardIds.UNICORN.getId(), CardIds.GREAT_FLOOD.getId(), CardIds.DRAGON.getId(), CardIds.ISLAND.getId() });

		cards.stream().filter(c -> !cardsWhichAreNotBlanked.contains(c.getCardId())).forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
