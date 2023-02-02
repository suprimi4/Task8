package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Star implements ChristmasTree{

    @Override
    public void draw(Pane pane) {
        Polygon star = new Polygon();
        star.getPoints().addAll(new Double[]{
                100.0, 10.0,
                113.0, 50.0,//
                150.0, 50.0,
                112.5, 75.0,
                125.0, 125.0,
                100.0, 100.0,
                75.0, 125.0,
                87.5, 75.0,
                50.0, 50.0,
                100.0, 50.0,
                87.0, 50.0//
        });



        star.setFill(Color.YELLOW);
        pane.getChildren().add(star);


    }


}
