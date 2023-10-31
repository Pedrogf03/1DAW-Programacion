package Ejercicio2;

public class Videojuego implements Entregable{

    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String company;

    public Videojuego(){
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String company) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = company;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        if(this.entregado){
            System.out.println("Este videojuego ya ha sido entregado anteriormente.");
        } else {
            this.entregado = true;
        }
    }

    @Override
    public void devolver() {
        if(!this.entregado){
            System.out.println("Este videojuego no ha sido entregado.");
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
        Videojuego v = (Videojuego) a;
        int comparador = 0;
        if(this.getHorasEstimadas() == v.getHorasEstimadas()){
            comparador = 0;
        } else if(this.getHorasEstimadas() > v.getHorasEstimadas()){
            comparador = 1;
        } else  if(this.getHorasEstimadas() < v.getHorasEstimadas()){
            comparador = -1;
        }
        return comparador;
    }

}
