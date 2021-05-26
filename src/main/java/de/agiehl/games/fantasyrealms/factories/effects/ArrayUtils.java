package de.agiehl.games.fantasyrealms.factories.effects;

import static java.util.Arrays.asList;
import static java.util.function.Predicate.not;

import java.util.List;

import de.agiehl.games.fantasyrealms.model.Suit;

public final class ArrayUtils {

	public static Suit[] removeSuitsFrom(Suit[] source, Suit[] shouldBeRemoved) {
		List<Suit> blacklist = asList(shouldBeRemoved);
		return asList(source).stream().filter(not(c -> blacklist.contains(c))).toArray(Suit[]::new);
	}

}
