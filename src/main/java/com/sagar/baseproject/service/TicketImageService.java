package com.sagar.baseproject.service;

import com.sagar.baseproject.entity.TicketImage;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface TicketImageService {

    void saveTicketImage(TicketImage ticketImage);

    void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException;
}
