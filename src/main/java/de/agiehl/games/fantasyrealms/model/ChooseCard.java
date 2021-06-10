package de.agiehl.games.fantasyrealms.model;

import java.util.Collections;
import java.util.List;

public interface ChooseCard {

	ChooseCardFrom chooseFrom();

	default List<Suit> canChooseFromSuit() {
		return Collections.emptyList();
	}

}
