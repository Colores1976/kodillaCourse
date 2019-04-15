package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> collection = new ArrayList<>();

    public void addFigure( Shape shape ) {
        collection.add(shape);
    }

    public void removeFigure( Shape shape ) {
        collection.remove(shape);
    }

    public Shape getFigure( int n ) {

           Shape result = collection.get(n);
        return result;
    }

    public String showFigures() {
        for (int k = 0; k < collection.size(); k++) ;
        String result = collection.toString();
        return result;
    }
}
