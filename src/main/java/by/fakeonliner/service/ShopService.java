package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopDao;
import by.fakeonliner.repository.InMemoryShopDao;

import java.util.List;

public class ShopService {
    private final ShopDao shopDao = new InMemoryShopDao();

    public boolean save(Shop shop) {
        if (shopDao.existByLogin(shop.getLogin())) {
            return false;
        } else {
            shopDao.save(shop);
            return true;
        }
    }

    public Shop findByLogin(String login) {
        if (shopDao.existByLogin(login)) {
            return shopDao.getShop(login);
        }
        return null;
    }

    public List<Shop> getShopList() {
        return shopDao.getShopList();
    }
}
