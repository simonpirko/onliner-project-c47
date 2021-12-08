package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopDao;
import by.fakeonliner.repository.ShopRepository;

public class ShopService {
    private final ShopDao shopDao = new ShopRepository();

    public boolean registerShop(Shop shop) {
        if (!shopDao.existByLogin(shop.getLogin())) {
            shopDao.save(shop);
            return true;
        }
        return false;
    }

}
