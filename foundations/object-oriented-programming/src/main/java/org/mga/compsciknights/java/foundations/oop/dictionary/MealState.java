package org.mga.compsciknights.java.foundations.oop.dictionary;

/**
 * An enum storing the different states of a meal
 */
public enum MealState {

    WHOLE("whole"),
    PARTIAL("partial"),
    GONE("gone");

    private final String propertyKey;

    /**
     * Retrieve a value from the enum based upon the submitted key
     *
     * @param key The reference key
     */
    MealState(String key) { this.propertyKey = key; }

    @Override
    public String toString() { return this.propertyKey; }

}
