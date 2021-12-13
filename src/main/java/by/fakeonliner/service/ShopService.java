package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopDao;
import by.fakeonliner.repository.ShopRepository;

import java.util.List;

public class ShopService {
    private final ShopDao shopDao  = new ShopRepository();

    public boolean save(Shop shop) {
        if (shopDao.existByLogin(shop.getLogin())) {
            shopDao.save(shop);
            return true;
        }
        return false;
    }

    public Shop findByLogin(String login) {
        if (shopDao .existByLogin(login)) {
            return shopDao .getShop(login);
        }
        return null;
    }

    public List<Shop> getShopList() {
        return shopDao .getShopList();
    }
}
