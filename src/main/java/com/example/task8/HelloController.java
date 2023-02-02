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

    ChristmasTree decoratedStar = new TreeDecorator(new Star());
    ChristmasTree greenTree = new TreeDecorator(new GreenTree());
    ChristmasTree back = new TreeDecorator(new Background());
    ChristmasTree girland = new TreeDecorator(new Girland());
    ChristmasTree presents = new TreeDecorator(new Presents());



    public void drawStar(ActionEvent actionEvent) {
        decoratedStar.draw(paneLight);
    }

    public void addLights(ActionEvent actionEvent) {
        girland.draw(paneLight);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        back.draw(paneLight);
        greenTree.draw(paneLight);
    }

    public void deleteAll(ActionEvent actionEvent) {
        paneLight.getChildren().clear();
        back.draw(paneLight);
        greenTree.draw(paneLight);
    }

    public void addPresents(ActionEvent actionEvent) {
        presents.draw(paneLight);
    }

    public void addAll(ActionEvent actionEvent) {
        decoratedStar.draw(paneLight);
        girland.draw(paneLight);
        presents.draw(paneLight);
    }
}