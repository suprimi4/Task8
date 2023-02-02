package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class GreenTree implements ChristmasTree{
    @Override
    public void draw(Pane pane) {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                100.0, 50.0,
                200.0, 250.0,
                0.0, 250.0
        });
        triangle.setFill(Color.GREEN);
        pane.getChildren().add(triangle);
    }
}
