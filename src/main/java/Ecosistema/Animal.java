package Ecosistema;
class Animal extends Organismo {
    Animal(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    void competirPorRecursos() {
        // Implementación de la competencia por recursos para los animales
    }
    void predar() {
        // Implementación de la predación
    }
        void crecer() {
            // Implementación del crecimiento de la población
        }

        void reproducirse() {
            // Implementación de la reproducción
        }


}


