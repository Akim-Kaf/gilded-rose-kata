package com.gildedrose.test;

import com.gildedrose.Inventory.InventoryInteractor;
import com.gildedrose.Items.GeneriqueItem;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    
    private InventoryInteractor shop;
    private InMemoryRepository repository;
    
    //annnotation TestIni [TestInitializte]
    public void Setup(){        
        this.repository=new InMemoryRepository();
        this.shop=new InventoryInteractor(this.repository);
    }
    
    //[TestMethode]
    
    public void shoud_HaveSellInOnItems(){
        assertEquals(3,this.repository.getInventory().get(0).getSellIn());
    }
    
    public void shoud_HaveQalityInOnItems(){
        assertEquals(3,this.repository.getInventory().get(0).getQuality());
    }
    
    public void should_NeverHaveNegativeQuality(){
        shop.updateInventory();                
        assertEquals(7,this.repository.getInventory().get(8).getQuality());
    }
    
    public void should_IncreaseBackstagePassQuality(){
        shop.updateInventory();                
        assertEquals(7,this.repository.getInventory().get(8).getQuality());
    }
    
    
    public void should_NeverUpo(){
        shop.updateInventory(); 
        assertEquals(7,this.repository.getInventory().get(8).getQuality());
    }
    
    public void should_NeveHaveQualityOverFifty(){
        shop.updateInventory(); 
        assertEquals(50,this.repository.getInventory().get(4).getQuality());
    }
        
}
