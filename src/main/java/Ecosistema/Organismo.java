package Ecosistema;
abstract class Organismo {
    String posicion;
    int salud;
    int edad;
    boolean estadoReproductivo;

    Organismo(String posicion, int salud, int edad, boolean estadoReproductivo) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    // Métodos abstractos para ser implementados por las subclases
    abstract void competirPorRecursos();
    abstract void reproducirse();
}