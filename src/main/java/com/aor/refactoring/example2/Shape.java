package com.aor.refactoring.example2;

public interface Shape {
    double getArea() throws Exception;

    double getPerimeter() throws Exception;

    void draw(GraphicFramework graphics);
}
