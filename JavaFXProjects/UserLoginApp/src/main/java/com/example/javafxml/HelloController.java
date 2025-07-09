package com.example.javafxml;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonEntered(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Button Entered");
        alert.setHeaderText("Header Text");
        alert.setContentText("You entered the button");
        alert.showAndWait();
    }
}