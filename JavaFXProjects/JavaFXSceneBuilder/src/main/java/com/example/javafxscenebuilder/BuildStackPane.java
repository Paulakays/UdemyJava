package com.example.javafxscenebuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BuildStackPane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("Build StackPane");
        Button button2 = new Button();
        button2.setText("Build StackPane");

        StackPane sPane = new StackPane();
        sPane.getChildren().addAll(button, button2);
        Scene scene = new Scene(sPane,300,400);
        primaryStage.setTitle("Stack Pane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
