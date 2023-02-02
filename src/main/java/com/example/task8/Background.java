package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Background extends TreeDecorator{
    public Background(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void draw(Pane pane) {
        Polygon back = new Polygon();
        back.getPoints().addAll(new Double[]{
                0.0, 0.0,
                230.0, 0.0,
                230.0, 300.0,
                0.0, 300.0
        });
        back.setFill(Color.CYAN);
        pane.getChildren().add(back);
    }
}
