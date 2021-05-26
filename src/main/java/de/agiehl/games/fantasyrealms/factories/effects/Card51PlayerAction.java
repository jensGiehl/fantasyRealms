package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.GAME;

import java.util.Arrays;
import java.util.List;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.PlayerAction;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card51PlayerAction implements PlayerAction {

	@Override
	public ChooseCardFrom chooseFrom() {
		return GAME;
	}

	@Override
	public List<Suit> canChooseFrom() {
		return Arrays.asList(new Suit[] { Suit.ARTIFACT, Suit.LEADER, Suit.WIZARD, Suit.WEAPON, Suit.BEAST });
	}

	@Override
	public void choose(Card card, Card choosenCard) {
		card.setCardId(choosenCard.getCardId());
		card.setSuit(choosenCard.getSuit());
	}

}
