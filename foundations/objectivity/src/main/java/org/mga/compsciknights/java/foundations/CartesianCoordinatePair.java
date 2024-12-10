package org.mga.compsciknights.java.foundations;

public class CartesianCoordinatePair<X, Y> {
    private final X x;
    private final Y y;

    /**
     * Constructs a new Cartesian coordinate pair
     *
     * @param x Coordinate along the X-axis
     * @param y Coordinate along the Y-axis
     */
    public CartesianCoordinatePair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the X value for the current pair
     *
     * @return The X value for the pair
     */
    public X getX() {
        return x;
    }

    /**
     * Gets the Y value for the current pair
     *
     * @return The Y value for the pair
     */
    public Y getY() {
        return y;
    }
}
