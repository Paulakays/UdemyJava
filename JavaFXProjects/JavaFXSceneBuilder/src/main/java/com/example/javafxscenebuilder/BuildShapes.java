package com.example.javafxscenebuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BuildShapes extends Application {
    @Override
    public void start(Stage stage)  {
        Pane root = new Pane();
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(100);
        rectangle.setHeight(70);
        rectangle.setFill(Color.VIOLET);

        Circle circle = new Circle();
        circle.setRadius(30);
        circle.setCenterX(10);
        circle.setCenterY(5);
        circle.setFill(Color.GOLD);

        Line line = new Line();
        line.setStartX(20);
        line.setStartY(20);
        line.setEndX(200);
        line.setEndY(200);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(3);



        //Adds features created (rectangle) in the scene
        root.getChildren().addAll(rectangle, circle,line);

        Scene scene = new Scene(root,400,300);
        stage.setTitle("Sample JavaFX Scene Builder");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}