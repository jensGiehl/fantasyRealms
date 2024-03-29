package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.GAME;
import static java.util.Arrays.asList;

import java.util.List;

import de.agiehl.games.fantasyrealms.model.ChooseCard;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card52PlayerAction implements ChooseCard {

	@Override
	public ChooseCardFrom chooseFrom() {
		return GAME;
	}

	@Override
	public List<Suit> canChooseFromSuit() {
		return asList(new Suit[] { Suit.ARMY, Suit.LAND, Suit.WEATHER, Suit.FLOOD, Suit.FLAME });
	}

}
