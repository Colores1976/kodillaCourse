package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    int sum = 0;
    int odd= 0;
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
}
