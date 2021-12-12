package by.fakeonliner.repository.jdbc;

import by.fakeonliner.dto.ProductDto;
import by.fakeonliner.repository.ProductDao;
import by.fakeonliner.repository.configuration.JdbcConnection;
import by.fakeonliner.repository.query_constant.ProductQueryConstant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcProductDao implements ProductDao {
    private final static String ID = "id";
    private final static String BRAND = "brand";
    private final static String PRICE = "price";
    private final static String MODEL = "model";
    private final static String MARKET_LAUNCH_DATE = "market_launch_date";
    private final static String RATING = "rating";
    private final static String CATEGORY = "category";

    @Override
    public void save(Object object) {

    }

    @Override
    public boolean existByModel(String model) {
        return false;
    }

    @Override
    public List<Object> findByModel(String name) {
        List<Object> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_MODEL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, name);
            resultSet(preparedStatement, list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void edit(long id, Object object) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Object> findByBrand(String name, String category) {
        List<Object> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_BRAND)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, category);
            resultSet(preparedStatement, list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Object> findByPrice(double min, double max, String category) {
        List<Object> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_PRICE)) {
            preparedStatement.setDouble(1, min);
            preparedStatement.setDouble(2, max);
            preparedStatement.setString(3, category);
            resultSet(preparedStatement, list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Object> findByAllFromCategory(String category) {
        return null;
    }

    private void resultSet(PreparedStatement preparedStatement, List<Object> list) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(ID);
            String brand = resultSet.getString(BRAND);
            double price = resultSet.getDouble(PRICE);
            String model = resultSet.getString(MODEL);
            int dt = resultSet.getInt(MARKET_LAUNCH_DATE);
            double rating = resultSet.getDouble(RATING);
            ProductDto productDto = new ProductDto(id, brand, price, model, dt, rating);
            list.add(productDto);
        }
    }
}
