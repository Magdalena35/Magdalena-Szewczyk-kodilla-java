package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;


public class ShapeCollectorTestSuite {



    @Test

    public void testAddFigure() {
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle("Circle",140);
        shapecollector.addFigure(circle);
        Assert.assertEquals(1,shapecollector.getFiguresQuantity());
    }

    @Test

    public void testRemoveFigure() {
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 140);
        shapecollector.addFigure(circle);
        boolean result = shapecollector.removeFigure(circle);
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapecollector.getFiguresQuantity());
    }
    @Test

    public void testGetFigure() {
        ShapeCollector shapecollector = new ShapeCollector();
        Shape circle = new Circle("Circle",140);
        shapecollector.addFigure(circle);
        Shape retrievedFigure;
        retrievedFigure = shapecollector.getFigure(0);

        Assert.assertEquals(circle,retrievedFigure);
    }
}

