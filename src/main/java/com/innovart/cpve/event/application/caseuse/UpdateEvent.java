package com.innovart.cpve.event.application.caseuse;


import com.innovart.cpve.event.application.service.EventService;
import com.innovart.cpve.event.persistence.dto.EventPutDto;
import com.innovart.cpve.event.persistence.entity.Event;
import org.springframework.stereotype.Component;

@Component
public class UpdateEvent {

    EventService eventService;

    public UpdateEvent(EventService eventService) {
        this.eventService = eventService;
    }

    public Event updateEvent(EventPutDto newEvent, Long id) {
        return eventService.updateEvent(newEvent, id);
    }
}
