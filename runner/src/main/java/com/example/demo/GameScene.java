package com.example.demo;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class GameScene extends Scene {

    staticThing background;

    staticThing right;

    Camera camera;

    Hero hero;

    public GameScene(Pane pane) {
        super(pane , 600, 400);
        String backgroundImg = "back.png";
        background = new staticThing(0, 0, backgroundImg);

        pane.getChildren().add(background.getImageView());

        camera = new Camera(200, 300);
        hero = new Hero(200, 300, 1, 1, 172096600, 1, 1, 1);
        pane.getChildren().add(hero.getImageView());

        timer.start();
    }

    AnimationTimer timer = new AnimationTimer() {
        public void handle(long time){
            hero.update(time);
            /*hero.update(time);
            camera.update(time);
            gameScene.update(time);*/
        }
    };
}
