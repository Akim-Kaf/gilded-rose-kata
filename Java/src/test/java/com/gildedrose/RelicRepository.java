package com.gildedrose;

import com.gildedrose.Items.Item;
import java.util.ArrayList;
import relic.Relic;

/**
 *
 * @author akimkafanga
 */
public interface RelicRepository {
    public ArrayList<Relic> getInventory();
    public void saveInventory(ArrayList<Item> items);
    
}
