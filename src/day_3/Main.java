package day_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear algunas mascotas
        Mascota mascota1 = new Mascota("Tobi", 5, Mascota.TipoDeMascota.PERRO);
        Mascota mascota2 = new Mascota("Blondie", 3, Mascota.TipoDeMascota.GATO);

        Mascota mascota3 = new Mascota("Pinchu", 4, Mascota.TipoDeMascota.PERRO);
        Mascota mascota4 = new Mascota("Kiara", 13, Mascota.TipoDeMascota.GATO);

        // Crear un conjunto de mascotas utilizando la interfaz Set
        Set<Mascota> mascotasPersonaMayco = new HashSet<>();
        mascotasPersonaMayco.add(mascota1);
        mascotasPersonaMayco.add(mascota2);

        Set<Mascota> mascotasPersonaAndrea = new HashSet<>();
        mascotasPersonaAndrea.add(mascota3);
        mascotasPersonaAndrea.add(mascota4);

        // Crear una nueva persona con las mascotas
        Personadia3 personaMayco = new Personadia3("Mayco", 22, 1.89, true, mascotasPersonaMayco, "43555738");

        personaMayco.mostrarEnConsola();
        System.out.println("\n");
        Personadia3 personaAndrea = new Personadia3("Andrea",20,1.71,false, mascotasPersonaAndrea, "43553241");
        personaAndrea.mostrarEnConsola();
    }
}
