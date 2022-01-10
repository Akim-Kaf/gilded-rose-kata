package com.gildedrose;

import com.gildedrose.Items.Item;
import java.util.ArrayList;

/**
 *
 * @author akimkafanga
 */
public interface InventoryRepository {
    
    public ArrayList<Item> getInventory();
    public void saveInventory(ArrayList<Item> items);
}
