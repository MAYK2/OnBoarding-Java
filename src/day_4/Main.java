package day_4;

public class Main {
    public static void main(String[] args) {
        CalculadoraConMenú calculadora = new CalculadoraConMenú();

        boolean salida;
        do{
            calculadora.mostrarMenu();
            salida = calculadora.ejecutarOperacion();
        }
        while(salida);
    }
}
