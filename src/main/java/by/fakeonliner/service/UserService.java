package by.fakeonliner.service;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserDao;
import by.fakeonliner.repository.InMemoryUserDao;

import java.util.List;

public class UserService {
    private final UserDao userDao = new InMemoryUserDao();


    public User findByUsername(String userName) {
        if (userDao.existByLogin(userName)) {
            return userDao.findByUsername(userName);
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

    public void changeUsername (long userId, String newUsername){
        userDao.changeUsername(userId, newUsername);
    }

    public void changePassword (long userId, String newPassword){
        userDao.changePassword(userId, newPassword);
    }

    public void changePhoneNumber(long userId, String newPhoneNumber){
        userDao.changePhoneNumber(userId, newPhoneNumber);
    }

    public void changeEmail(long userId, String newEmail){
        userDao.changeEmail(userId, newEmail);
    }

    public void changeFirstName(long userId, String newFirstName){
        userDao.changeFirstName(userId, newFirstName);
    }

    public void changeLastName(long userId, String newLastName){
        userDao.changeLastName(userId, newLastName);
    }
}
