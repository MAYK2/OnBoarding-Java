package day_1;

import java.util.Scanner;

public class bolera {
    private static int capacidadDisponible = 0;
    private static double dineroRecaudado = 0;

    public static void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido a la Bolera - Menú:");
            System.out.println("1. Entrada de datos");
            System.out.println("2. Consultar capacidad disponible");
            System.out.println("3. Consultar dinero recaudado");
            System.out.println("4. Cerrar sesión en el sistema");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    entradaDatos();
                    break;
                case 2:
                    consultarCapacidad();
                    break;
                case 3:
                    consultarDineroRecaudado();
                    break;
                case 4:
                    System.out.println("Cerrando sesión en el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void entradaDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad disponible: ");
        capacidadDisponible = scanner.nextInt();
        System.out.print("Ingrese el dinero recaudado: ");
        dineroRecaudado = scanner.nextDouble();
        System.out.println("Datos actualizados exitosamente.");
    }

    public static void consultarCapacidad() {
        System.out.println("La capacidad disponible es: " + capacidadDisponible);
    }

    public static void consultarDineroRecaudado() {
        System.out.println("El dinero recaudado es: " + dineroRecaudado);
    }
}