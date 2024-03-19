package main;

import Gestion_usuarios_ysimulciones.Autenticacion;
import Gestion_usuarios_ysimulciones.Registro;

public class Main {
    private Autenticacion autenticacion;
    private Registro registro;

    public Main(Autenticacion autenticacion, Registro registro) {
        this.autenticacion = autenticacion;
        this.registro = registro;
    }

    public void iniciarSesion(String nombre, String contraseña) {
        // Solicitar al usuario que introduzca su nombre y contraseña
        // Utilizar el sistema de autenticación para verificar las credenciales del usuario
        // Si las credenciales son correctas, permitir al usuario acceder al sistema
        // Si las credenciales no son correctas, mostrar un mensaje de error
        if (autenticacion.autenticarUsuario(nombre, contraseña)) {
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("User authentication failed.");
        }
    }

    public void configurarSimulacion() {
        // Permitir al usuario configurar los parámetros de la simulación
        // Guardar la configuración de la simulación en el sistema de registro
        // This is just a placeholder, replace it with your actual code
        System.out.println("Configuring the simulation...");
    }

    public void iniciarSimulacion(String nombre, String contraseña) {
        if (autenticacion.autenticarUsuario(nombre, contraseña)) {
            // Start the simulation with the user-provided configuration
            // This is just a placeholder, replace it with your actual simulation code
            System.out.println("Starting the simulation...");

            // After the simulation is completed, save the results to the Registro instance
            // This is just a placeholder, replace it with your actual code to save the results
            String detallesSimulacion = "Simulation details...";
            registro.registrarSimulacion(detallesSimulacion);

            System.out.println("Simulation completed and results saved.");
        } else {
            System.out.println("User authentication failed. Cannot start the simulation.");
        }
    }
}