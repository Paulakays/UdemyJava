package com.example.javafxscenebuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BuildHBox extends Application {
    @Override
    public void start(Stage primaryStage)  {
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        HBox root = new HBox(20);
        root.getChildren().addAll( button1, button2);

        Scene scene = new Scene(root,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
