package org.mga.compsciknights.java.foundations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConditionalsAndIteration {

    private static final Logger log = LoggerFactory.getLogger(ConditionalsAndIteration.class);

    public static void main(String[] args) {
        String message;
        if (args == null || args.length == 0) {
            message = "Program input is empty.";
            log.info(message);
            return;
        } else if (args.length == 1) {
            message = String.format("Program has %d input value.", args.length);
        } else {
            message = String.format("Program has %d input values.", args.length);
        }
        log.info(message);

        log.info("Printing program input now...");
        for (String arg : args) {
            log.info(arg);
        }
    }

}
