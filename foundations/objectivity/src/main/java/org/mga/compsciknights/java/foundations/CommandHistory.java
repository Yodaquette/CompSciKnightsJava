package org.mga.compsciknights.java.foundations;

import java.util.Stack;

public class CommandHistory {

    // TODO: may need to refactor this class to implement the Dequeue<E>
    //       interface if asynchronous multi-threading is needed
    //       in the future
    private final Stack<Command> history;

    /**
     * Constructs a new command history object
     */
    public CommandHistory() {
        history = new Stack<>();
    }

    /**
     * Pushes a new command onto the command history stack.
     *
     * @param cmd The newly executed command
     */
    public void push(Command cmd) {
        history.push(cmd);
    }

    /**
     * Pops the last command executed from the command history stack. A null
     * value indicates that the history has been exhausted.
     *
     * @return The last performed command
     */
    public Command pop() {
        if (!history.empty()) {
            return history.pop();
        }
        return null;
    }

    /**
     * Declares the empty status of the command history
     *
     * @return true if history is empty; otherwise, false
     */
    public boolean isEmpty() {
        return history.isEmpty();
    }

}
