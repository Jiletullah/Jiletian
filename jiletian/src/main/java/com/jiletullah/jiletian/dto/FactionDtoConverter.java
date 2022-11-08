package com.jiletullah.jiletian.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jiletullah.jiletian.model.Faction;

@Component
public class FactionDtoConverter {

    public FactionDto convertToDto(Faction faction){
        return new FactionDto(faction.getName(),
                              faction.getPlayers(),
                              faction.getTotalStrength(),
                              faction.getOverallStrength());
    }

    public List<FactionDto> convertAllToDto(List<Faction> factions){
        List<FactionDto> factionDtos = new ArrayList<>();
        for(Faction f : factions){
            factionDtos.add(convertToDto(f));
        }
        return factionDtos;
    }

}
