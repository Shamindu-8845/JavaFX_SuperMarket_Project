package lk.ijse.edu.javafx_supermarket.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;

    private static DBConnection dbConnection;

    private DBConnection() throws SQLException {
        connection = DriverManager.getConnection("mysql://localhost:3306/supermarket", "root", "Ijse@1234");
    }

}
