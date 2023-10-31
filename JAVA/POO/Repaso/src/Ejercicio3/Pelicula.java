package Ejercicio3;

public class Pelicula {

    private String titulo;
    private int duracion;
    private int min_edad;
    private String director;

    public Pelicula(String titulo, int duracion, int min_edad, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.min_edad = min_edad;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMin_edad() {
        return min_edad;
    }

    public void setMin_edad(int min_edad) {
        this.min_edad = min_edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", min_edad=" + min_edad +
                ", director='" + director + '\'' +
                '}';
    }

}
