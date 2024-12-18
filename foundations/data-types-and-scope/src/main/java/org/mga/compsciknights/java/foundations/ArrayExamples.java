package org.mga.compsciknights.java.foundations;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class ArrayExamples {

    private static final Logger log = LoggerFactory.getLogger(ArrayExamples.class);

    public static void main(String[] args) {
        int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        append(fib, 34);
        int[] fib2 = append(fib);
        log.info("fib2 after append: {}", fib2);
    }

    /**
     * Simply attempting to append a value to the end of an array will result
     * in an IndexOutOfBounds exception
     *
     * @param array The array to alter
     * @param value The value to append
     */
    public static void append(int[] array, int value) {
        try {
            array[array.length + 1] = value;
        } catch (IndexOutOfBoundsException ex) {
            log.error("Appending to an array results in an IndexOutOfBounds exception.");
        }
    }

    /**
     * Arrays are immutable, so "appending" a value requires some extra steps.
     * 1. A new section of memory must be allocated in the Heap
     * 2. The values from the old array must be copied to the new array
     * 3. Then the new value(s) can be "appended"
     *
     * @param array The array to copy
     * @return A new array with an additional value appended to the end
     */
    public static int[] append(int[] array) {
        int[] newFib = new int[array.length + 1];
        try {
            for (int i = 0; i < array.length; i++) {
                // There exist some utility classes that can quickly copy values
                // from one array to another, but we're doing it manually here
                // for the sake of the example
                //
                // Check out Arrays.copyOf(), Arrays.asList, Collections.addAll
                // or System.arraycopy for some examples of these utilities
                newFib[i] = array[i];
            }
            newFib[newFib.length - 1] = array[array.length - 2] + array[array.length - 1];
        } catch (IndexOutOfBoundsException ex) {
            log.error("Cannot append to array.");
        }
        return newFib;
    }

}
