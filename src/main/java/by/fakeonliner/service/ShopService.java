package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopRepository;

public class ShopService {
    private ShopRepository shopRepository = new ShopRepository();

    public boolean registerShop(Shop shop) {
        if (!shopRepository.existByLogin(shop.getLogin())) {
            shopRepository.save(shop);
            return true;
        }
        return false;
    }

}
