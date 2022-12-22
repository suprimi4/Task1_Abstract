package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{

    double length;

    double width;

    public Rectangle(Color color,double length,double width) {

        // calling Shape constructor

        super(color);

        this.length = length;

        this.width = width;  }

    @Override

    double area() {

        return length*width;   }

    @Override
    void draw(GraphicsContext gr, int x , int y) {
        gr.setLineWidth(2);
        gr.setFill(color);
        gr.fillRect(x, y, width, length);

    }
}
