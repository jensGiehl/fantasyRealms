package de.agiehl.games.fantasyrealms.factories.effects;

import static de.agiehl.games.fantasyrealms.factories.CardId.SMOKE;
import static de.agiehl.games.fantasyrealms.factories.CardId.WILDFIRE;

import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;
import de.agiehl.games.fantasyrealms.model.Suit;

public class Card01Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsAllOf(SMOKE, WILDFIRE)) {
			card.setBonusPoints(50);
		}

		handcards.getCardsBySuits(Suit.FLOOD).forEach(c -> c.setCleared(true));
	}

}
