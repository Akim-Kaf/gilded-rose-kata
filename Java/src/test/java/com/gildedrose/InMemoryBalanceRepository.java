package com.gildedrose;

/**
 *
 * @author akimkafanga
 */
public class InMemoryBalanceRepository implements BalanceRepository {
    int Solde=1000;

    @Override
    public int getBalance() {
        return this.Solde;
    }

    @Override
    public void saveBalance(int balance) {
        this.Solde=balance;
    }
    
    
}
