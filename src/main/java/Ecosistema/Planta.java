package Ecosistema;
class Planta extends Organismo {
    Planta(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    void competirPorRecursos() {
        // Implementación de la competencia por recursos para las plantas
    }
    void polinizar() {
        // Implementación de la polinización
    }
    void crecer() {
        // Implementación del crecimiento de la población
    }

    void reproducirse() {
        // Implementación de la reproducción
    }
}