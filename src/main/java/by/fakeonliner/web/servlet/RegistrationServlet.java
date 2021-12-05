package by.fakeonliner.web.servlet;

import by.fakeonliner.entity.User;
import by.fakeonliner.enumeration.ExceptionMessages;
import by.fakeonliner.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private UserService userService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        boolean flagMessage = false;

        if (req.getParameter("firstName") == null) {
            req.getSession().setAttribute("firstNameMessage", ExceptionMessages.FIRST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setFirstName(req.getParameter("firstName"));
        }

        if (req.getParameter("lastName") == null) {
            req.getSession().setAttribute("lastNameMessage", ExceptionMessages.LAST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setLastName(req.getParameter("lastName"));
        }

        if (req.getParameter("username") == null) {
            req.getSession().setAttribute("usernameMessage", ExceptionMessages.USERNAME_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setUsername(req.getParameter("username"));
        }

        if (req.getParameter("password") == null) {
            req.getSession().setAttribute("passwordMessage", ExceptionMessages.PASSWORD_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setPassword(req.getParameter("password"));
        }

        if (req.getParameter("confirmPassword") == null) {
            req.getSession().setAttribute("confirmPasswordMessage", ExceptionMessages.PASSWORD_IS_EMPTY.toString());
            flagMessage = true;
        }

        if (req.getParameter("email") == null) {
            req.getSession().setAttribute("emailMessage", ExceptionMessages.EMAIL_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setEmail(req.getParameter("email"));
        }

        if (req.getParameter("phoneNumber") == null) {
            req.getSession().setAttribute("phoneNumberMessage", ExceptionMessages.PHONE_NUMBER_IS_EMPTY.toString());
            flagMessage = true;
        } else {
            user.setPhoneNumber(req.getParameter("phoneNumber"));
        }

        if (!user.getPassword().equals(req.getParameter("confirmPassword"))) {
            req.getSession().setAttribute("passwordNotEquals", ExceptionMessages.PASSWORD_NOT_EQUALS.toString());
            flagMessage = true;
        }

////        if (!userService.isExistUsername(user.getUsername())) {
//            req.getSession().setAttribute("userMessage", ExceptionMessages.USER_ALREADY_EXIST.toString());
//            flagMessage = true;
//        }

        if (flagMessage) {
            resp.sendRedirect("/registration");
        }

//        userService.save(user);
//        resp.sendRedirect("/authorization");
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }
}
