package com.jiletullah.model.resource;

import javax.persistence.Embeddable;


@Embeddable
public class Resource {
    
    private long food;
    private long stone;
    private long wood;
    private long iron;
    private long manufacturedGoods;
    private long weapons;
    private long armors;
    private long sulphur;
    
    
    
    public Resource() {/* For hibernate*/}

    public long getFood() {
        return food;
    }
    public void setFood(long food) {
        this.food = food;
    }
    public long getStone() {
        return stone;
    }
    public void setStone(long stone) {
        this.stone = stone;
    }
    public long getWood() {
        return wood;
    }
    public void setWood(long wood) {
        this.wood = wood;
    }
    public long getIron() {
        return iron;
    }
    public void setIron(long iron) {
        this.iron = iron;
    }
    public long getManufacturedGoods() {
        return manufacturedGoods;
    }
    public void setManufacturedGoods(long manufacturedGoods) {
        this.manufacturedGoods = manufacturedGoods;
    }
    public long getWeapons() {
        return weapons;
    }
    public void setWeapons(long weapons) {
        this.weapons = weapons;
    }
    public long getArmors() {
        return armors;
    }
    public void setArmors(long armors) {
        this.armors = armors;
    }
    public long getSulphur() {
        return sulphur;
    }
    public void setSulphur(long sulphur) {
        this.sulphur = sulphur;
    }

    
    
}
