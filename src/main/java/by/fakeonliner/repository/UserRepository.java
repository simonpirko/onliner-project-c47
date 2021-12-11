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
        if (!users.isEmpty()) {
            for (User usr : users) {
                if (usr.getEmail().equals(email)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean existByPhoneNumber(String phoneNumber) {
        if (!users.isEmpty()) {
            for (User usr : users) {
                if (usr.getPhoneNumber().equals(phoneNumber)) {
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public void changeFirstName(long userId, String newFirstName){
        for (User usr : users){
            if (usr.getId() == userId){
                usr.setFirstName(newFirstName);
            }
        }
    }

    @Override
    public void changeLastName(long userId, String newLastName){
        for (User usr : users){
            if (usr.getId() == userId){
                usr.setLastName(newLastName);
            }
        }
    }

    @Override
    public void changeUsername(long userId, String newUsername){
        for (User usr : users){
            if (usr.getId() == userId){
                usr.setUsername(newUsername);
            }
        }
    }

    @Override
    public void changePassword(long userId, String newPassword){
        for (User usr : users){
            if(usr.getId() == userId){
                usr.setPassword(newPassword);
            }
        }
    }

    @Override
    public void changePhoneNumber(long userId, String newPhoneNumber){
        for (User usr : users){
            if(usr.getId() == userId){
                usr.setPhoneNumber(newPhoneNumber);
            }
        }
    }

    @Override
    public  void changeEmail(long userId, String newEmail){
        for (User usr : users){
            if (usr.getId() == userId){
                usr.setEmail(newEmail);
            }
        }
    }
}
