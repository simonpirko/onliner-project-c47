package by.fakeonliner.repository.jdbc;

import by.fakeonliner.dto.ProductDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JdbcProductDaoTest {

    @Test
    void findByModel() {
        JdbcProductDao jdbcProductDao = new JdbcProductDao();
        List<ProductDto> samsung = jdbcProductDao.findByModel("iPhone","Apple");
        System.out.println(samsung);
        assertNotNull(samsung);
    }

    @Test
    void findByPrice() {
        JdbcProductDao jdbcProductDao = new JdbcProductDao();
        List<ProductDto> mobile = jdbcProductDao.findByPrice(2500.0, 3064.0, "mobile");
        System.out.println(mobile);
    }

    @Test
    void delete() {
        JdbcProductDao jdbcProductDao = new JdbcProductDao();
        jdbcProductDao.delete(2);
    }
}