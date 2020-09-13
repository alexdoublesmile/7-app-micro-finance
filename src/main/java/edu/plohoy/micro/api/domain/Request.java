package edu.plohoy.micro.api.domain;

import edu.plohoy.micro.api.domain.command.CreateRequest;

import java.time.LocalDateTime;
import java.util.UUID;

public class Request {
    private UUID id;
    private UUID personId;
    private String stockCode;
    private int stockCount;
    private LocalDateTime requestDate;

    public Request() {
    }

    public Request(UUID id, UUID personId, String stockCode, int stockCount, LocalDateTime requestDate) {
        this.id = id;
        this.personId = personId;
        this.stockCode = stockCode;
        this.stockCount = stockCount;
        this.requestDate = requestDate;
    }

    public static Request from(CreateRequest command) {
        return new Request(
                command.getId(),
                command.getPersonId(),
                command.getStockCode(),
                command.getStockCount(),
                command.getRequestDate()
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getPersonId() {
        return personId;
    }

    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }
}
