package de.agiehl.games.fantasyrealms.model;

import java.util.Optional;

import de.agiehl.games.fantasyrealms.factories.CardId;
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

	CardId cardId;

	Suit suit;

	int baseStrength;

	BonusEffect bonus;

	ClearsPenaltyEffect clearsPenalty;

	PenaltyEffect penalty;

	ChooseCard chooseCardAction;

	Card choosenCard;

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

	public Optional<BonusEffect> getBonus() {
		return Optional.ofNullable(bonus);
	}

	public Optional<ClearsPenaltyEffect> getClearsPenalty() {
		return Optional.ofNullable(clearsPenalty);
	}

	public Optional<PenaltyEffect> getPenalty() {
		return Optional.ofNullable(penalty);
	}

	public Optional<ChooseCard> getChooseCardAction() {
		return Optional.ofNullable(chooseCardAction);
	}

	public Optional<Card> getChoosenCard() {
		return Optional.ofNullable(choosenCard);
	}

}