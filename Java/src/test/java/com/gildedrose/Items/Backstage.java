package com.gildedrose.Items;

/**
 *
 * @author akimkafanga
 */
public class Backstage extends GeneriqueItem {
    
    public Backstage(String n,int s, int q,int v){
        super(n,s,q,v);
    }
    
    public void update(){
        super.update();
        this.ceilQualityToFifty();
        this.floorQualityToZero();
        if (this.sellIn <= 5 && this.quality <= 47) {
            this.quality += 3;
        } else if (this.sellIn <= 10 && this.quality <= 48) {
            this.quality += 2;
        } else {            
                this.quality += 1;            
        }
    }
}
