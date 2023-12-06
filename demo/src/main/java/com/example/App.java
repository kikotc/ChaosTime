package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    //declare variables at class scope 
    public static Scene scene;
    public Pane MenuLayout = new Pane();
    public Pane game = new Pane();
    public Stage stage = new Stage();
    public Button Start = new Button("Start");
    public Scene menuScene = new Scene(MenuLayout);
    

    

    @Override
    public void start(Stage stage) throws IOException {
        //gets the max size of screen and stores in a variable 
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        //makes the Stage be created at the max size of user screen 
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.show();
        stage.setTitle("Chaos Time");
        stage.setScene(menuScene);
        MenuLayout.getChildren().add(Start);
        Start.relocate(400, 500);
        
        


        
    }

    public static void main(String[] args) {
        launch();
    }

}