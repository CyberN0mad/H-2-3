package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        //  amount = amount + sum ;
        amount += sum;
    }

    public Double withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Not amount balance: ", getAmount());
        }
        amount -= sum;
        System.out.println("Removed from balanced:  " + sum);
        return amount;
    }

}