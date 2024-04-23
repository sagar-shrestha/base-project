package com.sagar.baseproject.repository;

import com.sagar.baseproject.entity.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
}
