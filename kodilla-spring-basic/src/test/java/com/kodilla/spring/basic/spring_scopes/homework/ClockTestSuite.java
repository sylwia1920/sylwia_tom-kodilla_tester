package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClockTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
    Clock clockOne1 = context.getBean(Clock.class);
    Clock clockTwo2 = context.getBean(Clock.class);
    Clock clockThree3 = context.getBean(Clock.class);

    @Test
    public void checkTime() {
        Assertions.assertNotEquals(clockOne1, clockTwo2);
        Assertions.assertNotEquals(clockOne1, clockThree3);
        Assertions.assertNotEquals(clockTwo2, clockThree3);
    }
}
