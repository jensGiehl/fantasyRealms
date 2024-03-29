package de.agiehl.games.fantasyrealms.factories.effects;

import static java.util.stream.Collectors.toList;

import java.util.List;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.PenaltyEffect;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card08Penalty implements PenaltyEffect {

	private Suit[] penatlySuits = new Suit[] { Suit.ARMY, Suit.LAND, Suit.FLAME };

	@Override
	public void apply(Card card, HandCards handcards) {
		List<Card> blankedCards = handcards.getCardsBySuits(penatlySuits).stream()
				.filter(c -> c.getCardId() != CardId.LIGHTNING && c.getCardId() != CardId.MOUNTAIN).collect(toList());

		blankedCards.forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
