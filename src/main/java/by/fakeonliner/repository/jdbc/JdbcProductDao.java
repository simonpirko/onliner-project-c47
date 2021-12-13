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
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_MODEL)) {
            preparedStatement.setString(1, model);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<ProductDto> findByModel(String model) {
        List<ProductDto> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_MODEL)) {
            preparedStatement.setString(1, model);
            resultSet(preparedStatement, ID, BRAND, PRICE, MODEL, MARKET_LAUNCH_DATE, RATING, list);
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
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.DELETE_PRODUCT_BY_ID)) {
            preparedStatement.setInt(1, (int) id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ProductDto> findByBrand(String name, String category) {
        List<ProductDto> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_BRAND)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, category);
            resultSet(preparedStatement, ID, BRAND, PRICE, MODEL, MARKET_LAUNCH_DATE, RATING, list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ProductDto> findByPrice(double min, double max, String category) {
        List<ProductDto> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.FIND_BY_PRICE)) {
            preparedStatement.setDouble(1, min);
            preparedStatement.setDouble(2, max);
            preparedStatement.setString(3, category);
            resultSet(preparedStatement, ID, BRAND, PRICE, MODEL, MARKET_LAUNCH_DATE, RATING, list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ProductDto> findByAllFromCategory(String category) {
        List<ProductDto> list = new ArrayList<>();
        try (Connection con = JdbcConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(ProductQueryConstant.ALL_FROM_CATEGORY)) {
            preparedStatement.setString(1, category);
            resultSet(preparedStatement, ID, BRAND, PRICE, MODEL, MARKET_LAUNCH_DATE, RATING, list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private void resultSet(PreparedStatement preparedStatement, String id, String brand, String price, String model, String marketLaunchDate, String rating, List<ProductDto> list) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            ProductDto productDto = new ProductDto();
            productDto.setId(resultSet.getInt(id));
            productDto.setBrand(resultSet.getString(brand));
            productDto.setPrice(resultSet.getInt(price));
            productDto.setModel(resultSet.getString(model));
            productDto.setMarketLaunchDate(resultSet.getInt(marketLaunchDate));
            productDto.setAverageRating(resultSet.getDouble(rating));
            list.add(productDto);
        }
    }
}
