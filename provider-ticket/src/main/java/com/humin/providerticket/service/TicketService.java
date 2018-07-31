package com.humin.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:31/07/20186:20 PM
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
        return "《厉害了，我的丹》";
    }
}
