package simulacion;
import Ecosistema.Eventos;
import Ecosistema.Ambiente;
public class Simulacion {
    private Eventos eventos; // Declare eventos here
    private CustomModel customModel;
    private ModeloPersonalizado modeloPersonalizado;
    private boolean running;
    private Ambiente ambiente;

    public interface CustomModel {
        void executeModel(Ambiente ambiente);
    }

    public Simulacion(String initialConditions, int duration, Ambiente ambiente) {
        this.ambiente = ambiente;
        this.running = false;
    }
    public Ambiente getAmbiente() {
        return this.ambiente;
    }

    public Simulacion(Ambiente ambiente) {
        this.ambiente = ambiente;
        this.running = false;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Simulacion() {
        this.running = false;
    }

    public Simulacion(String initialConditions, int duration) {
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
        return "Datos de la simulación";
    }

    public class ControladorSimulacion {
        private final Eventos Eventos;
        private Simulacion simulation;
        private ModeloPersonalizado modeloPersonalizado;

        public ControladorSimulacion() {
            this.Eventos = new Eventos();
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
            this.simulation = new Simulacion(initialConditions, duration);
            System.out.println("Simulation configured with initial conditions: " + initialConditions + " and duration: " + duration);
        }

        public void handleStartSimulation() {
            if (simulation == null) {
                simulation = new Simulacion();
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