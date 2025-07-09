module com.example.javafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxml to javafx.fxml;
    exports com.example.javafxml;
}