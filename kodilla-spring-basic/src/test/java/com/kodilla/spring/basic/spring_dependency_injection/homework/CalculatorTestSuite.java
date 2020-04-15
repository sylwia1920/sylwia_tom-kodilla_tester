package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    ApplicationContext context =  new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    void add() {
        double actualResult = bean.add(4,2);
        Assertions.assertEquals(100, actualResult);
    }

    @Test
    void subtract() {
        double actualResult = bean.subtract(8.0,2.0);
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void multiply() {
        double actualResult = bean.multiply(8.0,2.0);
        Assertions.assertEquals(16, actualResult);
    }

    @Test
    void divide() {
        double actualResult = bean.divide(8.0,2.0);
        Assertions.assertEquals(4, actualResult);
    }
}
