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

    public BankAccountHW2(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
        this.active = initialBalance >= 100.0;
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        this.balance += amt;
        if (this.balance >= 100.0) {
            this.active = true;
        }
    }

    public void withdraw(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amt > this.balance) {
            throw new IllegalArgumentException("Overdraft attempt: Withdrawal exceeds balance.");
        }
        this.balance -= amt;
        if (this.balance < 100.0) {
            this.active = false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}