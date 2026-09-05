/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class BankAccountHW2 {
    private double balance;
    private boolean active;

    public BankAccountHW2() {
        this.balance = 0.0;
        this.active = true;
    }

    public BankAccountHW2(double initialBalance) {
        this.balance = initialBalance;
        this.active = true;
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amt > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
        balance -= amt;
        if (balance < 100) {
            active = false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}