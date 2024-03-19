package Ecosistema;

public class Eventos {

    void eventoAleatorio(Ambiente ambiente) {
        // Generar un número aleatorio entre 0 y 2
        int evento = (int) (Math.random() * 3);

        switch (evento) {
            case 0:
                // Desastre natural
                System.out.println("Ha ocurrido un desastre natural, disminuir la población.");
                // Aquí puedes agregar el código para disminuir la población
                if (!ambiente.organismos.isEmpty()) {
                    ambiente.organismos.remove(0); // eliminar el primer organismo de la lista
                }
                break;
            case 1:
                // Enfermedad
                System.out.println("Ha surgido una enfermedad, disminuir la salud de los organismos.");
                // Aquí puedes agregar el código para disminuir la salud de los organismos
                for (Organismo organismo : ambiente.organismos) {
                    if (organismo.salud > 0) {
                        organismo.salud -= 1; // disminuir la salud del organismo en uno
                    }
                }
                break;
            case 2:
                // Cambio climático
                System.out.println("Ha ocurrido un cambio climático, afectar los recursos disponibles.");
                // Aquí puedes agregar el código para afectar los recursos disponibles
                if (ambiente.recursosDisponibles > 0) {
                    ambiente.recursosDisponibles -= 1; // disminuir los recursos disponibles en uno
                }
                break;
        }
    }
}