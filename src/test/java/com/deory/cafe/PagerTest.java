package com.deory.cafe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagerTest {
    
    @Test
    public void testSetPagerRinging() {
        Pager pager = new Pager();
        pager.setRinging();
        assertTrue(pager.ringing);
    }
    
}