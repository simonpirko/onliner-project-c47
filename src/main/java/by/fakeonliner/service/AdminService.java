package by.fakeonliner.service;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.inMemory.InMemoryUserDao;
import by.fakeonliner.repository.UserDao;

import java.util.List;

public class AdminService {
    private final UserDao userDao = new InMemoryUserDao();

    public List<User> performOperation(String operation, User user, List<User> users, String userNumber) {
        switch(operation) {
            case "addAdmin" : {
                if (!user.getStatus().equals("admin")) {
                    User modifyUser = addAdminStatus(user);
                    int number = Integer.parseInt(userNumber);
                    users.set(number, modifyUser);
                }
                return users;
            }
            case "removeAdmin" : {
                if (user.getStatus().equals("admin")) {
                    User modifyUser = removeAdminStatus(user);
                    int number = Integer.parseInt(userNumber);
                    users.set(number, modifyUser);
                }
                return users;
            }

            case "deleteUser" : {
                deleteUser(user);
                users.remove(user);
                return users;
            }
        }
        return null;
    }


    private User addAdminStatus(User user) {
        user.setStatus("admin");
//        userDao.addAdminStatus(user.getId());
        return user;
    }

    private User removeAdminStatus(User user) {
        user.setStatus("user");
//        userDao.removeAdminStatus(user.getId());
        return user;
    }

    private void deleteUser(User user) {
//        userDao.delete(user.getId());
    }
}
