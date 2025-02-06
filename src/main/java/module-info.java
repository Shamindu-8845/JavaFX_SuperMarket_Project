module lk.ijse.edu.javafx_supermarket {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens lk.ijse.edu.javafx_supermarket to javafx.fxml;
    exports lk.ijse.edu.javafx_supermarket;
    exports lk.ijse.edu.javafx_supermarket.controller;
    opens lk.ijse.edu.javafx_supermarket.controller to javafx.fxml;
}