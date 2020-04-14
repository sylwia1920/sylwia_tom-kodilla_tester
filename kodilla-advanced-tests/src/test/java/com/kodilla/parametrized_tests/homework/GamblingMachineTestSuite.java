package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @Test
    public void ShouldReturnExceptionWhenSetOfNumbersAreInvalid() throws InvalidNumbersException {
        //GIVEN
        Set<Integer> invalidSet = addToMachineThreeNumbers();
        //THEN
        getMessageFromExceptionMethod(invalidSet);
    }

    @Test
    public void ShouldReturnExceptionWhenSetOfNumbersAreInvalid_DoubleCheck() throws InvalidNumbersException {
        //GIVEN
        Set<Integer> invalidSet = addToMachineThreeNumbers();
        //THEN
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidSet));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongSetOfNumbersToValidate.csv", numLinesToSkip = 0)
    public void ShouldReturnExceptionWhenSetOfNumbersGivenInSourceFileAreInvalid(String string)
            throws InvalidNumbersException {
        //GIVEN
        Set<Integer> invalidSets = addToMachineNumbersFromFile(string);
        //THEN
        getMessageFromExceptionMethod(invalidSets);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/CorrectSetOfNumbersToValidate.csv", numLinesToSkip = 0)
    public void ShouldReturnTrueWhenSetOfNumbersGivenInSourceFileAreValid(String string)
            throws InvalidNumbersException {
        //GIVEN
        Set<Integer> validSets = addToMachineNumbersFromFile(string);
        //WHEN
        int counted = gamblingMachine.howManyWins(validSets);
        //THEN
        assertTrue(counted >=0 && counted <=6);
    }

    @ParameterizedTest
    @MethodSource
    public void ShouldReturnExceptionWhenSetOfNumbersGivenInMethodAreInvalid(Set<Integer> invalidSet) {
        getMessageFromExceptionMethod(invalidSet);
    }

    @ParameterizedTest
    @MethodSource
    public void ShouldReturnExceptionWhenSetOfNumbersGivenInMethodAreInvalid_Another_Method(Set<Integer> invalidSet) {
        Assertions.assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(invalidSet));
    }


    @ParameterizedTest
    @MethodSource
    public void ShouldReturnTrueWhenSetOfNumbersGivenInMethodAreValid(Set<Integer> validSet)
            throws InvalidNumbersException {
        int counted = gamblingMachine.howManyWins(validSet);
        assertTrue(counted >=0 && counted <=6);
    }

//-----------------------METHODS-------------------------------------------------------------------------------------------------------

    private static Stream<Arguments> ShouldReturnExceptionWhenSetOfNumbersGivenInMethodAreInvalid(){
        return Stream.of(
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5))),
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))),
                Arguments.of(new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5))),
                Arguments.of(new HashSet<>(Arrays.asList(-1, 1, 2, 3, 4, 5)))
        );
    }

    private static Stream<Arguments> ShouldReturnTrueWhenSetOfNumbersGivenInMethodAreValid(){
        return Stream.of(
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5 ,6))),
                Arguments.of(new HashSet<>(Arrays.asList(44, 45, 46, 47, 48 ,49)))
        );
    }

    private static Stream<Arguments> ShouldReturnExceptionWhenSetOfNumbersGivenInMethodAreInvalid_Another_Method(){
        return Stream.of(
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5))),
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))),
                Arguments.of(new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5))),
                Arguments.of(new HashSet<>(Arrays.asList(-1, 1, 2, 3, 4, 5)))
        );
    }

    private void getMessageFromExceptionMethod(Set<Integer> invalidSet) {
        try {
            int result = gamblingMachine.howManyWins(invalidSet);
        } catch (InvalidNumbersException e) {
            assertEquals("Wrong numbers provided", e.getMessage());
        }
    }

    private Set<Integer> addToMachineThreeNumbers(){
        Set<Integer> invalidSet = new HashSet<>();
        for (int i = 1; i < 4; i++) {
            invalidSet.add(i);
        }
        return invalidSet;
    }

    private Set<Integer> addToMachineNumbersFromFile(String string) {
        String[] splitedString = string.split(" ");
        Set<Integer> sets = new HashSet<>();
        for (String number : splitedString) {
            sets.add(Integer.parseInt(number));
        }
        return sets;
    }
}
