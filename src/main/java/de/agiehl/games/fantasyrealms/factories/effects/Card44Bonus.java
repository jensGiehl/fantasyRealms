package de.agiehl.games.fantasyrealms.factories.effects;

import de.agiehl.games.fantasyrealms.factories.CardId;
import de.agiehl.games.fantasyrealms.model.BonusEffect;
import de.agiehl.games.fantasyrealms.model.Card;
import de.agiehl.games.fantasyrealms.model.HandCards;

public class Card44Bonus implements BonusEffect {

	@Override
	public void apply(Card card, HandCards handcards) {
		if (handcards.containsOneOf(CardId.ELVEN_ARCHERS, CardId.WARLORD, CardId.BEASTMASTER)) {
			card.setBonusPoints(30);
		}
	}

}
