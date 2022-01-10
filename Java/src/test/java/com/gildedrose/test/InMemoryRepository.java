package com.gildedrose.test;
import com.gildedrose.InventoryRepository;
import com.gildedrose.Items.Item;
import com.gildedrose.Items.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author akimkafanga
 */
public class InMemoryRepository implements InventoryRepository {
    ArrayList<Item> items=new ArrayList<Item>();
    public InMemoryRepository(){
        //this.items=new ArrayList<Item>();
        items.add(new GeneriqueItem("Generic",3,3,0));
        items.add(new GeneriqueItem("Generic",-1,4,0));
        items.add(new GeneriqueItem("Generic",3,3,0));
        items.add(new GeneriqueItem("Generic",3,3,0));
        items.add(new GeneriqueItem("Generic",3,3,0));
        
        items.add(new AgeItem("Aged Brie", 2, 0,0));
        items.add(new GeneriqueItem("Elixir of the Mongoose", 5, 7,0));
        items.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80,0));
        items.add(new Backstage("Backstage passes", 15, 20,0));
        items.add(new Conjured("Conjured Mana Cake", 3, 6,0));
    }
    public ArrayList<Item> getInventory(){        
        return items;
    }
            
    public void saveInventory(ArrayList<Item> items){
        this.items=items;
    }    
        
}
