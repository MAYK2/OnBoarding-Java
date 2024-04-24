package day_4;

import java.util.Scanner;

public class CalculadoraConMenú implements CalculadoraMenú {

    private Calculadora calculadora;

    public CalculadoraConMenú() {
        this.calculadora = new Calculadora();
    }

    void mostrarMenu() {


        System.out.println("Calculadora - Opciones:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");

    }

    ;

    boolean ejecutarOperacion() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el primer número: ");
                a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = scanner.nextInt();
                calculadora.suma(a, b);
                return true;
            case 2:
                System.out.print("Ingrese el primer número: ");
                a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = scanner.nextInt();
                calculadora.resta(a, b);
                return true;
            case 3:
                System.out.print("Ingrese el primer número: ");
                a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = scanner.nextInt();
                calculadora.multiplicacion(a, b);
                return true;
            case 4:
                System.out.print("Ingrese el primer número: ");
                a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = scanner.nextInt();
                calculadora.division(a, b);
                return true;
            case 0:
                System.out.println("Saliendo...");
                return false;
            default:
                System.out.println("Opción inválida");
                return true;
        }
    }
}



