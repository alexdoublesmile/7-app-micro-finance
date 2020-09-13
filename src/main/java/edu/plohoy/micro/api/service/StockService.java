package edu.plohoy.micro.api.service;

import edu.plohoy.micro.api.domain.StockInfo;

public interface StockService {

    StockInfo getStockInfo(String code);
}
