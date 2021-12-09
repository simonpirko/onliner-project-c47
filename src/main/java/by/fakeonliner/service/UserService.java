package by.fakeonliner.service;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserDao;
import by.fakeonliner.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserRepository();


    public User findByUsername(String userName) {
        if (userDao.existByLogin(userName)) {
            return userDao.getUser(userName);
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public boolean existByUsername(String username) {
        return userDao.existByLogin(username);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public boolean existByPhoneNumber(String phoneNumber) {
        return userDao.existByPhoneNumber(phoneNumber);
    }

    public boolean existByEmail(String email) {
        return userDao.existByEmail(email);
    }
}
