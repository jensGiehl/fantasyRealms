package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.Arrays;
import java.util.List;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.PenaltyEffect;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card16Penalty implements PenaltyEffect {

	private Suit[] penatlySuits = new Suit[] { Suit.FLAME, Suit.WIZARD, Suit.WEATHER, Suit.WEAPON, Suit.ARTIFACT };

	@Override
	public void apply(Card card, HandCards handcards) {
		List<Card> cards = handcards.getCardsExceptSuits(penatlySuits);

		List<CardId> cardsWhichAreNotBlanked = Arrays.asList(new CardId[] { CardId.MOUNTAIN, CardId.UNICORN,
				CardId.GREAT_FLOOD, CardId.DRAGON, CardId.ISLAND });

		cards.stream().filter(c -> !cardsWhichAreNotBlanked.contains(c.getCardId())).forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
