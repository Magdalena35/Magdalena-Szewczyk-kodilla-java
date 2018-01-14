package com.kodilla.testing.shape;

import org.junit.Assert;

class Test {
    public static void main(String[] args) {

        class ShapeCollectorTestSuiteTest {
            public int testCounter = 0;

            public void beforeAllTests() {
                System.out.println("This is the beginning of tests.");
            }

            public void afterAllTest() {
                System.out.println("All tests are finished.");
            }

            public void beforeEveryTest() {
                testCounter++;
                System.out.println("Preparing to execute test #" + testCounter);
            }

            private void testAddFigure() {
                ShapeCollector shapecollector = new ShapeCollector();
                Shape circle = new Circle("Circle",140);
                shapecollector.addFigure(circle);
                Assert.assertEquals(1,shapecollector.getFiguresQuantity());
            }

            public void testRemoveFigure() {
                ShapeCollector shapecollector = new ShapeCollector();
                Shape circle = new Circle("Circle",140);
                shapecollector.addFigure(circle);
                boolean result = shapecollector.removeFigure(circle);
                Assert.assertTrue(result);
                Assert.assertEquals(0,shapecollector.getFiguresQuantity());
            }

            public void testGetFigure() {
                ShapeCollector shapecollector = new ShapeCollector();
                Shape circle = new Circle("Circle",140);
                shapecollector.addFigure(circle);
                Shape retrievedFigure;
                retrievedFigure = shapecollector.getFigure(0);

                Assert.assertEquals(circle,retrievedFigure);
            }
        }


    }
}