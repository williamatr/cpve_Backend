package com.innovart.cpve.event.application.repository;

import com.innovart.cpve.event.persistence.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
