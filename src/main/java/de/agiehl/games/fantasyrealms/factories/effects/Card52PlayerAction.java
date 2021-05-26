package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.model.ChooseCardFrom.GAME;
import static java.util.Arrays.asList;

import java.util.List;

import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.ChooseCardFrom;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.PlayerAction;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card52PlayerAction implements PlayerAction {

	@Override
	public ChooseCardFrom chooseFrom() {
		return GAME;
	}

	@Override
	public List<Suit> canChooseFrom() {
		return asList(new Suit[] { Suit.ARMY, Suit.LAND, Suit.WEATHER, Suit.FLOOD, Suit.FLAME });
	}

	@Override
	public void apply(Card card, Card choosenCard, HandCards handCards) {
		card.setCardId(choosenCard.getCardId());
		card.setSuit(choosenCard.getSuit());
	}

}
