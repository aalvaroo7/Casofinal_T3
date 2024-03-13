package Ecosistema;
class Animal extends Organismo {
    Animal(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    void competirPorRecursos() {
        // Implementación de la competencia por recursos para los animales
    }

    @Override
    void reproducirse() {
        // Implementación de la reproducción para los animales
    }

    void predar() {
        // Implementación de la predación
    }
}
