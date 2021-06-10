package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.Optional;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card09Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		Optional<Card> choosenCard = card.getChoosenCard();
		if (choosenCard.isPresent()) {
			choosenCard.get().setCleared(true);
		}
	}

}
