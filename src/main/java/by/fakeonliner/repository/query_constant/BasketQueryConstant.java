package by.fakeonliner.repository.query_constant;

public class BasketQueryConstant {
    public static final String ADD_PRODUCT_QUERY = "INSERT INTO basket (user_id, product_id, amount) VALUES (?, ?, ?)";
    public static final String GET_PRODUCTS_QUERY = "SELECT * FROM basket LEFT JOIN" +
            " product_list ON basket.product_id = product_list.id WHERE basket.user_id =?";
    public static final String DELETE_PRODUCT_QUERY = "DELETE FROM basket WHERE basket.product_id =?";

}
