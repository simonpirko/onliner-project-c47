package by.fakeonliner.repository;

import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.entity.Product;

import java.util.List;

public interface ProductDao {

    void save(Object object);

    boolean existByModel(String model);

    List<ProductDto> findByModel(String model);

    List<ProductDto> findByBrand(String name, String category);

    List<ProductDto> findByAllFromCategory(String category);

    List<ProductDto> findByPrice(double min, double max, String category);

    void edit(long id, Object object);

    void delete(long id);

    List<ProductDto> getProductDtoList();

}
