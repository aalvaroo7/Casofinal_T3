package Ecosistema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Animal extends Organismo {
    // Añade un generador de números aleatorios
    private static Random random = new Random();

    // Añade una lista de nombres de animales
    private static List<String> nombresAnimales = Arrays.asList("León", "Tigre", "Elefante", "Jirafa", "Hipopótamo", "Cebra", "Oso", "Lobo", "Zorro", "Canguro");

    private String nombre; // Añade un campo para el nombre del animal

    Animal(String nombre, String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
        this.nombre = nombre; // Inicializa el nombre del animal
    }
    Animal(String posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }
    @Override
    public String toString() {
        return "Animal: " + this.nombre;
    }
    // Método para crear un animal aleatorio
    public static Animal crearAnimalAleatorio() {
        String nombre = nombresAnimales.get(random.nextInt(nombresAnimales.size())); // Genera un nombre aleatorio
        String posicion = "Posicion" + random.nextInt(100); // Genera una posición aleatoria
        int salud = random.nextInt(100); // Genera una salud aleatoria
        int edad = random.nextInt(100); // Genera una edad aleatoria
        boolean estadoReproductivo = random.nextBoolean(); // Genera un estado reproductivo aleatorio

        return new Animal(nombre, posicion, salud, edad, estadoReproductivo);
    }

    void competirPorRecursos(Ambiente ambiente) {
        if (ambiente.recursosDisponibles > 0) {
            ambiente.recursosDisponibles -= 1;
            this.salud += 1;
            System.out.println("El animal ha competido por recursos, disminuir los recursos disponibles en el ambiente en uno y aumentar la salud del animal en uno.");
        } else {
            System.out.println("No hay recursos disponibles en el ambiente para que el animal compita.");
        }
    }

    void predar(Animal presa) {
        if (this.salud > presa.salud) {
            presa.salud -= 1;
            this.salud += 1;
            System.out.println("El animal ha predado a su presa, disminuir la salud de la presa en uno y aumentar la salud del predador en uno.");
        } else {
            System.out.println("El animal no tiene suficiente salud para predar a su presa.");
        }
    }

    void crecer() {
        this.edad += 1;
        System.out.println("El organismo ha crecido, incrementar la edad en uno.");
    }

    void reproducirse() {
        if (this.estadoReproductivo) {
            // Incrementar la población de la especie en uno
            // Esto es solo un ejemplo y puede necesitar ajustes para satisfacer tus necesidades específicas
            System.out.println("El animal se ha reproducido, incrementar la población de la especie en uno.");
        } else {
            System.out.println("El animal no está en estado reproductivo y no puede reproducirse.");
        }
    }

    public static List<Animal> generarAnimalesAleatorios(int cantidad) {
        List<Animal> animales = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            animales.add(crearAnimalAleatorio());
        }
        return animales;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}