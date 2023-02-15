package com.deory.cafe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
    
    @Test
    public void testMinusBalance() {
        Wallet wallet = new Wallet(8000);
        wallet.pay(5000);
        assertTrue(wallet.getBalance() > 0);
        assertThrows(IllegalArgumentException.class, () -> wallet.pay(5000));
    }
    
}