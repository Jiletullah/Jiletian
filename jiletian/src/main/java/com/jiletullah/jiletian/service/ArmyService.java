package com.jiletullah.jiletian.service;

import org.springframework.stereotype.Service;

import com.jiletullah.jiletian.repository.ArmyRepository;

@Service
public class ArmyService {

    private final ArmyRepository armyRepository;

    public ArmyService(ArmyRepository armyRepository){
        this.armyRepository = armyRepository;
    }
    
    
}
