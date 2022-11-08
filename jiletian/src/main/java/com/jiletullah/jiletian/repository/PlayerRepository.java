package com.jiletullah.jiletian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.jiletian.model.player.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,String>{
    
}
