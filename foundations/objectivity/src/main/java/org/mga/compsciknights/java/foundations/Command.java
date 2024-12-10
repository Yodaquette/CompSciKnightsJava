package org.mga.compsciknights.java.foundations;

public interface Command {

    /**
     * Performs a command on the actor object
     *
     * @param actor An object in the game world
     */
    void execute(Actor actor);

    /**
     * Undoes the last stored command
     *
     * @param actor An object in the game world
     */
    void undo(Actor actor);

}
