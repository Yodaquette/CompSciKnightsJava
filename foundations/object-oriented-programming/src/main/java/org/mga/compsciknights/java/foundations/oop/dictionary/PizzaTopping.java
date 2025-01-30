package org.mga.compsciknights.java.foundations.oop.dictionary;

public enum PizzaTopping {

    SAUCE("sauce"),
    CHEESE("cheese"),
    PEPPERONI("pepperoni"),
    SAUSAGE("sausage"),
    BELL_PEPPERS("bell peppers"),
    ONIONS("onions"),
    BACON("bacon"),
    PINEAPPLE("pineapple"),
    HAM("ham");

    private final String propertyKey;

    /**
     * Retrieve a value from the enum based upon the submitted key
     *
     * @param key The reference key
     */
    PizzaTopping(String key) { this.propertyKey = key; }

    @Override
    public String toString() { return this.propertyKey; }

}
