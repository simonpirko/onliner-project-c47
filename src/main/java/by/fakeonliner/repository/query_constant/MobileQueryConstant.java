package by.fakeonliner.repository.query_constant;

public class MobileQueryConstant {
    public static final String ADD_MOBILE_QUERY = "INSERT INTO mobile (id, type, processor, OS," +
            " display_size, frequency, ram, display_type) VALUES (?,?,?,?,?,?,?,?)";
    public static final String GET_MOBILE_BY_ID_QUERY = "SELECT * FROM product_list, mobile " +
            " WHERE mobile.id = product_list.id";
}
