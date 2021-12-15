package by.fakeonliner.web;

import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.service.ProductService;
import by.fakeonliner.service.UserService;
import by.fakeonliner.web.constant.ConstantPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    private ProductService productService;

    @Override
    public void init() throws ServletException {
        productService = ProductService.getInstance();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProductDto> homeProductList = productService.getProductListHome();
        req.getSession().setAttribute("homeProductList", homeProductList);
        getServletContext().getRequestDispatcher(ConstantPath.HOME_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productNumber = req.getParameter("productNumber");
        List<ProductDto> products = (List<ProductDto>) req.getSession().getAttribute("homeProductList");

    }
}
