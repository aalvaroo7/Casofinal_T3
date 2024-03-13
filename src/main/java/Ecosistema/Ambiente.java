
package Ecosistema;
class Ambiente {
    String clima;
    String terreno;
    int recursosDisponibles;

    Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }
    void crecer() {
        // Implementación del crecimiento de la población
    }

    void reproducirse() {
        // Implementación de la reproducción
    }
    // Métodos para interactuar con el ambiente

    void eventoAleatorio() {
        // Implementación de eventos aleatorios que pueden afectar a las poblaciones
    }

    void calcularEstadisticas() {
        // Implementación de cálculo y presentación de estadísticas sobre la salud del ecosistema y las tendencias poblacionales
    }
}
