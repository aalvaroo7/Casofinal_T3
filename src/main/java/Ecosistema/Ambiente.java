
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
}