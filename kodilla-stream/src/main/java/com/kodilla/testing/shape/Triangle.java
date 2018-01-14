package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String ShapeName;
    int Field;

    public Triangle(String ShapeName, int Field){
        this.ShapeName=ShapeName;
        this.Field=Field;
    }
    public String getShapeName() {
        return ShapeName;
    }

    public int getField() {
        return Field;
    }
}
