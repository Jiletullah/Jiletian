package com.jiletullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.model.army.Army;

@Repository
public interface ArmyRepository extends JpaRepository<Army,String>{}
