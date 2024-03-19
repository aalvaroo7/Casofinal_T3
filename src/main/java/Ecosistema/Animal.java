package Ecosistema;
class Animal extends Organismo {
    Animal(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    void competirPorRecursos(Ambiente ambiente) {
        if (ambiente.recursosDisponibles > 0) {
            ambiente.recursosDisponibles -= 1;
            this.salud += 1;
            System.out.println("El animal ha competido por recursos, disminuir los recursos disponibles en el ambiente en uno y aumentar la salud del animal en uno.");
        } else {
            System.out.println("No hay recursos disponibles en el ambiente para que el animal compita.");
        }
    }
    void predar(Animal presa) {
        if (this.salud > presa.salud) {
            presa.salud -= 1;
            this.salud += 1;
            System.out.println("El animal ha predado a su presa, disminuir la salud de la presa en uno y aumentar la salud del predador en uno.");
        } else {
            System.out.println("El animal no tiene suficiente salud para predar a su presa.");
        }
    }
    void crecer() {
        this.edad += 1;
        System.out.println("El organismo ha crecido, incrementar la edad en uno.");
    }

    void reproducirse() {
        if (this.estadoReproductivo) {
            // Incrementar la población de la especie en uno
            // Esto es solo un ejemplo y puede necesitar ajustes para satisfacer tus necesidades específicas
            System.out.println("El animal se ha reproducido, incrementar la población de la especie en uno.");
        } else {
            System.out.println("El animal no está en estado reproductivo y no puede reproducirse.");
        }
    }
}


