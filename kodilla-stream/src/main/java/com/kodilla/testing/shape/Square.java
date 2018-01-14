package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Square implements Shape {

    String ShapeName;
    int Field;

    public Square(String ShapeName, int Field){
        this.ShapeName=ShapeName;
        this.Field=Field;
    }

    public String getShapeName(){
        return ShapeName;
    }
    public int getField(){
        return Field;
    }
}
