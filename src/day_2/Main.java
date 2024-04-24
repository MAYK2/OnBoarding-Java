package day_2;

public class Main {
    public static void main(String[] args) {
        String[] mascotasMayco = {"Blondie", "Tobi"};
        Persona mayco = new Persona(mascotasMayco, false, 1.89, 22, "Mayco","43555738");

        mayco.mostrarEnConsola();


        String[] mascotasAndrea = {"Kiara", "Pinchu"};
        Persona andrea = new Persona(mascotasAndrea, true, 1.71, 20, "Andrea","44873431");
        System.out.println("\n");
        andrea.mostrarEnConsola();
    }
}
