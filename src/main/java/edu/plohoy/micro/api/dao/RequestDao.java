package edu.plohoy.micro.api.dao;

import edu.plohoy.micro.api.domain.Request;

import java.util.List;
import java.util.UUID;

public interface RequestDao {
    void delete(UUID requestId);
    void insert(Request request);
    Long create(Request request);
    List<Request> findAll();
    Request findById(UUID requestId);
}
