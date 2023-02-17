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
    
    Pager getPay(Wallet wallet) {
        Pager pager = new Pager();
        
        try {
            for (MENU menu : orderList) {
                wallet.pay(menu.price);
            }
            pager.setRinging();
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    
        return pager;
    }
}
