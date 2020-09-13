package edu.plohoy.micro.impl.dao;

import edu.plohoy.micro.Application;
import edu.plohoy.micro.api.dao.RequestDao;
import edu.plohoy.micro.api.domain.Request;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RequestDaoTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private RequestDao dao;

    @Test
    public void insert() {
//        new Request(UUID.randomUUID(), UUID.randomUUID(), "GMK", 10, LocalDateTime.now());
    }

    @Test
    public void delete() {
    }

    @Test
    public void create() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findById() {
    }
}