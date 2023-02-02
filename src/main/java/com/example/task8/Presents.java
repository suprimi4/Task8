package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Presents implements ChristmasTree{
    @Override
    public void draw(Pane pane) {
        Polygon pres1 = new Polygon();
        pres1.getPoints().addAll(new Double[]{
                0.0, 250.0,
                0.0, 200.0,
                100.0, 200.0,
                100.0, 250.0
        });
        pres1.setFill(Color.DARKBLUE);
        pane.getChildren().add(pres1);

        Polygon pres2 = new Polygon();
        pres2.getPoints().addAll(new Double[]{
                160.0, 250.0,
                160.0, 160.0,
                230.0, 160.0,
                230.0, 250.0
        });
        pres2.setFill(Color.YELLOWGREEN);
        pane.getChildren().add(pres2);
    }
}
