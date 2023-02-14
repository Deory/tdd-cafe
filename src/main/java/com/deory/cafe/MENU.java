package com.deory.cafe;

public enum MENU {
    Espresso(1500),
    Americano(2000),
    Latte(2500),
    ;
    
    int price;
    
    MENU(int price) {
        this.price = price;
    }
}
