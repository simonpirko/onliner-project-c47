package by.fakeonliner.service;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();


    public User findByUsername(String userName) {
        if (userRepository.existByLogin(userName)) {
            return userRepository.getUser(userName);
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public boolean existByUsername(String username) {
        return userRepository.existByLogin(username);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public boolean existByPhoneNumber(String phoneNumber) {
        return userRepository.existByPhoneNumber(phoneNumber);
    }

    public boolean existByEmail(String email) {
        return userRepository.existByEmail(email);
    }
}
