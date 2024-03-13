package Gestion_usuarios_ysimulciones;
import java.util.HashMap;
import java.util.Map;

public class Autenticacion {
    private Map<String, String> usuarios = new HashMap<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombre(), usuario.getContraseña());
    }

    public boolean autenticarUsuario(String nombre, String contraseña) {
        String contraseñaGuardada = usuarios.get(nombre);
        return contraseñaGuardada != null && contraseñaGuardada.equals(contraseña);
    }
}