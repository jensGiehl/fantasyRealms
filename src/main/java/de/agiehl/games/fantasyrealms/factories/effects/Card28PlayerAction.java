package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.DISCARDED;

import java.util.Arrays;
import java.util.List;

import de.agiehl.games.fantasyrealms.model.ChooseCard;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card28PlayerAction implements ChooseCard {

	@Override
	public ChooseCardFrom chooseFrom() {
		return DISCARDED;
	}

	@Override
	public List<Suit> canChooseFromSuit() {
		return Arrays.asList(new Suit[] { Suit.ARMY, Suit.LEADER, Suit.WIZARD, Suit.BEAST });
	}

}
