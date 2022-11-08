package com.jiletullah.jiletian.gameobject;

import javax.persistence.Embeddable;

@Embeddable
public class Force {

    private int swordsman;
    private int spearman;
    private int pikeman;
    private int archer;
    private int crossbow;
    private int gunpowderInfantry;
    private int meleeCavalry;
    private int shockCavalry;
    private int missileCavalry;
    private int catapult;
    private int cannon;
    private int ballista;

    public Force(){/*For Hibernate*/}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + swordsman;
        result = prime * result + spearman;
        result = prime * result + pikeman;
        result = prime * result + archer;
        result = prime * result + crossbow;
        result = prime * result + gunpowderInfantry;
        result = prime * result + meleeCavalry;
        result = prime * result + shockCavalry;
        result = prime * result + missileCavalry;
        result = prime * result + catapult;
        result = prime * result + cannon;
        result = prime * result + ballista;
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
        Force other = (Force) obj;
        if (swordsman != other.swordsman)
            return false;
        if (spearman != other.spearman)
            return false;
        if (pikeman != other.pikeman)
            return false;
        if (archer != other.archer)
            return false;
        if (crossbow != other.crossbow)
            return false;
        if (gunpowderInfantry != other.gunpowderInfantry)
            return false;
        if (meleeCavalry != other.meleeCavalry)
            return false;
        if (shockCavalry != other.shockCavalry)
            return false;
        if (missileCavalry != other.missileCavalry)
            return false;
        if (catapult != other.catapult)
            return false;
        if (cannon != other.cannon)
            return false;
        if (ballista != other.ballista)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Force [swordsman=" + swordsman + ", spearman=" + spearman + ", pikeman=" + pikeman + ", archer="
                + archer + ", crossbow=" + crossbow + ", gunpowderInfantry=" + gunpowderInfantry + ", meleeCavalry="
                + meleeCavalry + ", shockCavalry=" + shockCavalry + ", missileCavalry=" + missileCavalry + ", catapult="
                + catapult + ", cannon=" + cannon + ", ballista=" + ballista + "]";
    }

    public int getSwordsman() {
        return swordsman;
    }

    public void setSwordsman(int swordsman) {
        this.swordsman = swordsman;
    }

    public int getSpearman() {
        return spearman;
    }

    public void setSpearman(int spearman) {
        this.spearman = spearman;
    }

    public int getPikeman() {
        return pikeman;
    }

    public void setPikeman(int pikeman) {
        this.pikeman = pikeman;
    }

    public int getArcher() {
        return archer;
    }

    public void setArcher(int archer) {
        this.archer = archer;
    }

    public int getCrossbow() {
        return crossbow;
    }

    public void setCrossbow(int crossbow) {
        this.crossbow = crossbow;
    }

    public int getGunpowderInfantry() {
        return gunpowderInfantry;
    }

    public void setGunpowderInfantry(int gunpowderInfantry) {
        this.gunpowderInfantry = gunpowderInfantry;
    }

    public int getMeleeCavalry() {
        return meleeCavalry;
    }

    public void setMeleeCavalry(int meleeCavalry) {
        this.meleeCavalry = meleeCavalry;
    }

    public int getShockCavalry() {
        return shockCavalry;
    }

    public void setShockCavalry(int shockCavalry) {
        this.shockCavalry = shockCavalry;
    }

    public int getMissileCavalry() {
        return missileCavalry;
    }

    public void setMissileCavalry(int missileCavalry) {
        this.missileCavalry = missileCavalry;
    }

    public int getCatapult() {
        return catapult;
    }

    public void setCatapult(int catapult) {
        this.catapult = catapult;
    }

    public int getCannon() {
        return cannon;
    }

    public void setCannon(int cannon) {
        this.cannon = cannon;
    }

    public int getBallista() {
        return ballista;
    }

    public void setBallista(int ballista) {
        this.ballista = ballista;
    }

    

}
