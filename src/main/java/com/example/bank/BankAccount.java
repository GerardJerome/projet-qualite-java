package com.example.bank;

public class BankAccount {


    private double balance;
    private String ownerName = "John Doe";

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void addMoney(double amount) {
        if (amount < 0) {

            throw new IllegalArgumentException("Erreur");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Solde insuffisant");
        }
        balance = balance - amount;
    }

    public void printHello() {
        System.out.println("Hello");
    }

    public double getBalance() {
        return balance;
    }
}
