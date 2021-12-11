package by.fakeonliner.repository.jdbc;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserDao;

import java.util.List;

public class JdbcUserDao implements UserDao {
    @Override
    public boolean existByLogin(String userName) {
        return false;
    }

    @Override
    public User getUser(String userName) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public boolean existByEmail(String email) {
        return false;
    }

    @Override
    public boolean existByPhoneNumber(String phoneNumber) {
        return false;
    }

    @Override
    public void changeFirstName(long userId, String newFirstName) {

    }

    @Override
    public void changeLastName(long userId, String newLastName) {

    }

    @Override
    public void changeUsername(long userId, String newUsername) {

    }

    @Override
    public void changePassword(long userId, String newPassword) {

    }

    @Override
    public void changePhoneNumber(long userId, String newPhoneNumber) {

    }

    @Override
    public void changeEmail(long userId, String newEmail) {

    }
}
