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
                break;
            case 1:
                // Enfermedad
                System.out.println("Ha surgido una enfermedad, disminuir la salud de los organismos.");
                // Aquí puedes agregar el código para disminuir la salud de los organismos
                break;
            case 2:
                // Cambio climático
                System.out.println("Ha ocurrido un cambio climático, afectar los recursos disponibles.");
                // Aquí puedes agregar el código para afectar los recursos disponibles
                break;
        }
    }

    void calcularEstadisticas() {
        int poblacionTotal = 0;
        int saludTotal = 0;
        int cantidadOrganismos = 0;

        // Iterar sobre la lista de organismos en el ambiente
        for (Organismo organismo : this.organismos) {
            poblacionTotal++;
            saludTotal += organismo.salud;
            cantidadOrganismos++;
        }

        int saludPromedio = saludTotal / cantidadOrganismos;

        System.out.println("Población total: " + poblacionTotal);
        System.out.println("Salud promedio: " + saludPromedio);
        System.out.println("Recursos disponibles: " + this.recursosDisponibles);
    }
}