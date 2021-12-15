package by.fakeonliner.repository;

import by.fakeonliner.dto.BasketProductDto;

import java.util.List;

public interface BasketDao {

    boolean addProduct(BasketProductDto product);

    boolean addProductDb(long id, int productId);

    void deleteProduct(long productId);

    List<BasketProductDto> getBasket();

    List<BasketProductDto> getBasketFromDb(long userId);


}
