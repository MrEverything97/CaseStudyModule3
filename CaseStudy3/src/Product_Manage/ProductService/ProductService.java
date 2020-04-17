package Product_Manage.ProductService;

import Product_Manage.Controller.SQL_Connection;
import Product_Manage.Model.Product;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductService {
    final static String SELECT_ALL_PRODUCT = "SELECT * FROM Product";
    final static String UPDATE_ONE_PRODUCT = "UPDATE Product SET productname = ?, price=? WHERE productId =?";
    final static String DELETE_ONE_PRODUCT = "DELETE FROM Product WHERE productId=?";
    final static String ADD_ONE_PRODUCT = "INSERT INTO Product VALUES(?,?,?,?,?,?,?)";
    final static String FIND_BY_ID = "SELECT * FROM Product WHERE productId =?";

    SQL_Connection connection = new SQL_Connection();

    public ArrayList<Product> selectAllProduct(){
        ArrayList<Product> productList = new ArrayList<>();
        Connection conn = connection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int productId = rs.getInt("productId");
                String productName = rs.getString("productName");
                int price = rs.getInt("price");
                productList.add(new Product(productId,productName,price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }


    public boolean saveProduct(Product product){
        Connection conn = connection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(UPDATE_ONE_PRODUCT);
            ps.setString(1,product.getProductName());
            ps.setInt(2,product.getPrice());
            ps.setInt(3,product.getProductId());
            int rows = ps.executeUpdate();
            if(rows>0)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void deleteProduct(int Id){
        Connection conn = connection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(DELETE_ONE_PRODUCT);
            ps.setInt(1,Id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean addProduct(Product product){

        Connection conn = connection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(ADD_ONE_PRODUCT);
            ps.setInt(1,product.getProductId());
            ps.setString(2,product.getProductName());
            ps.setInt(3,product.getPrice());
            int rows = ps.executeUpdate();
            if(rows>0){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
return false;
    }

    public Product findById(int Id){
        Connection conn = connection.getConnection();
        Product product = null;
        try {
            PreparedStatement ps = conn.prepareStatement(FIND_BY_ID);
            ps.setInt(1,Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int productId = Id;
                String productName = rs.getString("productName");
                int price = rs.getInt("price");
                product = new Product(productId, productName, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return product;
    }
}
