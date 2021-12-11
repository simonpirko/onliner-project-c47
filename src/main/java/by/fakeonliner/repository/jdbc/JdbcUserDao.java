package by.fakeonliner.repository.jdbc;

import by.fakeonliner.entity.User;
import by.fakeonliner.repository.UserDao;
import by.fakeonliner.repository.configuration.JdbcConnection;
import by.fakeonliner.repository.query_constant.UserQueryConstant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcUserDao implements UserDao {
    @Override
    public boolean existByLogin(String userName) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.EXIST_BY_LOGIN_QUERY)) {
            preparedStatement.setString(1, userName);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean existByEmail(String email) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_USERNAME_QUERY)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean existByPhoneNumber(String phoneNumber) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.EXIST_BY_PHONE_NUMBER_QUERY)) {
            preparedStatement.setString(1, phoneNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public User getUser(String userName) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void save(User user) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.ADD_USER)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setString(6, user.getPhoneNumber());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


    @Override
    public void delete(User user) {

    }

    @Override
    public void changeFirstName(long userId, String newFirstName) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_NAME_QUERY)) {
            preparedStatement.setString(1, newFirstName);
            preparedStatement.setInt(2, (int) userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void changeLastName(long userId, String newLastName) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_LAST_NAME_QUERY)) {
            preparedStatement.setString(1, newLastName);
            preparedStatement.setInt(2, (int) userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void changeUsername(long userId, String newUsername) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_USERNAME_QUERY)) {
            preparedStatement.setString(1, newUsername);
            preparedStatement.setInt(2, (int) userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void changePassword(long userId, String newPassword) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_PASSWORD_QUERY)) {
            preparedStatement.setString(1, newPassword);
            preparedStatement.setInt(2, (int) userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void changePhoneNumber(long userId, String newPhoneNumber) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_PHONE_NUMBER_QUERY)) {
            preparedStatement.setString(1, newPhoneNumber);
            preparedStatement.setInt(2, (int) userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void changeEmail(long userId, String newEmail) {
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(UserQueryConstant.CHANGE_EMAIL_QUERY)) {
            preparedStatement.setString(1, newEmail);
            preparedStatement.setInt(2, (int) userId);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
