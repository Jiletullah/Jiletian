package com.jiletullah.jiletian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.jiletian.model.faction.Faction;

@Repository
public interface FactionRepository extends JpaRepository<Faction,String>{}