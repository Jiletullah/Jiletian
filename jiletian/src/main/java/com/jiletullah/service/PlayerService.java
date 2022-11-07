package com.jiletullah.service;

import org.springframework.stereotype.Service;

import com.jiletullah.repository.PlayerRepository;

@Service
public class PlayerService {
    
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

}
