package by.fakeonliner.repository;

import by.fakeonliner.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserDao{

    private final List<User> users = new ArrayList<>();

    @Override
    public boolean existByLogin(String userName) {
        if (!users.isEmpty()) {
            for (User usr : users) {
                if (usr.getUsername().equals(userName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public User getUser(String userName) {
        if (!users.isEmpty()) {
            for (User usr : users) {
                if (usr.getUsername().equals(userName)) {
                    return usr;
                }
            }
        }
        return null;

    }

    @Override
    public List<User> getAllUsers(){
        if (!users.isEmpty()){
            return users;
        }
        return null;
    }

}
