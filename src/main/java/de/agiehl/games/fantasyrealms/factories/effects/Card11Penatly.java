package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.List;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Penalty;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card11Penatly implements Penalty {

	private Suit[] penatlySuits = new Suit[] { Suit.FLAME };

	@Override
	public void apply(Card card, HandCards handcards) {
		List<Card> cards = handcards.getCardsBySuits(penatlySuits);

		cards.stream().filter(c -> c.getCardId() != CardId.LIGHTNING).forEach(c -> c.setBlanked(true));
	}

	@Override
	public void removePenaltyForSuits(Suit... suits) {
		penatlySuits = ArrayUtils.removeSuitsFrom(penatlySuits, suits);
	}

}
