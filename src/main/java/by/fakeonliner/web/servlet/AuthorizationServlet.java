package by.fakeonliner.web.servlet;

import by.fakeonliner.entity.User;
import by.fakeonliner.service.UserService;
import by.fakeonliner.web.constant.ConstantPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    private final UserService userService = new UserService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            getServletContext().getRequestDispatcher(ConstantPath.USER_AUTHORIZATION_JSP).forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = userService.findByUsername(username);
        verificationPassword(req, resp, password, user);
    }

    private void verificationPassword(HttpServletRequest req, HttpServletResponse resp, String password, User user) throws IOException, ServletException {
        if (user != null) {
            if (user.getPassword().equals(password)) {
                List<User> users = userService.getAllUsers();
                req.getSession().setAttribute("user", user);
                req.getSession().setAttribute("users", users);
                resp.sendRedirect("/");
                return;
            } else {
                req.setAttribute("message", "Wrong password");
            }
        } else {
            req.setAttribute("message", "User not found");
        }
        getServletContext().getRequestDispatcher(ConstantPath.USER_AUTHORIZATION_JSP).forward(req, resp);
    }
}

