package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.HAND;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.PlayerAction;

public class Card53PlayerAction implements PlayerAction {

	@Override
	public ChooseCardFrom chooseFrom() {
		return HAND;
	}

	@Override
	public void choose(Card card, Card choosenCard) {
		card.setCardId(choosenCard.getCardId());
		card.setBaseStrength(choosenCard.getBaseStrength());
		card.setSuit(choosenCard.getSuit());
		card.setPenalty(choosenCard.getPenalty());
	}

}
