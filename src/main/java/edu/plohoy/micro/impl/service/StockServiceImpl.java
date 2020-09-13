package edu.plohoy.micro.impl.service;

import edu.plohoy.micro.api.domain.StockInfo;
import edu.plohoy.micro.api.service.StockService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockServiceImpl implements StockService {
    private final RestTemplate restTemplate;
    private final String serviceUrl;

    public StockServiceImpl(RestTemplate restTemplate, String serviceUrl) {
        this.restTemplate = restTemplate;
        this.serviceUrl = serviceUrl;
    }

    @Override
    public StockInfo getStockInfo(String code) {
        return restTemplate.getForObject(serviceUrl + "api/v1/info" + code, StockInfo.class);
    }
}
