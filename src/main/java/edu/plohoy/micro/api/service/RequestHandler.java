package edu.plohoy.micro.api.service;

import edu.plohoy.micro.api.dao.RequestDao;
import org.springframework.stereotype.Component;

@Component
public class RequestHandler {
    private RequestDao dao;
    private CommandSender sender;

    public RequestHandler(RequestDao dao, CommandSender sender) {
        this.dao = dao;
        this.sender = sender;
    }

    
}
