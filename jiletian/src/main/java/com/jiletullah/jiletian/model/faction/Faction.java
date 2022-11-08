package com.jiletullah.jiletian.model.faction;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

import com.jiletullah.jiletian.model.player.Player;

@Entity
public class Faction {
    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String factionId;

    @OneToMany(mappedBy = "faction")
    private List<Player> players; 

    private String name;
    private long totalStrength;
    private long overallStrength;

    public Faction(){/*For Hibernate*/}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((factionId == null) ? 0 : factionId.hashCode());
        result = prime * result + ((players == null) ? 0 : players.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) (totalStrength ^ (totalStrength >>> 32));
        result = prime * result + (int) (overallStrength ^ (overallStrength >>> 32));
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
        Faction other = (Faction) obj;
        if (factionId == null) {
            if (other.factionId != null)
                return false;
        } else if (!factionId.equals(other.factionId))
            return false;
        if (players == null) {
            if (other.players != null)
                return false;
        } else if (!players.equals(other.players))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (totalStrength != other.totalStrength)
            return false;
        if (overallStrength != other.overallStrength)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Faction [factionId=" + factionId + ", players=" + players + ", name=" + name + ", totalStrength="
                + totalStrength + ", overallStrength=" + overallStrength + "]";
    }

    public String getFactionId() {
        return factionId;
    }

    public void setFactionId(String factionId) {
        this.factionId = factionId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotalStrength() {
        return totalStrength;
    }

    public void setTotalStrength(long totalStrength) {
        this.totalStrength = totalStrength;
    }

    public long getOverallStrength() {
        return overallStrength;
    }

    public void setOverallStrength(long overallStrength) {
        this.overallStrength = overallStrength;
    }

    

}
