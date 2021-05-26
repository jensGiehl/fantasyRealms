package de.agiehl.games.fantasyrealms.model;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BiConsumer;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

/**
 * Represent the hand cards for one player
 * 
 * @author Jens Giehl
 *
 */
@Value
@Builder
public class HandCards {

	UUID handId;

	@Singular("card")
	List<Card> cards;

	public List<Card> getCards() {
		return unmodifiableList(cards);
	}

	public int getHandCardSize() {
		return cards.size();
	}

	public boolean containsOneOf(int... cardIds) {
		List<Integer> whitelistIds = Arrays.stream(cardIds).boxed().collect(toList());

		return cards.stream().map(Card::getCardId).filter(id -> whitelistIds.contains(id)).count() > 0;
	}

	public boolean containsAllOf(int... cardIds) {
		List<Integer> whitelistIds = Arrays.stream(cardIds).boxed().collect(toList());

		return cards.stream().map(Card::getCardId).filter(id -> whitelistIds.contains(id)).count() == whitelistIds
				.size();
	}

	public List<Card> getCardsBySuits(Suit... suits) {
		List<Suit> whitelistSuits = asList(suits);

		return cards.stream().filter(card -> whitelistSuits.contains(card.getSuit())).collect(toList());
	}

	public List<Card> getCardsExceptSuits(Suit... suits) {
		List<Suit> blacklistSuits = asList(suits);

		return cards.stream().filter(card -> !blacklistSuits.contains(card.getSuit())).collect(toList());
	}

	public boolean containsSuits(Suit... suits) {
		return !notContainsSuits(suits);
	}

	public boolean notContainsSuits(Suit... suits) {
		return getCardsBySuits(suits).isEmpty();
	}

	public int countSuits(Suit... suits) {
		return getCardsBySuits(suits).size();
	}

	public List<BiConsumer<Card, HandCards>> getAllBonusEffects() {
		return cards.stream().map(Card::getBonus).filter(Objects::nonNull).collect(toList());
	}

	public List<BiConsumer<Card, HandCards>> getAllPenaltyEffects() {
		return cards.stream().map(Card::getPenalty).filter(Objects::nonNull).collect(toList());
	}

}