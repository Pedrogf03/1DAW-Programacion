package Ejercicio3;

public class Asiento {

    private char columna;
    private int fila;
    private Espectador espectador;

    public Asiento(char columna, int fila) {
        this.columna = columna;
        this.fila = fila;
        this.espectador = null;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean estaOcupado() {
        return espectador != null;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "columna=" + columna +
                ", fila=" + fila +
                ", espectador=" + espectador +
                '}';
    }

}
