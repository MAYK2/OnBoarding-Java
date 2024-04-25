package day_1;

import static day_1.bolera.iniciarSesion;
import static day_1.calculadora.mostrarMenu;

public class Main {
    public static void main(String[] args) {
        String nombre = "Mayco";
        String apellido = "Dominguez";
        int edad = 22;
        System.out.println(nombre + " " + apellido + " " + edad);

        int num1 = 23;
        int num2 = 26;
        int num3 = 21;
        saludar(nombre, apellido);
        masGrande(num1, num2, num3);
        parOimpar(num2);
        String nombre2 = "Mayco";
        cadenaIgual(nombre, nombre2);
        int numPrimo = 17;
        System.out.println(esPrimo(numPrimo));
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arraySuma(array);
        imprimirParesYSumaPrimos(array);
//        mostrarMenu();
        iniciarSesion();
    }

    public static void saludar(String nombre, String apellido) {
        System.out.println("Hola bienvenido " + nombre + " " + apellido + " a este nuevo módulo.");
    }

    public static void masGrande(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }

    public static void parOimpar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
    }

    public static void cadenaIgual(String cad1, String cad2) {
        if (cad1.equals(cad2)) {
            System.out.println("las cadenas son iguales");
        } else {
            System.out.println("no son iguales");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void arraySuma(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void imprimirParesYSumaPrimos(int[] matriz) {
        System.out.println("Números pares:");
        int sumaPrimos = 0;

        for (int numero : matriz) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            if (esPrimo(numero)) {
                sumaPrimos += numero;
            }
        }
        System.out.println("\nLa suma de los números primos en la matriz es: " + sumaPrimos);
    }
}
