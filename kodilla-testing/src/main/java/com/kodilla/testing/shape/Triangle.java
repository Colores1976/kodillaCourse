package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a, h;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }
    public String getShapeName() {
        String triangle = "triangle";
        return triangle;
    }
    // a- podstawa, h - wysokość
    public double getField() {
        double field = (a*h)/2;
        return field;
    }
}
