package com.aor.refactoring.example5;

public class LeftCommand implements Command {
    @Override
    public void execute(Movement movement) {
        char direction = movement.getDirection();
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';
        movement.setDirection(direction);
    }
}
