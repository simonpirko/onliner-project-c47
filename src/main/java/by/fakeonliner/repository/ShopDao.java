package by.fakeonliner.repository;

import by.fakeonliner.entity.Shop;

public interface ShopDao {

    void save(Shop shop);
    boolean existByLogin(String login);
    Shop getShop(String login);
    void edit(Shop shop);
    void delete(Shop shop);
}
