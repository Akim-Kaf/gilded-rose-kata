package com.gildedrose.Items;

/**
 *
 * @author akimkafanga
 */
public class AgeItem extends Item{
    
    public AgeItem(String n, int s, int q,int v){
        super(n,s,q,v);
    }
    
    public void update(){
        this.sellIn--;
        this.quality ++;        
        this.ceilQualityToFifty();
        this.floorQualityToZero();                                
    }
}
