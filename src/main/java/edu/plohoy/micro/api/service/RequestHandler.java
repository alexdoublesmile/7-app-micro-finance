package edu.plohoy.micro.api.service;

import edu.plohoy.micro.api.dao.RequestDao;
import edu.plohoy.micro.api.domain.Request;
import edu.plohoy.micro.api.domain.command.CreateRequest;
import org.springframework.stereotype.Component;

@Component
public class RequestHandler {
    private RequestDao dao;
    private CommandSender sender;

    public RequestHandler(RequestDao dao, CommandSender sender) {
        this.dao = dao;
        this.sender = sender;
    }


    public void createRequest(CreateRequest command) {
        dao.insert(Request.from(command));
    }
}
