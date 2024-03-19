package simulacion;

import Ecosistema.Ambiente;
import Ecosistema.Eventos;
import simulacion.Simulacion;
import simulacion.ModeloPersonalizado; // Import the ModeloPersonalizado interface

public class ControladorSimulacion {
    private Simulacion simulation;
    private Simulacion.CustomModel customModel;
    private ModeloPersonalizado modeloPersonalizado; // This is now correctly recognized
    private Eventos eventos;

    public ControladorSimulacion() {
        this.eventos = new Eventos();
    }

    public void setCustomModel(Simulacion.CustomModel customModel) {
        this.customModel = customModel;
    }

    public void handleConfigureSimulation(String initialConditions, int duration, Ambiente ambiente) {
        this.simulation = new Simulacion(ambiente);
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

    public void handleStopSimulation() {
        if (simulation != null && simulation.isRunning()) {
            simulation.stop();
            System.out.println("Simulation stopped.");
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

    public void handleStartSimulation() {
        if (simulation == null) {
            simulation = new Simulacion();
        }
        if (!simulation.isRunning()) {
            simulation.start();
            System.out.println("Simulation started.");
            eventos.eventoAleatorio(simulation.getAmbiente());
        } else {
            System.out.println("A simulation is already running.");
        }
    }

    public void executeCustomModel(Ambiente ambiente) {
        if (customModel != null) {
            customModel.executeModel(ambiente);
        } else {
            System.out.println("No custom model has been set.");
        }
    }
}