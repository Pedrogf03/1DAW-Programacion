package biblioteca;

public class Revista extends Publicacion{

    private int numero;

    public Revista(String isbn, String titulo, int anho, int numero){
        super(isbn, titulo, anho);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return super.toString() + ", Número: "+ numero;
    }

}
