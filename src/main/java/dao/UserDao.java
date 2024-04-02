package dao;

import java.sql.Connection;
import java.sql.SQLException;

import services.DatabaseConnect;

public class UserDao {
	private Connection conn;
	public UserDao() {
		// TODO Auto-generated constructor stub
		try {
			setConn(DatabaseConnect.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	


	public Connection getConn() {
		return conn;
	}


	public void setConn(Connection conn) {
		this.conn = conn;
	}

}
