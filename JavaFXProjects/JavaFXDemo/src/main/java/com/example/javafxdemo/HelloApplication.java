package com.example.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/javafxdemo/hello-view.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root, 320, 240);
            stage.setTitle("First JavaFX Project");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace(); // 👈 This shows what's going wrong
        }
    }

    public static void main(String[] args) {
        try {
            launch();
        } catch (Exception e) {
            e.printStackTrace(); // 👈 This too
        }
    }
}
