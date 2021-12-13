package by.fakeonliner.service;

import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.entity.Laptop;
import by.fakeonliner.entity.Mobile;
import by.fakeonliner.repository.jdbc.JdbcMobileDao;
import by.fakeonliner.repository.jdbc.JdbcProductDao;

import java.util.List;

public class ProductService {
    private final JdbcProductDao jdbcProductDao = new JdbcProductDao();
    private final JdbcMobileDao jdbcMobileDao = new JdbcMobileDao();
    private static ProductService instance;

    private ProductService(){};

    public static synchronized ProductService getInstance() {
        if(instance == null){
            instance = new ProductService();
        }
        return instance;
    }

    public boolean existByModel(String model){
        return jdbcProductDao.existByModel(model);
    }

    public List<ProductDto> findByModel(String model){
        return jdbcProductDao.findByModel(model);
    }

    public void delete(long id){
        jdbcProductDao.delete(id);
    }

    public List<ProductDto> findByBrand(String name, String category){
        return jdbcProductDao.findByBrand(name, category);
    }

    public List<ProductDto> findByPrice(double min, double max, String category){
        return jdbcProductDao.findByPrice(min, max, category);
    }

    public List<ProductDto> findByAllFromCategory(String category){
        return jdbcProductDao.findByAllFromCategory(category);
    }

    public Object getProduct(long id, String category) {
        switch(category) {
            case "phones" :
            case "tablet" : {
                return findMobileById(id, category);
            }
            case "laptop" : {
                return findLaptopById(id);
            }
        }
        return null;
    }


    private Mobile findMobileById(long id, String category) {
        return jdbcMobileDao.getMobileById(id, category);
    }

    private Laptop findLaptopById(long id) {
        return null;
    }
}
