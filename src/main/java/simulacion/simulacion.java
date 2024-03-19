package simulacion;

import Ecosistema.Ambiente;

public class simulacion {


    public interface CustomModel {
        void executeModel(Ambiente ambiente);
    }
        private boolean running;
        private Ambiente ambiente;

        public simulacion(String initialConditions, int duration, Ambiente ambiente) {
            this.ambiente = ambiente;
            this.running = false;
        }

        public Ambiente getAmbiente() {
            return this.ambiente;
        }
        // Añade un constructor que acepta un objeto Ambiente
        public simulacion(Ambiente ambiente) {
            this.ambiente = ambiente;
            this.running = false;
        }

        // Añade un setter para el ambiente
        public void setAmbiente(Ambiente ambiente) {
            this.ambiente = ambiente;
        }
    public simulacion() {
        this.running = false;
    }

    public simulacion(String initialConditions, int duration) {
    }

    public boolean isRunning() {
        return this.running;
    }

    public void start() {
        this.running = true;
        System.out.println("comienzo simulacion.");
    }

    public void stop() {
        this.running = false;
        System.out.println("fin simulacion.");
    }

    public String getDatos() {
        // This is just an example. You should replace this with code that
        // generates a string containing the data of the simulation.
        return "Datos de la simulación";
    }
    public class ControladorSimulacion {
        private simulacion simulation;
        private ModeloPersonalizado modeloPersonalizado;

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
                String datos = simulation.getDatos();
                System.out.println(datos);
            } else {
                System.out.println("No hay una simulación para visualizar sus datos.");
            }
        }
    }
}
