package com.example.demo;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class AnimatedThing {

    double x;

    double y;

    ImageView imageView;

    // 1 is run
    int attitude;

    int index;

    // 每帧间隔
    long duration;

    int width;

    int height;

    int  offset;

    String url;

    Map<Integer, String> runImgMap = new HashMap();

    long lastTime = 0L;

    public AnimatedThing(double x, double y, int attitude, int index, long duration, int width, int height, int offset) {
        runImgMap.put(1, "run1.png");
        runImgMap.put(2, "run2.png");
        runImgMap.put(3, "run3.png");
        runImgMap.put(4, "run4.png");
        runImgMap.put(5, "run5.png");
        runImgMap.put(6, "run6.png");

        this.x = x;
        this.y = y;
        url = runImgMap.get(index);
        Image spriteSheet = new Image(Objects.requireNonNull(getClass().getResourceAsStream(url)));
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(0,0,200,400));
        sprite.setX(x);
        sprite.setY(y);
        this.imageView = sprite;
        this.attitude = attitude;
        this.index = index;
        this.duration = duration;
        this.width = width;
        this.height = height;
        this.offset = offset;
    }

    public void update(long time) {
        System.out.println("AnimatedThing" + time);
        // 超过间隔时间，触发下一帧
        if (time - lastTime > duration) {
            if (attitude == 1) {
                index ++;
                url = runImgMap.get(index);
                Image spriteSheet = new Image(Objects.requireNonNull(getClass().getResourceAsStream(url)));
                imageView.setImage(spriteSheet);
                if (index >= 6) {
                    index = 0;
                }
                lastTime = time;
            }
        }
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
