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

import com.jiletullah.model.army.Army;
import com.jiletullah.model.faction.Faction;
import com.jiletullah.model.resource.Resource;
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

    private String username;
    private String password;
    private String email; 

    @OneToMany(mappedBy = "owner")
    private List<Town> towns; 

    @OneToMany(mappedBy = "owner")
    private List<Army> armies;

    private List<String> allies;
    private List<String> enemies;

    private long totalPopulation;
    private long totalManpower;
    private long treasury;
    private long totalIncome;
    private long totalRecovery;

    @Embedded
    private Resource resources;

    @Embedded
    private Resource resourceIncome;
    
    private long numberOfVictories;
    private long numberOfDefeats;
    

}
