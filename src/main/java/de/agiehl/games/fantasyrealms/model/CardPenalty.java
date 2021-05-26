package de.agiehl.games.fantasyrealms.model;

public interface CardPenalty {

	void accept(Card card, HandCards handcards);

	default void removePenaltyForSuits(Suit... suits) {

	}
}
