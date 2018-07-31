package com.humin.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:31/07/20186:33 PM
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String getTicket(String name){
        String forObject = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+":购买了"+forObject;
    }
}
