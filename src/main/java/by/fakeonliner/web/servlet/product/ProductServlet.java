package by.fakeonliner.web.servlet.product;

import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.service.ProductService;
import by.fakeonliner.web.constant.ConstantPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product/product")
public class ProductServlet extends HttpServlet {

    private ProductService productService;

    @Override
    public void init() throws ServletException {
        productService = ProductService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        ProductDto productDto = productService.findById(Integer.parseInt(id));
        req.setAttribute("product", productDto);
        getServletContext().getRequestDispatcher(ConstantPath.PRODUCT_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}