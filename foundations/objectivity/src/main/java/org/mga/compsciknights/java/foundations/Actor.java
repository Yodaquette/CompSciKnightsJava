package org.mga.compsciknights.java.foundations;

public interface Actor {

    /**
     * Declares the actor's current existence in the game world
     *
     * @return true if actor is alive in the game world; otherwise, false
     */
    boolean isAlive();

    /**
     * Declares the actor's current visibility status in the game world
     *
     * @return true if the actor is in view of the camera; otherwise, false
     */
    boolean isVisible();

}
