package Ecosistema;

import java.util.Collection;
import java.util.List;

public class Ambiente {
    private List<Organismo> organismos;
    String clima;
    String terreno;
    int recursosDisponibles;


    public List<Organismo> getOrganismos() {
        return this.organismos;
    }

    public Ambiente(String clima, String terreno, int recursosDisponibles, List<? extends Organismo> organismos) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
        this.organismos = (List<Organismo>) organismos; // Inicializar la lista de organismos
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

    @Override
    public String toString() {
        return "Ambiente{" +
                "clima='" + clima + '\'' +
                ", terreno='" + terreno + '\'' +
                ", recursosDisponibles=" + recursosDisponibles +
                '}';
    }
}
