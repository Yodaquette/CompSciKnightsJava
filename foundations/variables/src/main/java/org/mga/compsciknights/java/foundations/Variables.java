package org.mga.compsciknights.java.foundations;

/**
 * A class demonstrating the use of variables.
 * <p />
 * For more information on the data types used in this class
 * refer to <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">
 *     Primitive Data Types
 * </a>.
 */
public class Variables {

    /**
     * Strings are powerful and can perform many operations, but basically
     * they store text as a string of alphanumeric characters.
     * <p />
     * NOTE: the String type in Java is immutable and cannot be changed
     *       once created.
     * Refer to <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">
     *     Class String
     * </a> for more information
     */
    private String aString;

    /**
     * int represents signed 32-bit integers in the range
     * -2,147,483,648 and 2,147,483,647, inclusive.
     * <p />
     * Refer to <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">
     *     Primitive Data Types
     * </a> for more information
     */
    private int anInt;

    /**
     * float represents signed 32-bit, single-precision decimal numbers
     */
    private float aFloat;

    /**
     * double represents signed 64-bit, double-precision decimal numbers.
     */
    private double aDouble;

    /**
     * Default constructor
     */
    public Variables() {
        aString = "this is a string.";
        anInt = 0;
        aFloat = 0F;
        aDouble = 0D;
    }

    /**
     * This constructor supports setting a custom String value
     *
     * @param passInString A String value
     */
    public Variables(String passInString) {
        this.setaString(passInString);

        anInt = 0;
        aFloat = 0F;
        aDouble = 0D;
    }

    /**
     * This constructor supports setting all member variables of the class
     *
     * @param passInString A String value
     * @param anInt An int value
     * @param aFloat A float value
     * @param aDouble A double value
     */
    public Variables(String passInString, int anInt, float aFloat, double aDouble) {
        this.setaString(passInString);
        this.anInt = anInt;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
    }

    /**
     * Checks the String argument value and then sets the aString
     * member variable accordingly
     *
     * @param aString A String value
     */
    public void setaString(String aString) {
        if (aString == null || aString.isEmpty()) {
            this.aString = aString;
        } else {
            this.aString = "no string was provided.";
        }
    }

    public String getaString() {
        return aString;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }
}
