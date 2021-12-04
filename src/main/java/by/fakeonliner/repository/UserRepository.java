package by.fakeonliner.repository;

import by.fakeonliner.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements  UserDao{
//    private final static UserRepository userRepository =new UserRepository();
    private final List<User> users = new ArrayList<>();

//    public static UserRepository getInstance(){
//        return userRepository;
//    }

    @Override
    public void save(User user) {

    }
}
