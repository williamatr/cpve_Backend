package com.innovart.cpve.event.application.caseuse;

import com.innovart.cpve.event.application.service.EventService;
import com.innovart.cpve.event.persistence.entity.Event;
import org.springframework.stereotype.Component;

@Component
public class CreateEvent {

    EventService eventService;

    public CreateEvent(EventService eventService) {
        this.eventService = eventService;
    }

    public Event saveEvent(Event newEvent) {
        return eventService.saveEvent(newEvent);
    }
}
