package de.agiehl.games.fantasyrealms.factories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import de.agiehl.games.fantasyrealms.factories.effects.Card10Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card11Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card11Penatly;
import de.agiehl.games.fantasyrealms.factories.effects.Card12Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card13Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card14Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card15Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card16Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card17Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card19Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card1Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card22Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card24Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card25Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card2Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card30Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card30Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card31Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card32Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card45Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card53Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card7Bonus;
import de.agiehl.games.fantasyrealms.factories.effects.Card8Penalty;
import de.agiehl.games.fantasyrealms.factories.effects.Card9Bonus;
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

		cards.add(Card.builder().cardId(1).baseStrength(9).suit(Suit.LAND).bonus(new Card1Bonus()).build());
		cards.add(Card.builder().cardId(2).baseStrength(6).suit(Suit.LAND).bonus(new Card2Bonus()).build());
		cards.add(Card.builder().cardId(4).baseStrength(7).suit(Suit.LAND).bonus(new Card7Bonus()).build());
		cards.add(Card.builder().cardId(8).baseStrength(32).suit(Suit.FLOOD).penalty(new Card8Penalty()).build());
		cards.add(Card.builder().cardId(9).baseStrength(14).suit(Suit.FLOOD).bonus(new Card9Bonus()).build());

		cards.add(Card.builder().cardId(10).baseStrength(4).suit(Suit.FLOOD).bonus(new Card10Bonus()).build());
		cards.add(Card.builder().cardId(11).baseStrength(8).suit(Suit.WEATHER).bonus(new Card11Bonus())
				.penalty(new Card11Penatly()).build());
		cards.add(Card.builder().cardId(12).baseStrength(30).suit(Suit.WEATHER).penalty(new Card12Penalty()).build());
		cards.add(Card.builder().cardId(13).baseStrength(27).suit(Suit.WEATHER).penalty(new Card13Penalty()).build());
		cards.add(Card.builder().cardId(14).baseStrength(13).suit(Suit.WEATHER).bonus(new Card14Bonus()).build());
		cards.add(Card.builder().cardId(15).baseStrength(4).suit(Suit.WEATHER).bonus(new Card15Bonus()).build());
		cards.add(Card.builder().cardId(16).baseStrength(40).suit(Suit.FLAME).penalty(new Card16Penalty()).build());
		cards.add(Card.builder().cardId(19).baseStrength(11).suit(Suit.FLAME).bonus(new Card19Bonus()).build());

		cards.add(Card.builder().cardId(22).baseStrength(10).suit(Suit.ARMY).bonus(new Card22Bonus()).build());
		cards.add(Card.builder().cardId(23).baseStrength(17).suit(Suit.ARMY).penalty(new Card17Penalty()).build());
		cards.add(Card.builder().cardId(24).baseStrength(15).suit(Suit.ARMY).penalty(new Card24Penalty()).build());
		cards.add(Card.builder().cardId(25).baseStrength(5).suit(Suit.ARMY).bonus(new Card25Bonus()).build());

		cards.add(Card.builder().cardId(30).baseStrength(5).suit(Suit.WIZARD).bonus(new Card30Bonus()).build());
		cards.add(Card.builder().cardId(31).baseStrength(8).suit(Suit.LEADER).bonus(new Card31Bonus()).build());
		cards.add(Card.builder().cardId(32).baseStrength(6).suit(Suit.LEADER).bonus(new Card32Bonus()).build());

		cards.add(Card.builder().cardId(39).baseStrength(30).suit(Suit.BEAST).penalty(new Card30Penalty()).build());

		cards.add(Card.builder().cardId(45).baseStrength(35).suit(Suit.WEAPON).penalty(new Card45Penalty()).build());

		cards.add(Card.builder().cardId(53).baseStrength(0).suit(Suit.WILD).bonus(new Card53Bonus()).build());
		return cards;
	}

	public List<Card> getBaseGameCardDeck() {
		return baseGameCards;
	}

}
