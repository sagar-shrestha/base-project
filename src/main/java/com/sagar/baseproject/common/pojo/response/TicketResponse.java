package com.sagar.baseproject.common.pojo.response;

import com.sagar.baseproject.entity.TicketCategory;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketResponse {
    private Long id;
    private TicketCategory ticketCategory;
    private String description;
    private List<Integer> imageId;
}
