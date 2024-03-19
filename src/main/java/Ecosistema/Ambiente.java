package Ecosistema;

import java.util.List;

class Ambiente {
    String clima;
    String terreno;
    int recursosDisponibles;
    List<Organismo> organismos; // Añadido para mantener una lista de organismos en el ambiente

    Ambiente(String clima, String terreno, int recursosDisponibles, List<Organismo> organismos) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
        this.organismos = organismos; // Inicializar la lista de organismos
    }

    void eventoAleatorio() {
        // Generar un número aleatorio entre 0 y 2
        int evento = (int) (Math.random() * 3);

        switch (evento) {
            case 0:
                // Desastre natural
                System.out.println("Ha ocurrido un desastre natural, disminuir la población.");
                // Aquí puedes agregar el código para disminuir la población
                if (!this.organismos.isEmpty()) {
                    this.organismos.remove(0); // eliminar el primer organismo de la lista
                }
                break;
            case 1:
                // Enfermedad
                System.out.println("Ha surgido una enfermedad, disminuir la salud de los organismos.");
                // Aquí puedes agregar el código para disminuir la salud de los organismos
                for (Organismo organismo : this.organismos) {
                    if (organismo.salud > 0) {
                        organismo.salud -= 1; // disminuir la salud del organismo en uno
                    }
                }
                break;
            case 2:
                // Cambio climático
                System.out.println("Ha ocurrido un cambio climático, afectar los recursos disponibles.");
                // Aquí puedes agregar el código para afectar los recursos disponibles
                if (this.recursosDisponibles > 0) {
                    this.recursosDisponibles -= 1; // disminuir los recursos disponibles en uno
                }
                break;
        }
    }
    void calcularEstadisticas() {
        int poblacionTotal = 0;
        int saludTotal = 0;
        int edadTotal = 0;
        int cantidadOrganismos = 0;

        for (Organismo organismo : this.organismos) {
            poblacionTotal++;
            saludTotal += organismo.salud;
            edadTotal += organismo.edad;
            cantidadOrganismos++;
        }

        int saludPromedio = saludTotal / cantidadOrganismos;
        int edadPromedio = edadTotal / cantidadOrganismos;

        System.out.println("Población total: " + poblacionTotal);
        System.out.println("Salud promedio: " + saludPromedio);
        System.out.println("Edad promedio: " + edadPromedio);
        System.out.println("Recursos disponibles: " + this.recursosDisponibles);
    }
}