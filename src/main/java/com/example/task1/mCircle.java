package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class mCircle extends Shape {
    double length;

    double width;

    public mCircle(Color color, double length, double width) {
        super(color);
        this.length = length;

        this.width = width;
    }

    @Override
    double area() {

        return length*width;   }


    @Override
    void draw(GraphicsContext gr, int x, int y) {
        gr.setLineWidth(2);
        gr.setFill(color);
        gr.fillOval(x, y, width, length);

    }
}
