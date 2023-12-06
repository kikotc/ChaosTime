package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    //declare at class scope 
    public static Scene scene;
    public Pane MenuLayout = new Pane();
    public Pane game = new Pane();
    public Stage stage = new Stage();
    public Button Start = new Button("Start");

    

    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Chaos Time");

        
    }

    public static void main(String[] args) {
        launch();
    }

}