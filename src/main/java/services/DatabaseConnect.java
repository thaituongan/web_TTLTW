package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

    private static final String JDBC_URL = "jdbc:mysql://localhost/FastJobWeb";
    private static String username = "tuongan";
    private static final String password = "123456";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = getConnection();
            System.out.println(conn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, username, password);
    }

    public static void main(String[] args) {
        new DatabaseConnect();
    }
}