package by.fakeonliner.repository;

import by.fakeonliner.entity.Laptop;
import by.fakeonliner.entity.Mobile;

import java.util.LinkedList;
import java.util.List;

public class ProductRepository implements ProductDao{

    private final LinkedList<Laptop> laptops = new LinkedList<>();
    private final LinkedList<Mobile> mobiles = new LinkedList<>();

    @Override
    public void save(Object object) {

    }

    @Override
    public boolean existByModel(String model) {
        return false;
    }

    @Override
    public List<Object> getProducts(String name) {
        return null;
    }

    @Override
    public void edit(long id, Object object) {

    }

    @Override
    public void delete(long id) {

    }
}
