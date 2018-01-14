package com.kodilla.testing.shape;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ShapeCollector {


    ArrayList<Shape>shapes = new ArrayList<Shape>();


    public void addFigure(Shape shape){
        Shape Figure = shape;;

        shapes.add(Figure);
    }
    public boolean removeFigure(Shape shape){
return true;
    }

    public Shape getFigure(int n) {
        Shape Figure = null;
        if(n>=0 && n<shapes.size())
            Figure = shapes.get(n);
        return Figure;
    }

    public void showFigures(){}



    public int getFiguresQuantity() {
        return shapes.size();
    }
}



