package simulacion;
import Ecosistema.Ambiente;
import Ecosistema.Organismo;
import Ecosistema.Animal;

public class ControladorSimulacion {
    private simulacion simulation;
    private ModeloPersonalizado modeloPersonalizado;
    public void handleConfigureSimulation(String initialConditions, int duration, Ambiente ambiente) {
        this.simulation = new simulacion(initialConditions, duration, ambiente);
        System.out.println("Simulation configured with initial conditions: " + initialConditions + " and duration: " + duration);
    }
    public void setModeloPersonalizado(ModeloPersonalizado modeloPersonalizado) {
        this.modeloPersonalizado = modeloPersonalizado;
    }
    public void ejecutarModeloPersonalizado() {
        if (modeloPersonalizado != null) {
            modeloPersonalizado.ejecutarModelo();
        } else {
            System.out.println("No se ha configurado un modelo personalizado.");
        }
    }

    public void handleConfigureSimulation(String initialConditions, int duration) {
        this.simulation = new simulacion(initialConditions, duration);
        System.out.println("Simulation configured with initial conditions: " + initialConditions + " and duration: " + duration);
    }

    public void handleStartSimulation() {
        if (simulation == null) {
            simulation = new simulacion(); // Assuming Simulation is your simulation class
        }
        if (!simulation.isRunning()) {
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

    public void visualizarDatos() {
        if (simulation != null) {
            if (simulation.isRunning()) {
                String datos = simulation.getDatos();
                System.out.println(datos);
            } else {
                System.out.println("The simulation is not running. Please start the simulation before visualizing its data.");
            }
        } else {
            System.out.println("No simulation has been configured. Please configure a simulation before visualizing its data.");
        }
    }
}