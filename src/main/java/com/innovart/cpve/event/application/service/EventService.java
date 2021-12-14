package com.innovart.cpve.event.application.service;

import com.innovart.cpve.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

}
