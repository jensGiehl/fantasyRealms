package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card52Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		Card choosenCard = card.getChoosenCard();

		card.setCardId(choosenCard.getCardId());
		card.setSuit(choosenCard.getSuit());
	}

}
