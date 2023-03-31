module com.example.snowitall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snowitall to javafx.fxml;
    exports com.example.snowitall;
}