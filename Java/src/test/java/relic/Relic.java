package relic;

import com.gildedrose.*;
import com.gildedrose.Items.Item;

/**
 *
 * @author akimkafanga
 */
public class Relic {
    String nom;
    int quality=20;
    int value;
    

    public Relic(String nom,int Quality,int v){
        this.nom=nom;
        this.quality=Quality;        
        this.value=v;
    }
    
    private void limiteOneHundrend(){
        if(this.quality>100)this.quality=100;
    }
    
    public void updateQuality(){
        this.limiteOneHundrend();
        this.quality+=(this.quality*5)/100;        
    }
    
    public int getQuality(){
        return this.quality;
    }
    
    public int getValue(){
        return this.value;
    }
    
    
}
