module com.example.lab4_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4_2 to javafx.fxml;
    exports com.example.lab4_2;
}