package by.fakeonliner.web.servlet.admin;

import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.service.AdminService;
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

@WebServlet(value = "/admin/products", name = "ProductsServlet")
public class ProductsServlet extends HttpServlet {

    private ProductService productService;
    private AdminService adminService;

    @Override
    public void init() throws ServletException {
        productService = ProductService.getInstance();
        adminService = AdminService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProductDto> products = productService.getProductDtoList();
        req.getSession().setAttribute("products", products);
        getServletContext().getRequestDispatcher(ConstantPath.ADMIN_PRODUCTS_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numberProduct = req.getParameter("numberProduct");
        String operation = req.getParameter("productOperation");
        List<ProductDto> products = (List<ProductDto>) req.getSession().getAttribute("products");

        ProductDto productDto = products.get(Integer.parseInt(numberProduct));

        products = adminService.performProductOperation(operation, productDto, products, numberProduct);
    }
}
