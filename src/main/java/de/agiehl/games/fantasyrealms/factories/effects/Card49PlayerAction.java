package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.COLOR;

import de.agiehl.games.fantasyrealms.model.ChooseCard;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;

public class Card49PlayerAction implements ChooseCard {

	@Override
	public ChooseCardFrom chooseFrom() {
		return COLOR;
	}

}
