package com.gildedrose.console;

import com.gildedrose.InventoryRepository;
import com.gildedrose.Items.Item;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author akimkafanga
 */
public class FileRepository implements InventoryRepository {
    
    
    public void saveInventory(ArrayList<Item> items) {
        try {
            System.out.println("SAVING ITEMS.....");
            FileOutputStream fos = new FileOutputStream("saveItems");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(items);
            oos.close();
        } catch (Exception e) {
            System.out.println("*Erro during saving *:" + e.toString());
        }
    }
    
    

    @Override
    public ArrayList<Item> getInventory() {
        ArrayList<Item> items = new ArrayList<Item>();
        try {
            FileInputStream fis = new FileInputStream("saveItems");
            ObjectInputStream ois = new ObjectInputStream(fis);
            items = (ArrayList<Item>) ois.readObject();
            ois.close();
            System.out.println("Iteme Loading... : ");
            for (Item item : items) {
                System.out.println("Iteme : " + item.toString());
            }

        } catch (Exception e) {
            System.out.println("*Erro during Loading *:" + e.toString());

        }
     return items;   
    }
    
}
