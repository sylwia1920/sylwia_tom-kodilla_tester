package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<CashMachine> machines = new ArrayList<>();

    public int[] addToMachine(CashMachine anyMachine, int value) {
        return anyMachine.addTransaction(value);
    }

    public int[] historyOfMachine(CashMachine anyMachine) {
        return anyMachine.getHistory();
    }


    public int totalSaldo() {
        int totalSaldo = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalSaldo = totalSaldo + machines.get(i).getSaldo();
        }
        return totalSaldo;
    }

    public int totalInMinusTransaction() {
        int totalInMinusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalInMinusTransaction = totalInMinusTransaction + machines.get(i).getInMinusTransaction();
        }
        return totalInMinusTransaction;
    }

    public int totalInPlusTransaction() {
        int totalInPlusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalInPlusTransaction = totalInPlusTransaction + machines.get(i).getInPlusTransaction();
        }
        return totalInPlusTransaction;
    }

    public int totalSumOfInMinusTransaction() {
        int totalSumOfInMinusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalSumOfInMinusTransaction = totalSumOfInMinusTransaction + machines.get(i).getSumOfInMinusTransaction();
        }
        return totalSumOfInMinusTransaction;
    }

    public int totalSumOfInPlusTransaction() {
        int totalSumOfInPlusTransaction = 0;
        for (int i = 0; i < machines.size(); i++) {
            totalSumOfInPlusTransaction = totalSumOfInPlusTransaction + machines.get(i).getSumOfInPlusTransaction();
        }
        return totalSumOfInPlusTransaction;
    }

    public double averageOfInMinusTransaction() {
        return totalSumOfInMinusTransaction() / totalInMinusTransaction();
    }

    public double averageOfInPlusTransaction() {
        return totalSumOfInPlusTransaction() / totalInPlusTransaction();
    }
}
