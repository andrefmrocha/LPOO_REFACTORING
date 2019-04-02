package com.aor.refactoring.example5;

public class RightCommand implements Command {
    @Override
    public void execute(Movement movement) {
        char direction = movement.getDirection();
        if (direction == 'N') direction = 'E';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
        movement.setDirection(direction);
    }
}
