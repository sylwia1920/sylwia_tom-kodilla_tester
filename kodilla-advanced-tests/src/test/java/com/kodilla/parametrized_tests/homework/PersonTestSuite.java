/*package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.Method#verySeverelyUnderweightPeople")
    public void ShouldIndicateVerySevereUnderweight(Person person){
        String result = person.getBMI();
        assertEquals("Very severely underweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#severelyUnderweightPeople")
    public void ShouldIndicateSevereUnderweight(Person person){
        String result = person.getBMI();
        assertEquals("Severely underweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#UnderweightPeople")
    public void ShouldIndicateUnderweight(Person person){
        String result = person.getBMI();
        assertEquals("Underweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#NormalPeople")
    public void ShouldIndicateNormal(Person person){
        String result = person.getBMI();
        assertEquals("Normal (healthy weight)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#OverweightPeople")
    public void ShouldIndicateOverweight(Person person){
        String result = person.getBMI();
        assertEquals("Overweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#ObeseClass1")
    public void ShouldIndicateObeseClassOne(Person person){
        String result = person.getBMI();
        assertEquals("Obese Class I (Moderately obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#ObeseClass2")
    public void ShouldIndicateObeseClassTwo(Person person){
        String result = person.getBMI();
        assertEquals("Obese Class II (Severely obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#ObeseClass3")
    public void ShouldIndicateObeseClassThree(Person person){
        String result = person.getBMI();
        assertEquals("Obese Class III (Very severely obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#ObeseClass4")
    public void ShouldIndicateObeseClassFour(Person person){
        String result = person.getBMI();
        assertEquals("Obese Class IV (Morbidly Obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#ObeseClass5")
    public void ShouldIndicateObeseClassFive(Person person){
        String result = person.getBMI();
        assertEquals("Obese Class V (Super Obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.Method#ObeseClass6")
    public void ShouldIndicateObeseClassSix(Person person){
        String result = person.getBMI();
        assertEquals("Obese Class VI (Hyper Obese)", result);
    }
}

 */
