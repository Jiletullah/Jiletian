package com.jiletullah.jiletian.gameobject;

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

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (food ^ (food >>> 32));
        result = prime * result + (int) (stone ^ (stone >>> 32));
        result = prime * result + (int) (wood ^ (wood >>> 32));
        result = prime * result + (int) (iron ^ (iron >>> 32));
        result = prime * result + (int) (manufacturedGoods ^ (manufacturedGoods >>> 32));
        result = prime * result + (int) (weapons ^ (weapons >>> 32));
        result = prime * result + (int) (armors ^ (armors >>> 32));
        result = prime * result + (int) (sulphur ^ (sulphur >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Resource other = (Resource) obj;
        if (food != other.food)
            return false;
        if (stone != other.stone)
            return false;
        if (wood != other.wood)
            return false;
        if (iron != other.iron)
            return false;
        if (manufacturedGoods != other.manufacturedGoods)
            return false;
        if (weapons != other.weapons)
            return false;
        if (armors != other.armors)
            return false;
        if (sulphur != other.sulphur)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Resource [food=" + food + ", stone=" + stone + ", wood=" + wood + ", iron=" + iron
                + ", manufacturedGoods=" + manufacturedGoods + ", weapons=" + weapons + ", armors=" + armors
                + ", sulphur=" + sulphur + "]";
    }

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
