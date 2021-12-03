package by.fakeonliner.repository;

import by.fakeonliner.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public boolean verificationLogin(String userName) {
        if (!users.isEmpty()) {
            for (User usr : users) {
                if (usr.getUsername().equals(userName)) {
                    return true;
                }
            }
        }
        return false;
    }


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

    public List<User> getAllUsers(){
        if (!users.isEmpty()){
            return users;
        }
        return null;
    }

}
