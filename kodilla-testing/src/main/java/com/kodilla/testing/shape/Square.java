package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

class Square implements Shape {
    private double a, b;
    public String name;
    public double field;

    public Square(double a, double b){
        this.a = a;
        this.b = b;
    }
    public String getShapeName() {
        name = "square";
        return name;
    }
@Override
    public double getField(double a, double b) {
        field = a*b;
        return field;
    }
}
