package by.fakeonliner.web.servlet;

import by.fakeonliner.dto.BasketProductDto;
import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.entity.User;
import by.fakeonliner.service.BasketService;
import by.fakeonliner.service.ProductService;
import by.fakeonliner.web.constant.ConstantPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/basket", name = "BasketServlet")
public class BasketServlet extends HttpServlet {

    private BasketService basketService;

    @Override
    public void init() throws ServletException {
        basketService = BasketService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("guest") == null) {
            if (req.getSession().getAttribute("basketList") != null) {
                List<BasketProductDto> guestList = (List<BasketProductDto>) req.getSession().getAttribute("basketList");
            }
            User user = (User) req.getSession().getAttribute("user");
            List<BasketProductDto> productsDb = basketService.getProductListFromDb(user.getId());
            double totalCost = getTotalCost(productsDb);
            req.setAttribute("totalCost", totalCost);
            req.getSession().setAttribute("basketList", productsDb);
        } else {

            List<BasketProductDto> products = basketService.getProductList();
            double totalCost = getTotalCost(products);
            req.setAttribute("totalCost", totalCost);
            req.getSession().setAttribute("basketList", products);
        }
        getServletContext().getRequestDispatcher(ConstantPath.BASKET_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


    private double getTotalCost(List<BasketProductDto> basketList) {
        double amount = 0;
        for(BasketProductDto item : basketList) {
            if (item.getAmount() > 1) {
                amount += item.getPrice() * item.getAmount();
            } else {
                amount += item.getPrice();
            }
        }
        return amount;
    }
}
