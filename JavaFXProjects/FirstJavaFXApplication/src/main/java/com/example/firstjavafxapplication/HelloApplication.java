package com.example.firstjavafxapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Label helloLabel = new Label("Hello World");
        helloLabel.setStyle("-fx-text-fill: green;");
        helloLabel.setFont(Font.font(null, FontWeight.BOLD, 20));
        //second label to show how stackpane overwrites when no new stackpane is initialised
        Label myLabel = new Label("My Label");

        StackPane root = new StackPane();
        //method to add items to the stage; buttons, labels etc...
        root.getChildren().add(helloLabel);
        root.getChildren().add(myLabel);

        Scene scene = new Scene(root,450,450);
        stage.setScene(scene);
        stage.setTitle("Hello World JavaFX Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}