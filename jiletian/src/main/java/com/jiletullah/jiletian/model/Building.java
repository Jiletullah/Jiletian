package com.jiletullah.jiletian.model;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import com.jiletullah.jiletian.enumeration.BuildingType;
import com.jiletullah.jiletian.gameobject.Resource;

@MappedSuperclass
public class Building {
    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String buildingId;
    
    @Embedded
    private Resource resourceCost;

    @Embedded
    private Resource resourceIncome;
    
    @Embedded
    private Resource resourceUpkeep;

    @Enumerated(EnumType.STRING)
    private BuildingType buildingType;

    private long cost;
    private long upkeep;

    public Building(){/*For Hibernate*/}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((buildingId == null) ? 0 : buildingId.hashCode());
        result = prime * result + ((resourceCost == null) ? 0 : resourceCost.hashCode());
        result = prime * result + ((resourceIncome == null) ? 0 : resourceIncome.hashCode());
        result = prime * result + ((resourceUpkeep == null) ? 0 : resourceUpkeep.hashCode());
        result = prime * result + ((buildingType == null) ? 0 : buildingType.hashCode());
        result = prime * result + (int) (cost ^ (cost >>> 32));
        result = prime * result + (int) (upkeep ^ (upkeep >>> 32));
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
        Building other = (Building) obj;
        if (buildingId == null) {
            if (other.buildingId != null)
                return false;
        } else if (!buildingId.equals(other.buildingId))
            return false;
        if (resourceCost == null) {
            if (other.resourceCost != null)
                return false;
        } else if (!resourceCost.equals(other.resourceCost))
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
        if (buildingType != other.buildingType)
            return false;
        if (cost != other.cost)
            return false;
        if (upkeep != other.upkeep)
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Building [buildingId=" + buildingId + ", resourceCost=" + resourceCost + ", resourceIncome="
                + resourceIncome + ", resourceUpkeep=" + resourceUpkeep + ", buildingType=" + buildingType + ", cost="
                + cost + ", upkeep=" + upkeep + "]";
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public Resource getResourceCost() {
        return resourceCost;
    }

    public void setResourceCost(Resource resourceCost) {
        this.resourceCost = resourceCost;
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

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getUpkeep() {
        return upkeep;
    }

    public void setUpkeep(long upkeep) {
        this.upkeep = upkeep;
    }

    


}
