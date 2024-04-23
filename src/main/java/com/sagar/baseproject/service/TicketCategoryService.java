package com.sagar.baseproject.service;

import com.sagar.baseproject.common.pojo.request.TicketCategoryRequest;
import com.sagar.baseproject.entity.TicketCategory;
import org.springframework.data.domain.Page;

public interface TicketCategoryService {
    void saveTicketCategory(TicketCategoryRequest ticketCategoryRequest);

    TicketCategory updateTicketCategory(TicketCategoryRequest ticketCategoryRequest, int id);

    TicketCategory getCategoryById(int id);

    Page<TicketCategory> getAllCategory(int pageNo, int pageSize);
}
