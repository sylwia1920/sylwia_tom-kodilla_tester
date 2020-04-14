package com.kodilla.bank.homework;

public class CashMachine {

    private int[] historia = new int[0];
    private int saldo = 0;
    private int transactionNumber = 0;
    private int inPlusTransaction = 0;
    private int inMinusTransaction = 0;
    private int sumOfInMinusTransaction = 0;
    private int sumOfInPlusTransaction = 0;

    public int[] addTransaction(int cashAmount) {
        if ((cashAmount >= (saldo * -1)) && cashAmount != 0) {
            transactionNumber++;
            int[] newTab = new int[transactionNumber];
            System.arraycopy(historia, 0, newTab, 0, historia.length);
            newTab[transactionNumber - 1] = cashAmount;
            historia = newTab;
            saldo = saldo + cashAmount;
            if (cashAmount < 0){
                inMinusTransaction++;
                sumOfInMinusTransaction = sumOfInMinusTransaction + cashAmount;
            } else {
                inPlusTransaction++;
                sumOfInPlusTransaction = sumOfInPlusTransaction + cashAmount;
            }
        }
        return historia;
    }


    public int[] getHistory(){
        return historia;
    }

    public int getTransactionNumber(){
        return transactionNumber;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getInPlusTransaction(){
        return inPlusTransaction;
    }

    public int getInMinusTransaction(){
        return inMinusTransaction;
    }

    public int getSumOfInMinusTransaction(){
        return sumOfInMinusTransaction;
    }

    public int getSumOfInPlusTransaction(){
        return sumOfInPlusTransaction;
    }
}
