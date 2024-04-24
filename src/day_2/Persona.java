package day_2;

import java.util.Arrays;

public class Persona {
    private String nombre;
    private int edad;
    private Double altura;
    private boolean casado;
    private String[] mascotas;
    private String TarjetaIdentificacion;

    public Persona(String[] mascotas, boolean casado, Double altura, int edad, String nombre, String TarjetaIdentificacion) {
        this.mascotas = mascotas;
        this.casado = casado;
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.TarjetaIdentificacion = TarjetaIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public boolean esCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(String[] mascotas) {
        this.mascotas = mascotas;
    }

    public String getTarjetaIdentificacion() {
        return TarjetaIdentificacion;
    }

    public void setTarjetaIdentificacion(String tarjetaIdentificacion) {
        TarjetaIdentificacion = tarjetaIdentificacion;
    }

    public void mostrarEnConsola() {
        System.out.println("¡Hola! Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años y mido " + altura + " metros de altura.");
        if (casado) {
            System.out.println("Estoy casado/a.");
        } else {
            System.out.println("No estoy casado/a.");
        }
        System.out.println("Mis mascotas se llaman: ");
        for (String mascota : mascotas) {
            System.out.println("-" + mascota);
    }
}
}
