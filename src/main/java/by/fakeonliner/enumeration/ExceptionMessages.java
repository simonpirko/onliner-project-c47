package by.fakeonliner.enumeration;

public enum ExceptionMessages {
    FIRST_NAME_IS_EMPTY("First name must be not empty."),
    LAST_NAME_IS_EMPTY("Last name must be not empty."),
    USERNAME_IS_EMPTY("Username must be not empty."),
    PASSWORD_IS_EMPTY("Password must be not empty."),
    PHONE_NUMBER_IS_EMPTY("Phone number must be not empty."),
    EMAIL_IS_EMPTY("Email must be not empty."),
    USER_ALREADY_EXIST("User already exist."),
    PASSWORD_NOT_EQUALS("Passwords not equal.")
    ;


    private String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
