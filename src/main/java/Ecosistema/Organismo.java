package Ecosistema;

public abstract class Organismo {
    String posicion;
    int salud;
    int edad;
    boolean estadoReproductivo;
    public boolean danos; // true si el organismo ha sufrido daños, false en caso contrario

    public int getSalud() {
        return this.salud;
    }

    Organismo(String posicion, int salud, int edad, boolean estadoReproductivo) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    // Métodos abstractos para ser implementados por las subclases
    abstract void competirPorRecursos(Ambiente ambiente);
    abstract void reproducirse();
}