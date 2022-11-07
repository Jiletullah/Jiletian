package com.jiletullah.model.town;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.jiletullah.gameobject.Resource;
import com.jiletullah.model.building.Building;
import com.jiletullah.model.player.Player;

@Entity
public class Town {
    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String townId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "playerId")
    private Player owner;

    @Embedded
    private List<Building> buildings;

    @Embedded
    private Resource resources;

    @Embedded
    private Resource resourceIncome;

    @Embedded
    private Resource resourceUpkeep;

    private long coordsX;
    private long coordsY;
    private long zoneOfControlRadius;
    private long income;
    private long population;
    private long populationGrowth;
    private long manpower;
    private long manpowerRecovery;
    private int happiness;


    public Town(){/*For Hibernate*/}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((townId == null) ? 0 : townId.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((buildings == null) ? 0 : buildings.hashCode());
        result = prime * result + ((resources == null) ? 0 : resources.hashCode());
        result = prime * result + ((resourceIncome == null) ? 0 : resourceIncome.hashCode());
        result = prime * result + ((resourceUpkeep == null) ? 0 : resourceUpkeep.hashCode());
        result = prime * result + (int) (coordsX ^ (coordsX >>> 32));
        result = prime * result + (int) (coordsY ^ (coordsY >>> 32));
        result = prime * result + (int) (zoneOfControlRadius ^ (zoneOfControlRadius >>> 32));
        result = prime * result + (int) (income ^ (income >>> 32));
        result = prime * result + (int) (population ^ (population >>> 32));
        result = prime * result + (int) (populationGrowth ^ (populationGrowth >>> 32));
        result = prime * result + (int) (manpower ^ (manpower >>> 32));
        result = prime * result + (int) (manpowerRecovery ^ (manpowerRecovery >>> 32));
        result = prime * result + happiness;
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
        Town other = (Town) obj;
        if (townId == null) {
            if (other.townId != null)
                return false;
        } else if (!townId.equals(other.townId))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (buildings == null) {
            if (other.buildings != null)
                return false;
        } else if (!buildings.equals(other.buildings))
            return false;
        if (resources == null) {
            if (other.resources != null)
                return false;
        } else if (!resources.equals(other.resources))
            return false;
        if (resourceIncome == null) {
            if (other.resourceIncome != null)
                return false;
        } else if (!resourceIncome.equals(other.resourceIncome))
            return false;
        if (resourceUpkeep == null) {
            if (other.resourceUpkeep != null)
                return false;
        } else if (!resourceUpkeep.equals(other.resourceUpkeep))
            return false;
        if (coordsX != other.coordsX)
            return false;
        if (coordsY != other.coordsY)
            return false;
        if (zoneOfControlRadius != other.zoneOfControlRadius)
            return false;
        if (income != other.income)
            return false;
        if (population != other.population)
            return false;
        if (populationGrowth != other.populationGrowth)
            return false;
        if (manpower != other.manpower)
            return false;
        if (manpowerRecovery != other.manpowerRecovery)
            return false;
        if (happiness != other.happiness)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Town [townId=" + townId + ", owner=" + owner + ", buildings=" + buildings + ", resources=" + resources
                + ", resourceIncome=" + resourceIncome + ", resourceUpkeep=" + resourceUpkeep + ", coordsX=" + coordsX
                + ", coordsY=" + coordsY + ", zoneOfControlRadius=" + zoneOfControlRadius + ", income=" + income
                + ", population=" + population + ", populationGrowth=" + populationGrowth + ", manpower=" + manpower
                + ", manpowerRecovery=" + manpowerRecovery + ", happiness=" + happiness + "]";
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public Resource getResources() {
        return resources;
    }

    public void setResources(Resource resources) {
        this.resources = resources;
    }

    public Resource getResourceIncome() {
        return resourceIncome;
    }

    public void setResourceIncome(Resource resourceIncome) {
        this.resourceIncome = resourceIncome;
    }

    public Resource getResourceUpkeep() {
        return resourceUpkeep;
    }

    public void setResourceUpkeep(Resource resourceUpkeep) {
        this.resourceUpkeep = resourceUpkeep;
    }

    public long getCoordsX() {
        return coordsX;
    }

    public void setCoordsX(long coordsX) {
        this.coordsX = coordsX;
    }

    public long getCoordsY() {
        return coordsY;
    }

    public void setCoordsY(long coordsY) {
        this.coordsY = coordsY;
    }

    public long getZoneOfControlRadius() {
        return zoneOfControlRadius;
    }

    public void setZoneOfControlRadius(long zoneOfControlRadius) {
        this.zoneOfControlRadius = zoneOfControlRadius;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulationGrowth() {
        return populationGrowth;
    }

    public void setPopulationGrowth(long populationGrowth) {
        this.populationGrowth = populationGrowth;
    }

    public long getManpower() {
        return manpower;
    }

    public void setManpower(long manpower) {
        this.manpower = manpower;
    }

    public long getManpowerRecovery() {
        return manpowerRecovery;
    }

    public void setManpowerRecovery(long manpowerRecovery) {
        this.manpowerRecovery = manpowerRecovery;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    


}







































