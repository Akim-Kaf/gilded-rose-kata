package com.gildedrose.console;
import com.gildedrose.Inventory.InventoryInteractor;
import java.util.*;
/**
 *
 * @author akimkafanga
 */
public class GildedRose {
    
    public void displayInventoryCommande(){
        
    }
    
    public void displayInventoryByCountCommand(){
        
    }
    
    public void updateInvetoryCommand(){
        
    }
    
    public static void main(String[] args) {
        System.out.println("Launch!");
        
        int nbrJour = 30;
        
        InventoryInteractor myShop=new InventoryInteractor(new FileRepository());
        myShop.updateInventory();
        //for (int i = 0; i < nbrJour; i++) {
        //    ex.updateQuality();
        //}

    }
}
