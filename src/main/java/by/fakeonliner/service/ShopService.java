package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.repository.ShopDao;
import by.fakeonliner.repository.InMemoryShopDao;

import java.util.List;

public class ShopService {
    private final ShopDao shopDao  = new InMemoryShopDao();

    public boolean save(Shop shop) {
        if (!shopDao.existByEmail(shop.getLogin())) {
            shopDao.save(shop);
            return true;
        }
        return false;
    }

    public Shop findByLogin(String login) {
        if (shopDao .existByEmail(login)) {
            return shopDao .getShopByEmail(login);
        }
        return null;
    }

    public List<Shop> getShopList() {
        return shopDao .getShopList();
    }
}
