package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.ItemBean;

public class ItemService {

	/** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/workshop";
    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "postgres";
//    商品の写真、名前、値段の表示
    private static final String SQL_SELECT = "select price, name, image_url from items where id = ?";

    ItemBean itemDate = null;

    public ItemBean itemSerch(int id) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
        	Class.forName(POSTGRES_DRIVER);
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
            statement = connection.createStatement();

            preparedStatement = connection.prepareStatement(SQL_SELECT);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
            	String itmName = resultSet.getString("name");
            	int itmprice = resultSet.getInt("price");
            	String itmImage = resultSet.getString("image_url");

            	itemDate = new ItemBean();
            	itemDate.setName(itmName);
            	itemDate.setPrice(itmprice);
            	itemDate.setImage_url(itmImage);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // getConnection()、createStatement()、executeQuery()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	try {
        		if(resultSet != null) {
        			resultSet.close();
        		}
        		if(statement != null) {
        			statement.close();
        		}
        		if(connection != null) {
        			connection.close();
        		}
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return itemDate;
    }
}