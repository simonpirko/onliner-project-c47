package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopDao;
import by.fakeonliner.repository.ShopRepository;

public class ShopService {
    private final ShopDao shopRepository = new ShopRepository();

    public boolean registerShop(Shop shop) {
        if (!shopRepository.existByLogin(shop.getLogin())) {
            shopRepository.save(shop);
            return true;
        }
        return false;
    }

}
