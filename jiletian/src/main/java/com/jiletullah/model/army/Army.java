package com.jiletullah.model.army;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.jiletullah.enumeration.ArmyOrderType;
import com.jiletullah.gameobject.Force;
import com.jiletullah.gameobject.Resource;
import com.jiletullah.model.player.Player;

@Entity
public class Army {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String armyId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "playerId")
    private Player owner;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "townId")

    @Embedded
    private Force force;

    @Embedded
    private Resource resourceUpkeep;

    @Embedded
    private Resource supplies;

    @Enumerated(EnumType.STRING)
    private ArmyOrderType order;

    private long upkeep;
    private int morale;
    private int discipline;
    private int energy;
    private int integrity;
    
    public Army(){/*For Hibernate*/}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((armyId == null) ? 0 : armyId.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((force == null) ? 0 : force.hashCode());
        result = prime * result + ((resourceUpkeep == null) ? 0 : resourceUpkeep.hashCode());
        result = prime * result + ((supplies == null) ? 0 : supplies.hashCode());
        result = prime * result + ((order == null) ? 0 : order.hashCode());
        result = prime * result + (int) (upkeep ^ (upkeep >>> 32));
        result = prime * result + morale;
        result = prime * result + discipline;
        result = prime * result + energy;
        result = prime * result + integrity;
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
        Army other = (Army) obj;
        if (armyId == null) {
            if (other.armyId != null)
                return false;
        } else if (!armyId.equals(other.armyId))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (force == null) {
            if (other.force != null)
                return false;
        } else if (!force.equals(other.force))
            return false;
        if (resourceUpkeep == null) {
            if (other.resourceUpkeep != null)
                return false;
        } else if (!resourceUpkeep.equals(other.resourceUpkeep))
            return false;
        if (supplies == null) {
            if (other.supplies != null)
                return false;
        } else if (!supplies.equals(other.supplies))
            return false;
        if (order != other.order)
            return false;
        if (upkeep != other.upkeep)
            return false;
        if (morale != other.morale)
            return false;
        if (discipline != other.discipline)
            return false;
        if (energy != other.energy)
            return false;
        if (integrity != other.integrity)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Army [armyId=" + armyId + ", owner=" + owner + ", force=" + force + ", resourceUpkeep=" + resourceUpkeep
                + ", supplies=" + supplies + ", order=" + order + ", upkeep=" + upkeep + ", morale=" + morale
                + ", discipline=" + discipline + ", energy=" + energy + ", integrity=" + integrity + "]";
    }

    public String getArmyId() {
        return armyId;
    }

    public void setArmyId(String armyId) {
        this.armyId = armyId;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Force getForce() {
        return force;
    }

    public void setForce(Force force) {
        this.force = force;
    }

    public Resource getResourceUpkeep() {
        return resourceUpkeep;
    }

    public void setResourceUpkeep(Resource resourceUpkeep) {
        this.resourceUpkeep = resourceUpkeep;
    }

    public Resource getSupplies() {
        return supplies;
    }

    public void setSupplies(Resource supplies) {
        this.supplies = supplies;
    }

    public ArmyOrderType getOrder() {
        return order;
    }

    public void setOrder(ArmyOrderType order) {
        this.order = order;
    }

    public long getUpkeep() {
        return upkeep;
    }

    public void setUpkeep(long upkeep) {
        this.upkeep = upkeep;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    

}
