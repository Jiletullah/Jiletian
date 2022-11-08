package com.jiletullah.jiletian.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jiletullah.jiletian.dto.FactionDto;
import com.jiletullah.jiletian.service.FactionService;

@RestController
public class FactionController{

    private final FactionService factionService;

    public FactionController(FactionService factionService){
        this.factionService = factionService;
    }

    @GetMapping("/jiletian/factions")
    public List<FactionDto> getAllFactions(){
        return factionService.getAllFactions();
    }

    @GetMapping("/jiletian/factions/{factionId}")
    public FactionDto getFaction(@PathVariable String factionId) throws Exception{ //TODO: Exception Handling
        return factionService.getFaction(factionId);
    }

    //No need for POST PUT DELETE mappings as the Factions will be static
    


}