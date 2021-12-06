package by.fakeonliner.web.servlet;

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

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private UserService userService;
    private RegistrationValidator regValid;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(ConstantPath.registrationPathJsp).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        boolean flagMessage = false;

        if (regValid.isNullOrEmpty(req.getParameter("firstName"))) {
            req.getSession().setAttribute("firstNameMessage", ConstantMessage.FIRST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setFirstName(req.getParameter("firstName"));
        }

        if (regValid.isNullOrEmpty(req.getParameter("lastName"))) {
            req.getSession().setAttribute("lastNameMessage", ConstantMessage.LAST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setLastName(req.getParameter("lastName"));
        }

        if (regValid.isNullOrEmpty(req.getParameter("username"))) {
            req.getSession().setAttribute("usernameMessage", ConstantMessage.USERNAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setUsername(req.getParameter("username"));
        }

        if (regValid.isNullOrEmpty(req.getParameter("password"))) {
            req.getSession().setAttribute("passwordMessage", ConstantMessage.PASSWORD_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setPassword(req.getParameter("password"));
        }

        if (regValid.isNullOrEmpty(req.getParameter("confirmPassword"))) {
            req.getSession().setAttribute("confirmPasswordMessage", ConstantMessage.PASSWORD_IS_EMPTY.toString());
            flagMessage = true;
        }

        if (regValid.isNullOrEmpty(req.getParameter("email"))) {
            req.getSession().setAttribute("emailMessage", ConstantMessage.EMAIL_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setEmail(req.getParameter("email"));
        }

        if (regValid.isNullOrEmpty(req.getParameter("phoneNumber"))) {
            req.getSession().setAttribute("phoneNumberMessage", ConstantMessage.PHONE_NUMBER_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setPhoneNumber(req.getParameter("phoneNumber"));
        }

        if (regValid.isCorrectEmail(req.getParameter("email"))) {
            if (userService.existByEmail(req.getParameter("email"))) {
                req.getSession().setAttribute("email", ConstantMessage.EMAIL_ALREADY_EXIST.toString());
                flagMessage = true;
            }
        } else {
            req.getSession().setAttribute("email", ConstantMessage.EMAIL_INPUT_INCORRECTLY.toString());
            flagMessage = true;
        }

        if (regValid.isCorrectPhone(req.getParameter("phoneNumber"))) {
            if (userService.existByPhoneNumber(req.getParameter("phoneNumber"))) {
                req.getSession().setAttribute("phoneNumberMessage", ConstantMessage.PHONE_NUMBER_ALREADY_EXIST.toString());
                flagMessage = true;
            }
        } else {
            req.getSession().setAttribute("phoneNumberMessage", ConstantMessage.PHONE_NUMBER_INPUT_INCORRECTLY.toString());
            flagMessage = true;
        }

        if (userService.existByUsername(user.getUsername())) {
            req.getSession().setAttribute("userMessage", ConstantMessage.USER_ALREADY_EXIST.toString());
            flagMessage = true;
        }

        if (flagMessage) {
            resp.sendRedirect("/registration");
        } else {
            userService.save(user);
            resp.sendRedirect("/authorization");
        }
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
        regValid = new RegistrationValidator();
    }
}
