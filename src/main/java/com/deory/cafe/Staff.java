package com.deory.cafe;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    
    private final List<String> orderList = new ArrayList<>();
    
    void putOrder(String menu) {
        orderList.add(menu);
    }
    
    List<String> getOrderList() {
        return orderList;
    }
    
}
