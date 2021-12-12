package by.fakeonliner.repository;

import by.fakeonliner.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBasketDao implements BasketDao {
    private final List<Product> basket = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        return basket.add(product);
    }

    @Override
    public boolean deleteProduct(long id) {
        return basket.removeIf(product -> product.getId() == id);
    }

    @Override
    public List<Product> getBasket() {
        return basket;
    }
}
