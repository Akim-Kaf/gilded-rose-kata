package com.gildedrose.Inventory;

import com.gildedrose.InventoryRepository;
import com.gildedrose.Items.Item;
import java.util.ArrayList;

/**
 *
 * @author akimkafanga
 */
public class InventoryInteractor implements InventoryUpdater,InventoryViewer{
        
    InventoryRepository repository;
    
    public InventoryInteractor(InventoryRepository repository){
        this.repository=repository;
    }
    
    public void updateInventory(){
        ArrayList<Item> items=this.repository.getInventory();
        
        for (Item i : items){            
            i.update();
        }
        
        this.repository.saveInventory(items);
    }    

    @Override
    public ArrayList<Item> getInventory() {
        return this.repository.getInventory();
    }

    @Override
    public ArrayList<Item> getInventoryByQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void buyItem(Item item){
        
    }
    
    public void sellItem(Item item){
        
    }
    
    
    
}
