package com.jiletullah.model.player;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.jiletullah.gameobject.Resource;
import com.jiletullah.model.army.Army;
import com.jiletullah.model.faction.Faction;
import com.jiletullah.model.town.Town;


@Entity
public class Player {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String playerId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "factionId")
    private Faction faction;

    @OneToMany(mappedBy = "owner")
    private List<Town> towns; 

    @OneToMany(mappedBy = "owner")
    private List<Army> armies;

    @Embedded
    private Resource resources;

    @Embedded
    private Resource resourceIncome;
    
    private List<String> allies;
    private List<String> enemies;
    private String username;
    private String password;
    private String email; 
    private long totalPopulation;
    private long totalManpower;
    private long treasury;
    private long totalIncome;
    private long totalRecovery;
    private long numberOfVictories;
    private long numberOfDefeats;

    
    public Player(){/*For Hibernate*/}

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
        result = prime * result + ((faction == null) ? 0 : faction.hashCode());
        result = prime * result + ((towns == null) ? 0 : towns.hashCode());
        result = prime * result + ((armies == null) ? 0 : armies.hashCode());
        result = prime * result + ((resources == null) ? 0 : resources.hashCode());
        result = prime * result + ((resourceIncome == null) ? 0 : resourceIncome.hashCode());
        result = prime * result + ((allies == null) ? 0 : allies.hashCode());
        result = prime * result + ((enemies == null) ? 0 : enemies.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + (int) (totalPopulation ^ (totalPopulation >>> 32));
        result = prime * result + (int) (totalManpower ^ (totalManpower >>> 32));
        result = prime * result + (int) (treasury ^ (treasury >>> 32));
        result = prime * result + (int) (totalIncome ^ (totalIncome >>> 32));
        result = prime * result + (int) (totalRecovery ^ (totalRecovery >>> 32));
        result = prime * result + (int) (numberOfVictories ^ (numberOfVictories >>> 32));
        result = prime * result + (int) (numberOfDefeats ^ (numberOfDefeats >>> 32));
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
        Player other = (Player) obj;
        if (playerId == null) {
            if (other.playerId != null)
                return false;
        } else if (!playerId.equals(other.playerId))
            return false;
        if (faction == null) {
            if (other.faction != null)
                return false;
        } else if (!faction.equals(other.faction))
            return false;
        if (towns == null) {
            if (other.towns != null)
                return false;
        } else if (!towns.equals(other.towns))
            return false;
        if (armies == null) {
            if (other.armies != null)
                return false;
        } else if (!armies.equals(other.armies))
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
        if (allies == null) {
            if (other.allies != null)
                return false;
        } else if (!allies.equals(other.allies))
            return false;
        if (enemies == null) {
            if (other.enemies != null)
                return false;
        } else if (!enemies.equals(other.enemies))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (totalPopulation != other.totalPopulation)
            return false;
        if (totalManpower != other.totalManpower)
            return false;
        if (treasury != other.treasury)
            return false;
        if (totalIncome != other.totalIncome)
            return false;
        if (totalRecovery != other.totalRecovery)
            return false;
        if (numberOfVictories != other.numberOfVictories)
            return false;
        if (numberOfDefeats != other.numberOfDefeats)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Player [playerId=" + playerId + ", faction=" + faction + ", towns=" + towns + ", armies=" + armies
                + ", resources=" + resources + ", resourceIncome=" + resourceIncome + ", allies=" + allies
                + ", enemies=" + enemies + ", username=" + username + ", password=" + password + ", email=" + email
                + ", totalPopulation=" + totalPopulation + ", totalManpower=" + totalManpower + ", treasury=" + treasury
                + ", totalIncome=" + totalIncome + ", totalRecovery=" + totalRecovery + ", numberOfVictories="
                + numberOfVictories + ", numberOfDefeats=" + numberOfDefeats + "]";
    }

    public String getPlayerId() {
        return playerId;
    }


    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }


    public Faction getFaction() {
        return faction;
    }


    public void setFaction(Faction faction) {
        this.faction = faction;
    }


    public List<Town> getTowns() {
        return towns;
    }


    public void setTowns(List<Town> towns) {
        this.towns = towns;
    }


    public List<Army> getArmies() {
        return armies;
    }


    public void setArmies(List<Army> armies) {
        this.armies = armies;
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


    public List<String> getAllies() {
        return allies;
    }


    public void setAllies(List<String> allies) {
        this.allies = allies;
    }


    public List<String> getEnemies() {
        return enemies;
    }


    public void setEnemies(List<String> enemies) {
        this.enemies = enemies;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public long getTotalPopulation() {
        return totalPopulation;
    }


    public void setTotalPopulation(long totalPopulation) {
        this.totalPopulation = totalPopulation;
    }


    public long getTotalManpower() {
        return totalManpower;
    }


    public void setTotalManpower(long totalManpower) {
        this.totalManpower = totalManpower;
    }


    public long getTreasury() {
        return treasury;
    }


    public void setTreasury(long treasury) {
        this.treasury = treasury;
    }


    public long getTotalIncome() {
        return totalIncome;
    }


    public void setTotalIncome(long totalIncome) {
        this.totalIncome = totalIncome;
    }


    public long getTotalRecovery() {
        return totalRecovery;
    }


    public void setTotalRecovery(long totalRecovery) {
        this.totalRecovery = totalRecovery;
    }


    public long getNumberOfVictories() {
        return numberOfVictories;
    }


    public void setNumberOfVictories(long numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }


    public long getNumberOfDefeats() {
        return numberOfDefeats;
    }


    public void setNumberOfDefeats(long numberOfDefeats) {
        this.numberOfDefeats = numberOfDefeats;
    }

    

}
