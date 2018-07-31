package com.humin.providerticket.controller;

import com.humin.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:31/07/20186:21 PM
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        return this.ticketService.getTicket();
    }
}
