package by.fakeonliner.web.servlet.user;

import by.fakeonliner.entity.User;

import by.fakeonliner.service.UserService;
import by.fakeonliner.web.constant.ConstantMessage;
import by.fakeonliner.web.constant.ConstantPath;
import by.fakeonliner.web.validator.RegistrationValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/registration")
public class RegistrationServlet extends HttpServlet {
    private UserService userService;
    private RegistrationValidator regValid;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(ConstantPath.USER_REGISTRATION_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        User user = new User();
        boolean flagMessage = false;

        if (regValid.isNullOrEmpty(firstName)) {
            req.getSession().setAttribute("firstNameMessage", ConstantMessage.FIRST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setFirstName(firstName);
        }

        if (regValid.isNullOrEmpty(lastName)) {
            req.getSession().setAttribute("lastNameMessage", ConstantMessage.LAST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setLastName(lastName);
        }

        if (regValid.isNullOrEmpty(username)) {
            req.getSession().setAttribute("usernameMessage", ConstantMessage.USERNAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setUsername(username);
        }

        if (regValid.isNullOrEmpty(password)) {
            req.getSession().setAttribute("passwordMessage", ConstantMessage.PASSWORD_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setPassword(password);
        }

        if (regValid.isNullOrEmpty(email)) {
            req.getSession().setAttribute("emailMessage", ConstantMessage.EMAIL_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setEmail(email);
        }

        if (regValid.isNullOrEmpty(phoneNumber)) {
            req.getSession().setAttribute("phoneNumberMessage", ConstantMessage.PHONE_NUMBER_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setPhoneNumber(phoneNumber);
        }

        if (!flagMessage) {
            flagMessage = isCorrectEmail(email, req);
        }

        if (!flagMessage) {
            flagMessage = isCorrectPhoneNumber(phoneNumber, req);
        }

        if (userService.existByUsername(user.getUsername())) {
            req.getSession().setAttribute("userMessage", ConstantMessage.USER_ALREADY_EXIST.toString());
            flagMessage = true;
        }

        if (flagMessage) {
            resp.sendRedirect("/user/registration");
        } else {
            userService.save(user);
            resp.sendRedirect("/user/authorization");
        }
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
        regValid = new RegistrationValidator();
    }


    private boolean isCorrectPhoneNumber(String phoneNumber, HttpServletRequest req) {
//        if (regValid.isCorrectPhone(phoneNumber)) {
//            if (userService.existByPhoneNumber(phoneNumber)) {
//                req.getSession().setAttribute("phoneNumberMessage", ConstantMessage.PHONE_NUMBER_ALREADY_EXIST.toString());
//                return true;
//            }
//        } else {
//            req.getSession().setAttribute("phoneNumberMessage", ConstantMessage.PHONE_NUMBER_INPUT_INCORRECTLY.toString());
//            return true;
//        }
        return false;
    }

    private boolean isCorrectEmail(String email, HttpServletRequest req) {
        if (regValid.isCorrectEmail(email)) {
            if (userService.existByEmail(email)) {
                req.getSession().setAttribute("email", ConstantMessage.EMAIL_ALREADY_EXIST.toString());
                return true;
            }
        } else {
            req.getSession().setAttribute("email", ConstantMessage.EMAIL_INPUT_INCORRECTLY.toString());
            return true;
        }
        return false;
    }
}
