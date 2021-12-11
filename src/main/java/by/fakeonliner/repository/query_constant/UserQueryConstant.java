package by.fakeonliner.repository.query_constant;

public class UserQueryConstant {
    public static final String ADD_USER = "INSERT INTO users (username, password, " +
            "first_name, last_name, email, phone_number) VALUES(?, ?, ?, ?, ?, ?)";
    public static final String CHANGE_NAME_QUERY = "UPDATE users SET name=? WHERE id=?";
    public static final String CHANGE_LAST_NAME_QUERY = "UPDATE users SET last_name=? WHERE id=?";
    public static final String CHANGE_USERNAME_QUERY = "UPDATE users SET username=? WHERE id=?";
    public static final String CHANGE_PASSWORD_QUERY = "UPDATE users SET password=? WHERE id=?";
    public static final String CHANGE_PHONE_NUMBER_QUERY = "UPDATE users SET password=? WHERE id=?";
    public static final String CHANGE_EMAIL_QUERY = "UPDATE users SET email=? WHERE id=?";
    public static final String EXIST_BY_LOGIN_QUERY = "SELECT username FROM users WHERE username=?";
    public static final String EXIST_BY_PHONE_NUMBER_QUERY = "SELECT phone_number FROM users WHERE phone_number=?";
}
