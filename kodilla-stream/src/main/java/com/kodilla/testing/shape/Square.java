package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Square implements Shape {

    String ShapeName;
    int a;

    public Square(String ShapeName, int a){
        this.ShapeName=ShapeName;
        this.a=a;
    }

    public String getShapeName(){
        return ShapeName;
    }
    public double getField(){
        return a*a;
    }
}
