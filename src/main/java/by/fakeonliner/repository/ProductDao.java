package by.fakeonliner.repository;

import by.fakeonliner.entity.Product;

import java.util.List;

public interface ProductDao {

    void save(Object object);

    boolean existByModel(String model);

    List<Object> findByModel(String name);

    List<Object> findByBrand(String name, String category);

    List<Object> findByAllFromCategory(String category);

    List<Object> findByPrice(double min, double max, String category);

    void edit(long id, Object object);

    void delete(long id);



}
