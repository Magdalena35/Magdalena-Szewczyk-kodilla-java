package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String ShapeName;
    int a;
    int h;

    public Triangle(String ShapeName, int a, int h){
        this.ShapeName=ShapeName;
        this.a=a;
        this.h=h;
    }
    public String getShapeName() {
        return ShapeName;
    }

    public double getField() {
        return 0.5*a*h;
    }
}
