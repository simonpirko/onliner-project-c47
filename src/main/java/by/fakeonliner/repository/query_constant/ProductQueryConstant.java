package by.fakeonliner.repository.query_constant;

public class ProductQueryConstant {
    public final static String FIND_BY_MODEL = "SELECT * FROM fake_onliner.product_list where model like '%?%' and brand like '%?%'";
    public final static String FIND_BY_BRAND = "SELECT * FROM fake_onliner.product_list where brand like '%?%' and category='?'";
    public final static String FIND_BY_PRICE = "SELECT * FROM fake_onliner.product_list where price>? and price<? and category='?'";
}
