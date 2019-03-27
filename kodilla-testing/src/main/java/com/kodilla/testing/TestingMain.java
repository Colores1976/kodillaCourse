package com.kodilla.testing;
import  com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args){
        Calculator test = new Calculator(3, 5);
        int resultDifference = test.getDifference();
        int resultSum = test.getSum();
        int a = test.getA();
        int b = test.getB();
        if (resultDifference == a - b & resultSum == a + b) {
        System.out.println("test is ok.");
     } else { System.out.println("test is wrong.");
    }
        System.out.println("3 - 5 = " + resultDifference+",  "   + " 3 + 5 = " + resultSum );
    }
}
