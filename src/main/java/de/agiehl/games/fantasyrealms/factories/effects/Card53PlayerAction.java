package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.HAND;

import de.agiehl.games.fantasyrealms.model.ChooseCard;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;

public class Card53PlayerAction implements ChooseCard {

	@Override
	public ChooseCardFrom chooseFrom() {
		return HAND;
	}

}
