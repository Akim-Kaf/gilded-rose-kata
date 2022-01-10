package com.gildedrose.Items;

/**
 *
 * @author akimkafanga
 */
public class Conjured extends Item {
    
    public Conjured(String n, int s, int q,int v){
        super(n,s,q,v);
    }
    
    public void update(){ 
        this.sellIn--;
        this.quality -= 2;        
        this.ceilQualityToFifty();
        this.floorQualityToZero();        
            
    }
    
}
