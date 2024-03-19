package simulacion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Aplicacion extends Application {
    private ControladorSimulacion controller;

    public Aplicacion() {
        this.controller = new ControladorSimulacion();
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the user interface here
        // For example, you might create a form for configuring simulations
        // and buttons for controlling them

        // Create a root node for the scene
        Pane root = new Pane();

        // Set the scene on the primary stage and show it
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}