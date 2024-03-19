package simulacion;

public class simulacion {
    private boolean running;

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
}
