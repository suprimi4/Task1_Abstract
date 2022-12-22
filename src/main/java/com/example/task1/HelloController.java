package com.example.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;


public class HelloController {
    public TextArea xStart;
    public TextArea yStart;
    public Label lastUsed;
    public ColorPicker colorPick;
    public javafx.scene.canvas.Canvas Canvas;
    public TextArea Tlength;
    public TextArea Twidth;


    public void onClickButtonCircle(ActionEvent actionEvent) {
        int pStartx = Integer.parseInt(String.valueOf(xStart.getText()));
        int pStarty = Integer.parseInt(String.valueOf(yStart.getText()));
        int length1 = Integer.parseInt(String.valueOf(Tlength.getText()));
        int width1 = Integer.parseInt(String.valueOf(Twidth.getText()));
        mCircle circle = new mCircle(colorPick.getValue(),length1, width1);
        circle.draw(Canvas.getGraphicsContext2D(), pStartx, pStarty);
        lastUsed.setText("Circle");



    }



    public void onClickButtonRectangle(ActionEvent actionEvent) {
        int pStartx = Integer.parseInt(String.valueOf(xStart.getText()));
        int pStarty = Integer.parseInt(String.valueOf(yStart.getText()));
        int length1 = Integer.parseInt(String.valueOf(Tlength.getText()));
        int width1 = Integer.parseInt(String.valueOf(Twidth.getText()));
        Rectangle rectangle = new Rectangle(colorPick.getValue(),length1, width1);
        rectangle.draw(Canvas.getGraphicsContext2D(), pStartx, pStarty);
        lastUsed.setText("Rectangle");


    }

    public void onClickButtonRRectangle(ActionEvent actionEvent) {
        int pStartx = Integer.parseInt(String.valueOf(xStart.getText()));
        int pStarty = Integer.parseInt(String.valueOf(yStart.getText()));
        int length1 = Integer.parseInt(String.valueOf(Tlength.getText()));
        int width1 = Integer.parseInt(String.valueOf(Twidth.getText()));
        RRectangle rrectangle = new RRectangle(colorPick.getValue(),length1, width1);
        rrectangle.draw(Canvas.getGraphicsContext2D(), pStartx, pStarty);
        lastUsed.setText("RoundRectangle");

    }



}