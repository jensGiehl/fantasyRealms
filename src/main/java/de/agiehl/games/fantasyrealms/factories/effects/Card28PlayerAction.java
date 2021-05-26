package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.DISCARDED;

import java.util.Arrays;
import java.util.List;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.PlayerAction;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card28PlayerAction implements PlayerAction {

	@Override
	public ChooseCardFrom chooseFrom() {
		return DISCARDED;
	}

	@Override
	public List<Suit> canChooseFrom() {
		return Arrays.asList(new Suit[] { Suit.ARMY, Suit.LEADER, Suit.WIZARD, Suit.BEAST });
	}

	@Override
	public void choose(Card card, Card choosenCard) {
		// TODO: Find a way to impl.
	}

}
