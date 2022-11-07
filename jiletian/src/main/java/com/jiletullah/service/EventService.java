package com.jiletullah.service;

import org.springframework.stereotype.Service;

import com.jiletullah.repository.EventRepository;

@Service
public class EventService {
    
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

}
