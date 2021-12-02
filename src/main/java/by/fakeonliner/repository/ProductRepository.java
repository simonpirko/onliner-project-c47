package by.fakeonliner.repository;

import by.fakeonliner.entity.Laptop;
import by.fakeonliner.entity.Mobile;

import java.util.LinkedList;

public class ProductRepository {

    private final LinkedList<Laptop> laptops = new LinkedList<>();
    private final LinkedList<Mobile> mobiles = new LinkedList<>();
}
