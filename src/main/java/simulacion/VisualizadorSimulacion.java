package simulacion;
// JavaFX imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VisualizadorSimulacion extends Application {
    private SimulationController controller;

    public VisualizadorSimulacion() {
        this.controller = new SimulationController();
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the user interface here
        // For example, you might create a form for configuring simulations
        // and buttons for controlling them

        // Set the scene on the primary stage and show it
        primaryStage.setScene(new Scene(/* your root node here */));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
