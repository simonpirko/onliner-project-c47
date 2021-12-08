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

    public void changeFirstName(long userId, String newFirstName){
        userRepository.changeFirstName(userId, newFirstName);
    }

    public void changeLastName(long userId, String newLastName){
        userRepository.changeLastName(userId, newLastName);
    }
    public boolean existByUsername(String username) {
        return userRepository.existByLogin(username);
    }

    public void save(User user) {
        userRepository.save(user);
    }


    public void changeUsername (long userId, String newUsername){
        userRepository.changeUsername(userId, newUsername);
    }

    public void changePassword (long userId, String newPassword){
        userRepository.changePassword(userId, newPassword);
    }

    public void changePhoneNumber(long userId, String newPhoneNumber){
        userRepository.changePhoneNumber(userId, newPhoneNumber);
    }

    public void changeEmail(long userId, String newEmail){
        userRepository.changeEmail(userId, newEmail);
    }
    public boolean existByPhoneNumber(String phoneNumber) {
        return userRepository.existByPhoneNumber(phoneNumber);
    }

    public boolean existByEmail(String email) {
        return userRepository.existByEmail(email);
    }
}
