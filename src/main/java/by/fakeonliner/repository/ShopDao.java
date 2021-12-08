package by.fakeonliner.repository;

import by.fakeonliner.entity.Shop;

import java.util.List;

public interface ShopDao {

    void save(Shop shop);
    boolean existByLogin(String login);
    Shop getShop(String login);
    List<Shop> getShopList();
    void edit(Shop shop);
    void delete(Shop shop);
}
