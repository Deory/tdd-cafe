package com.deory.cafe;

public class Wallet {
    
    private int balance;
    
    int getBalance() {
        return this.balance;
    }
    
    Wallet(int balance) {
        this.balance = balance;
    }
    
    void pay(int price) {
        if (price > balance) throw new IllegalArgumentException("balance is less then price");
        balance -= price;
    }
    
}
