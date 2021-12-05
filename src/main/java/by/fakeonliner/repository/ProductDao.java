package by.fakeonliner.repository;

import java.util.List;

public interface ProductDao {

    void save(Object object);

    boolean existByModel(String model);

    List<Object> getProducts(String name);

    void edit(long id, Object object);

    void delete(long id);

}
