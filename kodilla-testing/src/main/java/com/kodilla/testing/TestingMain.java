package com.kodilla.testing;
import  com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args){
        Calculator test = new Calculator();
        int resultOfSubstraction = test.substract(3, 5);
        int resultOfAddition = test.add(5,3);

        if (resultOfAddition == 8 && resultOfSubstraction == -2) {
        System.out.println("test is ok.");
     } else { System.out.println("test is wrong.");
    }
        System.out.println("3 - 5 = " + resultOfSubstraction+",  "   + " 3 + 5 = " + resultOfAddition );
    }
}
