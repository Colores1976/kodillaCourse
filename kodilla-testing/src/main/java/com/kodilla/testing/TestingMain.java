package com.kodilla.testing;
import  com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args){
        Calculator test = new Calculator(3, 5);
        int resultOdd = test.getOdd();
        int resultSum = test.getSum();
        if ( resultOdd == -2 & resultSum == 8 ) {
        System.out.println("test is ok.");
     } else { System.out.println("test is wrong.");
    }
        System.out.println("3 - 5 = " + resultOdd+",  "+"3+5 = " + resultSum );
    }
}
