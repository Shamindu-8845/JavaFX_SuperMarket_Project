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

    private static DBConnection getInstance() throws SQLException {
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public  Connection getConnection() throws SQLException {
        return connection;
    }
}
