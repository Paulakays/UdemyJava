package com.example.javafxscenebuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BuildFlowPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowPane fPane = new FlowPane();

        for(int i = 1; i<= 10; i++) {
            Button button = new Button("Build FlowPane" + i);

            fPane.getChildren().add(button);
        }
            Scene scene = new Scene(fPane, 300, 400);
            primaryStage.setTitle("Flow Pane Example");
            primaryStage.setScene(scene);
            primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}
