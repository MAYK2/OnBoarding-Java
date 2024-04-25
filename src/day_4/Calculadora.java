package day_4;

public class Calculadora implements OperacionesCalculadora{
    @Override
    public void suma(int a, int b) {
        int suma=a+b;
        System.out.println(suma);
    }

    @Override
    public void resta(int a, int b) {
        int resta=a-b;
        System.out.println(resta);
    }

    @Override
    public void multiplicacion(int a, int b) {
        int multiplicacion=a*b;
        System.out.println(multiplicacion);
    }

    @Override
    public void division(int a, int b) {
        int division=a/b;
        System.out.println(division);
    }
}
