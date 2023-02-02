package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Girland implements ChristmasTree{

    @Override
    public void draw(Pane pane) {
        Circle circle1 = new Circle();
        circle1.setRadius(20);
        circle1.setCenterX(60);
        circle1.setCenterY(130);
        circle1.setFill(Color.ORANGE);
        pane.getChildren().add(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(20);
        circle2.setCenterX(120);
        circle2.setCenterY(170);
        circle2.setFill(Color.DARKCYAN);
        pane.getChildren().add(circle2);

        Circle circle3 = new Circle();
        circle3.setRadius(20);
        circle3.setCenterX(40);
        circle3.setCenterY(200);
        circle3.setFill(Color.DARKRED);
        pane.getChildren().add(circle3);

        Circle circle4 = new Circle();
        circle4.setRadius(20);
        circle4.setCenterX(170);
        circle4.setCenterY(220);
        circle4.setFill(Color.DARKKHAKI);
        pane.getChildren().add(circle4);
    }
}
