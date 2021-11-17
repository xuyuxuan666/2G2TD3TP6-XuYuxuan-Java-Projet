package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    /*@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("2G2TD3TP6-XuYuxuan-Java-runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane);
        primaryStage.setScene(theScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
