package com.jiletullah.jiletian.dto;

import java.util.List;

import com.jiletullah.jiletian.model.Player;

public record FactionDto(String name,
                         List<Player> players,
                         long totalStrength, 
                         long overallStrength) {}
