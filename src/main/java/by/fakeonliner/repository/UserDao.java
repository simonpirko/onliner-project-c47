package by.fakeonliner.repository;

import by.fakeonliner.entity.User;

import java.util.List;

public interface UserDao {

    boolean existByLogin(String userName);

    User getUser(String userName);

    List<User> getAllUsers();

    void save(User user);

    void edit(User user);

    void delete(User user);

    boolean existByEmail(String email);

    boolean existByPhoneNumber(String phoneNumber);

    void changeFirstName(long userId, String newFirstName);

    void changeLastName(long userId, String newLastName);

    void changeUsername(long userId, String newUsername);

    void changePassword(long userId, String newPassword);

    void changePhoneNumber(long userId, String newPhoneNumber);

    void changeEmail(long userId, String newEmail);
}
