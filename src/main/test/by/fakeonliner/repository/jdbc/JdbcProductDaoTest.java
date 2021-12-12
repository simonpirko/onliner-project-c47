package by.fakeonliner.repository.jdbc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JdbcProductDaoTest {

    @Test
    void findByModel() {
        JdbcProductDao jdbcProductDao = new JdbcProductDao();
        List<Object> samsung = jdbcProductDao.findByModel("samsung");
        assertNotNull(samsung);
    }
}