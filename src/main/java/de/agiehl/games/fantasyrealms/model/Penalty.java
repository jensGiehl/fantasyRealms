package de.agiehl.games.fantasyrealms.model;

public interface Penalty {

	void apply(Card card, HandCards handcards);

	default void removePenaltyForSuits(Suit... suits) {

	}
}
