package com.jiletullah.jiletian.service;

import org.springframework.stereotype.Service;

import com.jiletullah.jiletian.repository.EventRepository;

@Service
public class EventService {
    
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    
}
