package org.mga.compsciknights.java.foundations;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class RecursiveCallStackOverflow {
    private static final Logger log = LoggerFactory.getLogger(RecursiveCallStackOverflow.class);
    private static int depth = 0;

    /**
     * Recursively calls itself to force a StackOverflowError
     */
    private static void recursiveStackOverflow() {
        depth++;
        recursiveStackOverflow();
    }

    /**
     * Example program that forces a StackOverflowError and
     * then prints the depth
     *
     * @param args Command-line arguments (unused for this example)
     */
    public static void main(String[] args) {
        try {
            recursiveStackOverflow();
        } catch (StackOverflowError e) {
            log.error("Maximum depth of the call stack is {}", depth);
        }
    }
}
