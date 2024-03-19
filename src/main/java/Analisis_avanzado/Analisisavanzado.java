package Analisis_avanzado;
import Ecosistema.Ambiente;
import Ecosistema.Organismo;

    public abstract class Analisisavanzado {
        // ...

        public void buscarEquilibrioEco(Ambiente ambiente) {
            int recursos = ambiente.getRecursosDisponibles();
            int organismos = ambiente.getOrganismos().size();
            int saludTotal = 0;
            for (Organismo organismo : ambiente.getOrganismos()) {
                saludTotal += organismo.getSalud();
            }
            int saludPromedio = saludTotal / organismos;

            if (recursos >= organismos && saludPromedio > 50) {
                System.out.println("El ambiente está en equilibrio.");
            } else {
                System.out.println("El ambiente no está en equilibrio.");
            }
        }

        public void evaluarEstrategiaConservacion(Ambiente ambiente, EstrategiaConservacion estrategia) {
            // Aplicar la estrategia de conservación
            estrategia.aplicar(ambiente);

            // Evaluar el equilibrio ecológico después de aplicar la estrategia
            buscarEquilibrioEco(ambiente);
        }
}
