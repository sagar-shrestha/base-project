package com.sagar.baseproject.service;

import com.sagar.baseproject.entity.TicketImage;
import com.sagar.baseproject.helper.TicketImageHelper;
import com.sagar.baseproject.repository.TicketImageRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class TicketImageServiceImpl implements TicketImageService {

    private final TicketImageRepository ticketImageRepository;
    private final TicketImageHelper ticketImageHelper;

    @Override
    public void saveTicketImage(TicketImage ticketImage) {
         ticketImageRepository.save(ticketImage);
    }

    @Override
    public void getTicketImageById(int imageId, HttpServletResponse httpServletResponse) throws IOException {
        ticketImageHelper.getTicketImageById(imageId, httpServletResponse);
    }
}
