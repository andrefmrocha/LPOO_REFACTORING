package com.aor.refactoring.example5;

public class Turtle {
    private Movement movement;

    public Turtle(int row, int column, char direction) {
        movement = new Movement(row, column, direction);
    }

    public int getRow() {
        return movement.getRow();
    }

    public int getColumn() {
        return movement.getColumn();
    }

    public char getDirection() {
        return movement.getDirection();
    }

    public void execute(Command command) {
        command.execute(this.movement);
    }
}
