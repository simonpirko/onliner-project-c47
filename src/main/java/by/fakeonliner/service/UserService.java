package by.fakeonliner.service;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserRepository;

public class UserService {
//    private final UserRepository userRepository = UserRepository.getInstance();
    private final UserRepository userRepository = new UserRepository();

    public boolean isExistUsername(String userName) {
        //TODO check username if exist. If exist return true else return false.
        return false;
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
