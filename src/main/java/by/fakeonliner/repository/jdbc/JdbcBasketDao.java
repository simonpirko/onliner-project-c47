package by.fakeonliner.repository.jdbc;

import by.fakeonliner.dto.BasketProductDto;
import by.fakeonliner.repository.BasketDao;

import java.util.List;

public class JdbcBasketDao implements BasketDao {
    @Override
    public boolean addProduct(BasketProductDto product) {
        return false;
    }

    @Override
    public boolean addProductDb(long id, int productId) {
        return false;
    }

    @Override
    public void deleteProduct(long productId) {

    }

    @Override
    public List<BasketProductDto> getBasket() {
        return null;
    }

    @Override
    public List<BasketProductDto> getBasketFromDb(long userId) {
        return null;
    }
}