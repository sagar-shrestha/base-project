package com.sagar.baseproject.controller.rest;

import com.sagar.baseproject.common.annotation.CustomRestController;
import com.sagar.baseproject.common.pojo.request.TicketCategoryRequest;
import com.sagar.baseproject.common.pojo.response.GlobalApiResponse;
import com.sagar.baseproject.service.TicketCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CustomRestController
@RequestMapping("/rest")
@RequiredArgsConstructor
public class TicketCategoryController {

    private final TicketCategoryService ticketCategoryService;

  //  @PreAuthorize("hasAnyRole('SUPER_ADMIN')")
    @PostMapping("/saveTicketCategory")
    public ResponseEntity<GlobalApiResponse> saveTicketCategory(@RequestBody TicketCategoryRequest
                                                                        ticketCategoryRequest) {
        ticketCategoryService.saveTicketCategory(ticketCategoryRequest);
        return ResponseEntity.ok(GlobalApiResponse
                .builder()
                .code(HttpStatus.CREATED.value())
                .data(null)
                .message("TicketCategory saved successfully")
                .status(true)
                .build());
    }

  //  @PreAuthorize("hasAnyRole('SUPER_ADMIN')")
    @PutMapping("/saveTicketCategory/{id}")
    public ResponseEntity<GlobalApiResponse> updateTicketCategory(@RequestBody TicketCategoryRequest ticketCategoryRequest,
                                                                  @PathVariable int id) {
        return ResponseEntity.ok(GlobalApiResponse
                .builder()
                .code(HttpStatus.OK.value())
                .data(ticketCategoryService.updateTicketCategory(ticketCategoryRequest, id))
                .message("TicketCategory updated successfully")
                .status(true)
                .build());
    }

 //   @PreAuthorize("hasAnyRole('SUPER_ADMIN')")
    @GetMapping("getCategoryById/{id}")
    public ResponseEntity<GlobalApiResponse> getCategoryById(@PathVariable int id) {
        return ResponseEntity.ok(GlobalApiResponse
                .builder()
                .code(HttpStatus.OK.value())
                .data(ticketCategoryService.getCategoryById(id))
                .message("Ticket Category Found Successfully.")
                .status(true)
                .build());
    }

   // @PreAuthorize("hasAnyRole('SUPER_ADMIN')")
    @GetMapping("getAllCategory")
    public ResponseEntity<GlobalApiResponse> getAllCategory(@RequestParam("pageNo") int pageNo,
                                                            @RequestParam("pageSize") int pageSize) {
        return ResponseEntity.ok(GlobalApiResponse
                .builder()
                .code(HttpStatus.OK.value())
                .data(ticketCategoryService.getAllCategory(pageNo, pageSize))
                .message("Ticket Category Found Successfully.")
                .status(true)
                .build());
    }
}
