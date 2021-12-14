package by.fakeonliner.repository;

import by.fakeonliner.entity.Mobile;

public interface CategoryProductDao {

    boolean save(Mobile mobile);
    Mobile getMobileById(long id, String category);
}
