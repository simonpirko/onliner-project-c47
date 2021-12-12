package by.fakeonliner.repository.query_constant;

public class ProductQueryConstant {
    public final static String FIND_BY_MODEL = "SELECT * FROM product_list where model=? and brand=?";
    public final static String FIND_BY_BRAND = "SELECT * FROM product_list where brand=? and category=?";
    public final static String FIND_BY_PRICE = "SELECT * FROM product_list where price>? and price<? and category=?";
    public static final String DELETE_PRODUCT_BY_ID= "DELETE FROM product_list WHERE id=?";
}
