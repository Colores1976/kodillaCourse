package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    public Calculator(int a, int b){
        this.a =  a;
        this.b = b;
    }
    public int getSum(){
        int sum = a + b;
        return sum;
    }
    public int getOdd(){
        int odd = a - b;
        return odd;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
