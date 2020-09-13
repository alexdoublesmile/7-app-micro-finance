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
import java.util.Map;
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
        Request request = new Request(
                UUID.randomUUID(),
                UUID.randomUUID(),
                "GMK",
                10,
                LocalDateTime.now());

        dao.insert(request);

        Map<String, Object> result = jdbcTemplate.queryForMap("select * from request where id = ?", request.getId());

        assertTrue(result.size() > 0);
        assertEquals(request.getId(), result.get("id"));
        assertEquals(request.getPersonId(), result.get("person_id"));
        assertEquals(request.getStockCode(), result.get("stock_code"));
        assertEquals(String.valueOf(request.getStockCount()), result.get("stock_count").toString());
        assertNotNull(result.get("request_date"));
    }

    @Test
    public void delete() {
        Request request = new Request(
                UUID.randomUUID(),
                UUID.randomUUID(),
                "GMK",
                10,
                LocalDateTime.now());

        dao.insert(request);

        dao.delete(request.getId());

        Map<String, Object> result = jdbcTemplate.queryForMap("select * from request where id = ?", request.getId());

        assertEquals(0, result.size());
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