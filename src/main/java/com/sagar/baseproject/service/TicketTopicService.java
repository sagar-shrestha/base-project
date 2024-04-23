package com.sagar.baseproject.service;

import com.sagar.baseproject.common.pojo.request.TicketTopicRequest;
import com.sagar.baseproject.entity.TicketTopic;
import org.springframework.data.domain.Page;

public interface TicketTopicService {

void saveTicketTopic(TicketTopicRequest ticketTopicRequest);

TicketTopic updateTicketTopic(TicketTopicRequest ticketTopicRequest, int id);

TicketTopic getTopicById(int id);

Page<TicketTopic> getAllTopic(int pageNo, int pageSize);


}
