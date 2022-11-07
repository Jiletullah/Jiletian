package com.jiletullah.model.faction;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

import com.jiletullah.model.player.Player;

@Entity
public class Faction {
    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String factionId;

    private String name;
    private long totalStrength;
    private long overallStrength;

    @OneToMany(mappedBy = "faction")
    private List<Player> players; 



}
