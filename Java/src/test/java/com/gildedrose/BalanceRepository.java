package com.gildedrose;

/**
 *
 * @author akimkafanga
 */
public interface BalanceRepository {    
    int getBalance();
    void saveBalance(int balance);
}
