package Ecosistema;

class Planta extends Organismo {
    Planta(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }


    void competirPorRecursos(Ambiente ambiente) {
        if (ambiente.recursosDisponibles > 0) {
            ambiente.recursosDisponibles -= 1; // la planta consume un recurso
            this.salud += 1; // la salud de la planta aumenta
            System.out.println("La planta está compitiendo por recursos y ha consumido un recurso.");
        } else {
            System.out.println("No hay recursos disponibles para que la planta compita.");
        }
    }
    void polinizar(Ambiente ambiente) {
        if (this.estadoReproductivo) {
            if (ambiente.recursosDisponibles > 0) {
                ambiente.recursosDisponibles -= 1; // la planta consume un recurso para polinizar
                this.salud += 1; // la salud de la planta aumenta
                System.out.println("La planta está polinizando y ha consumido un recurso.");
            } else {
                System.out.println("No hay recursos disponibles para que la planta polinice.");
            }
        } else {
            System.out.println("La planta no está en estado reproductivo y no puede polinizar.");
        }
    }

    void crecer(Ambiente ambiente) {
        this.edad += 1;
        System.out.println("La planta ha crecido, incrementar la edad en uno.");

        // Si la planta tiene suficiente salud, puede reproducirse y aumentar la población de plantas
        if (this.salud > 0) {
            this.reproducirse();
            ambiente.organismos.add(new Planta(this.posicion, this.salud, this.edad, this.estadoReproductivo));
            System.out.println("La planta ha reproducido, incrementar la población de la especie en uno.");
        } else {
            System.out.println("La planta no tiene suficiente salud para reproducirse.");
        }
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