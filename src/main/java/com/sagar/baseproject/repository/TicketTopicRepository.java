package com.sagar.baseproject.repository;

import com.sagar.baseproject.entity.TicketTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketTopicRepository extends JpaRepository<TicketTopic, Integer> {
}
