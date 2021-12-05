package by.fakeonliner.repository;

import by.fakeonliner.entity.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopRepository implements ShopDao {

    private final List<Shop> shops = new ArrayList<>();

    @Override
    public void save(Shop shop) {
        shops.add(shop);
    }

    @Override
    public boolean existByLogin(String login) {
        if (!shops.isEmpty()) {
            for (Shop sh : shops) {
                if (sh.getLogin().equals(login)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Shop getShop(String login) {
        if (!shops.isEmpty()) {
            for (Shop sh : shops) {
                if (sh.getLogin().equals(login)) {
                    return sh;
                }
            }

        }
        return null;
    }

    @Override
    public void edit(Shop shop) {
        if (!shops.isEmpty()) {
            for (Shop sh : shops) {
                if (sh.getId() == shop.getId()) {
                    shops.remove(sh);
                    shops.add(shop);
                    return;
                }
            }
        }
    }

    @Override
    public void delete(Shop shop) {
        if (!shops.isEmpty()) {
            for (Shop sh : shops) {
                if (sh.getId() == shop.getId()) {
                    shops.remove(shop);
                    return;
                }
            }
        }
    }
}
