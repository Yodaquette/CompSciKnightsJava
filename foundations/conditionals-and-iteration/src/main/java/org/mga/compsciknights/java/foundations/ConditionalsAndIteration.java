package org.mga.compsciknights.java.foundations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConditionalsAndIteration {

    private static final Logger log = LoggerFactory.getLogger(ConditionalsAndIteration.class);

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            log.info("Program input is empty.");
            return;
        } else if (args.length == 1) {
            log.info("Program has {} input value.", args.length);
        } else {
            log.info("Program has {} input values.", args.length);
        }

        //*********************************************************************
        // For loops use a manually-defined index variable for iterating
        // through collections
        //*********************************************************************
        log.info("Printing program input using a for loop...");
        for (int i = 0; i < args.length; i++) {
            log.info("Argument at index {}: {}", i, args[i]);
        }

        //*********************************************************************
        // While loops examine a condition before executing the block of code
        // within the loop body
        //*********************************************************************
        log.info("Printing program input using a while loop...");
        int i = 0;
        while(i < args.length) {
            log.info("Argument at index {}: {}", i, args[i]);
            i++;
        }

        //*********************************************************************
        // Do While loops execute the block of code within the loop body before
        // examining the loop condition
        //*********************************************************************
        log.info("Printing program input using a do while loop...");
        i = 0;
        do {
            log.info("Argument at index {}: {}", i, args[i]);
            i++;
        } while (i < args.length);

        //*********************************************************************
        // The for each loop is based on Java's Iterable interface, which means
        // they don't have an explicit index counter variable but instead use
        // an Iterator to loop through collections
        //*********************************************************************
        log.info("Printing program input using a for each loop...");
        for (String arg : args) {
            log.info("{}", arg);
        }
    }

}
