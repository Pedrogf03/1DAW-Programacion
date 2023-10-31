package Ejercicio3;

public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
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

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void pagar(double precio) {
        this.setDinero(this.getDinero()-precio);
    }

    public boolean tieneEdad(int edadMinima) {
        return this.getEdad() >= edadMinima;
    }

    public boolean tieneDinero(double precioEntrada) {
        return this.getDinero() >= precioEntrada;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dinero=" + dinero +
                '}';
    }
}
