package com.jiletullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.model.town.Town;

@Repository
public interface TownRepository extends JpaRepository<Town,String>{}
