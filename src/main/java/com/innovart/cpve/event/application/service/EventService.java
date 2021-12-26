package com.innovart.cpve.event.application.service;

import com.innovart.cpve.event.application.repository.EventRepository;
import com.innovart.cpve.event.persistence.dto.EventPutDto;
import com.innovart.cpve.event.persistence.entity.Event;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    public List<Event> findByName(String name) {
        return eventRepository.findByName(name);
    }

    public Event saveEvent(Event newEvent) {
        Event eventNew = new Event();
        eventNew.setName(newEvent.getName());
        eventNew.setDescription(newEvent.getDescription());
        eventNew.setEventDate(newEvent.getEventDate());
        eventNew.setEventTime(newEvent.getEventTime());
        eventNew.setStateActive(1);
        eventNew.setPostDate(LocalDateTime.now());
        return eventRepository.save(eventNew);
    }

    public List<Event> getPageEvent(int page, int size) {
        List<Event> eventList = eventRepository.findAll(PageRequest.of(page,size, Sort.by("idEvent").ascending())).getContent();
        return eventList;
    }

    public Event updateEvent(EventPutDto newEvent, Long id) {
        return eventRepository.findById(id)
                .map(
                        event ->{
                            event.setName(newEvent.getName());
                            event.setDescription(newEvent.getDescription());
                            event.setEventDate(newEvent.getEventDate());
                            event.setEventTime(newEvent.getEventTime());
                            event.setStateActive(newEvent.getStateActive());
                            return eventRepository.save(event);
                        }
                ).get();
    }
}
