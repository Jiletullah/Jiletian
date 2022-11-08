package com.jiletullah.jiletian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiletullah.jiletian.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,String>{
    
}
