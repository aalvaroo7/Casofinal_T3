package simulacion;
public class ControladorSimulacion {
    private Simulation simulation;

    public void handleConfigureSimulation(String initialConditions, int duration) {
        // Create a new instance of your simulation class with the provided configuration
        this.simulation = new Simulation(initialConditions, duration);

        System.out.println("Simulation configured with initial conditions: " + initialConditions + " and duration: " + duration);
    }

    public void handleStartSimulation() {
        if (simulation == null || !simulation.isRunning()) {
            simulation = new Simulation(); // Assuming Simulation is your simulation class
            simulation.start();
            System.out.println("Simulation started.");
        } else {
            System.out.println("A simulation is already running.");
        }
    }

    public void handleStopSimulation() {
        if (simulation != null && simulation.isRunning()) {
            simulation.stop();
            System.out.println("Simulation stopped.");

            // Save the state of the simulation or any results it has produced
            // This will depend on the implementation of your simulation
            // For example:
            // String simulationResults = simulation.getResults();
            // registro.registrarSimulacion(simulationResults);
        } else {
            System.out.println("No simulation is currently running.");
        }
    }
}