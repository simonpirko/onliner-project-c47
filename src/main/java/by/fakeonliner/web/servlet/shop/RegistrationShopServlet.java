package by.fakeonliner.web.servlet.shop;

import by.fakeonliner.entity.Shop;
import by.fakeonliner.service.ShopService;
import by.fakeonliner.web.constant.ConstantPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shop/registration")
public class RegistrationShopServlet extends HttpServlet {
    private final ShopService shopService = new ShopService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            getServletContext().getRequestDispatcher(ConstantPath.SHOP_REGISTRATION_JSP).forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");

        if (!shopService.shopDao(new Shop(login, password, name, phoneNumber, email))) {
            req.setAttribute("alert", "This login exists");
            getServletContext().getRequestDispatcher(ConstantPath.SHOP_REGISTRATION_JSP).forward(req, resp);
        } else {
            resp.sendRedirect(ConstantPath.SHOP_AUTHORIZATION_JSP);
        }
    }
}