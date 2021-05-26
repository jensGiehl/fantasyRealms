package de.agiehl.games.fantasyrealms.factories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import de.agiehl.games.fantasyrealms.factories.effects.Card01Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card02Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card03Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card04Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card06Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card07Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card07Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card08Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card09Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card10Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card11Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card11Penatly;
import de.agiehl.games.fantasyrealms.factories.effects.Card12Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card13Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card14Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card15Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card16Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card17Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card17Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card18Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card19Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card20Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card21Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card22Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card24Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card25Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card25Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card26Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card27Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card30Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card30Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card31Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card32Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card33Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card34Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card35Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card35Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card36Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card37Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card38Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card40Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card41Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card42Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card43Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card44Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card45Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card46Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card47Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card50Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card53Bonus;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.Suit;

@Component
public class CardFactory {

	private List<Card> baseGameCards;

	public CardFactory() {
		super();
		baseGameCards = createBaseGameCardDeck();
	}

	private List<Card> createBaseGameCardDeck() {
		List<Card> cards = new ArrayList<>();

		cards.add(Card.builder().cardId(1).baseStrength(9).suit(Suit.LAND).bonus(new Card01Bonus()).build());
		cards.add(Card.builder().cardId(2).baseStrength(6).suit(Suit.LAND).bonus(new Card02Bonus()).build());
		cards.add(Card.builder().cardId(3).baseStrength(8).suit(Suit.LAND).bonus(new Card03Bonus()).build());
		cards.add(Card.builder().cardId(4).baseStrength(7).suit(Suit.LAND).bonus(new Card07Bonus()).build());
		cards.add(Card.builder().cardId(5).baseStrength(4).suit(Suit.LAND).bonus(new Card04Bonus()).build());
		cards.add(Card.builder().cardId(6).baseStrength(1).suit(Suit.FLOOD).bonus(new Card06Bonus()).build());
		cards.add(Card.builder().cardId(7).baseStrength(18).suit(Suit.FLOOD).penalty(new Card07Penalty()).build());
		cards.add(Card.builder().cardId(8).baseStrength(32).suit(Suit.FLOOD).penalty(new Card08Penalty()).build());
		cards.add(Card.builder().cardId(9).baseStrength(14).suit(Suit.FLOOD).bonus(new Card09Bonus()).build());

		cards.add(Card.builder().cardId(10).baseStrength(4).suit(Suit.FLOOD).bonus(new Card10Bonus()).build());
		cards.add(Card.builder().cardId(11).baseStrength(8).suit(Suit.WEATHER).bonus(new Card11Bonus())
				.penalty(new Card11Penatly()).build());
		cards.add(Card.builder().cardId(12).baseStrength(30).suit(Suit.WEATHER).penalty(new Card12Penalty()).build());
		cards.add(Card.builder().cardId(13).baseStrength(27).suit(Suit.WEATHER).penalty(new Card13Penalty()).build());
		cards.add(Card.builder().cardId(14).baseStrength(13).suit(Suit.WEATHER).bonus(new Card14Bonus()).build());
		cards.add(Card.builder().cardId(15).baseStrength(4).suit(Suit.WEATHER).bonus(new Card15Bonus()).build());
		cards.add(Card.builder().cardId(16).baseStrength(40).suit(Suit.FLAME).penalty(new Card16Penalty()).build());
		cards.add(Card.builder().cardId(17).baseStrength(2).suit(Suit.FLAME).bonus(new Card17Bonus()).build());
		cards.add(Card.builder().cardId(18).baseStrength(9).suit(Suit.FLAME).bonus(new Card18Bonus()).build());
		cards.add(Card.builder().cardId(19).baseStrength(11).suit(Suit.FLAME).bonus(new Card19Bonus()).build());

		cards.add(Card.builder().cardId(20).baseStrength(4).suit(Suit.FLAME).bonus(new Card20Bonus()).build());
		cards.add(Card.builder().cardId(21).baseStrength(20).suit(Suit.ARMY).penalty(new Card21Penalty()).build());
		cards.add(Card.builder().cardId(22).baseStrength(10).suit(Suit.ARMY).bonus(new Card22Bonus()).build());
		cards.add(Card.builder().cardId(23).baseStrength(17).suit(Suit.ARMY).penalty(new Card17Penalty()).build());
		cards.add(Card.builder().cardId(24).baseStrength(15).suit(Suit.ARMY).penalty(new Card24Penalty()).build());
		cards.add(Card.builder().cardId(25).baseStrength(5).suit(Suit.ARMY).bonus(new Card25Bonus()).build());
		cards.add(Card.builder().cardId(26).baseStrength(7).suit(Suit.WIZARD).bonus(new Card26Bonus()).build());
		cards.add(Card.builder().cardId(27).baseStrength(9).suit(Suit.WIZARD).bonus(new Card27Bonus()).build());
		cards.add(Card.builder().cardId(29).baseStrength(25).suit(Suit.WIZARD).penalty(new Card25Penalty()).build());

		cards.add(Card.builder().cardId(30).baseStrength(5).suit(Suit.WIZARD).bonus(new Card30Bonus()).build());
		cards.add(Card.builder().cardId(31).baseStrength(8).suit(Suit.LEADER).bonus(new Card31Bonus()).build());
		cards.add(Card.builder().cardId(32).baseStrength(6).suit(Suit.LEADER).bonus(new Card32Bonus()).build());
		cards.add(Card.builder().cardId(33).baseStrength(2).suit(Suit.LEADER).bonus(new Card33Bonus()).build());
		cards.add(Card.builder().cardId(34).baseStrength(4).suit(Suit.LEADER).bonus(new Card34Bonus()).build());
		cards.add(Card.builder().cardId(35).baseStrength(15).suit(Suit.LEADER).bonus(new Card35Bonus())
				.penalty(new Card35Penalty()).build());
		cards.add(Card.builder().cardId(36).baseStrength(9).suit(Suit.BEAST).bonus(new Card36Bonus()).build());
		cards.add(Card.builder().cardId(37).baseStrength(35).suit(Suit.BEAST).penalty(new Card37Penalty()).build());
		cards.add(Card.builder().cardId(38).baseStrength(6).suit(Suit.BEAST).bonus(new Card38Bonus()).build());
		cards.add(Card.builder().cardId(39).baseStrength(30).suit(Suit.BEAST).penalty(new Card30Penalty()).build());

		cards.add(Card.builder().cardId(40).baseStrength(12).suit(Suit.BEAST).bonus(new Card40Bonus()).build());
		cards.add(Card.builder().cardId(41).baseStrength(23).suit(Suit.WEAPON).penalty(new Card41Penalty()).build());
		cards.add(Card.builder().cardId(42).baseStrength(1).suit(Suit.WEAPON).bonus(new Card42Bonus()).build());
		cards.add(Card.builder().cardId(43).baseStrength(7).suit(Suit.WEAPON).bonus(new Card43Bonus()).build());
		cards.add(Card.builder().cardId(44).baseStrength(3).suit(Suit.WEAPON).bonus(new Card44Bonus()).build());
		cards.add(Card.builder().cardId(45).baseStrength(35).suit(Suit.WEAPON).penalty(new Card45Penalty()).build());
		cards.add(Card.builder().cardId(46).baseStrength(4).suit(Suit.ARTIFACT).bonus(new Card46Bonus()).build());
		cards.add(Card.builder().cardId(47).baseStrength(5).suit(Suit.ARTIFACT).bonus(new Card47Bonus()).build());

		cards.add(Card.builder().cardId(50).baseStrength(1).suit(Suit.ARTIFACT).bonus(new Card50Bonus()).build());
		cards.add(Card.builder().cardId(53).baseStrength(0).suit(Suit.WILD).bonus(new Card53Bonus()).build());
		return cards;
	}

	public List<Card> getBaseGameCardDeck() {
		return baseGameCards;
	}

}
