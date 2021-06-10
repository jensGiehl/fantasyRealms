package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card53Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		Card choosenCard = card.getChoosenCard();

		card.setCardId(choosenCard.getCardId());
		card.setBaseStrength(choosenCard.getBaseStrength());
		card.setSuit(choosenCard.getSuit());
		card.setPenalty(choosenCard.getPenalty());
	}

}
