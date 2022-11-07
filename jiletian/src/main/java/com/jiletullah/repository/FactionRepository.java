package com.jiletullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.model.faction.Faction;

@Repository
public interface FactionRepository extends JpaRepository<Faction,String>{}