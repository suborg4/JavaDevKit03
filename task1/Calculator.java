package javadevkit03.task1;

/**
* Написать класс Калькулятор (необобщенный), 
* который содержит обобщенные статические методы: 
* sum(), multiply(), divide(), subtract(). 
* Параметры этих методов – два числа разного типа, 
* над которыми должна быть произведена операция. */

public class Calculator {
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}
