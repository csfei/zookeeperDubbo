package com.cuisf.service;

import org.springframework.stereotype.Service;
import org.apache.dubbo.config.annotation.Reference;

@Service
public class UserService {

    @Reference  //dubbo 的注解
    TicketService ticketService;


    public String buyTicket() {
        String ticket = ticketService.getTicket();
        return "<consumer-server>";
    }
}
