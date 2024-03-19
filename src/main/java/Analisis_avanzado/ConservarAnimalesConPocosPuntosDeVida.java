package Analisis_avanzado;

import Ecosistema.Ambiente;
import Ecosistema.Animal;
import Ecosistema.Organismo;

public class ConservarAnimalesConPocosPuntosDeVida implements EstrategiaConservacion {
    private int umbralPuntosDeVida;
    private int incrementoPuntosDeVida;

    public ConservarAnimalesConPocosPuntosDeVida(int umbralPuntosDeVida, int incrementoPuntosDeVida) {
        this.umbralPuntosDeVida = umbralPuntosDeVida;
        this.incrementoPuntosDeVida = incrementoPuntosDeVida;
    }

    @Override
    public void aplicar(Ambiente ambiente) {
        for (Organismo organismo : ambiente.getOrganismos()) {
            if (organismo instanceof Animal) {
                Animal animal = (Animal) organismo;
                if (animal.getPuntosVida() < umbralPuntosDeVida) {
                    animal.setPuntosVida(animal.getPuntosVida() + incrementoPuntosDeVida);
                }
            }
        }
    }
}

