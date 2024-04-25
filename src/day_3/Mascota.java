package day_3;

public class Mascota {
    private String nombre;
    private int edad;
    private TipoDeMascota tipoDeMascota;

    // Constructor de la clase Mascota
    public Mascota(String nombre, int edad, TipoDeMascota tipoDeMascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDeMascota = tipoDeMascota;
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

    public TipoDeMascota getTipoDeMascota() {
        return tipoDeMascota;
    }

    public void setTipoDeMascota(TipoDeMascota tipoDeMascota) {
        this.tipoDeMascota = tipoDeMascota;
    }


    // Enumeración de TipoDeMascota
    public enum TipoDeMascota {
        PERRO,
        GATO,
        PAJARO,
        PEZ,
        OTROS
    }
}
