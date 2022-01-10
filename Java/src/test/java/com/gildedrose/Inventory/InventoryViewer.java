package com.gildedrose.Inventory;

import com.gildedrose.Items.Item;
import java.util.ArrayList;

/**
 *
 * @author akimkafanga
 */
public interface InventoryViewer {
    public ArrayList<Item> getInventory();    
    public ArrayList<Item> getInventoryByQuantity();
    
}
