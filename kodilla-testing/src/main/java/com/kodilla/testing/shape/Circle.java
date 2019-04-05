package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Circle implements Shape {
    private double r;

    public Circle(double r){
        this.r = r;
    }
    public String getShapeName(double r) {
        String name = "circle";
        return name;
    }
    public double getField(double r) {
        final double PI = 3.14;
        double field = PI*r*r;
        return field;
    }
}
