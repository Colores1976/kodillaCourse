package com.kodilla.testing.shape;
import java.lang.reflect.Array;
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
        if (n < 0 || n >= collection.size()) {
            return null;
        } else {
            return collection.get(n);
        }
    }

    public String showFigures() {
        for (int k = 0; k <= collection.size(); k++) ;
        String result = collection.toString();
        return result;
    }
}
