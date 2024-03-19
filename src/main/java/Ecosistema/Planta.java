package Ecosistema;

class Planta extends Organismo {
    Planta(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    void competirPorRecursos(Ambiente ambiente) {
        // Implementación de la competencia por recursos para las plantas
        System.out.println("La planta está compitiendo por recursos.");
    }

    void competirPorRecursos() {
        // Implementación de la competencia por recursos para las plantas
        System.out.println("La planta está compitiendo por recursos.");
    }

    void polinizar() {
        // Implementación de la polinización
        System.out.println("La planta está polinizando.");
    }

    void crecer() {
        // Implementación del crecimiento de la población
        this.edad += 1;
        System.out.println("La planta ha crecido, incrementar la edad en uno.");
    }

    void reproducirse() {
        // Implementación de la reproducción
        if (this.estadoReproductivo) {
            // Incrementar la población de la especie en uno
            // Esto es solo un ejemplo y puede necesitar ajustes para satisfacer tus necesidades específicas
            System.out.println("La planta se ha reproducido, incrementar la población de la especie en uno.");
        } else {
            System.out.println("La planta no está en estado reproductivo y no puede reproducirse.");
        }
    }
}