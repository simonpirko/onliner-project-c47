package by.fakeonliner.service;

import by.fakeonliner.entity.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    ShopService shopService = new ShopService();



    @Test
    void findByLogin() {
        String login = "";
        Shop shop = shopService.findByLogin(login);
        assertEquals(null, shop);
    }
    @Test
    void save() {
        Shop shop = new Shop();
        boolean x = shopService.save(shop);
        assertEquals(true, x);
    }



}