package main;

import java.util.Scanner;
import Ecosistema.Organismo;
import Gestion_usuarios_ysimulciones.Autenticacion;
import Gestion_usuarios_ysimulciones.Registro;
import Gestion_usuarios_ysimulciones.Usuario;
import simulacion.ControladorSimulacion;
import Ecosistema.Ambiente;
import Ecosistema.Eventos;
import Ecosistema.Animal;
import Analisis_avanzado.Analisisavanzado;

public class Main {
    public static void main(String[] args) {
        Autenticacion autenticacion = new Autenticacion();
        Registro registro = new Registro("registro.txt");
        ControladorSimulacion controladorSimulacion = new ControladorSimulacion();
        Ambiente ambiente = new Ambiente("Clima", "Terreno", 100, Animal.generarAnimalesAleatorios(10)); // Generamos 10 animales aleatorios
        Eventos eventos = new Eventos(); // Añadimos una instancia de Eventos
        Analisisavanzado analisisAvanzado = new Analisisavanzado() {
            @Override
            public void resolverProblemasEspecificos() {
                // Implementación de la resolución de problemas específicos
            }
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Configurar simulación");
            System.out.println("4. Iniciar simulación");
            System.out.println("5. Visualizar datos de la simulación");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre de usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contraseña = scanner.nextLine();
                    autenticacion.registrarUsuario(new Usuario(nombre, contraseña));
                    break;
                case 2:
                    System.out.print("Ingrese nombre de usuario: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    contraseña = scanner.nextLine();
                    if (autenticacion.autenticarUsuario(nombre, contraseña)) {
                        System.out.println("Usuario autenticado exitosamente.");
                    } else {
                        System.out.println("Autenticación fallida.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese las condiciones iniciales de la simulación: ");
                    String condicionesIniciales = scanner.nextLine();
                    System.out.print("Ingrese la duración de la simulación: ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    controladorSimulacion.handleConfigureSimulation(condicionesIniciales, duracion);
                    System.out.println("Simulación configurada.");
                    break;
                case 4:
                    controladorSimulacion.handleStartSimulation();
                    break;
                case 5:
                    controladorSimulacion.visualizarDatos();
                    eventos.eventoAleatorio(ambiente); // Ejecutamos un evento aleatorio
                    for (Organismo animal : ambiente.organismos) { // Mostramos los animales y cómo les afectan los eventos
                        System.out.println("Animal: " + animal.toString());
                    }
                    break; // Añadido break que faltaba
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}