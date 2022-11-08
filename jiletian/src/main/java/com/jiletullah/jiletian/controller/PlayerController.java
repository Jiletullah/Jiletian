package com.jiletullah.jiletian.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jiletullah.jiletian.service.PlayerService;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("/jiletian/players")
    public List<PlayerDto> getAllPlayers(){

    }

    @GetMapping("/jiletian/players/{playerId}")
    public PlayerDto getPlayer(@PathVariable String playerId){

    }

    @GetMapping("/jiletian/players/{playerId}/towns")
    public List<TownDto> getAllTownsOfPlayer(@PathVariable String playerId){

    }

    @GetMapping("/jiletian/players/{playerId}/towns/{townId}")
    public TownDto getTownOfPlayer(@PathVariable String playerId, @PathVariable String townId){

    }

    @GetMapping("/jiletian/players/{playerId}/armies")
    public List<ArmyDto> getAllArmiesOfPlayer(@PathVariable String playerId){

    }

    @GetMapping("/jiletian/players/{playerId}/armies/{armyId}")
    public ArmyDto getArmyOfPlayer(@PathVariable String playerId, @PathVariable String armyId){

    }

    @GetMapping("/jiletian/players/{playerId}/events")
    public List<EventDto> getAllEventsOfPlayer(@PathVariable String playerId){

    }

    @GetMapping("/jiletian/players/{playerId}/events/{eventId}")
    public EventDto getEventOfPlayer(@PathVariable String playerId, @PathVariable String eventId){

    }

    @GetMapping("/jiletian/players/{playerId}/allies")
    public List<PlayerDto> getAlliesOfPlayer(@PathVariable String playerId){

    }

    @GetMapping("/jiletian/players/{playerId}/enemies")
    public List<PlayerDto> getEnemiesOfPlayer(@PathVariable String playerId){
        
    }
}





























