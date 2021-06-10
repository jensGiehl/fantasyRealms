package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.Optional;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card51Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		Optional<Card> mayChoosenCard = card.getChoosenCard();

		if (mayChoosenCard.isPresent()) {
			Card choosenCard = mayChoosenCard.get();
			card.setCardId(choosenCard.getCardId());
			card.setSuit(choosenCard.getSuit());
		}
	}

}
