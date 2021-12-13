package by.fakeonliner.repository;

import by.fakeonliner.entity.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopRepository implements ShopDao {

    private final List<Shop> shops = new ArrayList<>();
    private long id = 0;

    @Override
    public void save(Shop shop) {
        shop.setId(id++);
        shops.add(shop);
    }

    @Override
    public boolean existByLogin(String login) {
        shops.stream()
                .filter(shop -> shop.getLogin().equals(login)).findFirst();
        return shops.isEmpty();

    }


    @Override
    public Shop getShop(String login) {
        shops.stream()
                .filter(shop -> shop.getLogin().equals(login)).findFirst();
        return null;
    }


    @Override
    public void edit(Shop shop) {
        if (shops.removeIf(sh -> sh.getId() == shop.getId())) {
            shops.add(shop);
        }
    }

    @Override
    public void delete(Shop shop) {
        shops.removeIf(sh -> sh.getId() == shop.getId()); {
            return;
        }
    }

    @Override
    public List<Shop> getShopList() {
        return null;
    }
}
