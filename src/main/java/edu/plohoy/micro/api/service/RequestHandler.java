package edu.plohoy.micro.api.service;

import edu.plohoy.micro.api.dao.RequestDao;
import edu.plohoy.micro.api.domain.Request;
import edu.plohoy.micro.api.domain.StockInfo;
import edu.plohoy.micro.api.domain.command.CreateRequest;
import org.springframework.stereotype.Component;

@Component
public class RequestHandler {
    private RequestDao requestDao;
    private CommandSender commandSender;
    private StockService stockService;

    public RequestHandler(RequestDao requestDao, CommandSender commandSender, StockService stockService) {
        this.requestDao = requestDao;
        this.commandSender = commandSender;
        this.stockService = stockService;
    }


    public void createRequest(CreateRequest command) {
        requestDao.insert(Request.from(command));
        StockInfo stock = stockService.getStockInfo(command.getStockCode());
    }
}
