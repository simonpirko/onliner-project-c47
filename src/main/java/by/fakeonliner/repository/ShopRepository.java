package by.fakeonliner.repository;

import by.fakeonliner.entity.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopRepository implements ShopDao {

    private final static List<Shop> shops = new ArrayList<>();
    private long id = 0;

    @Override
    public void save(Shop shop) {
        shop.setId(id++);
        shops.add(shop);
    }

    @Override
    public boolean existByLogin(String login) {
        for (Shop sh : shops) {
            if (sh.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Shop getShop(String login) {
        for (Shop sh : shops) {
            if (sh.getLogin().equals(login)) {
                return sh;
            }
        }
        return null;
    }

    @Override
    public void edit(Shop shop) {
        for (Shop sh : shops) {
            if (sh.getId() == shop.getId()) {
                shops.remove(sh);
                shops.add(shop);
                return;
            }
        }
    }

    @Override
    public void delete(Shop shop) {
        for (Shop sh : shops) {
            if (sh.getId() == shop.getId()) {
                shops.remove(shop);
                return;
            }
        }
    }

    @Override
    public List<Shop> getShopList() {
        return null;
    }
}
