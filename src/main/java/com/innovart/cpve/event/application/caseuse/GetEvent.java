package com.innovart.cpve.event.application.caseuse;

import com.innovart.cpve.event.application.service.EventService;
import com.innovart.cpve.event.persistence.entity.Event;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetEvent {

    EventService eventService;

    public GetEvent(EventService eventService) {
        this.eventService = eventService;
    }

    public Optional<Event> getById(Long id) {
                return eventService.findById(id);
    }

    public List<Event> getByName(String name) {
        return eventService.findByName(name);
    }

    public List<Event> getPage(int page, int size) {
        return eventService.getPageEvent(page, size);
    }
}
