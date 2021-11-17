package com.example.demo;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class staticThing {

    double x;

    double y;

    ImageView imageView;

    public staticThing(double x, double y, String url) {
        this.x = x;
        this.y = y;
        Image spriteSheet = new Image(Objects.requireNonNull(getClass().getResourceAsStream(url)));
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(0,0,600,400));
        sprite.setX(x);
        sprite.setY(y);
        this.imageView = sprite;
    }

    public ImageView getImageView() {
        return imageView;
    }
}
