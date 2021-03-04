package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.ShohinBean;
import util.ConstSQL;
public class ItemRegisterService {

	Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    ShohinBean shohinData;



    public ShohinBean itemRegister(String name, int price, String imageUrl, String kategori){

		try {
			Class.forName(ConstSQL.POSTGRES_DRIVER);
			connection = DriverManager.getConnection(ConstSQL.JDBC_CONNECTION, ConstSQL.USER, ConstSQL.PASS);

			 PreparedStatement psExecuteQuery = connection.prepareStatement(ConstSQL.LIST_SELECT_SQL);
	         resultSet = psExecuteQuery.executeQuery();

	         while (resultSet.next()) {
	                String name1 = resultSet.setString("name");
	                int price1 = resultSet.getInt("price");
	                String img1 = resultSet.getString("imageUrl");
	                String kategori1 = resultSet.getString("kategori");

	                shohinData = new ShohinBean();
	                shohinData.setName(name);
	                shohinData.setPrice(price);
	                shohinData.setImageUrl(imageUrl);
	                shohinData.setKategori(kategori);

		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}

		return shohinData;
	}
}
