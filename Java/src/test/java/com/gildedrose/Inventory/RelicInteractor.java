package com.gildedrose.Inventory;

import com.gildedrose.*;
import com.gildedrose.Items.Item;
import relic.Relic;

/**
 *
 * @author akimkafanga
 */
public class RelicInteractor {    
    RelicRepository relicRepository;
    BalanceRepository balanceRepository;
    
    
    public RelicInteractor(RelicRepository relicRepository,BalanceRepository balanceRepository){
        this.relicRepository = relicRepository;
        this.balanceRepository=balanceRepository;
        
    }
    
    public void run(){
        for (Relic relic : this.relicRepository.getInventory()) {
            relic.updateQuality();
            this.balanceRepository.saveBalance(this.balanceRepository.getBalance() + (relic.getQuality() / 100) *relic.getValue() );
        }
    }
}
