package com.gildedrose.shop;

import com.gildedrose.BalanceRepository;
import com.gildedrose.InventoryRepository;
import com.gildedrose.Items.Item;
import java.util.ArrayList;

/**
 *
 * @author akimkafanga
 */
public class Shopkeeper {
    InventoryRepository inventoryRepository;
    BalanceRepository balanceRepository;
    
    public Shopkeeper(InventoryRepository inventoryRepository,BalanceRepository balanceRepository){
        this.inventoryRepository=inventoryRepository;
        this.balanceRepository=balanceRepository;
    }
    
    public void buyItem(Item item){ 
        ArrayList<Item>items =this.inventoryRepository.getInventory();
        items.add(item);     
        this.inventoryRepository.saveInventory(items);
        int balance=this.balanceRepository.getBalance();
        this.balanceRepository.saveBalance(balance-item.getValue());
    }
    
    public void sellItem(Item item){        
        ArrayList<Item>items=this.inventoryRepository.getInventory();
        items.remove(item);
        int balance=this.balanceRepository.getBalance();
        this.balanceRepository.saveBalance(balance+item.getValue());
    }
}
