package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Method {

    public static Stream<Arguments> verySeverelyUnderweightPeople() {
        return Stream.of(
                Arguments.of(new Person(1.5, 30)),
                Arguments.of(new Person(1.6, 35)),
                Arguments.of(new Person(1.7, 40)),
                Arguments.of(new Person(1.8, 45)),
                Arguments.of(new Person(1.9, 50)),
                Arguments.of(new Person(2.0, 55))
                );
    }

    public static Stream<Arguments> severelyUnderweightPeople() {
        return Stream.of(
                Arguments.of(new Person(1.5, 35)),
                Arguments.of(new Person(1.6, 40)),
                Arguments.of(new Person(1.7, 45)),
                Arguments.of(new Person(1.8, 50)),
                Arguments.of(new Person(1.9, 55)),
                Arguments.of(new Person(2.0, 60))
                );
    }

    public static Stream<Arguments> UnderweightPeople() {
        return Stream.of(
                Arguments.of(new Person(1.5, 40)),
                Arguments.of(new Person(1.6, 45)),
                Arguments.of(new Person(1.7, 50)),
                Arguments.of(new Person(1.8, 55)),
                Arguments.of(new Person(1.9, 60)),
                Arguments.of(new Person(2.0, 65))
                );
    }

    public static Stream<Arguments> NormalPeople() {
        return Stream.of(
                Arguments.of(new Person(1.5, 55)),
                Arguments.of(new Person(1.6, 60)),
                Arguments.of(new Person(1.7, 65)),
                Arguments.of(new Person(1.8, 70)),
                Arguments.of(new Person(1.9, 75)),
                Arguments.of(new Person(2.0, 80))
                );
    }

    public static Stream<Arguments> OverweightPeople() {
        return Stream.of(
                Arguments.of(new Person(1.5, 60)),
                Arguments.of(new Person(1.6, 70)),
                Arguments.of(new Person(1.7, 80)),
                Arguments.of(new Person(1.8, 90)),
                Arguments.of(new Person(1.9, 100)),
                Arguments.of(new Person(2.0, 110))
                );
    }

    public static Stream<Arguments> ObeseClass1() {
        return Stream.of(
                Arguments.of(new Person(1.5, 70)),
                Arguments.of(new Person(1.6, 80)),
                Arguments.of(new Person(1.7, 90)),
                Arguments.of(new Person(1.8, 100)),
                Arguments.of(new Person(1.9, 110)),
                Arguments.of(new Person(2.0, 120))
                );
    }

    public static Stream<Arguments> ObeseClass2() {
        return Stream.of(
                Arguments.of(new Person(1.5, 80)),
                Arguments.of(new Person(1.6, 90)),
                Arguments.of(new Person(1.7, 110)),
                Arguments.of(new Person(1.8, 120)),
                Arguments.of(new Person(1.9, 130)),
                Arguments.of(new Person(2.0, 140))
                );
    }

    public static Stream<Arguments> ObeseClass3() {
        return Stream.of(
                Arguments.of(new Person(1.5, 90)),
                Arguments.of(new Person(1.6, 110)),
                Arguments.of(new Person(1.7, 120)),
                Arguments.of(new Person(1.8, 130)),
                Arguments.of(new Person(1.9, 150)),
                Arguments.of(new Person(2.0, 160))
                );
    }

    public static Stream<Arguments> ObeseClass4() {
        return Stream.of(
                Arguments.of(new Person(1.5, 110)),
                Arguments.of(new Person(1.6, 120)),
                Arguments.of(new Person(1.7, 140)),
                Arguments.of(new Person(1.8, 150)),
                Arguments.of(new Person(1.9, 170)),
                Arguments.of(new Person(2.0, 180))
                );
    }

    public static Stream<Arguments> ObeseClass5() {
        return Stream.of(
                Arguments.of(new Person(1.5, 120)),
                Arguments.of(new Person(1.6, 130)),
                Arguments.of(new Person(1.7, 150)),
                Arguments.of(new Person(1.8, 170)),
                Arguments.of(new Person(1.9, 190)),
                Arguments.of(new Person(2.0, 200))
                );
    }

    public static Stream<Arguments> ObeseClass6() {
        return Stream.of(
                Arguments.of(new Person(1.5, 150)),
                Arguments.of(new Person(1.6, 160)),
                Arguments.of(new Person(1.7, 180)),
                Arguments.of(new Person(1.8, 200)),
                Arguments.of(new Person(1.9, 220)),
                Arguments.of(new Person(2.0, 240))
                );
    }
}
