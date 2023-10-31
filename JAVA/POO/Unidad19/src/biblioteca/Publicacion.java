package biblioteca;

public abstract class Publicacion {

    private final String ISBN;
    private final String titulo;
    private final int anho;

    public Publicacion(String isbn, String titulo, int anho){
        this.ISBN = isbn;
        this.titulo = titulo;
        this.anho = anho;
    }

    public String getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnho() {
        return anho;
    }

    @Override
    public String toString() {
        return "ISBN: "+ this.getISBN() +", Título: "+ this.getTitulo() +", Año de publicación: "+ this.getAnho();
    }
}
