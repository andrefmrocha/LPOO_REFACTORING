package com.aor.refactoring.example2;

public class Circle implements Shape{

    private final double x;
    private final double y;
    private final double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return  Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw(GraphicFramework graphics) {

    }
}
