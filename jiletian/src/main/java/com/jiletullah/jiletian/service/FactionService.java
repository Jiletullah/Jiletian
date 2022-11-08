package com.jiletullah.jiletian.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jiletullah.jiletian.dto.FactionDto;
import com.jiletullah.jiletian.dto.FactionDtoConverter;
import com.jiletullah.jiletian.model.Faction;
import com.jiletullah.jiletian.repository.FactionRepository;

@Service
public class FactionService {
    
    private final FactionRepository factionRepository;
    private final FactionDtoConverter factionDtoConverter;

    public FactionService(FactionRepository factionRepository,
                          FactionDtoConverter factionDtoConverter){
        this.factionRepository = factionRepository;
        this.factionDtoConverter = factionDtoConverter;
    }

    public List<FactionDto> getAllFactions(){ //TODO: Exception handling
        List<Faction> factions = factionRepository.findAll();
        return factionDtoConverter.convertAllToDto(factions);
    }

    public FactionDto getFaction(String factionId) throws Exception{ //TODO: Exception handling
        Optional<Faction> faction = factionRepository.findById(factionId);
        if(faction.isEmpty()){
            throw new Exception();
        }
        return factionDtoConverter.convertToDto(faction.get());
    }

}
