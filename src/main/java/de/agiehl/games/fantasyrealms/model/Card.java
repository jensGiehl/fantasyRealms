package de.agiehl.games.fantasyrealms.model;

import java.util.function.BiConsumer;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Represent a card
 * 
 * @author Jens Giehl
 *
 */
@Builder
@Value
public class Card {

	int cardId;

	Suit suit;

	int baseStrength;

	BiConsumer<Card, HandCards> bonus;

	BiConsumer<Card, HandCards> penalty;

	@NonFinal
	@Setter
	@Builder.Default
	int bonusPoints = 0;

	@NonFinal
	@Setter
	@Builder.Default
	boolean isBlanked = false;

	@NonFinal
	@Setter
	@Builder.Default
	boolean isCleared = false;

	public int getScore(HandCards handCards) {
		if (isBlanked) {
			return 0;
		}

		return baseStrength + bonusPoints;
	}

}