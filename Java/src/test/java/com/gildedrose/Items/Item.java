package com.gildedrose.Items;

import java.io.Serializable;
/**
 *
 * @author akimkafanga
 */
public abstract class Item implements Serializable {    
        protected String nom;
        protected int sellIn;
        protected int quality = 0;
        protected int value;

        public Item(String n, int s, int q,int v) {
            this.nom = n;
            this.sellIn = s;
            this.quality = q;
            this.value=v;
        }        

    public abstract void update();

    protected void ceilQualityToFifty(){
        if(this.quality >50)
        this.quality=0;
    }
    
    protected void floorQualityToZero(){
        if(this.quality < 0)
            this.quality=0;
    }
    
    public String toString(){
        return this.nom +" _S:"+this.sellIn+" _Q:"+this.quality;
    }
    
    public int getSellIn(){
        return this.sellIn;
    }
    
    public int getQuality(){
        return this.quality;
    }
    
    public int getValue(){
        return this.value;
    }
    
}
