package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape  {

    //параметры фигуры - приватные поля

    protected Color color;

    protected double x, y;

    // объявление абстрактных методов

    abstract double area();

    abstract void draw( GraphicsContext gr, int x, int y);

    // конструктор

    public Shape(Color color) {

        System.out.println("Shape constructor called");

        this.color = color;     }



    // реализация методов

    public void setColor(Color color) {

        this.color=color;     }

}