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
    }
}
