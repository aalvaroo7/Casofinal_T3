package main;

import java.util.Scanner;
import Gestion_usuarios_ysimulciones.Autenticacion;
import Gestion_usuarios_ysimulciones.Registro;
import Gestion_usuarios_ysimulciones.Usuario;
import simulacion.ControladorSimulacion;

public class Main {
    public static void main(String[] args) {
        Autenticacion autenticacion = new Autenticacion();
        Registro registro = new Registro("registro.txt");
        ControladorSimulacion controladorSimulacion = new ControladorSimulacion();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Configurar simulación");
            System.out.println("4. Iniciar simulación");
            System.out.println("5. Salir");
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
                    // Aquí deberías solicitar al usuario los parámetros de la simulación
                    // y luego llamar a controladorSimulacion.handleConfigureSimulation con esos parámetros
                    System.out.println("Configurando simulación...");
                    break;
                case 4:
                    controladorSimulacion.handleStartSimulation();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}