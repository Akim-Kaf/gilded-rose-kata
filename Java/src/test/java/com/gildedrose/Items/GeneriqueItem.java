package com.gildedrose.Items;

/**
 *
 * @author akimkafanga
 */

public class GeneriqueItem extends Item{        
    
    public GeneriqueItem(String n, int s, int q,int v){
        super(n,s,q,v);
    }
    
    public void update(){        
        this.sellIn--;
        this.quality--;
    }
    
    
}
