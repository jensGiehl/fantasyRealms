package de.agiehl.games.fantasyrealms.model;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

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

	public void addCard(Card card) {
		cards.add(card);
	}

	public void discardCard(Card card) {
		cards.remove(card);
	}

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

	public List<Card> getAllCardsWithBonusEffects() {
		return cards.stream().filter(c -> Objects.nonNull(c.getBonus())).collect(toList());
	}

	public List<CardBonus> getAllBonusEffects() {
		return getAllCardsWithBonusEffects().stream().map(Card::getBonus).collect(toList());
	}

	public List<Card> getAllCardsWithPenaltyEffects() {
		return cards.stream().filter(c -> Objects.nonNull(c.getPenalty())).collect(toList());
	}

	public List<Card> getAllCardsWithPenaltyEffectsWithSuit(Suit... suits) {
		List<Suit> whitliste = Arrays.asList(suits);
		return getAllCardsWithPenaltyEffects().stream().filter(c -> whitliste.contains(c.getSuit())).collect(toList());
	}

	public List<CardPenalty> getAllPenaltyEffects() {
		return getAllCardsWithPenaltyEffects().stream().map(Card::getPenalty).collect(toList());
	}

	public List<CardPenalty> getAllPenaltyEffectsWithSuit(Suit... suits) {
		return getAllCardsWithPenaltyEffectsWithSuit(suits).stream().map(Card::getPenalty).collect(toList());
	}

	public List<Card> getAllCardsWithPlayerActionEffects() {
		return cards.stream().filter(c -> Objects.nonNull(c.getPlayerAction())).collect(toList());
	}

	public List<PlayerAction> getAllPlayerActions() {
		return getAllCardsWithPlayerActionEffects().stream().map(Card::getPlayerAction).collect(toList());
	}

}