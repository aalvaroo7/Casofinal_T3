package simulacion;

public class simulacion {
    private boolean running;

    public simulacion() {
        this.running = false;
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
}
