package org.mga.compsciknights.java.foundations.oop.api;

public interface Mammal {

    /**
     * Consume a meal to replenish energy
     *
     * @param meal The specific type of meal to eat
     * @return Total weight gained in lbs.
     */
    double eat(Meal meal);

    /**
     * Move via the act of locomotion
     *
     * @param mph The current pace in miles-per-hour
     * @return Total distance traveled
     */
    double move(double mph);

    /**
     * Communicate to others using voice and/or noises
     *
     * @param whatToSay What to communicate
     */
    void communicate(String whatToSay);

}
