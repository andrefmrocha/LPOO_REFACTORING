package com.aor.refactoring.example5;

public class Movement {
    private int row;
    private int column;
    private char direction;

    public Movement(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void rowForward(){
        this.row++;
    }

    public void rowBackwards(){
        this.row--;
    }

    public void columnForward(){
        this.column++;
    }

    public void columnBackwards(){
        this.column--;
    }
}
