package de.agiehl.games.fantasyrealms.model;

import lombok.Builder;
import lombok.Data;

/**
 * Represent a card
 * 
 * @author Jens Giehl
 *
 */
@Builder
@Data
public class Card {

	int cardId;

	Suit suit;

	int baseStrength;

	CardBonus bonus;

	CardPenalty penalty;

	PlayerAction playerAction;

	@Builder.Default
	int bonusPoints = 0;

	@Builder.Default
	boolean isBlanked = false;

	@Builder.Default
	boolean isCleared = false;

	public int getScore(HandCards handCards) {
		if (isBlanked) {
			return 0;
		}

		return baseStrength + bonusPoints;
	}

}