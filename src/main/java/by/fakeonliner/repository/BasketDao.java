package by.fakeonliner.repository;

import by.fakeonliner.entity.Product;

import java.util.List;

public interface BasketDao {

    boolean addProduct(Product product);

    boolean deleteProduct(long id);

    List<Product> getBasket();
}
