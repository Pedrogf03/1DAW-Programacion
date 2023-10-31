package Ejercicio2;

public class Serie implements Entregable{

    private String titulo;
    private int numTemps = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie(){
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numTemps, String genero, String creador) {
        this.titulo = titulo;
        this.numTemps = numTemps;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemps() {
        return numTemps;
    }

    public void setNumTemps(int numTemps) {
        this.numTemps = numTemps;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemps=" + numTemps +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        if(this.entregado){
            System.out.println("Esta serie ya ha sido entregado anteriormente.");
        } else {
            this.entregado = true;
        }
    }

    @Override
    public void devolver() {
        if(!this.entregado){
            System.out.println("Esta serie no ha sido entregado.");
        } else {
            this.entregado = false;
        }
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Serie s = (Serie) a;
        int comparador = 0;
        if(this.getNumTemps() == s.getNumTemps()){
            comparador = 0;
        } else if(this.getNumTemps() > s.getNumTemps()){
            comparador = 1;
        } else  if(this.getNumTemps() == s.getNumTemps()){
            comparador = -1;
        }
        return comparador;
    }
}
