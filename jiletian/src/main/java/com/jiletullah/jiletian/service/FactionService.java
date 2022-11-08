package com.jiletullah.jiletian.service;

import org.springframework.stereotype.Service;

import com.jiletullah.jiletian.repository.FactionRepository;

@Service
public class FactionService {
    
    private final FactionRepository factionRepository;

    public FactionService(FactionRepository factionRepository){
        this.factionRepository = factionRepository;
    }

    

}
