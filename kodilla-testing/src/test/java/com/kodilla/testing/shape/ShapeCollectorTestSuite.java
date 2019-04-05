package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
      ShapeCollector shapeCollector = new ShapeCollector();

      ArrayList<Shape> collection = new ArrayList<>();
      Shape square1 = new Square(2.0,2.0);
      Shape triangle = new Triangle(5, 5);
      Shape circle = new Circle(5.0);
      Shape square2 = new Square(5,7);

      ArrayList<Shape> expected = new ArrayList<>();
      expected.add(square1);
      expected.add(triangle);

        //When
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals( expected,  collection);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(2,2);
        Shape triangle = new Triangle(5, 5);
        Shape circle = new Circle(5);
        Shape square2 = new Square(5,7);
        ArrayList<Shape> collection = new ArrayList<>();
        collection.add(square1);
        collection.add(triangle);
        collection.add(circle);
        collection.add(square2);

        ArrayList<Shape> expected = new ArrayList<>();
        expected.add(square1);
        expected.add(triangle);
        expected.add(circle);
        //When
        shapeCollector.removeFigure(square2);
        //Then
        Assert.assertEquals( expected,  collection);
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(2,2);
        Shape triangle = new Triangle(5, 5);
        Shape circle = new Circle(5);
        Shape square2 = new Square(5,7);
        ArrayList<Shape> collection = new ArrayList<>();
        collection.add(square1);
        collection.add(triangle);
        collection.add(circle);
        collection.add(square2);
        //When
       Shape result = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals( circle,  result);
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square1 = new Square(2,2);

        ArrayList<Shape> collection = new ArrayList<>();
        collection.add(square1);

        //When
       String result = shapeCollector.showFigures();
        //Then
        Assert.assertEquals( "square1", result);
    }
}
