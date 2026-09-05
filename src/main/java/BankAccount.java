/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class BankAccount {
    private double balance;

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new IllegalStateException("Insufficient balance for withdrawal.");
        }
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}