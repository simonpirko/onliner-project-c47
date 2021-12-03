package by.fakeonliner.service;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();


    public User findByUsername(String userName) {
        if (userRepository.verificationLogin(userName)) {
            return userRepository.getUser(userName);
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

}
