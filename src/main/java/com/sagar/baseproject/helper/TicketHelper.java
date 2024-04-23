package com.sagar.baseproject.helper;

import com.sagar.baseproject.common.pojo.response.TicketResponse;
import com.sagar.baseproject.entity.Ticket;
import com.sagar.baseproject.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketHelper {

    private final TicketRepository ticketRepository;

    public TicketResponse getTicketById(Long id) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket Not Found."));
        return TicketResponse.builder()
                .id(id)
                .ticketCategory(ticket.getTicketCategory())
                .description(ticket.getDescription())
                .imageId(ticketRepository.getTicketById(id))
                .build();
    }
}
