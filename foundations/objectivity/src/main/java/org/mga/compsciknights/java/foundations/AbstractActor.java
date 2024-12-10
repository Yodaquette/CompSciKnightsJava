package org.mga.compsciknights.java.foundations;

public class AbstractActor implements Actor {

    //*************************************************************************
    // PROTECTED MEMBER VARIABLES
    //*************************************************************************

    protected double health;

    protected int positionX;

    protected int positionY;

    protected CommandHistory cmdHistory;

    //*************************************************************************
    // OVERRIDDEN PUBLIC METHODS
    //*************************************************************************

    @Override
    public boolean isAlive() {
        return health > 0D;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

}
