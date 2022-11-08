package com.jiletullah.jiletian.service;

import org.springframework.stereotype.Service;

import com.jiletullah.jiletian.repository.TownRepository;

@Service
public class TownService {
    
    private final TownRepository townRepository;

    public TownService(TownRepository townRepository){
        this.townRepository = townRepository;
    }

    

}
