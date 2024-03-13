package Ecosistema;
class Planta extends Organismo {
    Planta(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    void competirPorRecursos() {
        // Implementación de la competencia por recursos para las plantas
    }

    @Override
    void reproducirse() {
        // Implementación de la reproducción para las plantas
    }

    void polinizar() {
        // Implementación de la polinización
    }
}