package Gestion_usuarios_ysimulciones;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Registro {
    private String archivo;

    public Registro(String archivo) {
        this.archivo = archivo;
    }

    public void registrarSimulacion(String detallesSimulacion) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(detallesSimulacion);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}