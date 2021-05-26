package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.COLOR;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.PlayerAction;

public class Card49PlayerAction implements PlayerAction {

	@Override
	public ChooseCardFrom chooseFrom() {
		return COLOR;
	}

	@Override
	public void apply(Card card, Card choosenCard, HandCards handCards) {
		choosenCard.setSuit(card.getSuit());
	}

}
