package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopDao;
import by.fakeonliner.repository.ShopRepository;

import java.util.List;

public class ShopService {
    private final ShopDao shopRepository = new ShopRepository();

    public Shop findByLogin(String login) {
        if (shopRepository.existByLogin(login)) {
            return shopRepository.getShop(login);
        }
        return null;
    }

    public List<Shop> getShopList() {
        return shopRepository.getShopList();
    }
}
