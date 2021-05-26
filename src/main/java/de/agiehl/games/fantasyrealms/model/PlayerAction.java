package de.agiehl.games.fantasyrealms.model;

import java.util.Collections;
import java.util.List;

public interface PlayerAction {

	ChooseCardFrom chooseFrom();

	default List<Suit> canChooseFrom() {
		return Collections.emptyList();
	}

	void choose(Card card, Card choosenCard);

}
