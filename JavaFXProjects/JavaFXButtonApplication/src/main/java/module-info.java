module com.example.javafxbuttonapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxbuttonapplication to javafx.fxml;
    exports com.example.javafxbuttonapplication;
}