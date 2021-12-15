package by.fakeonliner.repository.inMemory;

import by.fakeonliner.dto.BasketProductDto;
import by.fakeonliner.repository.BasketDao;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBasketDao implements BasketDao {
    private static List<BasketProductDto> basket = new ArrayList<>();

    @Override
    public boolean addProduct(BasketProductDto product) {
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i).getModel().equals(product.getModel())) {
                int amount = basket.get(i).getAmount() + 1;
                basket.get(i).setAmount(amount);
                return true;
            }
        }
        return basket.add(product);
    }

    @Override
    public boolean addProductDb(long id, int productId) {
        return false;
    }

    @Override
    public void deleteProduct(long productId) {
        List<BasketProductDto> list = new ArrayList<>();
        for(BasketProductDto item : basket) {
            if (item.getId() == productId) {
                if (item.getAmount() == 1) {
                    basket.remove(item);
                    return;
                }
                int amount = item.getAmount() - 1;
                item.setAmount(amount);
            }
        }
    }

    @Override
    public List<BasketProductDto> getBasket() {
        return basket;
    }

    @Override
    public List<BasketProductDto> getBasketFromDb(long userId) {
        return null;
    }
}
