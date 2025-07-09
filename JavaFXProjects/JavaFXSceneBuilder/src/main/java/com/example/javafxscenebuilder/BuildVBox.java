package com.example.javafxscenebuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuildVBox extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button button = new Button();
        button.setText("Build VBox");
        Button button2 = new Button();
        button2.setText("Build VBox");

        VBox vbox = new VBox(25);
        vbox.getChildren().addAll(button, button2);
        Scene scene = new Scene(vbox,300,400);
        primaryStage.setTitle("VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
