package by.fakeonliner.repository;

import by.fakeonliner.entity.User;

import java.util.List;

public interface UserDao {
    boolean existByLogin(String userName);
    User getUser(String userName);
    List<User> getAllUsers();
}
