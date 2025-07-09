package com.example.javafxbuttonapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorldApp extends Application {
    @Override
    public void start(Stage primaryStage) {


        Button helloButton = new Button("Say Hello");
        //setOnAction listens to the event; prints hello world
        helloButton.setOnAction(event -> System.out.println("Hello World!"));

        Label label = new Label("Welcome to JavaFX Button Application!");
        Button changeTextButton = new Button("Change Text");
        //sets the label to Hello JavaFX
        changeTextButton.setOnAction(event -> label.setText("Hello JavaFX!"));

        //Creates a layout with 10 pixels spacing
        VBox root = new VBox(10);
        root.getChildren().addAll(helloButton, label, changeTextButton);




        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Hello World Application");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
