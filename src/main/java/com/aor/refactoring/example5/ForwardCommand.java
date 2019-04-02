package com.aor.refactoring.example5;

public class ForwardCommand implements Command {
    @Override
    public void execute(Movement movement) {
        char direction = movement.getDirection();
        if (direction == 'N') movement.rowBackwards();
        if (direction == 'S') movement.rowForward();
        if (direction == 'W') movement.columnBackwards();
        if (direction == 'E') movement.columnForward();
    }
}
