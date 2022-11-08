package com.jiletullah.jiletian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.jiletian.model.army.Army;

@Repository
public interface ArmyRepository extends JpaRepository<Army,String>{}
