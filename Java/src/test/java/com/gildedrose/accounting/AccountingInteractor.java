package com.gildedrose.accounting;

import com.gildedrose.InventoryRepository;
import com.gildedrose.Items.Item;

/**
 *
 * @author akimkafanga
 */
public class AccountingInteractor {
    
    InventoryRepository repository;
    
    public AccountingInteractor(InventoryRepository repository){
        this.repository=repository;
    }
    
    public int getSolde(Item item){
        int index=this.repository.getInventory().indexOf(item);
        return this.repository.getInventory().get(index).getValue();
    }
    
    
}
