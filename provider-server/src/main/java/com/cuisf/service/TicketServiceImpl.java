package com.cuisf.service;

import com.cuisf.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service  //dubbo 的@Service注解
@Component
public class TicketServiceImpl implements TicketService {


    @Override
    public String getTicket() {
        return "<dubbo + zookeeper + provider>";
    }
}
