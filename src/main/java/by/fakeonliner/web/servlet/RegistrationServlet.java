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
        req.getSession().setAttribute("user", new User());
        getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        boolean flagMessage = false;
        if (user == null) {
            resp.sendRedirect("/registration");
        }
        if (user.getFirstName() == null) {
            req.getSession().setAttribute("firstNameMessage", ExceptionMessages.FIRST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        }
        if (user.getLastName() == null) {
            req.getSession().setAttribute("lastNameMessage", ExceptionMessages.LAST_NAME_IS_EMPTY.toString());
            flagMessage = true;
        }
        if (user.getUsername() == null) {
            req.getSession().setAttribute("usernameMessage", ExceptionMessages.USERNAME_IS_EMPTY.toString());
            flagMessage = true;
        }
        if (user.getPassword() == null) {
            req.getSession().setAttribute("passwordMessage", ExceptionMessages.PASSWORD_IS_EMPTY.toString());
            flagMessage = true;
        }
        if (user.getEmail() == null) {
            req.getSession().setAttribute("emailMessage", ExceptionMessages.EMAIL_IS_EMPTY.toString());
            flagMessage = true;
        }
        if (user.getPhoneNumber() == null) {
            req.getSession().setAttribute("phoneNumberMessage", ExceptionMessages.PHONE_NUMBER_IS_EMPTY.toString());
            flagMessage = true;
        }
        if (flagMessage) {
            resp.sendRedirect("/registration");
        }

        if (!userService.isExistUsername(user.getUsername())) {
            req.getSession().setAttribute("userMessage", ExceptionMessages.USER_ALREADY_EXIST.toString());
            resp.sendRedirect("/registration");
        }

        userService.save(user);
        resp.sendRedirect("/authorization");
    }

    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }
}
