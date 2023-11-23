package javadevkit03;

import javadevkit03.task1.Calculator;

public class Main {
    public static void main(String[] args) {
        double sumResult = Calculator.sum(5, 10.5);
        double multiplyResult = Calculator.multiply(3.5, 2);
        double divideResult = Calculator.divide(10, 2);
        double subtractResult = Calculator.subtract(8, 3.5);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);
        System.out.println("Subtract: " + subtractResult);
    }
}