package by.fakeonliner.repository;

import by.fakeonliner.entity.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopRepository implements ShopDao{

    private final List<Shop> shops = new ArrayList<>();

    @Override
    public void save(Shop shop) {

    }

    @Override
    public boolean existByLogin(String login) {
        return false;
    }

    @Override
    public Shop getShop(String login) {
        return null;
    }

    @Override
    public void edit(Shop shop) {

    }

    @Override
    public void delete(Shop shop) {

    }

    @Override
    public List<Shop> getShopList() {
        return null;
    }
}
