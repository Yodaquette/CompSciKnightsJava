package org.mga.compsciknights.java.foundations.oop.api;

import org.mga.compsciknights.java.foundations.oop.dictionary.MealState;

public interface Meal {

    /**
     * Declares if the meal is whole, partial, or gone
     *
     * @return The current state of the meal
     */
    MealState getCurrentState();

}
