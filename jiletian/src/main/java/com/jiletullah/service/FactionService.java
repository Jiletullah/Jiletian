package com.jiletullah.service;

import org.springframework.stereotype.Service;

import com.jiletullah.repository.FactionRepository;

@Service
public class FactionService {
    
    private final FactionRepository factionRepository;

    public FactionService(FactionRepository factionRepository){
        this.factionRepository = factionRepository;
    }

}
