package de.agiehl.games.fantasyrealms.factories.effects;

import java.util.Optional;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.PenaltyEffect;

public class Card53Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		Optional<Card> mayChoosenCard = card.getChoosenCard();

		if (mayChoosenCard.isPresent()) {
			Card choosenCard = mayChoosenCard.get();
			card.setCardId(choosenCard.getCardId());
			card.setBaseStrength(choosenCard.getBaseStrength());
			card.setSuit(choosenCard.getSuit());

			Optional<PenaltyEffect> choosenCardPenalty = choosenCard.getPenalty();
			if (choosenCardPenalty.isPresent()) {
				card.setPenalty(choosenCardPenalty.get());
			}
		}
	}

}
