package com.example.snakeandladders;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    public Tile(int tileSize)
    {
        setWidth(tileSize);
        setHeight(tileSize);
        setFill(Color.AZURE);//
        setStroke(Color.BLACK);// Border color to rectangle
    }
}
