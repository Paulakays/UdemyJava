module com.example.firstjavafxapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.firstjavafxapplication to javafx.fxml;
    exports com.example.firstjavafxapplication;
}