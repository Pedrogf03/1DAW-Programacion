package Ejercicio3;

import java.util.Arrays;

public class Cine {

    private Asiento[][] asientos;
    private double precio;
    private Pelicula pelicula;

    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
        this.precio = precio;
        this.pelicula = pelicula;
        asientos = new Asiento[filas][columnas];
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void rellenaButacas(){
        int fila = this.asientos.length;
        for (int i = 0; i < this.asientos.length; i++){
            for (int j = 0; j < this.asientos[0].length; j++){
                asientos[i][j] = new Asiento((char) ('A' + j), fila);
            }
            fila--;
        }
    }

    public boolean haySitio() {

        for (int i = 0; i < this.asientos.length; i++) {
            for (int j = 0; j < this.asientos[0].length; j++) {
                if (!this.asientos[i][j].estaOcupado()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Asiento getAsiento(int fila, char columna) {
        return this.asientos[asientos.length - fila - 1][columna - 'A'];
    }

    public boolean butacaOcupada(int fila, char columna){
        return this.getAsiento(fila, columna).estaOcupado();
    }

    public boolean sePuedeSentar(Espectador e) {
        return e.tieneDinero(this.precio) && e.tieneEdad(this.pelicula.getMin_edad());
    }

    public void sentar(int fila, char columna, Espectador e) {
        this.getAsiento(fila, columna).setEspectador(e);
    }

    public int getFilas() {
        return this.asientos.length;
    }

    public int getColumnas() {
        return this.asientos[0].length;
    }

    public void mostrar() {

        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }

}
