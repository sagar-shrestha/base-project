package com.sagar.baseproject.common.pojo.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketCategoryRequest {

    private String category;
    private int ticketTopic;

}
