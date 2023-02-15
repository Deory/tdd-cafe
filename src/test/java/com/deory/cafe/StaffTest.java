package com.deory.cafe;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static com.deory.cafe.MENU.*;
import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    
    @Test
    public void testReceiveOrder() {
        Staff staff = new Staff();
        staff.putOrder(Latte);
        assertEquals(staff.getOrderList(), List.of(Latte));
    }
    
    @Test
    public void testGetPaid() {
        Staff staff = new Staff();
        staff.putOrder(Latte);
        Wallet wallet = new Wallet(10000);
        staff.getPay(wallet);
        assertEquals(wallet.getBalance(), 10000 - Latte.price);
    }
    
    @Test
    public void testGetPager() {
        Staff staff = new Staff();
        staff.putOrder(Latte);
        Wallet wallet = new Wallet(3000);
        Pager pager = staff.getPay(wallet);
        assertNotNull(pager);
    }
    
}