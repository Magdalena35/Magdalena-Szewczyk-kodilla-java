package com.kodilla.testing.shape;

public class Circle implements Shape{

    String ShapeName;
    double r;
    private double Field;


    public Circle(String ShapeName, int r){
     this.ShapeName=ShapeName;
     this.r = r;


    }


    public String getShapeName() {
        return ShapeName;

        }

        public double getField() {
        return (3.14*r*r);

        }


}
