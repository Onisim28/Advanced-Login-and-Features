package realLogin.com.onisim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	String url = "", username = "", pass = "";

	String query = "SELECT username, pass FROM application.accounts WHERE username=? AND pass=?";

	public boolean login(String user, String password) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, pass);

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, user);
		statement.setString(2, password);

		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {

			return true;

		}

		statement.close();
		connection.close();

		return false;

	}

}
