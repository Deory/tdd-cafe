package com.deory.cafe;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    
    @Test
    public void testReceiveOrder() {
        Staff staff = new Staff();
        staff.putOrder("latte");
        assertEquals(staff.getOrderList(), List.of("latte"));
    }
    
}