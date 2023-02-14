package com.deory.cafe;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    
    private final List<MENU> orderList = new ArrayList<>();
    
    void putOrder(MENU menu) {
        orderList.add(menu);
    }
    
    List<MENU> getOrderList() {
        return orderList;
    }
    
    void getPay(Wallet wallet) {
        for (MENU menu : orderList) {
            wallet.pay(menu.price);
        }
    }
}
