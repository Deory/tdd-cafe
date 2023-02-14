package com.deory.cafe;

public class Wallet {
    
    private int balance;
    
    int getBalance() {
        return this.balance;
    }
    
    Wallet(int balance) {
        this.balance = balance;
    }
    
    int pay(int price) {
        balance -= price;
        return price;
    }
    
}
