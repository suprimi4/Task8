package com.example.task8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public Pane paneLight;

    //ChristmasTree star = new Star();


    public void drawStar(ActionEvent actionEvent) {
        ChristmasTree decoratedStar = new Star(new GreenTree());
        decoratedStar.draw(paneLight);
    }

    public void addLights(ActionEvent actionEvent) {
        ChristmasTree girland = new Girland(new GreenTree());
        girland.draw(paneLight);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ChristmasTree back = new Background(new GreenTree());
        ChristmasTree greenTree = new TreeDecorator(new GreenTree());
        back.draw(paneLight);
        greenTree.draw(paneLight);
    }

    public void deleteAll(ActionEvent actionEvent) {
        ChristmasTree back = new Background(new GreenTree());
        ChristmasTree greenTree = new TreeDecorator(new GreenTree());
        paneLight.getChildren().clear();
        back.draw(paneLight);
        greenTree.draw(paneLight);
    }

    public void addPresents(ActionEvent actionEvent) {
        ChristmasTree presents = new Presents(new GreenTree());
        presents.draw(paneLight);
    }

    public void addAll(ActionEvent actionEvent) {
        ChristmasTree girland = new Girland(new GreenTree());
        ChristmasTree decoratedStar = new Star(new GreenTree());
        ChristmasTree presents = new Presents(new GreenTree());
        decoratedStar.draw(paneLight);
        girland.draw(paneLight);
        presents.draw(paneLight);
    }

    public void butZvPr(ActionEvent actionEvent) {
        ChristmasTree decoratedStar = new Presents(new Star(new GreenTree()));
        decoratedStar.draw(paneLight);

    }
}